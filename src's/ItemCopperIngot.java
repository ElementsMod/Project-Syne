package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemCopperIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemCopperIngot(int i) 
	{
		super(i);
	}

}
