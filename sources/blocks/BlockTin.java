package net.minecraft.src;

import java.util.Random;

public class BlockTin extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockTin(int i, int j)
	{
		super(i, j, Material.rock);
	}
}