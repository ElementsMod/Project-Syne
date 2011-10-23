package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockMagnesium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockMagnesium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}