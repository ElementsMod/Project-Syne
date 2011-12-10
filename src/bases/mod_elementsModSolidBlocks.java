package net.minecraft.src;

import java.awt.Color;
import java.util.Random;

import net.minecraft.client.Minecraft;
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
		
		ModLoader.SetInGameHook(this, true, false);
		ModLoader.SetInGUIHook(this, true, false);
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
    
    //MLProp Block ID's
    @MLProp public static final int LithiumID = 145;
    @MLProp public static final int BerylliumID = 146;
    @MLProp public static final int BoronID = 147;
    @MLProp public static final int CarbonID = 148;
    @MLProp public static final int SodiumID = 149;
    @MLProp public static final int MagnesiumID = 150;
    @MLProp public static final int AluminiumID = 151;
    @MLProp public static final int SiliconID = 152;
    @MLProp public static final int PhosphorusID = 153;
    @MLProp public static final int SulfurID = 154;
    @MLProp public static final int PotassiumID = 155;
    @MLProp public static final int CalciumID = 156;
    @MLProp public static final int ScandiumID = 157;
    @MLProp public static final int TitaniumID = 158;
    @MLProp public static final int VanadiumID = 159;
    @MLProp public static final int ChromiumID = 160;
    @MLProp public static final int ManganeseID = 161;
    @MLProp public static final int CobaltID = 162;
    @MLProp public static final int NickelID = 163;
    @MLProp public static final int CopperID = 164;
    @MLProp public static final int ZincID = 165;
    @MLProp public static final int GalliumID = 166;
    @MLProp public static final int GermaniumID = 167;
    @MLProp public static final int ArsenicID = 168;
    @MLProp public static final int SeleniumID = 169;
    @MLProp public static final int BromineID = 170;
    @MLProp public static final int RubidiumID = 171;
    @MLProp public static final int StrontiumID = 172;
    @MLProp public static final int YttriumID = 173;
    @MLProp public static final int ZirconiumID = 174;
    @MLProp public static final int NiobiumID = 175;
    @MLProp public static final int MolybdenumID = 176;
    @MLProp public static final int TechnetiumID = 177;
    @MLProp public static final int RutheniumID = 178;
    @MLProp public static final int RhodiumID = 179;
    @MLProp public static final int PalladiumID = 180;
    @MLProp public static final int SilverID = 181;
    @MLProp public static final int CadmiumID = 182;
    @MLProp public static final int IndiumID = 183;
    @MLProp public static final int TinID = 184;
    @MLProp public static final int AntimonyID = 185;
    @MLProp public static final int TelluriumID = 186;
    @MLProp public static final int IodineID = 187;
    @MLProp public static final int CaesiumID = 188;
    @MLProp public static final int BariumID = 189;
    @MLProp public static final int LanthanumID = 190;
    @MLProp public static final int CeriumID = 191;
    @MLProp public static final int PraseodymiumID = 192;
    @MLProp public static final int NeodymiumID = 193;
    @MLProp public static final int PromethiumID = 194;
    @MLProp public static final int SamariumID = 195;
    @MLProp public static final int EuropiumID = 196;
    @MLProp public static final int GadoliniumID = 197;
    @MLProp public static final int TerbiumID = 198;
    @MLProp public static final int DysprosiumID = 199;
    @MLProp public static final int HolmiumID = 200;
    @MLProp public static final int ErbiumID = 201;
    @MLProp public static final int ThuliumID = 202;
    @MLProp public static final int YtterbiumID = 203;
    @MLProp public static final int LutetiumID = 204;
    @MLProp public static final int HafniumID = 205;
    @MLProp public static final int TantalumID = 206;
    @MLProp public static final int TungstenID = 207;
    @MLProp public static final int RheniumID = 208;
    @MLProp public static final int OsmiumID = 209;
    @MLProp public static final int IridiumID = 210;
    @MLProp public static final int PlatinumID = 211;
    @MLProp public static final int MercuryID = 212;
    @MLProp public static final int ThalliumID = 213;
    @MLProp public static final int LeadID = 214;
    @MLProp public static final int BismuthID = 215;
    @MLProp public static final int PoloniumID = 216;
    @MLProp public static final int AstatineID = 217;
    @MLProp public static final int FranciumID = 218;
    @MLProp public static final int RadiumID = 219;
    @MLProp public static final int ActiniumID = 220;
    @MLProp public static final int ThoriumID = 221;
    @MLProp public static final int ProtactiniumID = 222;
    @MLProp public static final int UraniumID = 223;
    @MLProp public static final int NeptuniumID = 224;
    @MLProp public static final int PlutoniumID = 225;
    @MLProp public static final int AmericiumID = 226;
    @MLProp public static final int CuriumID = 227;
    @MLProp public static final int BerkeliumID = 228;
    @MLProp public static final int CaliforniumID = 229;
    @MLProp public static final int EinsteiniumID = 230;
    @MLProp public static final int FermiumID = 231;
    @MLProp public static final int MendeleviumID = 232;
    @MLProp public static final int NobeliumID = 233;
    @MLProp public static final int LawrenciumID = 234;
    @MLProp public static final int RutherfordiumID = 235;
    @MLProp public static final int DubniumID = 236;
    @MLProp public static final int SeaborgiumID = 237;
    @MLProp public static final int BohriumID = 238;
    @MLProp public static final int HassiumID = 239;
    @MLProp public static final int MeitneriumID = 240;
    @MLProp public static final int DarmstadtiumID = 241;
    @MLProp public static final int RoentgeniumID = 242;
    @MLProp public static final int CoperniciumID = 243;
    @MLProp public static final int UnuntriumID = 244;
    @MLProp public static final int UnunquadiumID = 245;
    @MLProp public static final int UnunpentiumID= 246;
    @MLProp public static final int UnunhexiumID = 247;
    @MLProp public static final int UnunseptiumID = 248;
    @MLProp public static final int UnunoctiumID = 249;
    
    
    //Block Info
    static
    {
		Lithium = (new BlockLithium(LithiumID, 0)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lithium");
    	Beryllium = (new BlockBeryllium(BerylliumID, 1)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Beryllium");
    	Boron = (new BlockBoron(BoronID, 2)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Boron");
    	Carbon = (new BlockCarbon(CarbonID, 3)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Carbon");
    	Sodium = (new BlockSodium(SodiumID, 4)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sodium");
    	Magnesium = (new BlockMagnesium(MagnesiumID, 5)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Magnesium");
    	Aluminium = (new BlockAluminum(AluminiumID, 6)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Aluminium");
    	Silicon = (new BlockSilicon(SiliconID, 7)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silicon");
    	Phosphorus = (new BlockPhosphorus(PhosphorusID, 8)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Phosphorus");
    	Sulfur = (new BlockSulfur(SulfurID, 9)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Sulfur");
    	Potassium = (new BlockPottasium(PotassiumID, 10)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Potassium");
    	Calcium = (new BlockCalcium(CalciumID, 11)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Calcium");
    	Scandium = (new BlockScandium(ScandiumID, 12)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Scandium");
    	Titanium = (new BlockTitanium(TitaniumID, 13)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Titanium");
    	Vanadium = (new BlockVanadium(VanadiumID, 14)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Vanadium");
    	Chromium = (new BlockChromium(ChromiumID, 15)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chromium");
    	Manganese = (new BlockManganese(161, 16)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Manganese");
    	Cobalt = (new BlockCobalt(CobaltID, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cobalt");
    	Nickel = (new BlockNickel(NickelID, 18)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nickel");
    	Copper = (new BlockCopper(CopperID, 19)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copper");
    	Zinc = (new BlockZinc(ZincID, 20)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zinc");
    	Gallium = (new BlockGallium(GalliumID, 21)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gallium");
    	Germanium = (new BlockGermanium(GermaniumID, 22)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Germanium");
    	Arsenic = (new BlockArsenic(ArsenicID, 23)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Arsenic");
    	Selenium = (new BlockSelenium(SeleniumID, 24)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Selenium");
    	Bromine = (new BlockBromine(BromineID, 25)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bromine");
    	Rubidium = (new BlockRubidium(RubidiumID, 26)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rubidium");
    	Strontium = (new BlockStrontium(StrontiumID, 27)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Strontium");
    	Yttrium = (new BlockYtterium(YttriumID, 28)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Yttrium");
    	Zirconium = (new BlockZirconium(ZirconiumID, 29)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Zirconium");
    	Niobium = (new BlockNiobium(NiobiumID, 30)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Niobium");
    	Molybdenum = (new BlockMolybdenum(MolybdenumID, 31)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Molybdenum");
    	Technetium = (new BlockTechnetium(TechnetiumID, 32)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Technetium");
    	Ruthenium = (new BlockRuthenium(RutheniumID, 33)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ruthenium");
    	Rhodium = (new BlockRhodium(RhodiumID, 34)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhodium");
    	Palladium = (new BlockPalladium(PalladiumID, 35)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Palladium");
    	Silver = (new BlockSilver(SilverID, 36)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Silver");
    	Cadmium = (new BlockCadmium(CadmiumID, 37)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cadmium");
    	Indium = (new BlockIndium(IndiumID, 38)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Indium");
    	Tin = (new BlockTin(TinID, 39)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tin");
    	Antimony = (new BlockAntimony(AntimonyID, 40)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Antimony");
    	Tellurium = (new BlockTellurium(TelluriumID, 41)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tellurium");
    	Iodine = (new BlockIodine(IodineID, 42)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iodine");
    	Caesium = (new BlockCaesium(CaesiumID, 43)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Caesium");
    	Barium = (new BlockBarium(BariumID, 44)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Barium");
    	Lanthanum = (new BlockLanthanum(LanthanumID, 45)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lanthanum");
    	Cerium = (new BlockCerium(CeriumID, 46)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Cerium");
    	Praseodymium = (new BlockPraseodymium(PraseodymiumID, 47)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Praseodymium");
    	Neodymium = (new BlockNeodymium(NeodymiumID, 48)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neodymium");
    	Promethium = (new BlockPromethium(PromethiumID, 49)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Promethium");
    	Samarium = (new BlockSamarium(SamariumID, 50)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Smarium");
    	Europium = (new BlockEuropium(EuropiumID, 51)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Europium");
    	Gadolinium = (new BlockGadolinium(GadoliniumID, 52)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gadolinium");
    	Terbium = (new BlockTerbium(TerbiumID, 53)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Terbium");
    	Dysprosium = (new BlockDysprosium(DysprosiumID, 54)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dysprosium");
    	Holmium = (new BlockHolmium(HolmiumID, 55)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Holmium");
    	Erbium = (new BlockErbium(ErbiumID, 56)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Erbium");
    	Thulium = (new BlockThulium(ThuliumID, 57)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thulium");
    	Ytterbium = (new BlockYtterbium(YtterbiumID, 58)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ytterbium");
    	Lutetium = (new BlockLutetium(LutetiumID, 59)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lutetium");
    	Hafnium = (new BlockHafnium(HafniumID, 60)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hafnium");
    	Tantalum = (new BlockTantalum(TantalumID, 61)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tantalum");
    	Tungsten = (new BlockTungsten(TungstenID, 62)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Tungsten");
    	Rhenium = (new BlockRhenium(RheniumID, 63)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rhenium");
    	Osmium = (new BlockOsmium(OsmiumID, 64)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Osmium");
    	Iridium = (new BlockIridium(IridiumID, 65)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Iridium");
    	Platinum = (new BlockPlatinum(PlatinumID, 66)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Platinum");
    	Mercury = (new BlockMercury(MercuryID, 67)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mercury");
    	Thallium = (new BlockThallium(ThalliumID, 68)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thallium");
    	Lead = (new BlockLead(LeadID, 69)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lead");
    	Bismuth = (new BlockBismuth(BismuthID, 70)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bismuth");
    	Polonium = (new BlockPolonium(PoloniumID, 71)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Polonium");
    	Astatine = (new BlockAstatine(AstatineID, 72)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Astatine");
    	Francium = (new BlockFrancium(FranciumID, 73)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Francium");
    	Radium = (new BlockRadium(RadiumID, 74)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radium");
    	Actinium = (new BlockActinium(ActiniumID, 75)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Actinium");
    	Thorium = (new BlockThorium(ThoriumID, 76)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Thorium");
    	Protactinium = (new BlockProtactinium(ProtactiniumID, 77)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Protactinium");
    	Uranium = (new BlockUranium(UraniumID, 78)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Uranium");
    	Neptunium = (new BlockNeptunium(NeptuniumID, 79)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neptunium");
    	Plutonium = (new BlockPlutonium(PlutoniumID, 80)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Plutonium");
    	Americium = (new BlockAmericium(AmericiumID, 81)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Americium");
    	Curium = (new BlockCurium(CuriumID, 82)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Curium");
    	Berkelium = (new BlockBerkelium(BerkeliumID, 83)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Berkelium");
    	Californium = (new BlockCalifornium(CaliforniumID, 84)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Californium");
    	Einsteinium = (new BlockEinsteinium(EinsteiniumID, 85)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Einsteinium");
    	Fermium = (new BlockFermium(FermiumID, 86)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Fermium");
    	Mendelevium = (new BlockMendelevium(MendeleviumID, 87)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Mendelevium");
    	Nobelium = (new BlockNobelium(NobeliumID, 88)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nobelium");
    	Lawrencium = (new BlockLawrencium(LawrenciumID, 89)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Lawrencium");
    	Rutherfordium = (new BlockRutherfordium(RutherfordiumID, 90)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Rutherfordium");
    	Dubnium = (new BlockDubnium(DubniumID, 91)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Dubnium");
    	Seaborgium = (new BlockSeaborgium(SeaborgiumID, 92)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Seaborgium");
    	Bohrium = (new BlockBohrium(BohriumID, 93)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Bohrium");
    	Hassium = (new BlockHassium(HassiumID, 94)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Hassium");
    	Meitnerium = (new BlockMeitnerium(MeitneriumID, 95)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Meitnerium");
    	Darmstadtium = (new BlockDarmstadtium(DarmstadtiumID, 96)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Darmstadtium");
    	Roentgenium = (new BlockRoentgenium(RoentgeniumID, 97)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Roentgenium");
    	Copernicium = (new BlockCopernicium(CoperniciumID, 98)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Copernicium");
    	Ununtrium = (new BlockUnuntrium(UnuntriumID, 99)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununtrium");
    	Ununquadium = (new BlockUnunquadium(UnunquadiumID, 100)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununquadium");
    	Ununpentium = (new BlockUnunpentium(UnunpentiumID, 101)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununpentium");
    	Ununhexium = (new BlockUnunhexium(UnunhexiumID, 102)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununhexium");
    	Ununseptium = (new BlockUnunseptium(UnunseptiumID, 103)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununseptium");
    	Ununoctium = (new BlockUnunoctium(UnunoctiumID, 104)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Ununoctium");
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
			(new WorldGenMinable(Lithium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Beryllium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Boron.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Carbon.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int by
				y= 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Sodium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Magnesium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Aluminium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Silicon.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Phosphorus.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Sulfur.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Potassium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Calcium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Scandium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Titanium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Vanadium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Chromium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Manganese.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Cobalt.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Nickel.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Copper.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Zinc.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Gallium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Germanium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Arsenic.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Selenium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Bromine.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Rubidium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Strontium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Yttrium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Zirconium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Yttrium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Yttrium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
		}
		for(int b = 0; b < 10; b++)
		{
			pozX = chunkX + random.nextInt(16);
			pozY = random.nextInt(64);
			pozZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Yttrium.blockID, 20)).generate(world, random, pozX, pozY, pozZ);
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
				minecraft.fontRenderer.drawStringWithShadow(Mod() + " by " + Author(), 85, 93, Color.CYAN.getRGB());
		}
		if(guiscreen instanceof GuiIngameMenu)
		{
			minecraft.fontRenderer.drawString(Mod() + " V" + getVersion(), 170, 55, Color.CYAN.getRGB());
		}
		if(guiscreen instanceof GuiGameOver)
		{
			minecraft.fontRenderer.drawString("The Elements will go on without you!", 125, 85, Color.RED.getRGB());
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