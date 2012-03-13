package net.minecraft.src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import net.minecraft.client.Minecraft;

public class mod_ElementsModConfig extends BaseMod
{
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
    
    //MLProp's Booleans
    @MLProp public static boolean SpawnSyntheticElements = true;
    
    //MLProp's ItemID's
    @MLProp public static final int BerylGemID = 6000;
    @MLProp public static final int BoronIngotID = 6001;
    @MLProp public static final int AluminiumIngotID = 6002;
    @MLProp public static final int TitaniumIngotID = 6003;
    @MLProp public static final int ChromiumIngotID = 6004;
    @MLProp public static final int CobaltIngotID = 6005;
    @MLProp public static final int NickelIngotID = 6006;
    @MLProp public static final int CopperIngotID = 6007;
    @MLProp public static final int ZirconiumGemID = 6008;
    @MLProp public static final int SilverIngotID = 6009;
    @MLProp public static final int TinIngotID = 6010;
    @MLProp public static final int PlatinumIngotID = 6011;
    @MLProp public static final int LeadIngotID = 6012;
    @MLProp public static final int CinnabarIngotID = 6013;
    @MLProp public static final int BismuthIngotID = 6014;
    @MLProp public static final int UraniumIngotID = 6015;
    @MLProp public static final int PlutoniumIngotID = 6016;
    @MLProp public static final int BronzeIngotID = 6017;
    @MLProp public static final int SteelIngotID = 6018;

	@Override
	public String getVersion() 
	{
		return null;
	}

	@Override
	public void load() 
	{
		
	}
	Minecraft mc;
}
