package net.minecraft.src;

import java.util.logging.Logger;
import java.util.Random;

public class mod_ElementsModItems extends BaseMod
{
	private static final Logger MC = Logger.getLogger("Minecraft");
	private static EnumElementsToolMaterial Tool;
	private static EnumElementsArmorMaterial Armor;
	private static mod_ElementsModConfig EM;
	private static mod_ElementsModSolidBlocks EMSB;
	
	//Item Registration
		//Ingots and Gems
	public static final Item BerylGem;
	public static final Item BoronIngot;
	public static final Item AluminiumIngot;
	public static final Item TitaniumIngot;
	public static final Item ChromiumIngot;
	public static final Item CobaltIngot;
	public static final Item NickelIngot;
	public static final Item CopperIngot;
	public static final Item ZirconiumGem;
	public static final Item SilverIngot;
	public static final Item TinIngot;
	public static final Item PlatinumIngot;
	public static final Item LeadIngot;
	public static final Item CinnabarIngot;
	public static final Item BismuthIngot;
	public static final Item UraniumIngot;
	public static final Item PlutoniumIngot;
	public static final Item TinCopperMix;
	public static final Item BronzeIngot;
	public static final Item SteelIngot;
	
		//Tools
			//Beryl
	public static final Item BerylPickaxe;
	public static final Item BerylAxe;
	public static final Item BerylSpade;
	public static final Item BerylHoe;
	public static final Item BerylSword;
	
			//Titanium
	public static final Item BoronPickaxe;
	public static final Item BoronAxe;
	public static final Item BoronSpade;
	public static final Item BoronHoe;
	public static final Item BoronSword;

			//Aluminium
	public static final Item AluminiumPickaxe;
	public static final Item AluminiumAxe;
	public static final Item AluminiumSpade;
	public static final Item AluminiumHoe;
	public static final Item AluminiumSword;

			//Titanium
	public static final Item TitaniumPickaxe;
	public static final Item TitaniumAxe;
	public static final Item TitaniumSpade;
	public static final Item TitaniumHoe;
	public static final Item TitaniumSword;
	
			//Chromium
	public static final Item ChromiumPickaxe;
	public static final Item ChromiumAxe;
	public static final Item ChromiumSpade;
	public static final Item ChromiumHoe;
	public static final Item ChromiumSword;

			//Cobalt
	public static final Item CobaltPickaxe;
	public static final Item CobaltAxe;
	public static final Item CobaltSpade;
	public static final Item CobaltHoe;
	public static final Item CobaltSword;

			//Nickel
	public static final Item NickelPickaxe;
	public static final Item NickelAxe;
	public static final Item NickelSpade;
	public static final Item NickelHoe;
	public static final Item NickelSword;

			//Copper
	public static final Item CopperPickaxe;
	public static final Item CopperAxe;
	public static final Item CopperSpade;
	public static final Item CopperHoe;
	public static final Item CopperSword;
	
			//Zirconium
	public static final Item ZirconiumPickaxe;
	public static final Item ZirconiumAxe;
	public static final Item ZirconiumSpade;
	public static final Item ZirconiumHoe;
	public static final Item ZirconiumSword;

			//Silver
	public static final Item SilverPickaxe;
	public static final Item SilverAxe;
	public static final Item SilverSpade;
	public static final Item SilverHoe;
	public static final Item SilverSword;

			//Tin
	public static final Item TinPickaxe;
	public static final Item TinAxe;
	public static final Item TinSpade;
	public static final Item TinHoe;
	public static final Item TinSword;

			//Platinum
	public static final Item PlatinumPickaxe;
	public static final Item PlatinumAxe;
	public static final Item PlatinumSpade;
	public static final Item PlatinumHoe;
	public static final Item PlatinumSword;

			//Lead
	public static final Item LeadPickaxe;
	public static final Item LeadAxe;
	public static final Item LeadSpade;
	public static final Item LeadHoe;
	public static final Item LeadSword;

			//Cinnabar
	public static final Item CinnabarPickaxe;
	public static final Item CinnabarAxe;
	public static final Item CinnabarSpade;
	public static final Item CinnabarHoe;
	public static final Item CinnabarSword;

			//Bismuth
	public static final Item BismuthPickaxe;
	public static final Item BismuthAxe;
	public static final Item BismuthSpade;
	public static final Item BismuthHoe;
	public static final Item BismuthSword;

			//Uranium
	public static final Item UraniumPickaxe;
	public static final Item UraniumAxe;
	public static final Item UraniumSpade;
	public static final Item UraniumHoe;
	public static final Item UraniumSword;

			//Plutonium
	public static final Item PlutoniumPickaxe;
	public static final Item PlutoniumAxe;
	public static final Item PlutoniumSpade;
	public static final Item PlutoniumHoe;
	public static final Item PlutoniumSword;
	
		//Bronze
	public static final Item SteelPickaxe;
	public static final Item SteelAxe;
	public static final Item SteelSpade;
	public static final Item SteelHoe;
	public static final Item SteelSword;

			//Bronze
	public static final Item BronzePickaxe;
	public static final Item BronzeAxe;
	public static final Item BronzeSpade;
	public static final Item BronzeHoe;
	public static final Item BronzeSword;
	
		//Armors
			//Beryl
	public static final Item BerylHelmet;
	public static final Item BerylChestplate;
	public static final Item BerylLeggings;
	public static final Item BerylBoots;
	
			//Titanium
	public static final Item BoronHelmet;
	public static final Item BoronChestplate;
	public static final Item BoronLeggings;
	public static final Item BoronBoots;
	
			//Aluminium
	public static final Item AluminiumHelmet;
	public static final Item AluminiumChestplate;
	public static final Item AluminiumLeggings;
	public static final Item AluminiumBoots;
	
			//Titanium
	public static final Item TitaniumHelmet;
	public static final Item TitaniumChestplate;
	public static final Item TitaniumLeggings;
	public static final Item TitaniumBoots;
	
			//Chromium
	public static final Item ChromiumHelmet;
	public static final Item ChromiumChestplate;
	public static final Item ChromiumLeggings;
	public static final Item ChromiumBoots;
	
			//Cobalt
	public static final Item CobaltHelmet;
	public static final Item CobaltChestplate;
	public static final Item CobaltLeggings;
	public static final Item CobaltBoots;
	
			//Nickel
	public static final Item NickelHelmet;
	public static final Item NickelChestplate;
	public static final Item NickelLeggings;
	public static final Item NickelBoots;
	
			//Copper
	public static final Item CopperHelmet;
	public static final Item CopperChestplate;
	public static final Item CopperLeggings;
	public static final Item CopperBoots;
	
			//Zirconium
	public static final Item ZirconiumHelmet;
	public static final Item ZirconiumChestplate;
	public static final Item ZirconiumLeggings;
	public static final Item ZirconiumBoots;
	
			//Silver
	public static final Item SilverHelmet;
	public static final Item SilverChestplate;
	public static final Item SilverLeggings;
	public static final Item SilverBoots;
	
			//Tin
	public static final Item TinHelmet;
	public static final Item TinChestplate;
	public static final Item TinLeggings;
	public static final Item TinBoots;
	
			//Platinum
	public static final Item PlatinumHelmet;
	public static final Item PlatinumChestplate;
	public static final Item PlatinumLeggings;
	public static final Item PlatinumBoots;
	
			//Lead
	public static final Item LeadHelmet;
	public static final Item LeadChestplate;
	public static final Item LeadLeggings;
	public static final Item LeadBoots;
	
			//Cinnabar
	public static final Item CinnabarHelmet;
	public static final Item CinnabarChestplate;
	public static final Item CinnabarLeggings;
	public static final Item CinnabarBoots;
	
			//Bismuth
	public static final Item BismuthHelmet;
	public static final Item BismuthChestplate;
	public static final Item BismuthLeggings;
	public static final Item BismuthBoots;
	
			//Uranium
	public static final Item UraniumHelmet;
	public static final Item UraniumChestplate;
	public static final Item UraniumLeggings;
	public static final Item UraniumBoots;
	
			//Uranium
	public static final Item PlutoniumHelmet;
	public static final Item PlutoniumChestplate;
	public static final Item PlutoniumLeggings;
	public static final Item PlutoniumBoots;
	
