package net.minecraft.src;


public enum EnumElementsArmorMaterial
{
	//Again, started from 5, since Vanilla Armor Materials end at 4 (Organization)
    BERYL("BERYL", 5, 25, new int[] {
        1, 3, 2, 1
    }, 15),
    BORON("BORON", 6, 30, new int[] {
        2, 5, 4, 1
    }, 12),
    ALUMINIUM("ALUMINIUM", 7, 7, new int[] {
        2, 6, 5, 2
    }, 9),
    TITANIUM("TITANIUM", 8, 20, new int[] {
        2, 5, 3, 1
    }, 25),
    CHROMIUM("CHROMIUM", 9, 26, new int[] {
        3, 8, 6, 3
    }, 10),
    COBALT("COBALT", 10, 13, new int[] {
        1, 3, 2, 1
    }, 15),
    NICKEL("NICKEL", 11, 7, new int[] {
        2, 5, 4, 1
    }, 12),
    COPPER("COPPER", 12, 7, new int[] {
        2, 6, 5, 2
    }, 9),
    ZIRCONIUM("ZIRCONIUM", 14, 7, new int[] {
        2, 5, 3, 1
    }, 25),
    SILVER("SILVER", 14, 5, new int[] {
        3, 8, 6, 3
    }, 10),
    TIN("TIN", 15, 5, new int[] {
        1, 3, 2, 1
    }, 15),
    PLATINUM("PLATINUM", 16, 8, new int[] {
        2, 5, 4, 1
    }, 12),
    LEAD("LEAD", 17, 5, new int[] {
        2, 6, 5, 2
    }, 9),
    CINNABAR("CINNABAR", 18, 7, new int[] {
        2, 5, 3, 1
    }, 25),
    BISMUTH("BISMUTH", 19, 8, new int[] {
        3, 8, 6, 3
    }, 10),
    URANIUM("URANIUM", 20, 20, new int[] {
        3, 8, 6, 3
    }, 10),
    PLUTONIUM("PLUTONIUM", 24, 5, new int[] {
        1, 3, 2, 1
    }, 15),
    STEEL("STEEL", 17, 5, new int[] {
        1, 3, 2, 1
    }, 15),
    BRONZE("BRONZE", 23, 8, new int[] {
        2, 5, 4, 1
    }, 12);

    private int field_40577_f;
    private int field_40578_g[];
    private int enchantability;
    private static final EnumElementsArmorMaterial allArmorMaterials[]; /* synthetic field */
    
    private EnumElementsArmorMaterial(String s, int i, int j, int ai[], int k)
    {
//        super(s, i);
        field_40577_f = j;
        field_40578_g = ai;
        enchantability = k;
    }

    public int func_40576_a(int i)
    {
        return ItemElementsArmor.func_40436_c()[i] * field_40577_f;
    }

    public int func_40574_b(int i)
    {
        return field_40578_g[i];
    }

    public int getEnchantability()
    {
        return enchantability;
    }

    static 
    {
        allArmorMaterials = (new EnumElementsArmorMaterial[] {
                BERYL, BORON, ALUMINIUM, TITANIUM, CHROMIUM, COBALT,
                NICKEL, COPPER, ZIRCONIUM, SILVER, TIN, PLATINUM, LEAD,
                CINNABAR, BISMUTH, URANIUM, PLUTONIUM, STEEL, BRONZE
        });
    }
}
