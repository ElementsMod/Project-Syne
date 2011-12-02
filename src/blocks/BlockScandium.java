package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockScandium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockScandium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}