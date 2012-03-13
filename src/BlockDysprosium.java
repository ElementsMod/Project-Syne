package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockDysprosium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockDysprosium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}