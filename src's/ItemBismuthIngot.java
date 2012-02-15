package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemBismuthIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemBismuthIngot(int i) 
	{
		super(i);
	}

}
