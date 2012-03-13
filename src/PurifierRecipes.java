package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

public class PurifierRecipes
{

    public static final PurifierRecipes Purifying()
    {
        return PurifyingBase;
    }

    private PurifierRecipes()
    {
        PurifyingList = new HashMap();
        //addPurifying(mod_elementsModGasBlocks.Hydrogen.blockID, new ItemStack(Item.stick));
    }

    public void addPurifying(int i, ItemStack itemstack)
    {
        PurifyingList.put(Integer.valueOf(i), itemstack);
    }

    public ItemStack getPurifyingResult(int i)
    {
        return (ItemStack)PurifyingList.get(Integer.valueOf(i));
    }

    public Map getPurifyingList()
    {
        return PurifyingList;
    }

    private static final PurifierRecipes PurifyingBase = new PurifierRecipes();
    private Map PurifyingList;

}
