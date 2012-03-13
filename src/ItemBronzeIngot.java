package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;

public class ItemBronzeIngot extends Item
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	protected ItemBronzeIngot(int i) {
		super(i);
	}

}
