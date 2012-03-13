package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockAluminum extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockAluminum(int i, int j)
	{
		super(i, j, Material.rock);
	}
}