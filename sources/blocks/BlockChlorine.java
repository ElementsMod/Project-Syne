package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockChlorine extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/Gas/Gas.png";
    }
	
	public BlockChlorine(int i, int j)
	{
		super(i, j, Material.rock);
	}
}