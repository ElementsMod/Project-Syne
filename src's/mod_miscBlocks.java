package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class mod_miscBlocks extends BaseMod
{

	public String Version(){
		return "1.8.1";
	}

	public mod_miscBlocks()
	{
		Condenser.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierSide.png");
		CondenserSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierSide.png");
		CondenserOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
		CondenserTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
	    CondenserBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
	    CondenserOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");
	    
	    //Register blocks
        ModLoader.RegisterBlock(Purifier);
        ModLoader.RegisterBlock(PurifierOn);
        ModLoader.RegisterTileEntity(net.minecraft.src.TileEntityPurifier.class, "Purifier");
        
        ModLoader.RegisterBlock(Bessemer);
        ModLoader.RegisterTileEntity(net.minecraft.src.TileEntityPurifier.class, "Bessemer");
        
        ModLoader.RegisterBlock(Condenser);
        ModLoader.RegisterBlock(CondenserOn);
        
        ModLoader.RegisterBlock(neonLightWhiteOff);
        ModLoader.RegisterBlock(neonLightWhiteOn);
        ModLoader.RegisterBlock(neonLightRedOff);
        ModLoader.RegisterBlock(neonLightRedOn);
        ModLoader.RegisterBlock(neonLightOrangeOff);
        ModLoader.RegisterBlock(neonLightOrangeOn);
        ModLoader.RegisterBlock(neonLightYellowOff);
        ModLoader.RegisterBlock(neonLightYellowOn);
        ModLoader.RegisterBlock(neonLightGreenOff);
        ModLoader.RegisterBlock(neonLightGreenOn);
        ModLoader.RegisterBlock(neonLightBlueOff);
        ModLoader.RegisterBlock(neonLightBlueOn);
        ModLoader.RegisterBlock(neonLightPurpleOff);
        ModLoader.RegisterBlock(neonLightPurpleOn);
        
        //in game names
        ModLoader.AddName(Purifier, "Purifier");
        ModLoader.AddName(PurifierOn, "Purifier");  
        
        ModLoader.AddName(Condenser, "Condenser");
        ModLoader.AddName(CondenserOn, "Condenser");
        
        ModLoader.AddName(neonLightWhiteOff, "White Neon Light");
        ModLoader.AddName(neonLightWhiteOn, "White Neon Light");
        ModLoader.AddName(neonLightRedOff, "Red Neon Light");
        ModLoader.AddName(neonLightRedOn, "Red Neon Light");
        ModLoader.AddName(neonLightOrangeOff, "Orange Neon Light");
        ModLoader.AddName(neonLightOrangeOn, "Orange Neon Light");
        ModLoader.AddName(neonLightYellowOff, "Yellow Neon Light");
        ModLoader.AddName(neonLightYellowOn, "Yellow Neon Light");
        ModLoader.AddName(neonLightGreenOff, "Green Neon Light");
        ModLoader.AddName(neonLightGreenOn, "Green Neon Light");
        ModLoader.AddName(neonLightBlueOff, "Blue Neon Light");
        ModLoader.AddName(neonLightBlueOn, "Blue Neon Light");
        ModLoader.AddName(neonLightPurpleOff, "Purple Neon Light");
        ModLoader.AddName(neonLightPurpleOn, "Purple Neon Light");
        
        //Recipes
        ModLoader.AddRecipe(new ItemStack(Purifier, 1), new Object[]{
            "XXX", "XYX", "XXX", 
            Character.valueOf('X'), Block.cobblestone,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
        
        ModLoader.AddRecipe(new ItemStack(Bessemer, 1), new Object[]{
            "XXX", "XYX", "X X", 
            Character.valueOf('X'), Block.cobblestone,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightWhiteOff), new Object[]
        {
        	" ", "X", " ",
        	"X", "Y", "X",
            " ", "X", " ",
            Character.valueOf('X'), Block.thinGlass,
            Character.valueOf('Y'), Block.sand
        });
     
        ModLoader.AddRecipe(new ItemStack(neonLightRedOff), new Object[]
        {
        	"X",
            "Y",
            Character.valueOf('X'), new ItemStack(Item.dyePowder, 2, 1),
            Character.valueOf('Y'), neonLightWhiteOff
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightOrangeOff), new Object[]
        {
        	"X",
            "Y",
            Character.valueOf('X'), new ItemStack(Item.dyePowder, 2, 14),
            Character.valueOf('Y'), neonLightWhiteOff
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightYellowOff), new Object[]
        {
        	"X",
            "Y",
            Character.valueOf('X'), new ItemStack(Item.dyePowder, 2, 11),
            Character.valueOf('Y'), neonLightWhiteOff
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightGreenOff), new Object[]
        {
        	"X",
            "Y",
            Character.valueOf('X'), new ItemStack(Item.dyePowder, 2, 10),
            Character.valueOf('Y'), neonLightWhiteOff
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightBlueOff), new Object[]
        {
        	"X",
            "Y",
            Character.valueOf('X'), new ItemStack(Item.dyePowder, 2, 12),
            Character.valueOf('Y'), neonLightWhiteOff
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightPurpleOff), new Object[]
        {
        	"X",
            "Y",
            Character.valueOf('X'), new ItemStack(Item.dyePowder, 2, 5),
            Character.valueOf('Y'), neonLightWhiteOff
        });

	}
	
	//statics
	public static final Block Purifier = (new BlockPurifier(126, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Purifier");
	public static final Block PurifierOn = (new BlockPurifier(127, true)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("PurifierOn");
	public static int purifierSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierSide.png");
	public static int purifierOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int purifierTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
    public static int purifierBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
    public static int purifierOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");
    
    public static final Block Condenser = (new BlockPurifier(128, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Condenser");
	public static final Block CondenserOn = (new BlockPurifier(129, true)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("CondenserOn");
	public static int CondenserSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierSide.png");
	public static int CondenserOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int CondenserTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
    public static int CondenserBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
    public static int CondenserOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");
    
    public static final Block neonLightWhiteOff = (new BlockNeonLightWhite(130, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/WhiteLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightWhiteOn = (new BlockNeonLightWhite(131, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/WhiteLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    public static final Block neonLightRedOff = (new BlockNeonLightRed(132, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/RedLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightRedOn = (new BlockNeonLightRed(133, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/RedLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    public static final Block neonLightOrangeOff = (new BlockNeonLightOrange(134, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/OrangeLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightOrangeOn = (new BlockNeonLightOrange(135, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/OrangeLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    public static final Block neonLightYellowOff = (new BlockNeonLightYellow(136, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/YellowLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightYellowOn = (new BlockNeonLightYellow(137, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/YellowLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    public static final Block neonLightGreenOff = (new BlockNeonLightGreen(138, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/GreenLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightGreenOn = (new BlockNeonLightGreen(139, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/GreenLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    public static final Block neonLightBlueOff = (new BlockNeonLightBlue(140, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/BlueLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightBlueOn = (new BlockNeonLightBlue(141, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/BlueLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    public static final Block neonLightPurpleOff = (new BlockNeonLightPurple(142, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/PurpleLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightPurpleOn = (new BlockNeonLightPurple(143, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/PurpleLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    
    public static final Block Bessemer = (new BlockBessemer(144, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Bessemer");
    public static int BessemerSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int BessemerOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int BessemerTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
    public static int BessemerBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
    public static int BessemerOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");

	static
	{

	}

	@Override
	public String getVersion() 
	{
		return null;
	}

	@Override
	public void load() 
	{
		
	}

}