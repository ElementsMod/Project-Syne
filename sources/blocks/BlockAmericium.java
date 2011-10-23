package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockAmericium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockAmericium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}