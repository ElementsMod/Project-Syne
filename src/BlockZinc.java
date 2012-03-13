package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockZinc extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockZinc(int i, int j)
	{
		super(i, j, Material.rock);
	}
}