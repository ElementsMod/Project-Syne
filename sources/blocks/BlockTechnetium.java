package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockTechnetium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockTechnetium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}