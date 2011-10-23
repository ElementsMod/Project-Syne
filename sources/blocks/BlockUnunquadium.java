package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnunquadium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockUnunquadium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}