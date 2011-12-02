package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockNeon extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/Gas/Gas.png";
    }
    
	public BlockNeon(int i, int j)
	{
		super(i, j, Material.rock);
	}
}