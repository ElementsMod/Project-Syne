package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockHafnium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockHafnium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}