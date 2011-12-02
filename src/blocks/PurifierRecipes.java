package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

public class PurifierRecipes
{

    public static final PurifierRecipes smelting()
    {
        return smeltingBase;
    }

    private PurifierRecipes()
    {
        smeltingList = new HashMap();
        addSmelting(mod_elementsModGasBlocks.Hydrogen.blockID, new ItemStack(Item.stick));
    }

    public void addSmelting(int i, ItemStack itemstack)
    {
        smeltingList.put(Integer.valueOf(i), itemstack);
    }

    public ItemStack getSmeltingResult(int i)
    {
        return (ItemStack)smeltingList.get(Integer.valueOf(i));
    }

    public Map getSmeltingList()
    {
        return smeltingList;
    }

    private static final PurifierRecipes smeltingBase = new PurifierRecipes();
    private Map smeltingList;

}
