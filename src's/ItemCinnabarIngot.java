package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemCinnabarIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemCinnabarIngot(int i) 
	{
		super(i);
	}

}
