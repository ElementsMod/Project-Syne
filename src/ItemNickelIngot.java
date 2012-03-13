package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemNickelIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemNickelIngot(int i) 
	{
		super(i);
	}

}
