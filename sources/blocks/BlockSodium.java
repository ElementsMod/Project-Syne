package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockSodium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockSodium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}