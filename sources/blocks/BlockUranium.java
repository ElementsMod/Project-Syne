package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockUranium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockUranium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}