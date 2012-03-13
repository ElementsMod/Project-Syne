package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemSilverIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemSilverIngot(int i) 
	{
		super(i);
	}

}
