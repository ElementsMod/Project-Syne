package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockNeptunium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockNeptunium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}