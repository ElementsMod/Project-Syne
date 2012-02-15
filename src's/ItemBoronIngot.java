package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemBoronIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemBoronIngot(int i) 
	{
		super(i);
	}
}