			//Uranium
	public static final Item SteelHelmet;
	public static final Item SteelChestplate;
	public static final Item SteelLeggings;
	public static final Item SteelBoots;
	
			//Uranium
	public static final Item BronzeHelmet;
	public static final Item BronzeChestplate;
	public static final Item BronzeLeggings;
	public static final Item BronzeBoots;

	public mod_ElementsModItems()
	{	
		//ModLoader addName Registers:
			//Tools
				//Beryl
		ModLoader.addName(BerylGem, "Beryl");
		ModLoader.addName(BerylPickaxe, "Beryl Pickaxe");
		ModLoader.addName(BerylAxe, "Beryl Axe");
		ModLoader.addName(BerylSpade, "Beryl Boots");
		ModLoader.addName(BerylHoe, "Beryl Hoe");
		ModLoader.addName(BerylSword, "Beryl Sword");
		
			//Titanium
		ModLoader.addName(TitaniumIngot, "Titanium Ingot");
		ModLoader.addName(TitaniumPickaxe, "Titanium Pickaxe");
		ModLoader.addName(TitaniumAxe, "Titanium Axe");
		ModLoader.addName(TitaniumSpade, "Titanium Boots");
		ModLoader.addName(TitaniumHoe, "Titanium Hoe");
		ModLoader.addName(TitaniumSword, "Titanium Sword");
		
			//Aluminium
		ModLoader.addName(AluminiumIngot, "Aluminium Ingot");
		ModLoader.addName(AluminiumPickaxe, "Aluminium Pickaxe");
		ModLoader.addName(AluminiumAxe, "Aluminium Axe");
		ModLoader.addName(AluminiumSpade, "Aluminium Boots");
		ModLoader.addName(AluminiumHoe, "Aluminium Hoe");
		ModLoader.addName(AluminiumSword, "Aluminium Sword");
		
			//Titanium
		ModLoader.addName(TitaniumIngot, "Titanium Ingot");
		ModLoader.addName(TitaniumPickaxe, "Titanium Pickaxe");
		ModLoader.addName(TitaniumAxe, "Titanium Axe");
		ModLoader.addName(TitaniumSpade, "Titanium Boots");
		ModLoader.addName(TitaniumHoe, "Titanium Hoe");
		ModLoader.addName(TitaniumSword, "Titanium Sword");
		
			//Chromium
		ModLoader.addName(ChromiumIngot, "Chromium Ingot");
		ModLoader.addName(ChromiumPickaxe, "Chromium Pickaxe");
		ModLoader.addName(ChromiumAxe, "Chromium Axe");
		ModLoader.addName(ChromiumSpade, "Chromium Boots");
		ModLoader.addName(ChromiumHoe, "Chromium Hoe");
		ModLoader.addName(ChromiumSword, "Chromium Sword");
		
			//Cobalt
		ModLoader.addName(CobaltIngot, "Cobalt Ingot");
		ModLoader.addName(CobaltPickaxe, "Cobalt Pickaxe");
		ModLoader.addName(CobaltAxe, "Cobalt Axe");
		ModLoader.addName(CobaltSpade, "Cobalt Boots");
		ModLoader.addName(CobaltHoe, "Cobalt Hoe");
		ModLoader.addName(CobaltSword, "Cobalt Sword");
		
			//Nickel
		ModLoader.addName(NickelIngot, "Nickel Ingot");
		ModLoader.addName(NickelPickaxe, "Nickel Pickaxe");
		ModLoader.addName(NickelAxe, "Nickel Axe");
		ModLoader.addName(NickelSpade, "Nickel Boots");
		ModLoader.addName(NickelHoe, "Nickel Hoe");
		ModLoader.addName(NickelSword, "Nickel Sword");
			
			//Copper
		ModLoader.addName(CopperIngot, "Copper Ingot");
		ModLoader.addName(CopperPickaxe, "Copper Pickaxe");
		ModLoader.addName(CopperAxe, "Copper Axe");
		ModLoader.addName(CopperSpade, "Copper Boots");
		ModLoader.addName(CopperHoe, "Copper Hoe");
		ModLoader.addName(CopperSword, "Copper Sword");
		
			//Zirconium
		ModLoader.addName(ZirconiumGem, "Zirconium Gem");
		ModLoader.addName(ZirconiumPickaxe, "Zirconium Pickaxe");
		ModLoader.addName(ZirconiumAxe, "Zirconium Axe");
		ModLoader.addName(ZirconiumSpade, "Zirconium Boots");
		ModLoader.addName(ZirconiumHoe, "Zirconium Hoe");
		ModLoader.addName(ZirconiumSword, "Zirconium Sword");
		
		ModLoader.addName(SilverIngot, "Silver Ingot");
		ModLoader.addName(SilverPickaxe, "Silver Pickaxe");
		ModLoader.addName(SilverAxe, "Silver Axe");
		ModLoader.addName(SilverSpade, "Silver Boots");
		ModLoader.addName(SilverHoe, "Silver Hoe");
		ModLoader.addName(SilverSword, "Silver Sword");
		
		ModLoader.addName(TinIngot, "Tin Ingot");
		ModLoader.addName(TinPickaxe, "Tin Pickaxe");
		ModLoader.addName(TinAxe, "Tin Axe");
		ModLoader.addName(TinSpade, "Tin Boots");
		ModLoader.addName(TinHoe, "Tin Hoe");
		ModLoader.addName(TinSword, "Tin Sword");
		
		ModLoader.addName(PlatinumIngot, "Platinum Ingot");
		ModLoader.addName(PlatinumPickaxe, "Platinum Pickaxe");
		ModLoader.addName(PlatinumAxe, "Platinum Axe");
		ModLoader.addName(PlatinumSpade, "Platinum Boots");
		ModLoader.addName(PlatinumHoe, "Platinum Hoe");
		ModLoader.addName(PlatinumSword, "Platinum Sword");
		
		ModLoader.addName(LeadIngot, "Lead Ingot");
		ModLoader.addName(LeadPickaxe, "Lead Pickaxe");
		ModLoader.addName(LeadAxe, "Lead Axe");
		ModLoader.addName(LeadSpade, "Lead Boots");
		ModLoader.addName(LeadHoe, "Lead Hoe");
		ModLoader.addName(LeadSword, "Lead Sword");
		
		ModLoader.addName(CinnabarIngot, "Cinnabar Ingot");
		ModLoader.addName(CinnabarPickaxe, "Cinnabar Pickaxe");
		ModLoader.addName(CinnabarAxe, "Cinnabar Axe");
		ModLoader.addName(CinnabarSpade, "Cinnabar Boots");
		ModLoader.addName(CinnabarHoe, "Cinnabar Hoe");
		ModLoader.addName(CinnabarSword, "Cinnabar Sword");
		
		ModLoader.addName(BismuthIngot, "Bismuth Ingot");
		ModLoader.addName(BismuthPickaxe, "Bismuth Pickaxe");
		ModLoader.addName(BismuthAxe, "Bismuth Axe");
		ModLoader.addName(BismuthSpade, "Bismuth Boots");
		ModLoader.addName(BismuthHoe, "Bismuth Hoe");
		ModLoader.addName(BismuthSword, "Bismuth Sword");
		
		ModLoader.addName(UraniumIngot, "Uranium Ingot");
		ModLoader.addName(UraniumPickaxe, "Uranium Pickaxe");
		ModLoader.addName(UraniumAxe, "Uranium Axe");
		ModLoader.addName(UraniumSpade, "Uranium Boots");
		ModLoader.addName(UraniumHoe, "Uranium Hoe");
		ModLoader.addName(UraniumSword, "Uranium Sword");
		
		ModLoader.addName(PlutoniumIngot, "Plutonium Ingot");
		ModLoader.addName(PlutoniumPickaxe, "Plutonium Pickaxe");
		ModLoader.addName(PlutoniumAxe, "Plutonium Axe");
		ModLoader.addName(PlutoniumSpade, "Plutonium Boots");
		ModLoader.addName(PlutoniumHoe, "Plutonium Hoe");
		ModLoader.addName(PlutoniumSword, "Plutonium Sword");
		
			//Armor
				//Beryl
		ModLoader.addName(BerylHelmet, "Plutonium Helmet");
		ModLoader.addName(BerylChestplate, "Plutonium ChestPlate");
		ModLoader.addName(BerylLeggings, "Plutonium Leggings");
		ModLoader.addName(BerylBoots, "Plutonium Boots");
		
				//Titanium
		ModLoader.addName(TitaniumHelmet, "Plutonium Helmet");
		ModLoader.addName(TitaniumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(TitaniumLeggings, "Plutonium Leggings");
		ModLoader.addName(TitaniumBoots, "Plutonium Boots");
		
				//Aluminium
		ModLoader.addName(AluminiumHelmet, "Plutonium Helmet");
		ModLoader.addName(AluminiumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(AluminiumLeggings, "Plutonium Leggings");
		ModLoader.addName(AluminiumBoots, "Plutonium Boots");

				//Titanium
		ModLoader.addName(TitaniumHelmet, "Plutonium Helmet");
		ModLoader.addName(TitaniumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(TitaniumLeggings, "Plutonium Leggings");
		ModLoader.addName(TitaniumBoots, "Plutonium Boots");
		
				//Chromium
		ModLoader.addName(ChromiumHelmet, "Plutonium Helmet");
		ModLoader.addName(ChromiumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(ChromiumLeggings, "Plutonium Leggings");
		ModLoader.addName(ChromiumBoots, "Plutonium Boots");

				//Cobalt
		ModLoader.addName(CobaltHelmet, "Plutonium Helmet");
		ModLoader.addName(CobaltChestplate, "Plutonium ChestPlate");
		ModLoader.addName(CobaltLeggings, "Plutonium Leggings");
		ModLoader.addName(CobaltBoots, "Plutonium Boots");

				//Nickel
		ModLoader.addName(NickelHelmet, "Nickel Helmet");
		ModLoader.addName(NickelChestplate, "Plutonium ChestPlate");
		ModLoader.addName(NickelLeggings, "Plutonium Leggings");
		ModLoader.addName(NickelBoots, "Plutonium Boots");

				//Copper
		ModLoader.addName(CopperHelmet, "Copper Helmet");
		ModLoader.addName(CopperChestplate, "Copper ChestPlate");
		ModLoader.addName(CopperLeggings, "Copper Leggings");
		ModLoader.addName(CopperBoots, "Copper Boots");
		
				//Zirconium
		ModLoader.addName(ZirconiumHelmet, "Zirconium Helmet");
		ModLoader.addName(ZirconiumChestplate, "Zirconium ChestPlate");
		ModLoader.addName(ZirconiumLeggings, "Zirconium Leggings");
		ModLoader.addName(ZirconiumBoots, "Zirconium Boots");

				//Cobalt
		ModLoader.addName(CobaltHelmet, "Plutonium Helmet");
		ModLoader.addName(CobaltChestplate, "Plutonium ChestPlate");
		ModLoader.addName(CobaltLeggings, "Plutonium Leggings");
		ModLoader.addName(CobaltBoots, "Plutonium Boots");

				//Aluminium
		ModLoader.addName(AluminiumHelmet, "Plutonium Helmet");
		ModLoader.addName(AluminiumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(AluminiumLeggings, "Plutonium Leggings");
		ModLoader.addName(AluminiumBoots, "Plutonium Boots");

				//Titanium
		ModLoader.addName(TitaniumHelmet, "Plutonium Helmet");
		ModLoader.addName(TitaniumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(TitaniumLeggings, "Plutonium Leggings");
		ModLoader.addName(TitaniumBoots, "Plutonium Boots");
		
				//Chromium
		ModLoader.addName(ChromiumHelmet, "Plutonium Helmet");
		ModLoader.addName(ChromiumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(ChromiumLeggings, "Plutonium Leggings");
		ModLoader.addName(ChromiumBoots, "Plutonium Boots");

				//Cobalt
		ModLoader.addName(CobaltHelmet, "Plutonium Helmet");
		ModLoader.addName(CobaltChestplate, "Plutonium ChestPlate");
		ModLoader.addName(CobaltLeggings, "Plutonium Leggings");
		ModLoader.addName(CobaltBoots, "Plutonium Boots");

				//Aluminium
		ModLoader.addName(AluminiumHelmet, "Plutonium Helmet");
		ModLoader.addName(AluminiumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(AluminiumLeggings, "Plutonium Leggings");
		ModLoader.addName(AluminiumBoots, "Plutonium Boots");

				//Titanium
		ModLoader.addName(TitaniumHelmet, "Plutonium Helmet");
		ModLoader.addName(TitaniumChestplate, "Plutonium ChestPlate");
		ModLoader.addName(TitaniumLeggings, "Plutonium Leggings");
		ModLoader.addName(TitaniumBoots, "Plutonium Boots");
		
		ModLoader.setInGameHook(this, true, false);
		ModLoader.setInGUIHook(this, true, false);
		
		//Pickaxe Recipes
		ModLoader.addRecipe(new ItemStack(BerylPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), BerylGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BoronPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), BoronIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(AluminiumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), AluminiumIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), TitaniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(ChromiumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), ChromiumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CobaltPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), CobaltIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(NickelPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), NickelIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CopperPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), CopperIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), ZirconiumGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(SilverPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), SilverIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(TinPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), TinIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlatinumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), PlatinumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(LeadPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), LeadIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), CinnabarIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BismuthPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), BismuthIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(UraniumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), UraniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlutoniumPickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), PlutoniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BronzePickaxe, 1), new Object[] {
            "###"," S "," S ", Character.valueOf('#'), BronzeIngot, Character.valueOf('S'), Item.stick,
		});
		
		//Axe Recipes
		/*
		ModLoader.addRecipe(new ItemStack(BerylAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), BerylGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BoronAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), BoronIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(AluminiumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), AluminiumIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), TitaniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(ChromiumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), ChromiumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CobaltAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), CobaltIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(NickelAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), NickelIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CopperAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), CopperIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), ZirconiumGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(SilverAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), SilverIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(TinAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), TinIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlatinumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), PlatinumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(LeadAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), LeadIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), CinnabarIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BismuthAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), BismuthIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(UraniumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), UraniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlutoniumAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), PlutoniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BronzeAxe, 1), new Object[] {
            "##","#S"," S ", Character.valueOf('#'), BronzeIngot, Character.valueOf('S'), Item.stick,
		});
		
		//Shovel Recipes
		
		ModLoader.addRecipe(new ItemStack(BerylSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), BerylGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BoronSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), BoronIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(AluminiumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), AluminiumIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), TitaniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(ChromiumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), ChromiumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CobaltSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), CobaltIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(NickelSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), NickelIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CopperSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), CopperIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), ZirconiumGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(SilverSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), SilverIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(TinSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), TinIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlatinumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), PlatinumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(LeadSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), LeadIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), CinnabarIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BismuthSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), BismuthIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(UraniumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), UraniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlutoniumSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), PlutoniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BronzeSpade, 1), new Object[] {
            "#"," S "," S ", Character.valueOf('#'), BronzeIngot, Character.valueOf('S'), Item.stick,
		});
		
		//Sword Recipes
		ModLoader.addRecipe(new ItemStack(BerylSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), BerylGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BoronSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), BoronIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(AluminiumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), AluminiumIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), TitaniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(ChromiumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), ChromiumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CobaltSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), CobaltIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(NickelSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), NickelIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CopperSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), CopperIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), ZirconiumGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(SilverSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), SilverIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(TinSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), TinIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlatinumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), PlatinumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(LeadSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), LeadIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), CinnabarIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BismuthSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), BismuthIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(UraniumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), UraniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlutoniumSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), PlutoniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BronzeSword, 1), new Object[] {
			"#","#","S", Character.valueOf('#'), BronzeIngot, Character.valueOf('S'), Item.stick,
		});
		
		//Hoe Recipes
		ModLoader.addRecipe(new ItemStack(BerylHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), BerylGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BoronHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), BoronIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(AluminiumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), AluminiumIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), TitaniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(ChromiumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), ChromiumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CobaltHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), CobaltIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(NickelHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), NickelIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(CopperHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), CopperIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), ZirconiumGem, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(SilverHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), SilverIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(TinHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), TinIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlatinumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), PlatinumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(LeadHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), LeadIngot, Character.valueOf('S'), Item.stick,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), CinnabarIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BismuthHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), BismuthIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(UraniumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), UraniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(PlutoniumHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), PlutoniumIngot, Character.valueOf('S'), Item.stick,
        });
		ModLoader.addRecipe(new ItemStack(BronzeHoe, 1), new Object[] {
            "##"," S "," S ", Character.valueOf('#'), BronzeIngot, Character.valueOf('S'), Item.stick,
		});*/
		
		//Chestplates Armor recipes
		
		ModLoader.addRecipe(new ItemStack(BerylChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), BerylGem,
		});
		ModLoader.addRecipe(new ItemStack(BoronChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), BoronIngot,
		});
		ModLoader.addRecipe(new ItemStack(AluminiumChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), AluminiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), TitaniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(ChromiumChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), ChromiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(CobaltChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), CobaltIngot,
		});
		ModLoader.addRecipe(new ItemStack(NickelChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), NickelIngot,
		});
		ModLoader.addRecipe(new ItemStack(CopperChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), CopperIngot,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), ZirconiumGem,
		});
		ModLoader.addRecipe(new ItemStack(SilverChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), SilverIngot,
		});
		ModLoader.addRecipe(new ItemStack(TinChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), TinIngot,
		});
		ModLoader.addRecipe(new ItemStack(PlatinumChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), PlatinumIngot,
		});
		ModLoader.addRecipe(new ItemStack(LeadChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), LeadIngot,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), CinnabarIngot,
		});
		ModLoader.addRecipe(new ItemStack(BismuthChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), BismuthIngot,
		});
		ModLoader.addRecipe(new ItemStack(UraniumChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), UraniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(BronzeChestplate, 1), new Object[] {
            "# #",
            "###",
            "###",
            Character.valueOf('#'), BronzeIngot,
		});
		
		//Helmets
		
		ModLoader.addRecipe(new ItemStack(BerylHelmet, 1), new Object[] {
            "###",
            "# #",
            Character.valueOf('#'), BerylGem,
		});
		ModLoader.addRecipe(new ItemStack(BoronChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), BoronIngot,
		});
		ModLoader.addRecipe(new ItemStack(AluminiumChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), AluminiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), TitaniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(ChromiumChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), ChromiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(CobaltChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), CobaltIngot,
		});
		ModLoader.addRecipe(new ItemStack(NickelChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), NickelIngot,
		});
		ModLoader.addRecipe(new ItemStack(CopperChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), CopperIngot,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), ZirconiumGem,
		});
		ModLoader.addRecipe(new ItemStack(SilverChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), SilverIngot,
		});
		ModLoader.addRecipe(new ItemStack(TinChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), TinIngot,
		});
		ModLoader.addRecipe(new ItemStack(PlatinumChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), PlatinumIngot,
		});
		ModLoader.addRecipe(new ItemStack(LeadChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), LeadIngot,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), CinnabarIngot,
		});
		ModLoader.addRecipe(new ItemStack(BismuthChestplate, 1), new Object[] {
            "###",
            "# #",
            Character.valueOf('#'), BismuthIngot,
		});
		ModLoader.addRecipe(new ItemStack(UraniumChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), UraniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(BronzeChestplate, 1), new Object[] {
			"###",
            "# #",
            Character.valueOf('#'), BronzeIngot,
		});
		
		//Leggings

		ModLoader.addRecipe(new ItemStack(BerylLeggings, 1), new Object[] {
            "###",
            "# #",
            "# #",
            Character.valueOf('#'), BerylGem,
		});
		ModLoader.addRecipe(new ItemStack(BoronLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), BoronIngot,
		});
		ModLoader.addRecipe(new ItemStack(AluminiumLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), AluminiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), TitaniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(ChromiumLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), ChromiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(CobaltLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), CobaltIngot,
		});
		ModLoader.addRecipe(new ItemStack(NickelLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), NickelIngot,
		});
		ModLoader.addRecipe(new ItemStack(CopperLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), CopperIngot,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), ZirconiumGem,
		});
		ModLoader.addRecipe(new ItemStack(SilverLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), SilverIngot,
		});
		ModLoader.addRecipe(new ItemStack(TinLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), TinIngot,
		});
		ModLoader.addRecipe(new ItemStack(PlatinumLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), PlatinumIngot,
		});
		ModLoader.addRecipe(new ItemStack(LeadLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), LeadIngot,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), CinnabarIngot,
		});
		ModLoader.addRecipe(new ItemStack(BismuthLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), BismuthIngot,
		});
		ModLoader.addRecipe(new ItemStack(UraniumLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), UraniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(BronzeLeggings, 1), new Object[] {
			"###",
            "# #",
            "# #",
            Character.valueOf('#'), BronzeIngot,
		});
		
		//Boots
		
		ModLoader.addRecipe(new ItemStack(BerylHelmet, 1), new Object[] {
            "# #",
            "# #",
            Character.valueOf('#'), BerylGem,
		});
		ModLoader.addRecipe(new ItemStack(BoronBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), BoronIngot,
		});
		ModLoader.addRecipe(new ItemStack(AluminiumBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), AluminiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(TitaniumBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), TitaniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(ChromiumBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), ChromiumIngot,
		});
		ModLoader.addRecipe(new ItemStack(CobaltBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), CobaltIngot,
		});
		ModLoader.addRecipe(new ItemStack(NickelBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), NickelIngot,
		});
		ModLoader.addRecipe(new ItemStack(CopperBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), CopperIngot,
		});
		ModLoader.addRecipe(new ItemStack(ZirconiumBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), ZirconiumGem,
		});
		ModLoader.addRecipe(new ItemStack(SilverBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), SilverIngot,
		});
		ModLoader.addRecipe(new ItemStack(TinBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), TinIngot,
		});
		ModLoader.addRecipe(new ItemStack(PlatinumBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), PlatinumIngot,
		});
		ModLoader.addRecipe(new ItemStack(LeadBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), LeadIngot,
		});
		ModLoader.addRecipe(new ItemStack(CinnabarBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), CinnabarIngot,
		});
		ModLoader.addRecipe(new ItemStack(BismuthBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), BismuthIngot,
		});
		ModLoader.addRecipe(new ItemStack(UraniumBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), UraniumIngot,
		});
		ModLoader.addRecipe(new ItemStack(BronzeBoots, 1), new Object[] {
			"# #",
            "# #",
            Character.valueOf('#'), BronzeIngot,
		});
		
		
		
		
		
		
		
		//Smelting Recipes
		ModLoader.addSmelting(EMSB.Boron.blockID, new ItemStack(BoronIngot));
		ModLoader.addSmelting(EMSB.Aluminium.blockID, new ItemStack(AluminiumIngot));
		ModLoader.addSmelting(EMSB.Titanium.blockID, new ItemStack(TitaniumIngot));
		ModLoader.addSmelting(EMSB.Chromium.blockID, new ItemStack(ChromiumIngot));
		ModLoader.addSmelting(EMSB.Cobalt.blockID, new ItemStack(CobaltIngot));
		ModLoader.addSmelting(EMSB.Nickel.blockID, new ItemStack(NickelIngot));
		ModLoader.addSmelting(EMSB.Copper.blockID, new ItemStack(CopperIngot));
		ModLoader.addSmelting(EMSB.Silver.blockID, new ItemStack(SilverIngot));
		ModLoader.addSmelting(EMSB.Tin.blockID, new ItemStack(TinIngot));
		ModLoader.addSmelting(EMSB.Platinum.blockID, new ItemStack(PlatinumIngot));
		ModLoader.addSmelting(EMSB.Lead.blockID, new ItemStack(LeadIngot));
		ModLoader.addSmelting(EMSB.Mercury.blockID, new ItemStack(CinnabarIngot));
		ModLoader.addSmelting(EMSB.Bismuth.blockID, new ItemStack(BismuthIngot));
		ModLoader.addSmelting(EMSB.Uranium.blockID, new ItemStack(UraniumIngot));
		ModLoader.addSmelting(EMSB.Plutonium.blockID, new ItemStack(PlutoniumIngot));
		ModLoader.addSmelting(TinCopperMix.shiftedIndex, new ItemStack(BronzeIngot));
	}
	
	public static void onLoadedTools()
	{
		MC.info("Loaded tools from the" + onElementsFileName());
	}
	
	public static void onLoadedArmor()
	{
		MC.info("Loaded armor from the" + onElementsFileName());
	}
	
	public static String onElementsFileName()
	{
		return " mod_ElementsModItems.class";
	}
	
	static
	{
		BerylGem = (new ItemBerylGem(EM.BerylGemID)).setIconIndex(144).setItemName("Beryl Gem");
		BoronIngot = (new ItemBoronIngot(EM.BoronIngotID)).setIconIndex(145).setItemName("Titanium Ingot");
		AluminiumIngot = (new ItemAluminiumIngot(EM.AluminiumIngotID)).setIconIndex(146).setItemName("Aluminium Ingot");
		TitaniumIngot = (new ItemTitaniumIngot(EM.TitaniumIngotID)).setIconIndex(147).setItemName("Titanium Ingot");
		ChromiumIngot = (new ItemChromiumIngot(EM.ChromiumIngotID)).setIconIndex(148).setItemName("Chromium Ingot");
		CobaltIngot = (new ItemCobaltIngot(EM.CobaltIngotID)).setIconIndex(149).setItemName("Cobalt Ingot");
		NickelIngot = (new ItemNickelIngot(EM.NickelIngotID)).setIconIndex(150).setItemName("Nickel Ingot");
		CopperIngot = (new ItemCopperIngot(EM.CopperIngotID)).setIconIndex(151).setItemName("Copper Ingot");
		ZirconiumGem = (new ItemZirconiumGem(EM.ZirconiumGemID)).setIconIndex(152).setItemName("Zirconium Ingot");
		SilverIngot = (new ItemSilverIngot(EM.SilverIngotID)).setIconIndex(153).setItemName("Silver Ingot");
		TinIngot = (new ItemTinIngot(EM.TinIngotID)).setIconIndex(154).setItemName("Tin Ingot");
		PlatinumIngot = (new ItemPlatinumIngot(EM.PlatinumIngotID)).setIconIndex(155).setItemName("Platinum Ingot");
		LeadIngot = (new ItemLeadIngot(EM.LeadIngotID)).setIconIndex(156).setItemName("Lead Ingot");
		CinnabarIngot = (new ItemCinnabarIngot(EM.CinnabarIngotID)).setIconIndex(157).setItemName("Cinnabar Ingot");
		BismuthIngot = (new ItemBismuthIngot(EM.BismuthIngotID)).setIconIndex(158).setItemName("Bismuth Ingot");
		UraniumIngot = (new ItemUraniumIngot(EM.UraniumIngotID)).setIconIndex(159).setItemName("Uranium Ingot");
		PlutoniumIngot = (new ItemPlutoniumIngot(EM.PlutoniumIngotID)).setIconIndex(160).setItemName("Plutonium Ingot");
		BronzeIngot = (new ItemBronzeIngot(EM.BronzeIngotID)).setIconIndex(209).setItemName("Bronze Ingot");
		SteelIngot = (new ItemSteelIngot(EM.SteelIngotID)).setIconIndex(301).setItemName("Steel Ingot");
		
		BerylPickaxe = (new ItemElementsPickaxe(7000,  Tool.BERYL)).setIconIndex(96).setItemName("Beryl Pickaxe");
		BerylAxe = (new ItemElementsAxe(7020, Tool.BERYL)).setIconIndex(112).setItemName("Beryl Axe");
		BerylSpade = (new ItemElementsSpade(7040, Tool.BERYL)).setIconIndex(80).setItemName("Beryl Spade");
		BerylHoe = (new ItemElementsHoe(7060, Tool.BERYL)).setIconIndex(128).setItemName("Beryl Hoe");
		BerylSword = (new ItemElementsSword(7080, Tool.BERYL)).setIconIndex(64).setItemName("Beryl Sword");
		
		BoronPickaxe = (new ItemElementsPickaxe(7001, Tool.BORON)).setIconIndex(97).setItemName("Boron Pickaxe");
		BoronAxe = (new ItemElementsAxe(7002, Tool.BORON)).setIconIndex(113).setItemName("Boron Axe");
		BoronSpade = (new ItemElementsSpade(7003, Tool.BORON)).setIconIndex(81).setItemName("Boron Spade");
		BoronHoe = (new ItemElementsHoe(7004, Tool.BORON)).setIconIndex(129).setItemName("Boron Hoe");
		BoronSword = (new ItemElementsSword(7005, Tool.BORON)).setIconIndex(65).setItemName("Boron Sword");
		
		AluminiumPickaxe = (new ItemElementsPickaxe(7006, Tool.ALUMINIUM)).setIconIndex(98).setItemName("Aluminium Pickaxe");
		AluminiumAxe = (new ItemElementsAxe(7007, Tool.ALUMINIUM)).setIconIndex(114).setItemName("Aluminium Axe");
		AluminiumSpade = (new ItemElementsSpade(7008, Tool.ALUMINIUM)).setIconIndex(82).setItemName("Aluminium Spade");
		AluminiumHoe = (new ItemElementsHoe(7009, Tool.ALUMINIUM)).setIconIndex(130).setItemName("Aluminium Hoe");
		AluminiumSword = (new ItemElementsSword(7010, Tool.ALUMINIUM)).setIconIndex(66).setItemName("Aluminium Sword");
		
		TitaniumPickaxe = (new ItemElementsPickaxe(7011, Tool.TITANIUM)).setIconIndex(99).setItemName("Titanium Pickaxe");
		TitaniumAxe = (new ItemElementsAxe(7012, Tool.TITANIUM)).setIconIndex(115).setItemName("Titanium Axe");
		TitaniumSpade = (new ItemElementsSpade(7013, Tool.TITANIUM)).setIconIndex(83).setItemName("Titanium Spade");
		TitaniumHoe = (new ItemElementsHoe(7014, Tool.TITANIUM)).setIconIndex(131).setItemName("Titanium Hoe");
		TitaniumSword = (new ItemElementsSword(7015, Tool.TITANIUM)).setIconIndex(67).setItemName("Titanium Sword");
		
		ChromiumPickaxe = (new ItemElementsPickaxe(7016, Tool.CHROMIUM)).setIconIndex(100).setItemName("Chromium Pickaxe");
		ChromiumAxe = (new ItemElementsAxe(7017, Tool.CHROMIUM)).setIconIndex(116).setItemName("Chromium Axe");
		ChromiumSpade = (new ItemElementsSpade(7018, Tool.CHROMIUM)).setIconIndex(84).setItemName("Chromium Spade");
		ChromiumHoe = (new ItemElementsHoe(7019, Tool.CHROMIUM)).setIconIndex(132).setItemName("Chromium Hoe");
		ChromiumSword = (new ItemElementsSword(7020, Tool.CHROMIUM)).setIconIndex(68).setItemName("Chromium Sword");
		
		CobaltPickaxe = (new ItemElementsPickaxe(7021, Tool.COBALT)).setIconIndex(101).setItemName("Cobalt Pickaxe");
		CobaltAxe = (new ItemElementsAxe(7022, Tool.COBALT)).setIconIndex(117).setItemName("Cobalt Axe");
		CobaltSpade = (new ItemElementsSpade(7023, Tool.COBALT)).setIconIndex(85).setItemName("Cobalt Spade");
		CobaltHoe = (new ItemElementsHoe(7024, Tool.COBALT)).setIconIndex(133).setItemName("Cobalt Hoe");
		CobaltSword = (new ItemElementsSword(7025, Tool.COBALT)).setIconIndex(69).setItemName("Cobalt Sword");
		
		NickelPickaxe = (new ItemElementsPickaxe(7026, Tool.NICKEL)).setIconIndex(102).setItemName("Nickel Pickaxe");
		NickelAxe = (new ItemElementsAxe(7027, Tool.NICKEL)).setIconIndex(118).setItemName("Nickel Axe");
		NickelSpade = (new ItemElementsSpade(7028, Tool.NICKEL)).setIconIndex(86).setItemName("Nickel Spade");
		NickelHoe = (new ItemElementsHoe(7029, Tool.NICKEL)).setIconIndex(134).setItemName("Nickel Hoe");
		NickelSword = (new ItemElementsSword(7030, Tool.NICKEL)).setIconIndex(70).setItemName("Nickel Sword");
		
		CopperPickaxe = (new ItemElementsPickaxe(7031, Tool.COPPER)).setIconIndex(103).setItemName("Copper Pickaxe");
		CopperAxe = (new ItemElementsAxe(7032, Tool.COPPER)).setIconIndex(119).setItemName("Copper Axe");
		CopperSpade = (new ItemElementsSpade(7033, Tool.COPPER)).setIconIndex(87).setItemName("Copper Spade");
		CopperHoe = (new ItemElementsHoe(7034, Tool.COPPER)).setIconIndex(135).setItemName("Copper Hoe");
		CopperSword = (new ItemElementsSword(7035, Tool.COPPER)).setIconIndex(71).setItemName("Copper Sword");
		
		ZirconiumPickaxe = (new ItemElementsPickaxe(7036, Tool.ZIRCONIUM)).setIconIndex(104).setItemName("Zirconium Pickaxe");
		ZirconiumAxe = (new ItemElementsAxe(7037, Tool.ZIRCONIUM)).setIconIndex(120).setItemName("Zirconium Axe");
		ZirconiumSpade = (new ItemElementsSpade(7038, Tool.ZIRCONIUM)).setIconIndex(88).setItemName("Zirconium Spade");
		ZirconiumHoe = (new ItemElementsHoe(7039, Tool.ZIRCONIUM)).setIconIndex(136).setItemName("Zirconium Hoe");
		ZirconiumSword = (new ItemElementsSword(7040, Tool.ZIRCONIUM)).setIconIndex(72).setItemName("Zirconium Sword");
		
		SilverPickaxe = (new ItemElementsPickaxe(7041, Tool.SILVER)).setIconIndex(105).setItemName("Silver Pickaxe");
		SilverAxe = (new ItemElementsAxe(7042, Tool.SILVER)).setIconIndex(121).setItemName("Silver Axe");
		SilverSpade = (new ItemElementsSpade(7043, Tool.SILVER)).setIconIndex(89).setItemName("Silver Spade");
		SilverHoe = (new ItemElementsHoe(7044, Tool.SILVER)).setIconIndex(137).setItemName("Silver Hoe");
		SilverSword = (new ItemElementsSword(7045, Tool.SILVER)).setIconIndex(73).setItemName("Silver Sword");
		
		TinPickaxe = (new ItemElementsPickaxe(7046, Tool.TIN)).setIconIndex(106).setItemName("Tin Pickaxe");
		TinAxe = (new ItemElementsAxe(7047, Tool.TIN)).setIconIndex(122).setItemName("Tin Axe");
		TinSpade = (new ItemElementsSpade(7048, Tool.TIN)).setIconIndex(90).setItemName("Tin Spade");
		TinHoe = (new ItemElementsHoe(7049, Tool.TIN)).setIconIndex(138).setItemName("Tin Hoe");
		TinSword = (new ItemElementsSword(7050, Tool.TIN)).setIconIndex(74).setItemName("Tin Sword");
		
		PlatinumPickaxe = (new ItemElementsPickaxe(7051, Tool.PLATINUM)).setIconIndex(107).setItemName("Platinum Pickaxe");
		PlatinumAxe = (new ItemElementsAxe(7052, Tool.PLATINUM)).setIconIndex(123).setItemName("Platinum Axe");
		PlatinumSpade = (new ItemElementsSpade(7053, Tool.PLATINUM)).setIconIndex(91).setItemName("Platinum Spade");
		PlatinumHoe = (new ItemElementsHoe(7054, Tool.PLATINUM)).setIconIndex(139).setItemName("Platinum Hoe");
		PlatinumSword = (new ItemElementsSword(7055, Tool.PLATINUM)).setIconIndex(75).setItemName("Platinum Sword");
		
		LeadPickaxe = (new ItemElementsPickaxe(7056, Tool.LEAD)).setIconIndex(108).setItemName("Lead Pickaxe");
		LeadAxe = (new ItemElementsAxe(7057, Tool.LEAD)).setIconIndex(124).setItemName("Lead Axe");
		LeadSpade = (new ItemElementsSpade(7058, Tool.LEAD)).setIconIndex(92).setItemName("Lead Spade");
		LeadHoe = (new ItemElementsHoe(7059, Tool.LEAD)).setIconIndex(140).setItemName("Lead Hoe");
		LeadSword = (new ItemElementsSword(7060, Tool.LEAD)).setIconIndex(76).setItemName("Lead Sword");
		
		CinnabarPickaxe = (new ItemElementsPickaxe(7061, Tool.CINNABAR)).setIconIndex(109).setItemName("Cinnabar Pickaxe");
		CinnabarAxe = (new ItemElementsAxe(7062, Tool.CINNABAR)).setIconIndex(125).setItemName("Cinnabar Axe");
		CinnabarSpade = (new ItemElementsSpade(7063, Tool.CINNABAR)).setIconIndex(93).setItemName("Cinnabar Spade");
		CinnabarHoe = (new ItemElementsHoe(7064, Tool.CINNABAR)).setIconIndex(141).setItemName("Cinnabar Hoe");
		CinnabarSword = (new ItemElementsSword(7065, Tool.CINNABAR)).setIconIndex(77).setItemName("Cinnabar Sword");
		
		BismuthPickaxe = (new ItemElementsPickaxe(7066, Tool.BISMUTH)).setIconIndex(110).setItemName("Bismuth Pickaxe");
		BismuthAxe = (new ItemElementsAxe(7067, Tool.BISMUTH)).setIconIndex(126).setItemName("Bismuth Axe");
		BismuthSpade = (new ItemElementsSpade(7068, Tool.BISMUTH)).setIconIndex(94).setItemName("Bismuth Spade");
		BismuthHoe = (new ItemElementsHoe(7069, Tool.BISMUTH)).setIconIndex(142).setItemName("Bismuth Hoe");
		BismuthSword = (new ItemElementsSword(7070, Tool.BISMUTH)).setIconIndex(78).setItemName("Bismuth Sword");
		
		UraniumPickaxe = (new ItemElementsPickaxe(7071, Tool.URANIUM)).setPotionEffect(Potion.poison.id, 5, 0, 0.5F).setIconIndex(111).setItemName("Uranium Pickaxe");
		UraniumAxe = (new ItemElementsAxe(7072, Tool.URANIUM)).setPotionEffect(Potion.poison.id, 5, 0, 0.5F).setIconIndex(127).setItemName("Uranium Axe");
		UraniumSpade = (new ItemElementsSpade(7073, Tool.URANIUM)).setPotionEffect(Potion.poison.id, 5, 0, 0.5F).setIconIndex(95).setItemName("Uranium Spade");
		UraniumHoe = (new ItemElementsHoe(7074, Tool.URANIUM)).setPotionEffect(Potion.poison.id, 5, 0, 0.5F).setIconIndex(143).setItemName("Uranium Hoe");
		UraniumSword = (new ItemElementsSword(7075, Tool.URANIUM)).setPotionEffect(Potion.poison.id, 5, 0, 0.5F).setIconIndex(79).setItemName("Uranium Sword");
		
		PlutoniumPickaxe = (new ItemElementsPickaxe(7076, Tool.PLUTONIUM)).setPotionEffect(Potion.poison.id, 5, 0, 1F).setIconIndex(112).setItemName("Plutonium Pickaxe");
		PlutoniumAxe = (new ItemElementsAxe(7077, Tool.PLUTONIUM)).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).setIconIndex(128).setItemName("Plutonium Axe");
		PlutoniumSpade = (new ItemElementsSpade(7078, Tool.PLUTONIUM)).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).setIconIndex(96).setItemName("Plutonium Spade");
		PlutoniumHoe = (new ItemElementsHoe(7079, Tool.PLUTONIUM)).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).setIconIndex(144).setItemName("Plutonium Hoe");
		PlutoniumSword = (new ItemElementsSword(7080, Tool.PLUTONIUM)).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).setIconIndex(80).setItemName("Plutonium Sword");
		
		SteelPickaxe = (new ItemElementsPickaxe(7081, Tool.STEEL)).setIconIndex(163).setItemName("Steel Pickaxe");
		SteelAxe = (new ItemElementsAxe(7082, Tool.STEEL)).setIconIndex(179).setItemName("Steel Axe");
		SteelSpade = (new ItemElementsSpade(7083, Tool.STEEL)).setIconIndex(242).setItemName("Steel Spade");
		SteelHoe = (new ItemElementsHoe(7084, Tool.STEEL)).setIconIndex(195).setItemName("Steel Hoe");
		SteelSword = (new ItemElementsSword(7085, Tool.STEEL)).setIconIndex(226).setItemName("Steel Sword");
		
		BronzePickaxe = (new ItemElementsPickaxe(7086, Tool.BRONZE)).setIconIndex(161).setItemName("Bronze Pickaxe");
		BronzeAxe = (new ItemElementsAxe(7087, Tool.BRONZE)).setIconIndex(177).setItemName("Bronze Axe");
		BronzeSpade = (new ItemElementsSpade(7088, Tool.BRONZE)).setIconIndex(240).setItemName("Bronze Spade");
		BronzeHoe = (new ItemElementsHoe(7089, Tool.BRONZE)).setIconIndex(193).setItemName("Bronze Hoe");
		BronzeSword = (new ItemElementsSword(7090, Tool.BRONZE)).setIconIndex(224).setItemName("Bronze Sword");
	 
		onLoadedTools();
		//Armor
		BerylHelmet = (new ItemElementsArmor(7500, Armor.BERYL, ModLoader.addArmor("Beryl"), 0)).setIconIndex(0).setItemName("Beryl Helmet");
		BerylChestplate = (new ItemElementsArmor(7501, Armor.BERYL, ModLoader.addArmor("Beryl"), 1)).setIconIndex(16).setItemName("Beryl Chestplate");
		BerylLeggings = (new ItemElementsArmor(7502, Armor.BERYL, ModLoader.addArmor("Beryl"), 2)).setIconIndex(32).setItemName("Beryl Leggings");
		BerylBoots = (new ItemElementsArmor(7503, Armor.BERYL, ModLoader.addArmor("Beryl"), 3)).setIconIndex(48).setItemName("Beryl Leggings");
		
		BoronHelmet = (new ItemElementsArmor(7504, Armor.BORON, ModLoader.addArmor("Boron"), 0)).setIconIndex(1).setItemName("Boron Helmet");
		BoronChestplate = (new ItemElementsArmor(7505, Armor.BORON, ModLoader.addArmor("Boron"), 1)).setIconIndex(17).setItemName("Boron Chestplate");
		BoronLeggings = (new ItemElementsArmor(7506, Armor.BORON, ModLoader.addArmor("Boron"), 2)).setIconIndex(33).setItemName("Boron Leggings");
		BoronBoots = (new ItemElementsArmor(7507, Armor.BORON, ModLoader.addArmor("Boron"), 3)).setIconIndex(49).setItemName("Boron Leggings");
		
		AluminiumHelmet = (new ItemElementsArmor(7508, Armor.ALUMINIUM, ModLoader.addArmor("Aluminium"), 0)).setIconIndex(2).setItemName("Aluminium Helmet");
		AluminiumChestplate = (new ItemElementsArmor(7509, Armor.ALUMINIUM, ModLoader.addArmor("Aluminium"), 1)).setIconIndex(18).setItemName("Aluminium Chestplate");
		AluminiumLeggings = (new ItemElementsArmor(7510, Armor.ALUMINIUM, ModLoader.addArmor("Aluminium"), 2)).setIconIndex(34).setItemName("Aluminium Leggings");
		AluminiumBoots = (new ItemElementsArmor(7511, Armor.ALUMINIUM, ModLoader.addArmor("Aluminium"), 3)).setIconIndex(50).setItemName("Aluminium Leggings");
		
		TitaniumHelmet = (new ItemElementsArmor(7512, Armor.TITANIUM, ModLoader.addArmor("Titanium"), 0)).setIconIndex(3).setItemName("Titanium Helmet");
		TitaniumChestplate = (new ItemElementsArmor(7513, Armor.TITANIUM, ModLoader.addArmor("Titanium"), 1)).setIconIndex(19).setItemName("Titanium Chestplate");
		TitaniumLeggings = (new ItemElementsArmor(7514, Armor.TITANIUM, ModLoader.addArmor("Titanium"), 2)).setIconIndex(35).setItemName("Titanium Leggings");
		TitaniumBoots = (new ItemElementsArmor(7515, Armor.TITANIUM, ModLoader.addArmor("Titanium"), 3)).setIconIndex(51).setItemName("Titanium Leggings");
		
		ChromiumHelmet = (new ItemElementsArmor(7516, Armor.CHROMIUM, ModLoader.addArmor("Chromium"), 0)).setIconIndex(4).setItemName("Chromium Helmet");
		ChromiumChestplate = (new ItemElementsArmor(7517, Armor.CHROMIUM, ModLoader.addArmor("Chromium"), 1)).setIconIndex(20).setItemName("Chromium Chestplate");
		ChromiumLeggings = (new ItemElementsArmor(7518, Armor.CHROMIUM, ModLoader.addArmor("Chromium"), 2)).setIconIndex(36).setItemName("Chromium Leggings");
		ChromiumBoots = (new ItemElementsArmor(7519, Armor.CHROMIUM, ModLoader.addArmor("Chromium"), 3)).setIconIndex(52).setItemName("Chromium Leggings");
		
		CobaltHelmet = (new ItemElementsArmor(7520, Armor.COBALT, ModLoader.addArmor("Cobalt"), 0)).setIconIndex(5).setItemName("Cobalt Helmet");
		CobaltChestplate = (new ItemElementsArmor(7521, Armor.COBALT, ModLoader.addArmor("Cobalt"), 1)).setIconIndex(21).setItemName("Cobalt Chestplate");
		CobaltLeggings = (new ItemElementsArmor(7522, Armor.COBALT, ModLoader.addArmor("Cobalt"), 2)).setIconIndex(37).setItemName("Cobalt Leggings");
		CobaltBoots = (new ItemElementsArmor(7523, Armor.COBALT, ModLoader.addArmor("Cobalt"), 3)).setIconIndex(53).setItemName("Cobalt Leggings");
		
		NickelHelmet = (new ItemElementsArmor(7524, Armor.NICKEL, ModLoader.addArmor("Nickel"), 0)).setIconIndex(6).setItemName("Nickel Helmet");
		NickelChestplate = (new ItemElementsArmor(7525, Armor.NICKEL, ModLoader.addArmor("Nickel"), 1)).setIconIndex(22).setItemName("Nickel Chestplate");
		NickelLeggings = (new ItemElementsArmor(7526, Armor.NICKEL, ModLoader.addArmor("Nickel"), 2)).setIconIndex(38).setItemName("Nickel Leggings");
		NickelBoots = (new ItemElementsArmor(7527, Armor.NICKEL, ModLoader.addArmor("Nickel"), 3)).setIconIndex(54).setItemName("Nickel Leggings");
		
		CopperHelmet = (new ItemElementsArmor(7528, Armor.COPPER, ModLoader.addArmor("Copper"), 0)).setIconIndex(7).setItemName("Copper Helmet");
		CopperChestplate = (new ItemElementsArmor(7529, Armor.COPPER, ModLoader.addArmor("Copper"), 1)).setIconIndex(23).setItemName("Copper Chestplate");
		CopperLeggings = (new ItemElementsArmor(7530, Armor.COPPER, ModLoader.addArmor("Copper"), 2)).setIconIndex(39).setItemName("Copper Leggings");
		CopperBoots = (new ItemElementsArmor(7531, Armor.COPPER, ModLoader.addArmor("Copper"), 3)).setIconIndex(55).setItemName("Copper Leggings");
		
		ZirconiumHelmet = (new ItemElementsArmor(7532, Armor.ZIRCONIUM, ModLoader.addArmor("Zirconium"), 0)).setIconIndex(8).setItemName("Zirconium Helmet");
		ZirconiumChestplate = (new ItemElementsArmor(7533, Armor.ZIRCONIUM, ModLoader.addArmor("Zirconium"), 1)).setIconIndex(24).setItemName("Zirconium Chestplate");
		ZirconiumLeggings = (new ItemElementsArmor(7534, Armor.ZIRCONIUM, ModLoader.addArmor("Zirconium"), 2)).setIconIndex(40).setItemName("Zirconium Leggings");
		ZirconiumBoots = (new ItemElementsArmor(7535, Armor.ZIRCONIUM, ModLoader.addArmor("Zirconium"), 3)).setIconIndex(56).setItemName("Zirconium Leggings");
		
		SilverHelmet = (new ItemElementsArmor(7536, Armor.SILVER, ModLoader.addArmor("Silver"), 0)).setIconIndex(9).setItemName("Silver Helmet");
		SilverChestplate = (new ItemElementsArmor(7537, Armor.SILVER, ModLoader.addArmor("Silver"), 1)).setIconIndex(25).setItemName("Silver Chestplate");
		SilverLeggings = (new ItemElementsArmor(7538, Armor.SILVER, ModLoader.addArmor("Silver"), 2)).setIconIndex(41).setItemName("Silver Leggings");
		SilverBoots = (new ItemElementsArmor(7539, Armor.SILVER, ModLoader.addArmor("Silver"), 3)).setIconIndex(57).setItemName("Silver Leggings");
		
		TinHelmet = (new ItemElementsArmor(7540, Armor.TIN, ModLoader.addArmor("Tin"), 0)).setIconIndex(10).setItemName("Tin Helmet");
		TinChestplate = (new ItemElementsArmor(7541, Armor.TIN, ModLoader.addArmor("Tin"), 1)).setIconIndex(26).setItemName("Tin Chestplate");
		TinLeggings = (new ItemElementsArmor(7542, Armor.TIN, ModLoader.addArmor("Tin"), 2)).setIconIndex(42).setItemName("Tin Leggings");
		TinBoots = (new ItemElementsArmor(7543, Armor.TIN, ModLoader.addArmor("Tin"), 3)).setIconIndex(58).setItemName("Tin Leggings");
		
		PlatinumHelmet = (new ItemElementsArmor(7544, Armor.PLATINUM, ModLoader.addArmor("Platinum"), 0)).setIconIndex(11).setItemName("Platinum Helmet");
		PlatinumChestplate = (new ItemElementsArmor(7545, Armor.PLATINUM, ModLoader.addArmor("Platinum"), 1)).setIconIndex(27).setItemName("Platinum Chestplate");
		PlatinumLeggings = (new ItemElementsArmor(7546, Armor.PLATINUM, ModLoader.addArmor("Platinum"), 2)).setIconIndex(43).setItemName("Platinum Leggings");
		PlatinumBoots = (new ItemElementsArmor(7547, Armor.PLATINUM, ModLoader.addArmor("Platinum"), 3)).setIconIndex(59).setItemName("Platinum Leggings");
		
		LeadHelmet = (new ItemElementsArmor(7548, Armor.LEAD, ModLoader.addArmor("Lead"), 0)).setIconIndex(12).setItemName("Lead Helmet");
		LeadChestplate = (new ItemElementsArmor(7549, Armor.LEAD, ModLoader.addArmor("Lead"), 1)).setIconIndex(28).setItemName("Lead Chestplate");
		LeadLeggings = (new ItemElementsArmor(7550, Armor.LEAD, ModLoader.addArmor("Lead"), 2)).setIconIndex(44).setItemName("Lead Leggings");
		LeadBoots = (new ItemElementsArmor(7551, Armor.LEAD, ModLoader.addArmor("Lead"), 3)).setIconIndex(60).setItemName("Lead Leggings");
		
		CinnabarHelmet = (new ItemElementsArmor(7552, Armor.CINNABAR, ModLoader.addArmor("Cinnabar"), 0)).setIconIndex(13).setItemName("Cinnabar Helmet");
		CinnabarChestplate = (new ItemElementsArmor(7553, Armor.CINNABAR, ModLoader.addArmor("Cinnabar"), 1)).setIconIndex(29).setItemName("Cinnabar Chestplate");
		CinnabarLeggings = (new ItemElementsArmor(7554, Armor.CINNABAR, ModLoader.addArmor("Cinnabar"), 2)).setIconIndex(45).setItemName("Cinnabar Leggings");
		CinnabarBoots = (new ItemElementsArmor(7555, Armor.CINNABAR, ModLoader.addArmor("Cinnabar"), 3)).setIconIndex(61).setItemName("Cinnabar Leggings");
		
		BismuthHelmet = (new ItemElementsArmor(7556, Armor.BISMUTH, ModLoader.addArmor("Bismuth"), 0)).setIconIndex(14).setItemName("Bismuth Helmet");
		BismuthChestplate = (new ItemElementsArmor(7557, Armor.BISMUTH, ModLoader.addArmor("Bismuth"), 1)).setIconIndex(30).setItemName("Bismuth Chestplate");
		BismuthLeggings = (new ItemElementsArmor(7558, Armor.BISMUTH, ModLoader.addArmor("Bismuth"), 2)).setIconIndex(46).setItemName("Bismuth Leggings");
		BismuthBoots = (new ItemElementsArmor(7559, Armor.BISMUTH, ModLoader.addArmor("Bismuth"), 3)).setIconIndex(62).setItemName("Bismuth Leggings");
		
		UraniumHelmet = (new ItemElementsArmor(7560, Armor.URANIUM, ModLoader.addArmor("Uranium"), 0)).setIconIndex(15).setItemName("Uranium Helmet");
		UraniumChestplate = (new ItemElementsArmor(7561, Armor.URANIUM, ModLoader.addArmor("Uranium"), 1)).setIconIndex(31).setItemName("Uranium Chestplate");
		UraniumLeggings = (new ItemElementsArmor(7562, Armor.URANIUM, ModLoader.addArmor("Uranium"), 2)).setIconIndex(47).setItemName("Uranium Leggings");
		UraniumBoots = (new ItemElementsArmor(7563, Armor.URANIUM, ModLoader.addArmor("Uranium"), 3)).setIconIndex(63).setItemName("Uranium Leggings");
		
		PlutoniumHelmet = (new ItemElementsArmor(7564, Armor.PLUTONIUM, ModLoader.addArmor("Plutonium"), 0)).setIconIndex(16).setItemName("Plutonium Helmet");
		PlutoniumChestplate = (new ItemElementsArmor(7565, Armor.PLUTONIUM, ModLoader.addArmor("Plutonium"), 1)).setIconIndex(32).setItemName("Plutonium Chestplate");
		PlutoniumLeggings = (new ItemElementsArmor(7566, Armor.PLUTONIUM, ModLoader.addArmor("Plutonium"), 2)).setIconIndex(48).setItemName("Plutonium Leggings");
		PlutoniumBoots = (new ItemElementsArmor(7567, Armor.PLUTONIUM, ModLoader.addArmor("Plutonium"), 3)).setIconIndex(64).setItemName("Plutonium Leggings");
		
		SteelHelmet = (new ItemElementsArmor(7568, Armor.STEEL, ModLoader.addArmor("Steel"), 0)).setIconIndex(162).setItemName("Steel Helmet");
		SteelChestplate = (new ItemElementsArmor(7569, Armor.STEEL, ModLoader.addArmor("Steel"), 1)).setIconIndex(178).setItemName("Steel Chestplate");
		SteelLeggings = (new ItemElementsArmor(7570, Armor.STEEL, ModLoader.addArmor("Steel"), 2)).setIconIndex(194).setItemName("Steel Leggings");
		SteelBoots = (new ItemElementsArmor(7571, Armor.STEEL, ModLoader.addArmor("Steel"), 3)).setIconIndex(300).setItemName("Steel Leggings");
		
		BronzeHelmet = (new ItemElementsArmor(7572, Armor.BRONZE, ModLoader.addArmor("Bronze"), 0)).setIconIndex(160).setItemName("Bronze Helmet");
		BronzeChestplate = (new ItemElementsArmor(7573, Armor.BRONZE, ModLoader.addArmor("Bronze"), 1)).setIconIndex(176).setItemName("Bronze Chestplate");
		BronzeLeggings = (new ItemElementsArmor(7574, Armor.BRONZE, ModLoader.addArmor("Bronze"), 2)).setIconIndex(192).setItemName("Bronze Leggings");
		BronzeBoots = (new ItemElementsArmor(7575, Armor.BRONZE, ModLoader.addArmor("Bronze"), 3)).setIconIndex(208).setItemName("Bronze Leggings");
		onLoadedArmor();
		
		TinCopperMix = (new ItemTinCopperMix(7600)).setIconIndex(164).setItemName("Tin and Copper Mixture");
	}
	
	@Override
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
