package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnunpentium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockUnunpentium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}