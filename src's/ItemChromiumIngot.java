package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemChromiumIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemChromiumIngot(int i) 
	{
		super(i);
	}
}
