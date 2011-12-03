package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class mod_elementsModSolidBlocks extends BaseMod
{
	public String Version(){
		return "1.8.1";
	} 
    
	public mod_elementsModSolidBlocks()
	{
		MinecraftForgeClient.preloadTexture("/elements/solid/solid.png");
		world = ModLoader.getMinecraftInstance().theWorld;
		
		ModLoader.AddRecipe(new ItemStack(Uranium, 16), new Object[]{
            "XXX", "XXX", "XYX", 
            Character.valueOf('X'), Block.sand,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
		
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
    static{
		Lithium = (new BlockLithium(244, 0)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lithium");
    	Beryllium = (new BlockBeryllium(245, 1)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Beryllium");
    	Boron = (new BlockBoron(246, 2)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Boron");
    	Carbon = (new BlockCarbon(247, 3)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Carbon");
    	Sodium = (new BlockSodium(248, 4)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sodium");
    	Magnesium = (new BlockMagnesium(249, 5)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Magnesium");
    	Aluminium = (new BlockAluminum(126, 6)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Aluminium");
    	Silicon = (new BlockSilicon(128, 7)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silicon");
    	Phosphorus = (new BlockPhosphorus(129, 8)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Phosphorus");
    	Sulfur = (new BlockSulfur(130, 9)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sulfur");
    	Potassium = (new BlockPottasium(131, 10)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Potassium");
    	Calcium = (new BlockCalcium(132, 11)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Calcium");
    	Scandium = (new BlockScandium(133, 12)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Scandium");
    	Titanium = (new BlockTitanium(134, 13)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Titanium");
    	Vanadium = (new BlockVanadium(135, 14)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Vanadium");
    	Chromium = (new BlockChromium(136, 15)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chromium");
    	Manganese = (new BlockManganese(137, 16)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Manganese");
    	Cobalt = (new BlockCobalt(138, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cobalt");
    	Nickel = (new BlockNickel(139, 18)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nickel");
    	Copper = (new BlockCopper(140, 19)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copper");
    	Zinc = (new BlockZinc(141, 20)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zinc");
    	Gallium = (new BlockGallium(142, 21)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gallium");
    	Germanium = (new BlockGermanium(143, 22)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Germanium");
    	Arsenic = (new BlockArsenic(144, 23)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Arsenic");
    	Selenium = (new BlockSelenium(145, 24)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Selenium");
    	Bromine = (new BlockBromine(146, 25)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bromine");
    	Rubidium = (new BlockRubidium(147, 26)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rubidium");
    	Strontium = (new BlockStrontium(148, 27)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Strontium");
    	Yttrium = (new BlockYtterium(149, 28)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Yttrium");
    	Zirconium = (new BlockZirconium(150, 29)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zirconium");
    	Niobium = (new BlockNiobium(151, 30)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Niobium");
    	Molybdenum = (new BlockMolybdenum(152, 31)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Molybdenum");
    	Technetium = (new BlockTechnetium(153, 32)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Technetium");
    	Ruthenium = (new BlockRuthenium(154, 33)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ruthenium");
    	Rhodium = (new BlockRhodium(155, 34)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhodium");
    	Palladium = (new BlockPalladium(156, 35)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Palladium");
    	Silver = (new BlockSilver(157, 36)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silver");
    	Cadmium = (new BlockCadmium(158, 37)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cadmium");
    	Indium = (new BlockIndium(159, 38)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Indium");
    	Tin = (new BlockTin(160, 39)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tin");
    	Antimony = (new BlockAntimony(161, 40)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Antimony");
    	Tellurium = (new BlockTellurium(162, 41)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tellurium");
    	Iodine = (new BlockIodine(163, 42)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iodine");
    	Caesium = (new BlockCaesium(164, 43)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Caesium");
    	Barium = (new BlockBarium(165, 44)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Barium");
    	Lanthanum = (new BlockLanthanum(166, 45)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lanthanum");
    	Cerium = (new BlockCerium(167, 46)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cerium");
    	Praseodymium = (new BlockPraseodymium(168, 47)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Praseodymium");
    	Neodymium = (new BlockNeodymium(169, 48)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neodymium");
    	Promethium = (new BlockPromethium(170, 49)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Promethium");
    	Samarium = (new BlockSamarium(171, 50)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Smarium");
    	Europium = (new BlockEuropium(172, 51)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Europium");
    	Gadolinium = (new BlockGadolinium(173, 52)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gadolinium");
    	Terbium = (new BlockTerbium(174, 53)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Terbium");
    	Dysprosium = (new BlockDysprosium(175, 54)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dysprosium");
    	Holmium = (new BlockHolmium(176, 55)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Holmium");
    	Erbium = (new BlockErbium(177, 56)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Erbium");
    	Thulium = (new BlockThulium(178, 57)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thulium");
    	Ytterbium = (new BlockYtterbium(179, 58)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ytterbium");
    	Lutetium = (new BlockLutetium(180, 59)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lutetium");
    	Hafnium = (new BlockHafnium(181, 60)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hafnium");
    	Tantalum = (new BlockTantalum(182, 61)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tantalum");
    	Tungsten = (new BlockTungsten(183, 62)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tungsten");
    	Rhenium = (new BlockRhenium(184, 63)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhenium");
    	Osmium = (new BlockOsmium(185, 64)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Osmium");
    	Iridium = (new BlockIridium(186, 65)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iridium");
    	Platinum = (new BlockPlatinum(187, 66)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Platinum");
    	Mercury = (new BlockMercury(188, 67)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mercury");
    	Thallium = (new BlockThallium(189, 68)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thallium");
    	Lead = (new BlockLead(190, 69)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lead");
    	Bismuth = (new BlockBismuth(191, 70)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bismuth");
    	Polonium = (new BlockPolonium(192, 71)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Polonium");
    	Astatine = (new BlockAstatine(193, 72)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Astatine");
    	Francium = (new BlockFrancium(194, 73)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Francium");
    	Radium = (new BlockRadium(195, 74)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radium");
    	Actinium = (new BlockActinium(196, 75)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Actinium");
    	Thorium = (new BlockThorium(197, 76)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Protactinium = (new BlockProtactinium(198, 77)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Uranium = (new BlockUranium(199, 78)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Neptunium = (new BlockNeptunium(200, 79)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Plutonium = (new BlockPlutonium(201, 80)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Americium = (new BlockAmericium(202, 81)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Curium = (new BlockCurium(203, 82)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Berkelium = (new BlockBerkelium(204, 83)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Californium = (new BlockCalifornium(205, 84)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Einsteinium = (new BlockEinsteinium(206, 85)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Fermium = (new BlockFermium(207, 86)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Mendelevium = (new BlockMendelevium(208, 87)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Nobelium = (new BlockNobelium(209, 88)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Lawrencium = (new BlockLawrencium(210, 89)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Rutherfordium= (new BlockRutherfordium(211, 90)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Dubnium = (new BlockDubnium(212, 91)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Seaborgium = (new BlockSeaborgium(213, 92)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Bohrium = (new BlockBohrium(214, 93)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Hassium = (new BlockHassium(215, 94)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Meitnerium = (new BlockMeitnerium(216, 95)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Darmstadtium = (new BlockDarmstadtium(217, 96)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Roentgenium = (new BlockRoentgenium(218, 97)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Copernicium= (new BlockCopemicium(219, 98)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununtrium = (new BlockUnuntrium(220, 99)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununquadium = (new BlockUnunquadium(221, 100)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununpentium = (new BlockUnunpentium(222, 101)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununhexium = (new BlockUnunhexium(223, 102)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununseptium = (new BlockUnunseptium(224, 103)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    	Ununoctium = (new BlockUnunoctium(225, 104)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
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