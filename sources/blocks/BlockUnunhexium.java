package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnunhexium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockUnunhexium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}