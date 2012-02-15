package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

public class BessemerRecipes
{

    public static final BessemerRecipes Bessemering()
    {
        return BessemeringBase;
    }

    private BessemerRecipes()
    {
        BessemeringList = new HashMap();
        addBessemering(Item.ingotIron.shiftedIndex, new ItemStack(mod_ElementsModItems.SteelIngot));
    }

    public void addBessemering(int i, ItemStack itemstack)
    {
        BessemeringList.put(Integer.valueOf(i), itemstack);
    }

    public ItemStack getBessemeringResult(int i)
    {
        return (ItemStack)BessemeringList.get(Integer.valueOf(i));
    }

    public Map getBessemeringList()
    {
        return BessemeringList;
    }

    private static final BessemerRecipes BessemeringBase = new BessemerRecipes();
    private Map BessemeringList;

}
