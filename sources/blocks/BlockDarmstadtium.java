package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockDarmstadtium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockDarmstadtium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}