package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemTinIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemTinIngot(int i) 
	{
		super(i);
	}

}
