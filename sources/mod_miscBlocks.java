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

    public static final Block Purifier;
    public static int purifierSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/side.png");
    public static int purifierFront = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/front.png");
    
    public static final Block Bessemer;
    public static int BessemerSide = ModLoader.addOverride("/terrain.png", "/elements/misc/Bessemer/side.png");
    public static int BessemerFront = ModLoader.addOverride("/terrain.png", "/elements/misc/Bessemer/front.png");

	static
	{
        Purifier = (new BlockPurifier(232, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Purifier");
        Bessemer = (new BlockPurifier(233, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Purifier");
	}
	
}