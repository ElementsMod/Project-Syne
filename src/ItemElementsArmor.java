// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;


// Referenced classes of package net.minecraft.src:
//            Item, EnumArmorMaterial

public class ItemElementsArmor extends Item
implements ITextureProvider
{
	@Override
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
    private static final int maxDamageArray[] = {
        11, 16, 15, 13
    };
    public final int armorType;
    public final int damageReduceAmount;
    public final int renderIndex;
    private final EnumElementsArmorMaterial material;

    public ItemElementsArmor(int i, EnumElementsArmorMaterial enumelementsarmormaterial, int j, int k)
    {
        super(i);
        material = enumelementsarmormaterial;
        armorType = k;
        renderIndex = j;
        damageReduceAmount = enumelementsarmormaterial.func_40574_b(k);
        setMaxDamage(enumelementsarmormaterial.func_40576_a(k));
        maxStackSize = 1;
    }

    public int getItemEnchantability()
    {
        return material.getEnchantability();
    }

    static int[] func_40436_c()
    {
        return maxDamageArray;
    }
}