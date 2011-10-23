package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockPottasium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockPottasium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}