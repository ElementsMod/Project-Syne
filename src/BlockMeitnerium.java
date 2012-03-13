package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockMeitnerium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockMeitnerium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}