package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockFluorine extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/Gas/Gas.png";
    }
    
	public BlockFluorine(int i, int j)
	{
		super(i, j, Material.rock);
	}
}