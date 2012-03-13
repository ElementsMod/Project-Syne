package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemLeadIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

	protected ItemLeadIngot(int i) 
	{
		super(i);
	}

}
