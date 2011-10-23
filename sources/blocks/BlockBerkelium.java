package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockBerkelium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockBerkelium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}