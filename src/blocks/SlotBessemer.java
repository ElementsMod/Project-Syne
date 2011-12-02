package net.minecraft.src;

public class SlotBessemer extends Slot
{

    public SlotBessemer(EntityPlayer entityplayer, IInventory iinventory, int i, int j, int k)
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
