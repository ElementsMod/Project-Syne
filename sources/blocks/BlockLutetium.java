package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockLutetium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockLutetium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}