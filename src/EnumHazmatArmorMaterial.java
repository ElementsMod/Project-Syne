// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

public enum EnumHazmatArmorMaterial
{
    CLOTH("CLOTH", 0, 5, new int[] {
        1, 3, 2, 1
    }, 15);

    private int field_40577_f;
    private int field_40578_g[];
    private int enchantability;
    private int radiationDamageReduceAmount;
    private static final EnumHazmatArmorMaterial allArmorMaterials[]; /* synthetic field */

    private EnumHazmatArmorMaterial(String s, int i, int j, int ai[], int k)
    {
        field_40577_f = j;
        field_40578_g = ai;
        enchantability = k;
        radiationDamageReduceAmount = 5;
    }

    public int func_40576_a(int i)
    {
        return ItemArmor.getMaxDamageArray()[i] * field_40577_f;
    }

    public int func_40574_b(int i)
    {
        return field_40578_g[i];
    }
    
    public int getRadiationDamageReduced()
    {
    	return radiationDamageReduceAmount;
    }

    public int getEnchantability()
    {
        return enchantability;
    }

    static 
    {
        allArmorMaterials = (new EnumHazmatArmorMaterial[] {
            CLOTH
        });
    }
}
