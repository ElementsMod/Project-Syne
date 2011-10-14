package net.minecraft.src;

import java.util.Random;

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
            Character.valueOf('Y'), Block.dirt //i dont know yet
        });
	}

    public static final Block Purifier;
    public static int freezSide = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/side.png");
    public static int freezFront = ModLoader.addOverride("/terrain.png", "/elements/misc/purifier/front.png");

	static
	{
        Purifier = (new BlockPurifier(116, false)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Purifier");
	}
	
}