package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockBismuth extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockBismuth(int i, int j)
	{
		super(i, j, Material.rock);
	}
}