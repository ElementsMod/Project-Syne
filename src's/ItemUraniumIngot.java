package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemUraniumIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemUraniumIngot(int i) 
	{
		super(i);
	}

}
