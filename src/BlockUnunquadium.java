package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnunquadium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockUnunquadium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}