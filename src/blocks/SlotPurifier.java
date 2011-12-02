package net.minecraft.src;

public class SlotPurifier extends Slot
{

    public SlotPurifier(EntityPlayer entityplayer, IInventory iinventory, int i, int j, int k)
    {
        super(iinventory, i, j, k);
        thePlayer = entityplayer;
    }

    public boolean isItemValid(ItemStack itemstack)
    {
        return false;
    }

    private EntityPlayer thePlayer;
}
