package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockGadolinium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockGadolinium(int i, int j)
	{
		super(i, j, Material.rock);
	}
}