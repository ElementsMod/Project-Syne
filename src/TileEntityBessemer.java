package net.minecraft.src;

import net.minecraft.src.forge.ISidedInventory;

public class TileEntityBessemer extends TileEntity
    implements IInventory, ISidedInventory
{

    public TileEntityBessemer()
    {
        BessemerItemStacks = new ItemStack[3];
        BessemerBurnTime = 0;
        currentItemBurnTime = 0;
        BessemerCookTime = 0;
    }

    public int getSizeInventory()
    {
        return BessemerItemStacks.length;
    }

    public ItemStack getStackInSlot(int i)
    {
        return BessemerItemStacks[i];
    }

    public ItemStack decrStackSize(int i, int j)
    {
        if(BessemerItemStacks[i] != null)
        {
            if(BessemerItemStacks[i].stackSize <= j)
            {
                ItemStack itemstack = BessemerItemStacks[i];
                BessemerItemStacks[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = BessemerItemStacks[i].splitStack(j);
            if(BessemerItemStacks[i].stackSize == 0)
            {
                BessemerItemStacks[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        BessemerItemStacks[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    public String getInvName()
    {
        return "Bessemer";
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
        BessemerItemStacks = new ItemStack[getSizeInventory()];
        for(int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte byte0 = nbttagcompound1.getByte("Slot");
            if(byte0 >= 0 && byte0 < BessemerItemStacks.length)
            {
                BessemerItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        BessemerBurnTime = nbttagcompound.getShort("BurnTime");
        BessemerCookTime = nbttagcompound.getShort("CookTime");
        currentItemBurnTime = getItemBurnTime(BessemerItemStacks[1]);
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BurnTime", (short)this.BessemerBurnTime);
        par1NBTTagCompound.setShort("CookTime", (short)this.BessemerCookTime);
        NBTTagList var2 = new NBTTagList();
        
        for (int var3 = 0; var3 < this.BessemerItemStacks.length; ++var3)
        {
            if (this.BessemerItemStacks[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.BessemerItemStacks[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }

        par1NBTTagCompound.setTag("Items", var2);
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public int getCookProgressScaled(int i)
    {
        return (BessemerCookTime * i) / 200;
    }

    public int getBurnTimeRemainingScaled(int i)
    {
        if(currentItemBurnTime == 0)
        {
            currentItemBurnTime = 200;
        }
        return (BessemerBurnTime * i) / currentItemBurnTime;
    }

    public boolean isBurning()
    {
        return BessemerBurnTime > 0;
    }

    public void updateEntity()
    {
        boolean flag = BessemerBurnTime > 0;
        boolean flag1 = false;
        if(BessemerBurnTime > 0)
        {
            BessemerBurnTime--;
        }
        if(!worldObj.isRemote)
        {
            if(BessemerBurnTime == 0 && canBessemer())
            {
                currentItemBurnTime = BessemerBurnTime = getItemBurnTime(BessemerItemStacks[1]);
                if(BessemerBurnTime > 0)
                {
                    flag1 = true;
                    if(BessemerItemStacks[1] != null)
                    {
                        if(BessemerItemStacks[1].getItem().hasContainerItem())
                        {
                            BessemerItemStacks[1] = new ItemStack(BessemerItemStacks[1].getItem().getContainerItem());
                        } else
                        {
                            BessemerItemStacks[1].stackSize--;
                        }
                        if(BessemerItemStacks[1].stackSize == 0)
                        {
                            BessemerItemStacks[1] = null;
                        }
                    }
                }
            }
            if(isBurning() && canBessemer())
            {
                BessemerCookTime++;
                if(BessemerCookTime == 200)
                {
                    BessemerCookTime = 0;
                    BessemerItem();
                    flag1 = true;
                }
            } else
            {
                BessemerCookTime = 0;
            }
            if(flag != (BessemerBurnTime > 0))
            {
                flag1 = true;
            }
        }
        if(flag1)
        {
            onInventoryChanged();
        }
    }

    private boolean canBessemer()
    {
        if(BessemerItemStacks[0] == null)
        {
            return false;
        }
        ItemStack itemstack = BessemerRecipes.Bessemering().getBessemeringResult(BessemerItemStacks[0].getItem().shiftedIndex);
        if(itemstack == null)
        {
            return false;
        }
        if(BessemerItemStacks[2] == null)
        {
            return true;
        }
        if(!BessemerItemStacks[2].isItemEqual(itemstack))
        {
            return false;
        }
        if(BessemerItemStacks[2].stackSize < getInventoryStackLimit() && BessemerItemStacks[2].stackSize < BessemerItemStacks[2].getMaxStackSize())
        {
            return true;
        }
        return BessemerItemStacks[2].stackSize < itemstack.getMaxStackSize();
    }

    public void BessemerItem()
    {
        if(!canBessemer())
        {
            return;
        }
        ItemStack itemstack = BessemerRecipes.Bessemering().getBessemeringResult(BessemerItemStacks[0].getItem().shiftedIndex);
        if(BessemerItemStacks[2] == null)
        {
            BessemerItemStacks[2] = itemstack.copy();
        } else
        if(BessemerItemStacks[2].itemID == itemstack.itemID)
        {
            BessemerItemStacks[2].stackSize++;
        }
        if(BessemerItemStacks[0].getItem().hasContainerItem())
        {
            BessemerItemStacks[0] = new ItemStack(BessemerItemStacks[0].getItem().getContainerItem());
        } else
        {
            BessemerItemStacks[0].stackSize--;
        }
        if(BessemerItemStacks[0].stackSize <= 0)
        {
            BessemerItemStacks[0] = null;
        }
    }

    public static int getItemBurnTime(ItemStack itemstack)
    {
        if(itemstack == null)
        {
            return 0;
        }
        int i = itemstack.getItem().shiftedIndex;
        if(i == Item.bucketLava.shiftedIndex)
        {
            return 20000;
        } else
        {
            return 0;
        }
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        if(worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this)
        {
            return false;
        }
        return entityplayer.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64D;
    }

    public void openChest()
    {
    }

    public void closeChest()
    {
    }

    private ItemStack BessemerItemStacks[];
    public int BessemerBurnTime;
    public int currentItemBurnTime;
    public int BessemerCookTime;
	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) 
	{
        if (this.BessemerItemStacks[par1] != null)
        {
            ItemStack var2 = this.BessemerItemStacks[par1];
            this.BessemerItemStacks[par1] = null;
            return var2;
        }
        else
        {
            return null;
        }
	}

	@Override
	public int getStartInventorySide(int side)
	{
        if (side == 0) return 1;
        if (side == 1) return 0;
        return 2;
	}

	@Override
	public int getSizeInventorySide(int side) {
		return 1;
	}
}
