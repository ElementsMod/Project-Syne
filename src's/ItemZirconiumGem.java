package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemZirconiumGem extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemZirconiumGem(int i) 
	{
		super(i);
	}
}
