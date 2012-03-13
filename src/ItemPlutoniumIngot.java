package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemPlutoniumIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemPlutoniumIngot(int i) 
	{
		super(i);
	}

}
