package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockSilver extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockSilver(int i, int j)
	{
		super(i, j, Material.rock);
	}
}