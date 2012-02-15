package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemTinCopperMix extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemTinCopperMix(int i) 
	{
		super(i);
	}
}
