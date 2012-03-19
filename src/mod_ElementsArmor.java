package net.minecraft.src;

public class mod_ElementsArmor extends BaseMod
{	
	public static final Item HazmatHelmet = new ItemArmor (1110, EnumArmorMaterial.CLOTH, ModLoader.addArmor("hazmat"), 0).setItemName("Hazmat Mask");
	public static final Item HazmatBody = new ItemArmor (1111, EnumArmorMaterial.CLOTH, ModLoader.addArmor("hazmat"), 1).setItemName("Hazmat Body");
	public static final Item HazmatPants= new ItemArmor (1112, EnumArmorMaterial.CLOTH, ModLoader.addArmor("hazmat"), 2).setItemName("Hazmat Pants");
	public static final Item HazmatBoots = new ItemArmor (1113, EnumArmorMaterial.CLOTH, ModLoader.addArmor("hazmat"), 3).setItemName("Hazmat Boots");
	
	public mod_ElementsArmor()
	{
		HazmatHelmet.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatHelm.png");
		HazmatBody.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatBody.png");
		HazmatPants.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatPants.png");
		HazmatBoots.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatBoots.png");
		
		ModLoader.addName(HazmatHelmet, "Hazmat Mask");
		ModLoader.addName(HazmatBody, "Hazmat Body");
		ModLoader.addName(HazmatPants, "Hazmat Pants");
		ModLoader.addName(HazmatBoots, "Hazmat Boots");
		
		ModLoader.addRecipe(new ItemStack(HazmatHelmet, 1), new Object[]{
            "YXX", "XXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
		ModLoader.addRecipe(new ItemStack(HazmatBody, 1), new Object[]{
            "XYX", "XXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
		ModLoader.addRecipe(new ItemStack(HazmatPants, 1), new Object[]{
            "XXY", "XXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
		ModLoader.addRecipe(new ItemStack(HazmatBoots, 1), new Object[]{
            "XXX", "YXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
	}
	
	public String getVersion()
	{
		return "1.2.3";
	}

	@Override
	public void load() 
	{
		// TODO Auto-generated method stub
	}
}
