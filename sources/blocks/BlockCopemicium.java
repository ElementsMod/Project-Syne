package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockCopemicium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockCopemicium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}