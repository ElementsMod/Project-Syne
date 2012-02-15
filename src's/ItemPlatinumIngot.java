package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemPlatinumIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemPlatinumIngot(int i) {
		super(i);
	}
}
