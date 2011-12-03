package net.minecraft.src;

public class TileEntityBessemer extends TileEntity
    implements IInventory
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

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setShort("BurnTime", (short)BessemerBurnTime);
        nbttagcompound.setShort("CookTime", (short)BessemerCookTime);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < BessemerItemStacks.length; i++)
        {
            if(BessemerItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                BessemerItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.setTag(nbttagcompound1);
            }
        }

        nbttagcompound.setTag("Items", nbttaglist);
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
        if(!worldObj.multiplayerWorld)
        {
            if(BessemerBurnTime == 0 && canSmelt())
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
            if(isBurning() && canSmelt())
            {
                BessemerCookTime++;
                if(BessemerCookTime == 200)
                {
                    BessemerCookTime = 0;
                    smeltItem();
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

    private boolean canSmelt()
    {
        if(BessemerItemStacks[0] == null)
        {
            return false;
        }
        ItemStack itemstack = BessemerRecipes.smelting().getSmeltingResult(BessemerItemStacks[0].getItem().shiftedIndex);
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

    public void smeltItem()
    {
        if(!canSmelt())
        {
            return;
        }
        ItemStack itemstack = BessemerRecipes.smelting().getSmeltingResult(BessemerItemStacks[0].getItem().shiftedIndex);
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

    private int getItemBurnTime(ItemStack itemstack)
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
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return false;
	}
}
