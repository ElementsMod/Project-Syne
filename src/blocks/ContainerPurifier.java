package net.minecraft.src;

import java.util.List;

public class ContainerPurifier extends Container
{

    public ContainerPurifier(InventoryPlayer inventoryplayer, TileEntityPurifier tileentityPurifier)
    {
        lastCookTime = 0;
        lastBurnTime = 0;
        lastItemBurnTime = 0;
        Purifier = tileentityPurifier;
        addSlot(new Slot(tileentityPurifier, 0, 56, 17));
        addSlot(new Slot(tileentityPurifier, 1, 56, 53));
        addSlot(new SlotPurifier(inventoryplayer.player, tileentityPurifier, 2, 116, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                addSlot(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            addSlot(new Slot(inventoryplayer, j, 8 + j * 18, 142));
        }

    }

    public void updateCraftingResults()
    {
        super.updateCraftingResults();
        for(int i = 0; i < crafters.size(); i++)
        {
            ICrafting icrafting = (ICrafting)crafters.get(i);
            if(lastCookTime != Purifier.PurifierCookTime)
            {
                icrafting.updateCraftingInventoryInfo(this, 0, Purifier.PurifierCookTime);
            }
            if(lastBurnTime != Purifier.PurifierBurnTime)
            {
                icrafting.updateCraftingInventoryInfo(this, 1, Purifier.PurifierBurnTime);
            }
            if(lastItemBurnTime != Purifier.currentItemBurnTime)
            {
                icrafting.updateCraftingInventoryInfo(this, 2, Purifier.currentItemBurnTime);
            }
        }

        lastCookTime = Purifier.PurifierCookTime;
        lastBurnTime = Purifier.PurifierBurnTime;
        lastItemBurnTime = Purifier.currentItemBurnTime;
    }

    public void func_20112_a(int i, int j)
    {
        if(i == 0)
        {
            Purifier.PurifierCookTime = j;
        }
        if(i == 1)
        {
            Purifier.PurifierBurnTime = j;
        }
        if(i == 2)
        {
            Purifier.currentItemBurnTime = j;
        }
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return Purifier.canInteractWith(entityplayer);
    }

    public ItemStack getStackInSlot(int i)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)inventorySlots.get(i);
        if(slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if(i == 2)
            {
                if(!mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }
            } else
            if(i >= 3 && i < 30)
            {
                if(!mergeItemStack(itemstack1, 30, 39, false))
                {
                    return null;
                }
            } else
            if(i >= 30 && i < 39)
            {
                if(!mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            } else
            if(!mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }
            if(itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            } else
            {
                slot.onSlotChanged();
            }
            if(itemstack1.stackSize != itemstack.stackSize)
            {
                slot.onPickupFromSlot(itemstack1);
            } else
            {
                return null;
            }
        }
        return itemstack;
    }

    private TileEntityPurifier Purifier;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
}
