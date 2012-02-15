package net.minecraft.src;

import net.minecraft.src.forge.*;

public class BlockUnuntrium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockUnuntrium(int i, int j)
	{
		super(i, j, Material.rock);
	
	}
}