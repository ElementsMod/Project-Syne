package net.minecraft.src;

public class mod_Armor extends BaseMod
{
	public String Version()
	{
		return "1.8.1";
	}
	
	public static final Item HazmatHelmet = new ItemArmor (1110, EnumArmorMaterial.CLOTH, ModLoader.AddArmor("hazmat"), 0).setItemName("Hazmat Mask");
	public static final Item HazmatBody = new ItemArmor (1111, EnumArmorMaterial.CLOTH, ModLoader.AddArmor("hazmat2"), 1).setItemName("Hazmat Body");
	public static final Item HazmatPants= new ItemArmor (1112, EnumArmorMaterial.CLOTH, ModLoader.AddArmor("hazmat3"), 2).setItemName("Hazmat Pants");
	public static final Item HazmatBoots = new ItemArmor (1113, EnumArmorMaterial.CLOTH, ModLoader.AddArmor("hazmat4"), 3).setItemName("Hazmat Boots");
	
	public mod_Armor()
	{
		HazmatHelmet.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatHelm.png");
		HazmatBody.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatBody.png");
		HazmatPants.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatPants.png");
		HazmatBoots.iconIndex = ModLoader.addOverride("/gui/items.png", "/elements/Armor/HazmatBoots.png");
		
		ModLoader.AddName(HazmatHelmet, "Hazmat Mask");
		ModLoader.AddName(HazmatBody, "Hazmat Body");
		ModLoader.AddName(HazmatPants, "Hazmat Pants");
		ModLoader.AddName(HazmatBoots, "Hazmat Boots");
		
		ModLoader.AddRecipe(new ItemStack(HazmatHelmet, 1), new Object[]{
            "YXX", "XXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
		ModLoader.AddRecipe(new ItemStack(HazmatBody, 1), new Object[]{
            "XYX", "XXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
		ModLoader.AddRecipe(new ItemStack(HazmatPants, 1), new Object[]{
            "XXX", "XYX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
		ModLoader.AddRecipe(new ItemStack(HazmatBoots, 1), new Object[]{
            "XXX", "YXX", "XXX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
}
