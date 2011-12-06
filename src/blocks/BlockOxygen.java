package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockOxygen extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/Gas/Gas.png";
    }
    
	public BlockOxygen(int i, int j)
	{
		super(i, j, Material.rock);
	}
}