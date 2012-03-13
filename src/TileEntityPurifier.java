package net.minecraft.src;

import net.minecraft.src.forge.ISidedInventory;

public class TileEntityPurifier extends TileEntity
    implements IInventory, ISidedInventory
{

    public TileEntityPurifier()
    {
        PurifierItemStacks = new ItemStack[3];
        PurifierBurnTime = 0;
        currentItemBurnTime = 0;
        PurifierCookTime = 0;
    }

    public int getSizeInventory()
    {
        return PurifierItemStacks.length;
    }

    public ItemStack getStackInSlot(int i)
    {
        return PurifierItemStacks[i];
    }

    public ItemStack decrStackSize(int i, int j)
    {
        if(PurifierItemStacks[i] != null)
        {
            if(PurifierItemStacks[i].stackSize <= j)
            {
                ItemStack itemstack = PurifierItemStacks[i];
                PurifierItemStacks[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = PurifierItemStacks[i].splitStack(j);
            if(PurifierItemStacks[i].stackSize == 0)
            {
                PurifierItemStacks[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        PurifierItemStacks[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    public String getInvName()
    {
        return "Purifier";
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
        PurifierItemStacks = new ItemStack[getSizeInventory()];
        for(int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte byte0 = nbttagcompound1.getByte("Slot");
            if(byte0 >= 0 && byte0 < PurifierItemStacks.length)
            {
                PurifierItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        PurifierBurnTime = nbttagcompound.getShort("BurnTime");
        PurifierCookTime = nbttagcompound.getShort("CookTime");
        currentItemBurnTime = getItemBurnTime(PurifierItemStacks[1]);
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BurnTime", (short)this.PurifierBurnTime);
        par1NBTTagCompound.setShort("CookTime", (short)this.PurifierCookTime);
        NBTTagList var2 = new NBTTagList();
        
        for (int var3 = 0; var3 < this.PurifierItemStacks.length; ++var3)
        {
            if (this.PurifierItemStacks[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.PurifierItemStacks[var3].writeToNBT(var4);
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
        return (PurifierCookTime * i) / 200;
    }

    public int getBurnTimeRemainingScaled(int i)
    {
        if(currentItemBurnTime == 0)
        {
            currentItemBurnTime = 200;
        }
        return (PurifierBurnTime * i) / currentItemBurnTime;
    }

    public boolean isBurning()
    {
        return PurifierBurnTime > 0;
    }

    public void updateEntity()
    {
        boolean flag = PurifierBurnTime > 0;
        boolean flag1 = false;
        if(PurifierBurnTime > 0)
        {
            PurifierBurnTime--;
        }
        if(!worldObj.isRemote)
        {
            if(PurifierBurnTime == 0 && canSmelt())
            {
                currentItemBurnTime = PurifierBurnTime = getItemBurnTime(PurifierItemStacks[1]);
                if(PurifierBurnTime > 0)
                {
                    flag1 = true;
                    if(PurifierItemStacks[1] != null)
                    {
                        if(PurifierItemStacks[1].getItem().hasContainerItem())
                        {
                            PurifierItemStacks[1] = new ItemStack(PurifierItemStacks[1].getItem().getContainerItem());
                        } else
                        {
                            PurifierItemStacks[1].stackSize--;
                        }
                        if(PurifierItemStacks[1].stackSize == 0)
                        {
                            PurifierItemStacks[1] = null;
                        }
                    }
                }
            }
            if(isBurning() && canSmelt())
            {
                PurifierCookTime++;
                if(PurifierCookTime == 200)
                {
                    PurifierCookTime = 0;
                    smeltItem();
                    flag1 = true;
                }
            } else
            {
                PurifierCookTime = 0;
            }
            if(flag != (PurifierBurnTime > 0))
            {
                flag1 = true;
            }
        }
        if(flag1)
        {
            onInventoryChanged();
        }
    }

    private boolean canSmelt()
    {
        if(PurifierItemStacks[0] == null)
        {
            return false;
        }
        ItemStack itemstack = PurifierRecipes.Purifying().getPurifyingResult(PurifierItemStacks[0].getItem().shiftedIndex);
        if(itemstack == null)
        {
            return false;
        }
        if(PurifierItemStacks[2] == null)
        {
            return true;
        }
        if(!PurifierItemStacks[2].isItemEqual(itemstack))
        {
            return false;
        }
        if(PurifierItemStacks[2].stackSize < getInventoryStackLimit() && PurifierItemStacks[2].stackSize < PurifierItemStacks[2].getMaxStackSize())
        {
            return true;
        }
        return PurifierItemStacks[2].stackSize < itemstack.getMaxStackSize();
    }

    public void smeltItem()
    {
        if(!canSmelt())
        {
            return;
        }
        ItemStack itemstack = PurifierRecipes.Purifying().getPurifyingResult(PurifierItemStacks[0].getItem().shiftedIndex);
        if(PurifierItemStacks[2] == null)
        {
            PurifierItemStacks[2] = itemstack.copy();
        } else
        if(PurifierItemStacks[2].itemID == itemstack.itemID)
        {
            PurifierItemStacks[2].stackSize++;
        }
        if(PurifierItemStacks[0].getItem().hasContainerItem())
        {
            PurifierItemStacks[0] = new ItemStack(PurifierItemStacks[0].getItem().getContainerItem());
        } else
        {
            PurifierItemStacks[0].stackSize--;
        }
        if(PurifierItemStacks[0].stackSize <= 0)
        {
            PurifierItemStacks[0] = null;
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

    private ItemStack PurifierItemStacks[];
    public int PurifierBurnTime;
    public int currentItemBurnTime;
    public int PurifierCookTime;
	@Override
	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) 
	{
        if (this.PurifierItemStacks[par1] != null)
        {
            ItemStack var2 = this.PurifierItemStacks[par1];
            this.PurifierItemStacks[par1] = null;
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
