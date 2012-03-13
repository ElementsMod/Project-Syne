package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockNeodymium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockNeodymium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}