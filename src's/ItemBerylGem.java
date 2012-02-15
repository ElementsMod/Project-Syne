package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemBerylGem extends Item 
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemBerylGem(int i) 
	{
		super(i);
	}
}
