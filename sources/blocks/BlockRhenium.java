package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockRhenium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockRhenium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}