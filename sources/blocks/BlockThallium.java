package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockThallium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockThallium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}