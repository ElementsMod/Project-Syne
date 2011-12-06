package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class mod_elementsModSolidBlocks extends BaseMod
{
	public String Version()
	{
		return "1.8.1";
	} 
    
	public mod_elementsModSolidBlocks()
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
	}
	
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
		Lithium = (new BlockLithium(145, 0)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lithium");
    	Beryllium = (new BlockBeryllium(146, 1)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Beryllium");
    	Boron = (new BlockBoron(147, 2)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Boron");
    	Carbon = (new BlockCarbon(148, 3)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Carbon");
    	Sodium = (new BlockSodium(149, 4)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sodium");
    	Magnesium = (new BlockMagnesium(150, 5)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Magnesium");
    	Aluminium = (new BlockAluminum(151, 6)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Aluminium");
    	Silicon = (new BlockSilicon(152, 7)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silicon");
    	Phosphorus = (new BlockPhosphorus(153, 8)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Phosphorus");
    	Sulfur = (new BlockSulfur(154, 9)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sulfur");
    	Potassium = (new BlockPottasium(155, 10)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Potassium");
    	Calcium = (new BlockCalcium(156, 11)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Calcium");
    	Scandium = (new BlockScandium(157, 12)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Scandium");
    	Titanium = (new BlockTitanium(158, 13)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Titanium");
    	Vanadium = (new BlockVanadium(159, 14)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Vanadium");
    	Chromium = (new BlockChromium(160, 15)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chromium");
    	Manganese = (new BlockManganese(161, 16)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Manganese");
    	Cobalt = (new BlockCobalt(162, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cobalt");
    	Nickel = (new BlockNickel(163, 18)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nickel");
    	Copper = (new BlockCopper(164, 19)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copper");
    	Zinc = (new BlockZinc(165, 20)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zinc");
    	Gallium = (new BlockGallium(166, 21)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gallium");
    	Germanium = (new BlockGermanium(167, 22)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Germanium");
    	Arsenic = (new BlockArsenic(168, 23)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Arsenic");
    	Selenium = (new BlockSelenium(169, 24)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Selenium");
    	Bromine = (new BlockBromine(170, 25)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bromine");
    	Rubidium = (new BlockRubidium(171, 26)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rubidium");
    	Strontium = (new BlockStrontium(172, 27)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Strontium");
    	Yttrium = (new BlockYtterium(173, 28)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Yttrium");
    	Zirconium = (new BlockZirconium(174, 29)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zirconium");
    	Niobium = (new BlockNiobium(175, 30)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Niobium");
    	Molybdenum = (new BlockMolybdenum(176, 31)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Molybdenum");
    	Technetium = (new BlockTechnetium(177, 32)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Technetium");
    	Ruthenium = (new BlockRuthenium(178, 33)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ruthenium");
    	Rhodium = (new BlockRhodium(179, 34)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhodium");
    	Palladium = (new BlockPalladium(180, 35)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Palladium");
    	Silver = (new BlockSilver(181, 36)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silver");
    	Cadmium = (new BlockCadmium(182, 37)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cadmium");
    	Indium = (new BlockIndium(183, 38)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Indium");
    	Tin = (new BlockTin(184, 39)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tin");
    	Antimony = (new BlockAntimony(185, 40)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Antimony");
    	Tellurium = (new BlockTellurium(186, 41)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tellurium");
    	Iodine = (new BlockIodine(187, 42)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iodine");
    	Caesium = (new BlockCaesium(188, 43)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Caesium");
    	Barium = (new BlockBarium(189, 44)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Barium");
    	Lanthanum = (new BlockLanthanum(190, 45)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lanthanum");
    	Cerium = (new BlockCerium(191, 46)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cerium");
    	Praseodymium = (new BlockPraseodymium(192, 47)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Praseodymium");
    	Neodymium = (new BlockNeodymium(193, 48)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neodymium");
    	Promethium = (new BlockPromethium(194, 49)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Promethium");
    	Samarium = (new BlockSamarium(195, 50)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Smarium");
    	Europium = (new BlockEuropium(196, 51)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Europium");
    	Gadolinium = (new BlockGadolinium(197, 52)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gadolinium");
    	Terbium = (new BlockTerbium(198, 53)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Terbium");
    	Dysprosium = (new BlockDysprosium(199, 54)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dysprosium");
    	Holmium = (new BlockHolmium(200, 55)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Holmium");
    	Erbium = (new BlockErbium(201, 56)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Erbium");
    	Thulium = (new BlockThulium(202, 57)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thulium");
    	Ytterbium = (new BlockYtterbium(203, 58)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ytterbium");
    	Lutetium = (new BlockLutetium(204, 59)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lutetium");
    	Hafnium = (new BlockHafnium(205, 60)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hafnium");
    	Tantalum = (new BlockTantalum(206, 61)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tantalum");
    	Tungsten = (new BlockTungsten(207, 62)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tungsten");
    	Rhenium = (new BlockRhenium(208, 63)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhenium");
    	Osmium = (new BlockOsmium(209, 64)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Osmium");
    	Iridium = (new BlockIridium(210, 65)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iridium");
    	Platinum = (new BlockPlatinum(211, 66)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Platinum");
    	Mercury = (new BlockMercury(212, 67)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mercury");
    	Thallium = (new BlockThallium(213, 68)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thallium");
    	Lead = (new BlockLead(214, 69)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lead");
    	Bismuth = (new BlockBismuth(215, 70)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bismuth");
    	Polonium = (new BlockPolonium(216, 71)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Polonium");
    	Astatine = (new BlockAstatine(217, 72)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Astatine");
    	Francium = (new BlockFrancium(218, 73)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Francium");
    	Radium = (new BlockRadium(219, 74)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radium");
    	Actinium = (new BlockActinium(220, 75)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Actinium");
    	Thorium = (new BlockThorium(221, 76)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Protactinium = (new BlockProtactinium(222, 77)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Uranium = (new BlockUranium(223, 78)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Neptunium = (new BlockNeptunium(224, 79)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Plutonium = (new BlockPlutonium(225, 80)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Americium = (new BlockAmericium(226, 81)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Curium = (new BlockCurium(227, 82)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Berkelium = (new BlockBerkelium(228, 83)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Californium = (new BlockCalifornium(229, 84)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Einsteinium = (new BlockEinsteinium(230, 85)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Fermium = (new BlockFermium(231, 86)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Mendelevium = (new BlockMendelevium(232, 87)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Nobelium = (new BlockNobelium(233, 88)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Lawrencium = (new BlockLawrencium(234, 89)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Rutherfordium= (new BlockRutherfordium(235, 90)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Dubnium = (new BlockDubnium(236, 91)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Seaborgium = (new BlockSeaborgium(237, 92)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Bohrium = (new BlockBohrium(238, 93)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Hassium = (new BlockHassium(239, 94)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Meitnerium = (new BlockMeitnerium(240, 95)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Darmstadtium = (new BlockDarmstadtium(241, 96)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Roentgenium = (new BlockRoentgenium(242, 97)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Copernicium= (new BlockCopemicium(243, 98)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununtrium = (new BlockUnuntrium(244, 99)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununquadium = (new BlockUnunquadium(245, 100)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununpentium = (new BlockUnunpentium(246, 101)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununhexium = (new BlockUnunhexium(247, 102)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununseptium = (new BlockUnunseptium(248, 103)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununoctium = (new BlockUnunoctium(249, 104)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
	}

    //generation
	public void GenerateSurface(World world, Random random, int chunkX,int chunkZ)
	{
		int pozX;
		int pozY;
		int pozZ;
	
		int tries = 20;
	
		for(int b = 0; b < tries; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Lithium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Beryllium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Boron.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Carbon.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Sodium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Magnesium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Aluminium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Silicon.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Phosphorus.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Sulfur.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Potassium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Calcium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Scandium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Titanium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Vanadium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Chromium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Manganese.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Cobalt.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Nickel.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Copper.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Zinc.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Gallium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Germanium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Arsenic.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Selenium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Bromine.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Rubidium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Strontium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Lithium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Beryllium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Lithium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
			(new WorldGenMinable(Beryllium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
	}
	
	World world;

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