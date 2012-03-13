package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockTin extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockTin(int i, int j)
	{
		super(i, j, Material.rock);
	}
}