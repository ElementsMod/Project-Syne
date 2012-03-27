package net.minecraft.src;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.*;

public class mod_ElementsModSolidBlocks extends BaseMod
{
	private static mod_ElementsModConfig EM;
	
	public mod_ElementsModSolidBlocks()
	{
		MinecraftForgeClient.preloadTexture("/elements/solid/solid.png");
		world = ModLoader.getMinecraftInstance().theWorld;
	
		
		//Block Register
		ModLoader.registerBlock(Lithium);
		ModLoader.addName(Lithium, "Lithium");
		
		ModLoader.registerBlock(Beryllium);
		ModLoader.addName(Beryllium, "Beryllium");
		
		ModLoader.registerBlock(Boron);
		ModLoader.addName(Boron, "Boron");
		
		ModLoader.registerBlock(Carbon);
		ModLoader.addName(Carbon, "Carbon");
        
        ModLoader.registerBlock(Sodium);
		ModLoader.addName(Sodium, "Sodium");
		
		ModLoader.registerBlock(Magnesium);
		ModLoader.addName(Magnesium, "Magnesium");
		
		ModLoader.registerBlock(Aluminium);
		ModLoader.addName(Aluminium, "Aluminium");
		
		ModLoader.registerBlock(Silicon);
		ModLoader.addName(Silicon, "Silicon");
        
        ModLoader.registerBlock(Phosphorus);
		ModLoader.addName(Phosphorus, "Phosphorus");
		
		ModLoader.registerBlock(Sulfur);
		ModLoader.addName(Sulfur, "Sulfur");
		
		ModLoader.registerBlock(Potassium);
		ModLoader.addName(Potassium, "Potassium");
		
		ModLoader.registerBlock(Calcium);
		ModLoader.addName(Calcium, "Calcium");
        
        ModLoader.registerBlock(Scandium);
		ModLoader.addName(Scandium, "Scandium");
		
		ModLoader.registerBlock(Titanium);
		ModLoader.addName(Titanium, "Titanium");
		
		ModLoader.registerBlock(Vanadium);
		ModLoader.addName(Vanadium, "Vanadium");
		
		ModLoader.registerBlock(Chromium);
		ModLoader.addName(Chromium, "Chromium");
        
        ModLoader.registerBlock(Manganese);
		ModLoader.addName(Manganese, "Manganese");
		
        ModLoader.registerBlock(Cobalt);
		ModLoader.addName(Cobalt, "Cobalt");
        
		ModLoader.registerBlock(Nickel);
		ModLoader.addName(Nickel, "Nickel");
		
		ModLoader.registerBlock(Copper);
		ModLoader.addName(Copper, "Copper");
        
        ModLoader.registerBlock(Zinc);
		ModLoader.addName(Zinc, "Zinc");
		
		ModLoader.registerBlock(Gallium);
		ModLoader.addName(Gallium, "Gallium");
		
		ModLoader.registerBlock(Germanium);
		ModLoader.addName(Germanium, "Germanium");
		
		ModLoader.registerBlock(Arsenic);
		ModLoader.addName(Arsenic, "Arsenic");
        
        ModLoader.registerBlock(Selenium);
		ModLoader.addName(Selenium, "Selenium");
		
		ModLoader.registerBlock(Bromine);
		ModLoader.addName(Bromine, "Bromine");
		
		ModLoader.registerBlock(Rubidium);
		ModLoader.addName(Rubidium, "Rubidium");
		
		ModLoader.registerBlock(Strontium);
		ModLoader.addName(Strontium, "Strontium");
        
        ModLoader.registerBlock(Yttrium);
		ModLoader.addName(Yttrium, "Yttrium");
		
		ModLoader.registerBlock(Zirconium);
		ModLoader.addName(Zirconium, "Zirconium");
		
		ModLoader.registerBlock(Niobium);
		ModLoader.addName(Niobium, "Niobium");
		
		ModLoader.registerBlock(Molybdenum);
		ModLoader.addName(Molybdenum, "Molybdenum");

        ModLoader.registerBlock(Technetium);
		ModLoader.addName(Technetium, "Technetium");
		
		ModLoader.registerBlock(Ruthenium);
		ModLoader.addName(Ruthenium, "Ruthenium");
		
		ModLoader.registerBlock(Rhodium);
		ModLoader.addName(Rhodium, "Rhodium");
		
		ModLoader.registerBlock(Palladium);
		ModLoader.addName(Palladium, "Palladium");

        ModLoader.registerBlock(Silver);
		ModLoader.addName(Silver, "Silver");
		
		ModLoader.registerBlock(Cadmium);
		ModLoader.addName(Cadmium, "Cadmium");
		
		ModLoader.registerBlock(Indium);
		ModLoader.addName(Indium, "Indium");

        ModLoader.registerBlock(Tin);
		ModLoader.addName(Tin, "Tin");
		
		ModLoader.registerBlock(Antimony);
		ModLoader.addName(Antimony, "Antimony");
		
		ModLoader.registerBlock(Tellurium);
		ModLoader.addName(Tellurium, "Tellurium");
		
		ModLoader.registerBlock(Iodine);
		ModLoader.addName(Iodine, "Iodine");

        ModLoader.registerBlock(Caesium);
		ModLoader.addName(Caesium, "Caesium");
		
		ModLoader.registerBlock(Barium);
		ModLoader.addName(Barium, "Barium");
		
        ModLoader.registerBlock(Lanthanum);
		ModLoader.addName(Lanthanum, "Lanthanum");
		
        ModLoader.registerBlock(Cerium);
		ModLoader.addName(Cerium, "Cerium");
        
        ModLoader.registerBlock(Praseodymium);
		ModLoader.addName(Praseodymium, "Praseodymium");
		
		ModLoader.registerBlock(Neodymium);
		ModLoader.addName(Neodymium, "Neodymium");
        
        ModLoader.registerBlock(Promethium);
		ModLoader.addName(Promethium, "Promethium");
		
		ModLoader.registerBlock(Samarium);
		ModLoader.addName(Samarium, "Samarium");
		
		ModLoader.registerBlock(Europium);
		ModLoader.addName(Europium, "Europium");
		
		ModLoader.registerBlock(Gadolinium);
		ModLoader.addName(Gadolinium, "Gadolinium");
        
        ModLoader.registerBlock(Terbium);
		ModLoader.addName(Terbium, "Terbium");
		
		ModLoader.registerBlock(Dysprosium);
		ModLoader.addName(Dysprosium, "Dysprosium");
		
		ModLoader.registerBlock(Holmium);
		ModLoader.addName(Holmium, "Holmium");
		
		ModLoader.registerBlock(Erbium);
		ModLoader.addName(Erbium, "Erbium");
        
        ModLoader.registerBlock(Thulium);
		ModLoader.addName(Thulium, "Thulium");
		
		ModLoader.registerBlock(Ytterbium);
		ModLoader.addName(Ytterbium, "Ytterbium");
		
		ModLoader.registerBlock(Lutetium);
		ModLoader.addName(Lutetium, "Lutetium");
        
        ModLoader.registerBlock(Hafnium);
		ModLoader.addName(Hafnium, "Hafnium");
		
		ModLoader.registerBlock(Tungsten);
		ModLoader.addName(Tungsten, "Tungsten");
		
		ModLoader.registerBlock(Rhenium);
		ModLoader.addName(Rhenium, "Rhenium");
		
		ModLoader.registerBlock(Osmium);
		ModLoader.addName(Osmium, "Osmium");
        
        ModLoader.registerBlock(Iridium);
		ModLoader.addName(Iridium, "Iridium");
		
        ModLoader.registerBlock(Platinum);
		ModLoader.addName(Platinum, "Platinum");
        
		ModLoader.registerBlock(Mercury);
		ModLoader.addName(Mercury, "Mercury");
		
		ModLoader.registerBlock(Thallium);
		ModLoader.addName(Thallium, "Thallium");
        
        ModLoader.registerBlock(Lead);
		ModLoader.addName(Lead, "Lead");
		
		ModLoader.registerBlock(Bismuth);
		ModLoader.addName(Bismuth, "Bismuth");
		
		ModLoader.registerBlock(Polonium);
		ModLoader.addName(Polonium, "Polonium");
		
		ModLoader.registerBlock(Astatine);
		ModLoader.addName(Astatine, "Astatine");
        
        ModLoader.registerBlock(Francium);
		ModLoader.addName(Francium, "Francium");
		
		ModLoader.registerBlock(Radium);
		ModLoader.addName(Radium, "Radium");
		
		ModLoader.registerBlock(Actinium);
		ModLoader.addName(Actinium, "Actinium");
		
		ModLoader.registerBlock(Thorium);
		ModLoader.addName(Thorium, "Thorium");
        
        ModLoader.registerBlock(Protactinium);
		ModLoader.addName(Protactinium, "Protactinium");
		
		ModLoader.registerBlock(Uranium);
		ModLoader.addName(Uranium, "Uranium");
		
		ModLoader.registerBlock(Neptunium);
		ModLoader.addName(Neptunium, "Neptunium");
		
		ModLoader.registerBlock(Plutonium);
		ModLoader.addName(Plutonium, "Plutonium");

        ModLoader.registerBlock(Americium);
		ModLoader.addName(Americium, "Americium");
		
		ModLoader.registerBlock(Curium);
		ModLoader.addName(Curium, "Curium");
		
		ModLoader.registerBlock(Berkelium);
		ModLoader.addName(Berkelium, "Berkelium");
		
		ModLoader.registerBlock(Californium);
		ModLoader.addName(Californium, "Californium");

        ModLoader.registerBlock(Einsteinium);
		ModLoader.addName(Einsteinium, "Einsteinium");
		
		ModLoader.registerBlock(Fermium);
		ModLoader.addName(Fermium, "Fermium");
		
		ModLoader.registerBlock(Mendelevium);
		ModLoader.addName(Mendelevium, "Mendelevium");

        ModLoader.registerBlock(Nobelium);
		ModLoader.addName(Nobelium, "Nobelium");
		
		ModLoader.registerBlock(Lawrencium);
		ModLoader.addName(Lawrencium, "Lawrencium");
		
		ModLoader.registerBlock(Rutherfordium);
		ModLoader.addName(Rutherfordium, "Rutherfordium");
		
		ModLoader.registerBlock(Dubnium);
		ModLoader.addName(Dubnium, "Dubnium");

        ModLoader.registerBlock(Seaborgium);
		ModLoader.addName(Seaborgium, "Seaborgium");
		
		ModLoader.registerBlock(Bohrium);
		ModLoader.addName(Bohrium, "Bohrium");
		
        ModLoader.registerBlock(Hassium);
		ModLoader.addName(Hassium, "Hassium");
		
        ModLoader.registerBlock(Meitnerium);
		ModLoader.addName(Meitnerium, "Meitnerium");
        
        ModLoader.registerBlock(Darmstadtium);
		ModLoader.addName(Darmstadtium, "Darmstadtium");
		
		ModLoader.registerBlock(Roentgenium);
		ModLoader.addName(Roentgenium, "Roentgenium");
		
		ModLoader.registerBlock(Copernicium);
		ModLoader.addName(Copernicium, "Copernicium");

        ModLoader.registerBlock(Ununtrium);
		ModLoader.addName(Ununtrium, "Ununtrium");
		
		ModLoader.registerBlock(Ununquadium);
		ModLoader.addName(Ununquadium, "Ununquadium");
		
        ModLoader.registerBlock(Ununpentium);
		ModLoader.addName(Ununpentium, "Ununpentium");
		
        ModLoader.registerBlock(Ununhexium);
		ModLoader.addName(Ununhexium, "Ununhexium");
        
        ModLoader.registerBlock(Ununseptium);
		ModLoader.addName(Ununseptium, "Ununseptium");
		
		ModLoader.registerBlock(Ununoctium);
		ModLoader.addName(Ununoctium, "Ununoctium");
		
		ModLoader.setInGameHook(this, true, false);
		ModLoader.setInGUIHook(this, true, false);
		
		ModLoader.addRecipe(new ItemStack(Uranium, 1), new Object[] {
            "#", Character.valueOf('#'), Block.dirt
        });
	}
	
