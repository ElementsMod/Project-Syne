package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnunseptium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockUnunseptium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}