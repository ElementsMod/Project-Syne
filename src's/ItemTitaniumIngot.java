package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemTitaniumIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemTitaniumIngot(int i) 
	{
		super(i);
	}
}
