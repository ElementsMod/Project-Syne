package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockTellurium extends Block
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockTellurium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}