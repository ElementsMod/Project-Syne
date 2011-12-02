package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockBarium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockBarium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}