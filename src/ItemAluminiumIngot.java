package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemAluminiumIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemAluminiumIngot(int i) 
	{
		super(i);
	}
}
