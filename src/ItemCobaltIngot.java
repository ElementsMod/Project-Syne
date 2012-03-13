package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemCobaltIngot extends Item 
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemCobaltIngot(int i) 
	{
		super(i);
	}

}
