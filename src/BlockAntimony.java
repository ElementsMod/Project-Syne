package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockAntimony extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockAntimony(int i, int j)
	{
		super(i, j, Material.rock);
	}
}