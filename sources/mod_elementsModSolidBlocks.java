package net.minecraft.src;

import java.util.Random;

public class mod_elementsModSolidBlocks extends BaseMod{

	public String Version(){
		return "1.8.1";
	}
    
	public mod_elementsModSolidBlocks(){
		
		//Block Register
		ModLoader.RegisterBlock(Lithium);
		ModLoader.AddName(Lithium, "Lithium");
        Lithium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/3.png");
		
		ModLoader.RegisterBlock(Beryllium);
		ModLoader.AddName(Beryllium, "Beryllium");
        Beryllium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/4.png");
		
		ModLoader.RegisterBlock(Boron);
		ModLoader.AddName(Boron, "Boron");
        Boron.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/5.png");
		
		ModLoader.RegisterBlock(Carbon);
		ModLoader.AddName(Carbon, "Carbon");
        Carbon.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/6.png");
        
        ModLoader.RegisterBlock(Sodium);
		ModLoader.AddName(Sodium, "Sodium");
        Sodium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/11.png");
		
		ModLoader.RegisterBlock(Magnesium);
		ModLoader.AddName(Magnesium, "Magnesium");
        Magnesium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/12.png");
		
		ModLoader.RegisterBlock(Aluminium);
		ModLoader.AddName(Aluminium, "Aluminium");
        Aluminium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/13.png");
		
		ModLoader.RegisterBlock(Silicon);
		ModLoader.AddName(Silicon, "Silicon");
        Silicon.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/14.png");
        
        ModLoader.RegisterBlock(Phosphorus);
		ModLoader.AddName(Phosphorus, "Phosphorus");
        Phosphorus.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/15.png");
		
		ModLoader.RegisterBlock(Sulfur);
		ModLoader.AddName(Sulfur, "Sulfur");
        Sulfur.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/16.png");
		
		ModLoader.RegisterBlock(Potassium);
		ModLoader.AddName(Potassium, "Potassium");
        Potassium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/19.png");
		
		ModLoader.RegisterBlock(Calcium);
		ModLoader.AddName(Calcium, "Calcium");
        Calcium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/20.png");
        
        ModLoader.RegisterBlock(Scandium);
		ModLoader.AddName(Scandium, "Scandium");
        Scandium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/21.png");
		
		ModLoader.RegisterBlock(Titanium);
		ModLoader.AddName(Titanium, "Titanium");
        Titanium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/22.png");
		
		ModLoader.RegisterBlock(Vanadium);
		ModLoader.AddName(Vanadium, "Vanadium");
        Vanadium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/23.png");
		
		ModLoader.RegisterBlock(Chromium);
		ModLoader.AddName(Chromium, "Chromium");
        Chromium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/24.png");
        
        ModLoader.RegisterBlock(Manganese);
		ModLoader.AddName(Manganese, "Manganese");
        Manganese.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/25.png");
		
        ModLoader.RegisterBlock(Cobalt);
		ModLoader.AddName(Cobalt, "Cobalt");
        Cobalt.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/27.png");
        
		ModLoader.RegisterBlock(Nickel);
		ModLoader.AddName(Nickel, "Nickel");
        Nickel.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/28.png");
		
		ModLoader.RegisterBlock(Copper);
		ModLoader.AddName(Copper, "Copper");
        Copper.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/29.png");
        
        ModLoader.RegisterBlock(Zinc);
		ModLoader.AddName(Zinc, "Zinc");
        Zinc.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/30.png");
		
		ModLoader.RegisterBlock(Gallium);
		ModLoader.AddName(Gallium, "Gallium");
        Gallium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/31.png");
		
		ModLoader.RegisterBlock(Germanium);
		ModLoader.AddName(Germanium, "Germanium");
        Germanium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/32.png");
		
		ModLoader.RegisterBlock(Arsenic);
		ModLoader.AddName(Arsenic, "Arsenic");
        Arsenic.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/33.png");
        
        ModLoader.RegisterBlock(Selenium);
		ModLoader.AddName(Selenium, "Selenium");
        Selenium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/34.png");
		
		ModLoader.RegisterBlock(Bromine);
		ModLoader.AddName(Bromine, "Bromine");
        Bromine.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/35.png");
		
		ModLoader.RegisterBlock(Rubidium);
		ModLoader.AddName(Rubidium, "Rubidium");
        Rubidium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/37.png");
		
		ModLoader.RegisterBlock(Strontium);
		ModLoader.AddName(Strontium, "Strontium");
        Strontium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/38.png");
        
        ModLoader.RegisterBlock(Yttrium);
		ModLoader.AddName(Yttrium, "Yttrium");
        Yttrium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/39.png");
		
		ModLoader.RegisterBlock(Zirconium);
		ModLoader.AddName(Zirconium, "Zirconium");
        Zirconium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/40.png");
		
		ModLoader.RegisterBlock(Niobium);
		ModLoader.AddName(Niobium, "Niobium");
        Niobium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/41.png");
		
		ModLoader.RegisterBlock(Molybdenum);
		ModLoader.AddName(Molybdenum, "Molybdenum");
        Molybdenum.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/42.png");

        ModLoader.RegisterBlock(Technetium);
		ModLoader.AddName(Technetium, "Technetium");
        Technetium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/43.png");
		
		ModLoader.RegisterBlock(Ruthenium);
		ModLoader.AddName(Ruthenium, "Ruthenium");
        Ruthenium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/44.png");
		
		ModLoader.RegisterBlock(Rhodium);
		ModLoader.AddName(Rhodium, "Rhodium");
        Rhodium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/45.png");
		
		ModLoader.RegisterBlock(Palladium);
		ModLoader.AddName(Palladium, "Palladium");
        Palladium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/46.png");

        ModLoader.RegisterBlock(Silver);
		ModLoader.AddName(Silver, "Silver");
        Silver.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/47.png");
		
		ModLoader.RegisterBlock(Cadmium);
		ModLoader.AddName(Cadmium, "Cadmium");
        Cadmium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/48.png");
		
		ModLoader.RegisterBlock(Indium);
		ModLoader.AddName(Indium, "Indium");
        Indium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/49.png");

        ModLoader.RegisterBlock(Tin);
		ModLoader.AddName(Tin, "Tin");
        Tin.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/50.png");
		
		ModLoader.RegisterBlock(Antimony);
		ModLoader.AddName(Antimony, "Antimony");
        Antimony.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/51.png");
		
		ModLoader.RegisterBlock(Tellurium);
		ModLoader.AddName(Tellurium, "Tellurium");
        Tellurium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/52.png");
		
		ModLoader.RegisterBlock(Iodine);
		ModLoader.AddName(Iodine, "Iodine");
        Iodine.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/53.png");

        ModLoader.RegisterBlock(Caesium);
		ModLoader.AddName(Caesium, "Caesium");
        Caesium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/55.png");
		
		ModLoader.RegisterBlock(Barium);
		ModLoader.AddName(Barium, "Barium");
        Barium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/56.png");
		
        ModLoader.RegisterBlock(Lanthanum);
		ModLoader.AddName(Lanthanum, "Lanthanum");
        Lanthanum.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/57.png");
		
        ModLoader.RegisterBlock(Cerium);
		ModLoader.AddName(Cerium, "Cerium");
        Cerium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/58.png");
        
        ModLoader.RegisterBlock(Praseodymium);
		ModLoader.AddName(Praseodymium, "Praseodymium");
        Praseodymium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/59.png");
		
		ModLoader.RegisterBlock(Neodymium);
		ModLoader.AddName(Neodymium, "Neodymium");
        Neodymium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Solid/60.png");
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
    public static final Block Copemicium;
    public static final Block Ununtrium;
    public static final Block Ununquadium;
    public static final Block Ununpentium;
    public static final Block Ununhexium;
    public static final Block Ununseptium;
    public static final Block Ununoctium;
    
    //Block Info
static{
	Lithium = (new BlockLithium(127, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lithium");
    Beryllium = (new BlockBeryllium(128, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Beryllium");
    Boron = (new BlockBoron(129, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Boron");
    Carbon = (new BlockCarbon(130, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Carbon");
    Sodium = (new BlockSodium(131, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sodium");
    Magnesium = (new BlockMagnesium(132, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Magnesium");
    Aluminium = (new BlockAluminum(133, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Aluminium");
    Silicon = (new BlockSilicon(134, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silicon");
    Phosphorus = (new BlockPhosphorus(135, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Phosphorus");
    Sulfur = (new BlockSulfur(136, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sulfur");
    Potassium = (new BlockPottasium(137, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Potassium");
    Calcium = (new BlockCalcium(138, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Calcium");
    Scandium = (new BlockScandium(139, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Scandium");
    Titanium = (new BlockTitanium(140, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Titanium");
    Vanadium = (new BlockVanadium(141, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Vanadium");
    Chromium = (new BlockChromium(142, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chromium");
    Manganese = (new BlockManganese(143, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Manganese");
    Cobalt = (new BlockCobalt(144, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cobalt");
    Nickel = (new BlockNickel(145, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nickel");
    Copper = (new BlockCopper(146, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copper");
    Zinc = (new BlockZinc(147, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zinc");
    Gallium = (new BlockGallium(148, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gallium");
    Germanium = (new BlockGermanium(149, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Germanium");
    Arsenic = (new BlockArsenic(150, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Arsenic");
    Selenium = (new BlockSelenium(151, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Selenium");
    Bromine = (new BlockBromine(152, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bromine");
    Rubidium = (new BlockRubidium(153, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rubidium");
    Strontium = (new BlockStrontium(154, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Strontium");
    Yttrium = (new BlockYtterium(155, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Yttrium");
    Zirconium = (new BlockZirconium(156, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zirconium");
    Niobium = (new BlockNiobium(157, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Niobium");
    Molybdenum = (new BlockMolybdenum(158, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Molybdenum");
    Technetium = (new BlockTechnetium(159, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Technetium");
    Ruthenium = (new BlockRuthenium(160, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ruthenium");
    Rhodium = (new BlockRhodium(161, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhodium");
    Palladium = (new BlockPalladium(162, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Palladium");
    Silver = (new BlockSilver(163, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silver");
    Cadmium = (new BlockCadmium(164, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cadmium");
    Indium = (new BlockIndium(165, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Indium");
    Tin = (new BlockTin(166, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tin");
    Antimony = (new BlockAntimony(167, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Antimony");
    Tellurium = (new BlockTellurium(168, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tellurium");
    Iodine = (new BlockIodine(169, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iodine");
    Caesium = (new BlockCaesium(170, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Caesium");
    Barium = (new BlockBarium(171, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Barium");
    Lanthanum = (new BlockLanthanum(172, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lanthanum");
    Cerium = (new BlockCerium(173, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cerium");
    Praseodymium = (new BlockPraseodymium(174, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Praseodymium");
    Neodymium = (new BlockNeodymium(175, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neodymium");
    Promethium = (new BlockPromethium(176, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Promethium");
    Samarium = (new BlockSamarium(177, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Smarium");
    Europium = (new BlockEuropium(178, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Europium");
    Gadolinium = (new BlockGadolinium(179, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gadolinium");
    Terbium = (new BlockTerbium(180, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Terbium");
    Dysprosium = (new BlockDysprosium(181, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dysprosium");
    Holmium = (new BlockHolmium(182, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Holmium");
    Erbium = (new BlockErbium(183, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Erbium");
    Thulium = (new BlockThulium(184, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thulium");
    Ytterbium = (new BlockYtterbium(185, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ytterbium");
    Lutetium = (new BlockLutetium(186, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lutetium");
    Hafnium = (new BlockHafnium(187, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hafnium");
    Tantalum = (new BlockTantalum(188, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tantalum");
    Tungsten = (new BlockTungsten(189, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tungsten");
    Rhenium = (new BlockRhenium(190, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhenium");
    Osmium = (new BlockOsmium(191, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Osmium");
    Iridium = (new BlockIridium(192, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iridium");
    Platinum = (new BlockPlatinum(193, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Platinum");
    Mercury = (new BlockMercury(194, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mercury");
    Thallium = (new BlockThallium(195, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thallium");
    Lead = (new BlockLead(196, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lead");
    Bismuth = (new BlockBismuth(197, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bismuth");
    Polonium = (new BlockPolonium(198, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Polonium");
    Astatine = (new BlockAstatine(199, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Astatine");
    Francium = (new BlockFrancium(200, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Francium");
    Radium = (new BlockRadium(201, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radium");
    Actinium = (new BlockActinium(202, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Actinium");
    Thorium = (new BlockThorium(203, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Protactinium = (new BlockProtactinium(204, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Uranium = (new BlockUranium(205, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Neptunium = (new BlockNeptunium(206, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Plutonium = (new BlockPlutonium(207, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Americium = (new BlockAmericium(208, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Curium = (new BlockCurium(209, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Berkelium = (new BlockBerkelium(210, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Californium = (new BlockCalifornium(211, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Einsteinium = (new BlockEinsteinium(212, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Fermium = (new BlockFermium(213, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Mendelevium = (new BlockMendelevium(214, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Nobelium = (new BlockNobelium(215, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Lawrencium = (new BlockLawrencium(216, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Rutherfordium= (new BlockRutherfordium(217, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Dubnium = (new BlockDubnium(218, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Seaborgium = (new BlockSeaborgium(219, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Bohrium = (new BlockBohrium(220, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Hassium = (new BlockHassium(221, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Meitnerium = (new BlockMeitnerium(222, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Darmstadtium = (new BlockDarmstadtium(223, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Roentgenium = (new BlockRoentgenium(224, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Copemicium= (new BlockCopemicium(225, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Ununtrium = (new BlockUnuntrium(226, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Ununquadium = (new BlockUnunquadium(227, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Ununpentium = (new BlockUnunpentium(228, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Ununhexium = (new BlockUnunhexium(229, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Ununseptium = (new BlockUnunseptium(230, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
    Ununoctium = (new BlockUnunoctium(231, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("");
}
public void GenerateSurface(World world, Random random, int chunkX,int chunkZ)
{
	int pozX;
	int pozY;
	int pozZ;
	
	int tries = 20;
	
	for(int i = 0; i < tries; i++)
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
}