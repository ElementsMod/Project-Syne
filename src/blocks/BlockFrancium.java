package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockFrancium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockFrancium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}