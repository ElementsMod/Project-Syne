package net.minecraft.src;

import net.minecraft.client.Minecraft;

public class BlockMultiple extends Block {

	protected BlockMultiple(int i, Material material) {
		super(i, material);
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(int i, int j) {
		switch (j) 
		{
		case 0:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 1:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 2:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 3:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 4:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 5:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 6:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 7:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 8:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 9:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		case 10:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		default:
			return (ModLoader.addOverride("/terrain.png", "/elements/Gas/Gas.png")); //change to the right texture
		}
	}
	
/*
	 * This event is fired, when someone is placing a block
	 
	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving) {
		int metadata = world.getBlockMetadata(i, j, k);
    	
		Minecraft mc = ModLoader.getMinecraftInstance();
		
		switch (metadata) {
		case 0: {
			mc.ingameGUI.addChatMessage("I look like planks");	
			break;
		}
		case 1: {
			mc.ingameGUI.addChatMessage("I look like bricks");	
			break;
		}
		case 2: {
			mc.ingameGUI.addChatMessage("I look like TNT");	
			break;
		}
		}
	}
*/
	
	/*
	* Mapping from metadata value to damage value
	*/
	@Override
	protected int damageDropped(int i) {
		return i;
	}
}
