package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

public class BessemerRecipes
{

    public static final BessemerRecipes smelting()
    {
        return smeltingBase;
    }

    private BessemerRecipes()
    {
        smeltingList = new HashMap();
        addSmelting(Item.ingotIron, new ItemStack(Item.stick));
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

    private static final BessemerRecipes smeltingBase = new BessemerRecipes();
    private Map smeltingList;

}
