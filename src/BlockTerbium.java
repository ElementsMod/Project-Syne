package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockTerbium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockTerbium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}