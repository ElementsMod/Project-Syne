package net.minecraft.src;


public enum EnumElementsToolMaterial
{
	//Started at 5 because Vanilla Enum Types end at 4
	
	//TYPE("NAME", i, j, k, Float, l, i1)
    BERYL("BERYL", 5, 2, 1250, 11F, 2, 21),
    BORON("BORON", 6, 3, 1500, 12F, 3, 28),
    ALUMINIUM("ALUMINIUM", 7, 1, 400, 5F, 1, 14),
    TITANIUM("TITANIUM", 8, 2, 1000, 10F, 2, 20),
    CHROMIUM("CHROMIUM", 9, 2, 1300, 12F, 3, 26),
    COBALT("COBALT", 10, 2, 700, 7F, 2, 7),
    NICKEL("NICKEL", 11, 1, 450, 5F, 1, 4),
    COPPER("COPPER", 12, 1, 425, 4F, 1, 4),
    ZIRCONIUM("ZIRCONIUM", 13, 2, 750, 8F, 2, 7),
    SILVER("SILVER", 14, 0, 200, 2F, 1, 2),
    TIN("TIN", 15, 0, 80, 8F, 1, 1),
    PLATINUM("PLATINUM", 16, 2, 600, 8F, 2, 6),
    LEAD("LEAD", 17, 0, 80, 2F, 1, 1),
    CINNABAR("CINNABAR", 18, 1, 350, 4F, 1, 3),
    BISMUTH("BISMUTH", 19, 1, 350, 4F, 1, 3),
    URANIUM("URANIUM", 20, 2, 1000, 12F, 2, 28),
    PLUTONIUM("PLUTONIUM", 21, 2, 1200, 14F, 3, 30),
    STEEL("STEEL", 21, 1, 900, 4F, 1, 3),
    BRONZE("BRONZE", 21, 1, 300, 4F, 1, 3);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private final int enchantability;
    private static final EnumElementsToolMaterial[] allToolMaterials; /* synthetic field */

    private EnumElementsToolMaterial(String s, int i, int j, int k, float f, int l, int i1)
    {
        harvestLevel = j;
        maxUses = k;
        efficiencyOnProperMaterial = f;
        damageVsEntity = l;
        enchantability = i1;
    }

    public int getMaxUses()
    {
        return maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return efficiencyOnProperMaterial;
    }

    public int getDamageVsEntity()
    {
        return damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    public int getEnchantability()
    {
        return enchantability;
    }

    static 
    {
        allToolMaterials = (new EnumElementsToolMaterial[] {
            BERYL, BORON, ALUMINIUM, TITANIUM, CHROMIUM, COBALT,
            NICKEL, COPPER, ZIRCONIUM, SILVER, TIN, PLATINUM, LEAD,
            CINNABAR, BISMUTH, URANIUM, PLUTONIUM, STEEL, BRONZE
        });
	}
}
