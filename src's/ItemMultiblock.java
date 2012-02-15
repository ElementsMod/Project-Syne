package net.minecraft.src;

public class ItemMultiblock extends ItemBlock {

	public ItemMultiblock(int i, Block block) {
		super(i);
		setHasSubtypes(true);
	}
	
	@Override
	public String getItemNameIS(ItemStack itemstack) {
		String name = "";
		switch(itemstack.getItemDamage()) 
		{
		    case 0: 
		    {
		    	name = "Hydrogen";
		    	break;
		    }
		    case 1: {
		    	name = "Helium"; 
		    	break;
		    }
		    case 2: {
		    	name = "Nitrogen";
		    	break;
		    }
		    case 3: 
		    {
		    	name = "Oxygen";
		    	break;
		    }
		    case 4: {
		    	name = "Fluorine"; 
		    	break;
		    }
		    case 5: {
		    	name = "Neon";
		    	break;
		    }
		    case 6: 
		    {
		    	name = "Chlorine";
		    	break;
		    }
		    case 7: {
		    	name = "Argon"; 
		    	break;
		    }
		    case 8: {
		    	name = "Krypton";
		    	break;
		    }
		    case 9: {
		    	name = "Xenon"; 
		    	break;
		    }
		    case 10: {
		    	name = "Radon";
		    	break;
		    }
		    default: name = "plank";
		}
	return getItemName() + "." + name;
	}
	
	/*
	 * Mapping from damage value to metadata value
	 */
	public int getPlacedBlockMetadata(int i) {
		return i;
	}
}
