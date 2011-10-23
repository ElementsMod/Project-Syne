package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockManganese extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockManganese(int i, int j)
	{
		super(i, j, Material.rock);
	}
}