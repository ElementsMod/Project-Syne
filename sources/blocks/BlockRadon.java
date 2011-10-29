package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockRadon extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/Gas/Gas.png";
    }
    
	public BlockRadon(int i, int j)
	{
		super(i, j, Material.rock);
	}
}