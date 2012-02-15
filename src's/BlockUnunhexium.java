package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnunhexium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockUnunhexium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}