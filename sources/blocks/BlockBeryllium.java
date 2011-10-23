package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockBeryllium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockBeryllium(int i, int j)
	{
		super(i, j, Material.ground);
	}
		    
}
