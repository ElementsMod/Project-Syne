package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockRoentgenium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockRoentgenium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}