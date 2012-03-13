package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockProtactinium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockProtactinium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}