	public static Block ElementsBlocks[];
	
	//Blocks
	public static final Block Lithium;
    public static final Block Beryllium;
    public static final Block Boron;
    public static final Block Carbon;
    public static final Block Sodium;
    public static final Block Magnesium;
    public static final Block Aluminium;
    public static final Block Silicon;
    public static final Block Phosphorus;
    public static final Block Sulfur;
    public static final Block Potassium;
    public static final Block Calcium;
    public static final Block Scandium;
    public static final Block Titanium;
    public static final Block Vanadium;
    public static final Block Chromium;
    public static final Block Manganese;
    public static final Block Cobalt;
    public static final Block Nickel;
    public static final Block Copper;
    public static final Block Zinc;
    public static final Block Gallium;
    public static final Block Germanium;
    public static final Block Arsenic;
    public static final Block Selenium;
    public static final Block Bromine;
    public static final Block Rubidium;
    public static final Block Strontium;
    public static final Block Yttrium;
    public static final Block Zirconium;
    public static final Block Niobium;
    public static final Block Molybdenum;
    public static final Block Technetium;
    public static final Block Ruthenium;
    public static final Block Rhodium;
    public static final Block Palladium;
    public static final Block Silver;
    public static final Block Cadmium;
    public static final Block Indium;
    public static final Block Tin;
    public static final Block Antimony;
    public static final Block Tellurium;
    public static final Block Iodine;
    public static final Block Caesium;
    public static final Block Barium;
    public static final Block Lanthanum;
    public static final Block Cerium;
    public static final Block Praseodymium;
    public static final Block Neodymium;
    public static final Block Promethium;
    public static final Block Samarium;
    public static final Block Europium;
    public static final Block Gadolinium;
    public static final Block Terbium;
    public static final Block Dysprosium;
    public static final Block Holmium;
    public static final Block Erbium;
    public static final Block Thulium;
    public static final Block Ytterbium;
    public static final Block Lutetium;
    public static final Block Hafnium;
    public static final Block Tantalum;
    public static final Block Tungsten;
    public static final Block Rhenium;
    public static final Block Osmium;
    public static final Block Iridium;
    public static final Block Platinum;
    public static final Block Mercury;
    public static final Block Thallium;
    public static final Block Lead;
    public static final Block Bismuth;
    public static final Block Polonium;
    public static final Block Astatine;
    public static final Block Francium;
    public static final Block Radium;
    public static final Block Actinium;
    public static final Block Thorium;
    public static final Block Protactinium;
    public static final Block Uranium;
    public static final Block Neptunium;
    public static final Block Plutonium;
    public static final Block Americium;
    public static final Block Curium;
    public static final Block Berkelium;
    public static final Block Californium;
    public static final Block Einsteinium;
    public static final Block Fermium;
    public static final Block Mendelevium;
    public static final Block Nobelium;
    public static final Block Lawrencium;
    public static final Block Rutherfordium;
    public static final Block Dubnium;
    public static final Block Seaborgium;
    public static final Block Bohrium;
    public static final Block Hassium;
    public static final Block Meitnerium;
    public static final Block Darmstadtium;
    public static final Block Roentgenium;
    public static final Block Copernicium;
    public static final Block Ununtrium;
    public static final Block Ununquadium;
    public static final Block Ununpentium;
    public static final Block Ununhexium;
    public static final Block Ununseptium;
    public static final Block Ununoctium;
    
    
    //Block Info
    static
    {
		Lithium = (new BlockLithium(EM.LithiumID, 0)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lithium");
    	Beryllium = (new BlockBeryllium(EM.BerylliumID, 1)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Beryllium");
    	Boron = (new BlockBoron(EM.BoronID, 2)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Boron");
    	Carbon = (new BlockCarbon(EM.CarbonID, 3)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Carbon");
    	Sodium = (new BlockSodium(EM.SodiumID, 4)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sodium");
    	Magnesium = (new BlockMagnesium(EM.MagnesiumID, 5)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Magnesium");
    	Aluminium = (new BlockAluminum(EM.AluminiumID, 6)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Aluminium");
    	Silicon = (new BlockSilicon(EM.SiliconID, 7)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silicon");
    	Phosphorus = (new BlockPhosphorus(EM.PhosphorusID, 8)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Phosphorus");
    	Sulfur = (new BlockSulfur(EM.SulfurID, 9)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sulfur");
    	Potassium = (new BlockPottasium(EM.PotassiumID, 10)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Potassium");
    	Calcium = (new BlockCalcium(EM.CalciumID, 11)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Calcium");
    	Scandium = (new BlockScandium(EM.ScandiumID, 12)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Scandium");
    	Titanium = (new BlockTitanium(EM.TitaniumID, 13)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Titanium");
    	Vanadium = (new BlockVanadium(EM.VanadiumID, 14)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Vanadium");
    	Chromium = (new BlockChromium(EM.ChromiumID, 15)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chromium");
    	Manganese = (new BlockManganese(EM.ManganeseID, 16)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Manganese");
    	Cobalt = (new BlockCobalt(EM.CobaltID, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cobalt");
    	Nickel = (new BlockNickel(EM.NickelID, 18)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nickel");
    	Copper = (new BlockCopper(EM.CopperID, 19)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copper");
    	Zinc = (new BlockZinc(EM.ZincID, 20)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zinc");
    	Gallium = (new BlockGallium(EM.GalliumID, 21)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gallium");
    	Germanium = (new BlockGermanium(EM.GermaniumID, 22)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Germanium");
    	Arsenic = (new BlockArsenic(EM.ArsenicID, 23)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Arsenic");
    	Selenium = (new BlockSelenium(EM.SeleniumID, 24)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Selenium");
    	Bromine = (new BlockBromine(EM.BromineID, 25)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bromine");
    	Rubidium = (new BlockRubidium(EM.RubidiumID, 26)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rubidium");
    	Strontium = (new BlockStrontium(EM.StrontiumID, 27)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Strontium");
    	Yttrium = (new BlockYtterium(EM.YttriumID, 28)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Yttrium");
    	Zirconium = (new BlockZirconium(EM.ZirconiumID, 29)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zirconium");
    	Niobium = (new BlockNiobium(EM.NiobiumID, 30)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Niobium");
    	Molybdenum = (new BlockMolybdenum(EM.MolybdenumID, 31)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Molybdenum");
    	Technetium = (new BlockTechnetium(EM.TechnetiumID, 32)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Technetium");
    	Ruthenium = (new BlockRuthenium(EM.RutheniumID, 33)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ruthenium");
    	Rhodium = (new BlockRhodium(EM.RhodiumID, 34)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhodium");
    	Palladium = (new BlockPalladium(EM.PalladiumID, 35)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Palladium");
    	Silver = (new BlockSilver(EM.SilverID, 36)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silver");
    	Cadmium = (new BlockCadmium(EM.CadmiumID, 37)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cadmium");
    	Indium = (new BlockIndium(EM.IndiumID, 38)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Indium");
    	Tin = (new BlockTin(EM.TinID, 39)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tin");
    	Antimony = (new BlockAntimony(EM.AntimonyID, 40)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Antimony");
    	Tellurium = (new BlockTellurium(EM.TelluriumID, 41)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tellurium");
    	Iodine = (new BlockIodine(EM.IodineID, 42)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iodine");
    	Caesium = (new BlockCaesium(EM.CaesiumID, 43)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Caesium");
    	Barium = (new BlockBarium(EM.BariumID, 44)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Barium");
    	Lanthanum = (new BlockLanthanum(EM.LanthanumID, 45)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lanthanum");
    	Cerium = (new BlockCerium(EM.CeriumID, 46)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cerium");
    	Praseodymium = (new BlockPraseodymium(EM.PraseodymiumID, 47)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Praseodymium");
    	Neodymium = (new BlockNeodymium(EM.NeodymiumID, 48)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neodymium");
    	Promethium = (new BlockPromethium(EM.PromethiumID, 49)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Promethium");
    	Samarium = (new BlockSamarium(EM.SamariumID, 50)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Smarium");
    	Europium = (new BlockEuropium(EM.EuropiumID, 51)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Europium");
    	Gadolinium = (new BlockGadolinium(EM.GadoliniumID, 52)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gadolinium");
    	Terbium = (new BlockTerbium(EM.TerbiumID, 53)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Terbium");
    	Dysprosium = (new BlockDysprosium(EM.DysprosiumID, 54)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dysprosium");
    	Holmium = (new BlockHolmium(EM.HolmiumID, 55)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Holmium");
    	Erbium = (new BlockErbium(EM.ErbiumID, 56)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Erbium");
    	Thulium = (new BlockThulium(EM.ThuliumID, 57)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thulium");
    	Ytterbium = (new BlockYtterbium(EM.YtterbiumID, 58)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ytterbium");
    	Lutetium = (new BlockLutetium(EM.LutetiumID, 59)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lutetium");
    	Hafnium = (new BlockHafnium(EM.HafniumID, 60)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hafnium");
    	Tantalum = (new BlockTantalum(EM.TantalumID, 61)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tantalum");
    	Tungsten = (new BlockTungsten(EM.TungstenID, 62)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tungsten");
    	Rhenium = (new BlockRhenium(EM.RheniumID, 63)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhenium");
    	Osmium = (new BlockOsmium(EM.OsmiumID, 64)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Osmium");
    	Iridium = (new BlockIridium(EM.IridiumID, 65)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iridium");
    	Platinum = (new BlockPlatinum(EM.PlatinumID, 66)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Platinum");
    	Mercury = (new BlockMercury(EM.MercuryID, 67)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mercury");
    	Thallium = (new BlockThallium(EM.ThalliumID, 68)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thallium");
    	Lead = (new BlockLead(EM.LeadID, 69)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lead");
    	Bismuth = (new BlockBismuth(EM.BismuthID, 70)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bismuth");
    	Polonium = (new BlockPolonium(EM.PoloniumID, 71)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Polonium");
    	Astatine = (new BlockAstatine(EM.AstatineID, 72)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Astatine");
    	Francium = (new BlockFrancium(EM.FranciumID, 73)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Francium");
    	Radium = (new BlockRadium(EM.RadiumID, 74)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radium");
    	Actinium = (new BlockActinium(EM.ActiniumID, 75)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Actinium");
    	Thorium = (new BlockThorium(EM.ThoriumID, 76)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thorium");
    	Protactinium = (new BlockProtactinium(EM.ProtactiniumID, 77)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Protactinium");
    	Uranium = (new BlockUranium(EM.UraniumID, 78)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Uranium");
    	Neptunium = (new BlockNeptunium(EM.NeptuniumID, 79)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neptunium");
    	Plutonium = (new BlockPlutonium(EM.PlutoniumID, 80)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Plutonium");
    	Americium = (new BlockAmericium(EM.AmericiumID, 81)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Americium");
    	Curium = (new BlockCurium(EM.CuriumID, 82)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Curium");
    	Berkelium = (new BlockBerkelium(EM.BerkeliumID, 83)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Berkelium");
    	Californium = (new BlockCalifornium(EM.CaliforniumID, 84)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Californium");
    	Einsteinium = (new BlockEinsteinium(EM.EinsteiniumID, 85)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Einsteinium");
    	Fermium = (new BlockFermium(EM.FermiumID, 86)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Fermium");
    	Mendelevium = (new BlockMendelevium(EM.MendeleviumID, 87)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mendelevium");
    	Nobelium = (new BlockNobelium(EM.NobeliumID, 88)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nobelium");
    	Lawrencium = (new BlockLawrencium(EM.LawrenciumID, 89)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lawrencium");
    	Rutherfordium = (new BlockRutherfordium(EM.RutherfordiumID, 90)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rutherfordium");
    	Dubnium = (new BlockDubnium(EM.DubniumID, 91)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dubnium");
    	Seaborgium = (new BlockSeaborgium(EM.SeaborgiumID, 92)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Seaborgium");
    	Bohrium = (new BlockBohrium(EM.BohriumID, 93)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bohrium");
    	Hassium = (new BlockHassium(EM.HassiumID, 94)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hassium");
    	Meitnerium = (new BlockMeitnerium(EM.MeitneriumID, 95)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Meitnerium");
    	Darmstadtium = (new BlockDarmstadtium(EM.DarmstadtiumID, 96)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Darmstadtium");
    	Roentgenium = (new BlockRoentgenium(EM.RoentgeniumID, 97)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Roentgenium");
    	Copernicium = (new BlockCopernicium(EM.CoperniciumID, 98)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copernicium");
    	Ununtrium = (new BlockUnuntrium(EM.UnuntriumID, 99)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununtrium");
    	Ununquadium = (new BlockUnunquadium(EM.UnunquadiumID, 100)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununquadium");
    	Ununpentium = (new BlockUnunpentium(EM.UnunpentiumID, 101)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununpentium");
    	Ununhexium = (new BlockUnunhexium(EM.UnunhexiumID, 102)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununhexium");
    	Ununseptium = (new BlockUnunseptium(EM.UnunseptiumID, 103)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununseptium");
    	Ununoctium = (new BlockUnunoctium(EM.UnunoctiumID, 104)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununoctium");
    
    	ElementsBlocks = (new Block[] {
    			Lithium, Beryllium, Boron, Carbon, Sodium, Magnesium,
    			Aluminium, Silicon, Phosphorus, Sulfur, Potassium, Calcium,
    			Scandium, Titanium, Vanadium, Chromium, Manganese, Cobalt,
    			Nickel, Copper, Zinc, Gallium, Germanium, Arsenic, Selenium,
    			Bromine, Rubidium, Strontium, Yttrium, Zirconium, Niobium, 
    			Molybdenum,Technetium, Ruthenium, Rhodium, Palladium, Silver,
    			Cadmium, Indium, Tin, Antimony, Tellurium, Iodine, Caesium,
    			Barium, Lanthanum, Cerium, Praseodymium, Neodymium, Promethium,
    			Samarium, Europium, Gadolinium, Terbium, Dysprosium, Holmium,
    			Erbium, Thulium, Ytterbium, Lutetium, Hafnium, Tantalum, 
    			Tungsten, Rhenium, Osmium, Iridium, Platinum, Mercury, Thallium,
    			Lead, Bismuth, Polonium, Astatine, Francium, Radium, Actinium,
    			Thorium, Protactinium, Uranium, Neptunium, Plutonium, Americium,
    			Curium, Berkelium, Californium, Einsteinium, Fermium, Mendelevium,
    			Nobelium, Lawrencium, Rutherfordium, Dubnium, Seaborgium, Bohrium,
    			Hassium, Meitnerium, Darmstadtium, Roentgenium, Copernicium,
    			Ununtrium, Ununquadium, Ununpentium, Ununhexium, Ununseptium, 
    			Ununoctium
    	});    	
	}


    //Block Generation
	public void generateSurface(World world, Random random, int chunkX,int chunkZ)
	{
		int pozX;
		int pozY;
		int pozZ;
	
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Lithium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Beryllium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Boron.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Carbon.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Sodium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Magnesium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Aluminium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Silicon.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Phosphorus.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Sulfur.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Potassium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Calcium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Scandium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Titanium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Vanadium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Chromium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Manganese.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Cobalt.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Nickel.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Copper.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Zinc.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Gallium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Germanium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Arsenic.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Selenium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Bromine.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Rubidium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Strontium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Yttrium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Zirconium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Niobium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Molybdenum.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Technetium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Ruthenium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Rhodium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Palladium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Silver.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Cadmium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Indium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Tin.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Antimony.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Tellurium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Iodine.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Caesium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Barium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Lanthanum.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Cerium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Praseodymium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Neodymium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Promethium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Samarium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Europium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Gadolinium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Terbium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Dysprosium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Holmium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Erbium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Thulium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Ytterbium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Lutetium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Hafnium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Tantalum.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Tungsten.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Rhenium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Osmium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Iridium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Platinum.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Mercury.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Thallium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Lead.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Bismuth.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Polonium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Astatine.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Francium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Radium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Actinium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Thorium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Protactinium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Uranium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Neptunium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Plutonium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
		}
		if(EM.SpawnSyntheticElements = true)
		{
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Americium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Curium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Berkelium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Californium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Einsteinium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Fermium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Mendelevium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Nobelium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Lawrencium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Rutherfordium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Dubnium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Seaborgium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Bohrium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Hassium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Meitnerium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Darmstadtium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Roentgenium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Copernicium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Ununtrium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Ununquadium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Ununpentium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Ununhexium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Ununseptium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}
			for(int b = 0; b < 10; b++)
			{
				pozX = chunkX + random.nextInt(16);
				pozY = random.nextInt(64);
				pozZ = chunkZ + random.nextInt(16);
				(new WorldGenMinable(Ununoctium.blockID, 5)).generate(world, random, pozX, pozY, pozZ);
			}	
		}
	}
	
	//In Game Messages
	public static int messageInt = 0;
	private Minecraft mc = ModLoader.getMinecraftInstance();
	public boolean gui = true;
	
	public boolean onTickInGame(float f, Minecraft minecraft) 
	{
		   messageInt++;
			   if(messageInt == 5)
		   		{
				   mc.thePlayer.addChatMessage(Mod() + " by " + Author());
				   mc.thePlayer.addChatMessage(Mod() + " " + getVersion() + " has been enabled");
		   		}
	return true;
	}
	public boolean onTickInGUI(float f, Minecraft minecraft, GuiScreen guiscreen)
    {
		if(guiscreen instanceof GuiContainer)
		{
			gui = false;
			minecraft.fontRenderer.drawString(Mod() + " V" + getVersion(), 160, 5, Color.ORANGE.getRGB());
		} else
		{
			gui = true;
		}
		if(guiscreen instanceof GuiMainMenu)
		{
				minecraft.fontRenderer.drawStringWithShadow(Mod() + " by " + Author(), 80, 93, Color.CYAN.getRGB());
		}
		if(guiscreen instanceof GuiIngameMenu)
		{
			minecraft.fontRenderer.drawString(Mod() + " V" + getVersion(), 170, 55, Color.CYAN.getRGB());
		}
		if(guiscreen instanceof GuiGameOver)
		{
			minecraft.fontRenderer.drawString("The Elements will go on without you!", 125, 85, Color.RED.getRGB());
		}
		if(guiscreen instanceof GuiWinGame)
		{
			minecraft.fontRenderer.drawString("You cannot win the Elements!", 125, 165, Color.RED.getRGB());
		}
		if(guiscreen instanceof GuiOptions)
		{
			minecraft.fontRenderer.drawString(Mod() + " V" + getVersion(), 170, 125, Color.CYAN.getRGB());
		}
		if(guiscreen instanceof GuiVideoSettings)
		{
			minecraft.fontRenderer.drawString(Mod() + " V" + getVersion(), 250, 167, Color.CYAN.getRGB());
		}
	return true;
    }
	
	World world;

	//Registered Strings
	public String Mod()
	{
		return "ElementsMod";
	}

	@Override
	public void load() 
	{
		// TODO Auto-generated method stub
	}
	
	public String Author()
	{
		return "ghosrec35, metalhead, and jamolnng";
	}
	@Override
	public String getVersion() 
	{
		return "1.2.3";
	}
}