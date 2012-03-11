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
	public String Version()
	{
		return "1.8.1";
	} 
	
	private static mod_ElementsModConfig EM;
	
	public mod_ElementsModSolidBlocks()
	{
		MinecraftForgeClient.preloadTexture("/elements/solid/solid.png");
		world = ModLoader.getMinecraftInstance().theWorld;
	
		
		//Block Register
		ModLoader.RegisterBlock(Lithium);
		ModLoader.AddName(Lithium, "Lithium");
		
		ModLoader.RegisterBlock(Beryllium);
		ModLoader.AddName(Beryllium, "Beryllium");
		
		ModLoader.RegisterBlock(Boron);
		ModLoader.AddName(Boron, "Boron");
		
		ModLoader.RegisterBlock(Carbon);
		ModLoader.AddName(Carbon, "Carbon");
        
        ModLoader.RegisterBlock(Sodium);
		ModLoader.AddName(Sodium, "Sodium");
		
		ModLoader.RegisterBlock(Magnesium);
		ModLoader.AddName(Magnesium, "Magnesium");
		
		ModLoader.RegisterBlock(Aluminium);
		ModLoader.AddName(Aluminium, "Aluminium");
		
		ModLoader.RegisterBlock(Silicon);
		ModLoader.AddName(Silicon, "Silicon");
        
        ModLoader.RegisterBlock(Phosphorus);
		ModLoader.AddName(Phosphorus, "Phosphorus");
		
		ModLoader.RegisterBlock(Sulfur);
		ModLoader.AddName(Sulfur, "Sulfur");
		
		ModLoader.RegisterBlock(Potassium);
		ModLoader.AddName(Potassium, "Potassium");
		
		ModLoader.RegisterBlock(Calcium);
		ModLoader.AddName(Calcium, "Calcium");
        
        ModLoader.RegisterBlock(Scandium);
		ModLoader.AddName(Scandium, "Scandium");
		
		ModLoader.RegisterBlock(Titanium);
		ModLoader.AddName(Titanium, "Titanium");
		
		ModLoader.RegisterBlock(Vanadium);
		ModLoader.AddName(Vanadium, "Vanadium");
		
		ModLoader.RegisterBlock(Chromium);
		ModLoader.AddName(Chromium, "Chromium");
        
        ModLoader.RegisterBlock(Manganese);
		ModLoader.AddName(Manganese, "Manganese");
		
        ModLoader.RegisterBlock(Cobalt);
		ModLoader.AddName(Cobalt, "Cobalt");
        
		ModLoader.RegisterBlock(Nickel);
		ModLoader.AddName(Nickel, "Nickel");
		
		ModLoader.RegisterBlock(Copper);
		ModLoader.AddName(Copper, "Copper");
        
        ModLoader.RegisterBlock(Zinc);
		ModLoader.AddName(Zinc, "Zinc");
		
		ModLoader.RegisterBlock(Gallium);
		ModLoader.AddName(Gallium, "Gallium");
		
		ModLoader.RegisterBlock(Germanium);
		ModLoader.AddName(Germanium, "Germanium");
		
		ModLoader.RegisterBlock(Arsenic);
		ModLoader.AddName(Arsenic, "Arsenic");
        
        ModLoader.RegisterBlock(Selenium);
		ModLoader.AddName(Selenium, "Selenium");
		
		ModLoader.RegisterBlock(Bromine);
		ModLoader.AddName(Bromine, "Bromine");
		
		ModLoader.RegisterBlock(Rubidium);
		ModLoader.AddName(Rubidium, "Rubidium");
		
		ModLoader.RegisterBlock(Strontium);
		ModLoader.AddName(Strontium, "Strontium");
        
        ModLoader.RegisterBlock(Yttrium);
		ModLoader.AddName(Yttrium, "Yttrium");
		
		ModLoader.RegisterBlock(Zirconium);
		ModLoader.AddName(Zirconium, "Zirconium");
		
		ModLoader.RegisterBlock(Niobium);
		ModLoader.AddName(Niobium, "Niobium");
		
		ModLoader.RegisterBlock(Molybdenum);
		ModLoader.AddName(Molybdenum, "Molybdenum");

        ModLoader.RegisterBlock(Technetium);
		ModLoader.AddName(Technetium, "Technetium");
		
		ModLoader.RegisterBlock(Ruthenium);
		ModLoader.AddName(Ruthenium, "Ruthenium");
		
		ModLoader.RegisterBlock(Rhodium);
		ModLoader.AddName(Rhodium, "Rhodium");
		
		ModLoader.RegisterBlock(Palladium);
		ModLoader.AddName(Palladium, "Palladium");

        ModLoader.RegisterBlock(Silver);
		ModLoader.AddName(Silver, "Silver");
		
		ModLoader.RegisterBlock(Cadmium);
		ModLoader.AddName(Cadmium, "Cadmium");
		
		ModLoader.RegisterBlock(Indium);
		ModLoader.AddName(Indium, "Indium");

        ModLoader.RegisterBlock(Tin);
		ModLoader.AddName(Tin, "Tin");
		
		ModLoader.RegisterBlock(Antimony);
		ModLoader.AddName(Antimony, "Antimony");
		
		ModLoader.RegisterBlock(Tellurium);
		ModLoader.AddName(Tellurium, "Tellurium");
		
		ModLoader.RegisterBlock(Iodine);
		ModLoader.AddName(Iodine, "Iodine");

        ModLoader.RegisterBlock(Caesium);
		ModLoader.AddName(Caesium, "Caesium");
		
		ModLoader.RegisterBlock(Barium);
		ModLoader.AddName(Barium, "Barium");
		
        ModLoader.RegisterBlock(Lanthanum);
		ModLoader.AddName(Lanthanum, "Lanthanum");
		
        ModLoader.RegisterBlock(Cerium);
		ModLoader.AddName(Cerium, "Cerium");
        
        ModLoader.RegisterBlock(Praseodymium);
		ModLoader.AddName(Praseodymium, "Praseodymium");
		
		ModLoader.RegisterBlock(Neodymium);
		ModLoader.AddName(Neodymium, "Neodymium");
        
        ModLoader.RegisterBlock(Promethium);
		ModLoader.AddName(Promethium, "Promethium");
		
		ModLoader.RegisterBlock(Samarium);
		ModLoader.AddName(Samarium, "Samarium");
		
		ModLoader.RegisterBlock(Europium);
		ModLoader.AddName(Europium, "Europium");
		
		ModLoader.RegisterBlock(Gadolinium);
		ModLoader.AddName(Gadolinium, "Gadolinium");
        
        ModLoader.RegisterBlock(Terbium);
		ModLoader.AddName(Terbium, "Terbium");
		
		ModLoader.RegisterBlock(Dysprosium);
		ModLoader.AddName(Dysprosium, "Dysprosium");
		
		ModLoader.RegisterBlock(Holmium);
		ModLoader.AddName(Holmium, "Holmium");
		
		ModLoader.RegisterBlock(Erbium);
		ModLoader.AddName(Erbium, "Erbium");
        
        ModLoader.RegisterBlock(Thulium);
		ModLoader.AddName(Thulium, "Thulium");
		
		ModLoader.RegisterBlock(Ytterbium);
		ModLoader.AddName(Ytterbium, "Ytterbium");
		
		ModLoader.RegisterBlock(Lutetium);
		ModLoader.AddName(Lutetium, "Lutetium");
        
        ModLoader.RegisterBlock(Hafnium);
		ModLoader.AddName(Hafnium, "Hafnium");
		
		ModLoader.RegisterBlock(Tungsten);
		ModLoader.AddName(Tungsten, "Tungsten");
		
		ModLoader.RegisterBlock(Rhenium);
		ModLoader.AddName(Rhenium, "Rhenium");
		
		ModLoader.RegisterBlock(Osmium);
		ModLoader.AddName(Osmium, "Osmium");
        
        ModLoader.RegisterBlock(Iridium);
		ModLoader.AddName(Iridium, "Iridium");
		
        ModLoader.RegisterBlock(Platinum);
		ModLoader.AddName(Platinum, "Platinum");
        
		ModLoader.RegisterBlock(Mercury);
		ModLoader.AddName(Mercury, "Mercury");
		
		ModLoader.RegisterBlock(Thallium);
		ModLoader.AddName(Thallium, "Thallium");
        
        ModLoader.RegisterBlock(Lead);
		ModLoader.AddName(Lead, "Lead");
		
		ModLoader.RegisterBlock(Bismuth);
		ModLoader.AddName(Bismuth, "Bismuth");
		
		ModLoader.RegisterBlock(Polonium);
		ModLoader.AddName(Polonium, "Polonium");
		
		ModLoader.RegisterBlock(Astatine);
		ModLoader.AddName(Astatine, "Astatine");
        
        ModLoader.RegisterBlock(Francium);
		ModLoader.AddName(Francium, "Francium");
		
		ModLoader.RegisterBlock(Radium);
		ModLoader.AddName(Radium, "Radium");
		
		ModLoader.RegisterBlock(Actinium);
		ModLoader.AddName(Actinium, "Actinium");
		
		ModLoader.RegisterBlock(Thorium);
		ModLoader.AddName(Thorium, "Thorium");
        
        ModLoader.RegisterBlock(Protactinium);
		ModLoader.AddName(Protactinium, "Protactinium");
		
		ModLoader.RegisterBlock(Uranium);
		ModLoader.AddName(Uranium, "Uranium");
		
		ModLoader.RegisterBlock(Neptunium);
		ModLoader.AddName(Neptunium, "Neptunium");
		
		ModLoader.RegisterBlock(Plutonium);
		ModLoader.AddName(Plutonium, "Plutonium");

        ModLoader.RegisterBlock(Americium);
		ModLoader.AddName(Americium, "Americium");
		
		ModLoader.RegisterBlock(Curium);
		ModLoader.AddName(Curium, "Curium");
		
		ModLoader.RegisterBlock(Berkelium);
		ModLoader.AddName(Berkelium, "Berkelium");
		
		ModLoader.RegisterBlock(Californium);
		ModLoader.AddName(Californium, "Californium");

        ModLoader.RegisterBlock(Einsteinium);
		ModLoader.AddName(Einsteinium, "Einsteinium");
		
		ModLoader.RegisterBlock(Fermium);
		ModLoader.AddName(Fermium, "Fermium");
		
		ModLoader.RegisterBlock(Mendelevium);
		ModLoader.AddName(Mendelevium, "Mendelevium");

        ModLoader.RegisterBlock(Nobelium);
		ModLoader.AddName(Nobelium, "Nobelium");
		
		ModLoader.RegisterBlock(Lawrencium);
		ModLoader.AddName(Lawrencium, "Lawrencium");
		
		ModLoader.RegisterBlock(Rutherfordium);
		ModLoader.AddName(Rutherfordium, "Rutherfordium");
		
		ModLoader.RegisterBlock(Dubnium);
		ModLoader.AddName(Dubnium, "Dubnium");

        ModLoader.RegisterBlock(Seaborgium);
		ModLoader.AddName(Seaborgium, "Seaborgium");
		
		ModLoader.RegisterBlock(Bohrium);
		ModLoader.AddName(Bohrium, "Bohrium");
		
        ModLoader.RegisterBlock(Hassium);
		ModLoader.AddName(Hassium, "Hassium");
		
        ModLoader.RegisterBlock(Meitnerium);
		ModLoader.AddName(Meitnerium, "Meitnerium");
        
        ModLoader.RegisterBlock(Darmstadtium);
		ModLoader.AddName(Darmstadtium, "Darmstadtium");
		
		ModLoader.RegisterBlock(Roentgenium);
		ModLoader.AddName(Roentgenium, "Roentgenium");
		
		ModLoader.RegisterBlock(Copernicium);
		ModLoader.AddName(Copernicium, "Copernicium");

        ModLoader.RegisterBlock(Ununtrium);
		ModLoader.AddName(Ununtrium, "Ununtrium");
		
		ModLoader.RegisterBlock(Ununquadium);
		ModLoader.AddName(Ununquadium, "Ununquadium");
		
        ModLoader.RegisterBlock(Ununpentium);
		ModLoader.AddName(Ununpentium, "Ununpentium");
		
        ModLoader.RegisterBlock(Ununhexium);
		ModLoader.AddName(Ununhexium, "Ununhexium");
        
        ModLoader.RegisterBlock(Ununseptium);
		ModLoader.AddName(Ununseptium, "Ununseptium");
		
		ModLoader.RegisterBlock(Ununoctium);
		ModLoader.AddName(Ununoctium, "Ununoctium");
		
		ModLoader.SetInGameHook(this, true, false);
		ModLoader.SetInGUIHook(this, true, false);
		
		ModLoader.AddRecipe(new ItemStack(Uranium, 1), new Object[] {
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
	public void GenerateSurface(World world, Random random, int chunkX,int chunkZ)
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
	
	public boolean OnTickInGame(float f, Minecraft minecraft) 
	{
		   messageInt++;
			   if(messageInt == 5)
		   		{
				   mc.thePlayer.addChatMessage(Mod() + " by " + Author());
				   mc.thePlayer.addChatMessage(Mod() + " " + getVersion() + " has been enabled");
		   		}
	return true;
	}
	public boolean OnTickInGUI(float f, Minecraft minecraft, GuiScreen guiscreen)
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
	public String getVersion() 
	{
		return "0.1";
	}

	@Override
	public void load() 
	{
	}
	
	public String Author()
	{
		return "ghosrec35, jamolnng, and metalhead";
	}
}