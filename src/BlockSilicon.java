package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockSilicon extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockSilicon(int i, int j)
	{
		super(i, j, Material.rock);
	}
}