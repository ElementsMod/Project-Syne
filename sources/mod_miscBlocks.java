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
	    
        ModLoader.RegisterBlock(Purifier);
        ModLoader.RegisterBlock(PurifierOn);
        ModLoader.RegisterTileEntity(net.minecraft.src.TileEntityPurifier.class, "Purifier");
        
        ModLoader.RegisterBlock(Condenser);
        ModLoader.RegisterBlock(CondenserOn);
        
        ModLoader.RegisterBlock(neonLightOff);
        ModLoader.RegisterBlock(neonLightOn);
        
        ModLoader.AddName(Purifier, "Purifier");      
        ModLoader.AddName(Condenser, "Condenser");
        ModLoader.AddName(neonLightOff, "Neon Light");
        
        ModLoader.AddRecipe(new ItemStack(Purifier, 1), new Object[]{
            "XXX", "XYX", "XXX", 
            Character.valueOf('X'), Block.cobblestone,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
        
        ModLoader.AddRecipe(new ItemStack(neonLightOff), new Object[]{
            "X", "X", 
            Character.valueOf('X'), Block.cobblestone,
        });
        
        System.out.println("Misc Blocks Loaded");
		
        ModLoader.RegisterBlock(Purifier);
        ModLoader.AddName(Purifier, "Purifier");
        ModLoader.RegisterTileEntity(net.minecraft.src.TileEntityPurifier.class, "Purifier");
        
        ModLoader.AddRecipe(new ItemStack(Purifier, 1), new Object[]{
            "XXX", "XYX", "XXX", 
            Character.valueOf('X'), Block.cobblestone,
            Character.valueOf('Y'), Block.dirt //i don't know yet
        });
            
        ModLoader.RegisterBlock(Bessemer);
        ModLoader.AddName(Bessemer, "Bessemer");
        ModLoader.RegisterTileEntity(net.minecraft.src.TileEntityPurifier.class, "Bessemer");
        
        ModLoader.AddRecipe(new ItemStack(Bessemer, 1), new Object[]{
            "XXX", "YYY", "XXX", 
            Character.valueOf('X'), Block.cobblestone,
            Character.valueOf('Y'), Block.sand //i don't know yet
        });
	}
    
	
	public static final Block Purifier = (new BlockPurifier(235, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Purifier");
	public static final Block PurifierOn = (new BlockPurifier(236, true)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("PurifierOn");

	public static int purifierSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierSide.png");
	public static int purifierOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int purifierTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
    public static int purifierBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
    public static int purifierOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");
    
    public static final Block Condenser = (new BlockPurifier(237, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Condenser");
	public static final Block CondenserOn = (new BlockPurifier(238, true)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("CondenserOn");

	public static int CondenserSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierSide.png");
	public static int CondenserOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int CondenserTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
    public static int CondenserBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
    public static int CondenserOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");
    
    public static final Block neonLightOff = (new BlockNeonLight(239, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/GreenLightOff.png"), Material.glass).setHardness(3F).setResistance(5F).setBlockName("light"));
    public static final Block neonLightOn = (new BlockNeonLight(240, ModLoader.addOverride("/terrain.png", "/elements/misc/neon/GreenLightOn.png"), Material.glass).setHardness(3F).setResistance(5F).setLightValue(1F).setBlockName("light"));
    
    public static final Block Bessemer = (new BlockPurifier(233, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Purifier");
    
    public static int BessemerSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int BessemerOn2 = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOn2.png");
	public static int BessemerTop = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierTop.png");
    public static int BessemerBottom = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierBottom.png");
    public static int BessemerOff = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/purifierOff.png");

	static
	{

	}
	
}