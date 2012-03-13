package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.src.mod_ElementsArmor;

public class RadDamage extends DamageSource
{
	protected RadDamage(String s) 
	{
		super(s);
	}

	public static boolean HelmOn;
	public static boolean ChestOn;
	public static boolean LeggingsOn;
	public static boolean BootsOn;

	
	public static int RadDamageBase;
	public static int RadDamageDefenceHelm;
	public static int RadDamageDefenceBody;
	public static int RadDamageDefencePants;
	public static int RadDamageDefenceBoots;
	public int RadDamageReduced;
	
    public static DamageSource rad = new DamageSource("Radiation").setDamageBypassesArmor();
	
	public boolean OnTickInGame(float f, Minecraft minecraft) 
	{
		RadDamageBase = 10;
		
	    ItemStack boots = minecraft.thePlayer.inventory.armorInventory[0]; 
	    ItemStack legs = minecraft.thePlayer.inventory.armorInventory[1]; 
	    ItemStack chest = minecraft.thePlayer.inventory.armorInventory[2]; 
	    ItemStack helm = minecraft.thePlayer.inventory.armorInventory[3]; 
		
	    RadDamageReduced = RadDamageDefenceHelm + RadDamageDefenceBody + RadDamageDefencePants + RadDamageDefenceBoots;
	    
		if(helm.itemID != mod_ElementsArmor.HazmatHelmet.shiftedIndex)
		{
			RadDamageDefenceHelm = 0;
		}
		else
		{
			RadDamageDefenceHelm = 3;
		}
		
		if(chest.itemID != mod_ElementsArmor.HazmatBody.shiftedIndex)
		{
			RadDamageDefenceBody = 0;
		}
		else
		
		{
			RadDamageDefenceBody = 4;
		}
		
		if(legs.itemID != mod_ElementsArmor.HazmatPants.shiftedIndex)
		{
			RadDamageDefencePants = 0;
		}
		else
		{
			RadDamageDefencePants = 2;
		}
		
		if(boots.itemID != mod_ElementsArmor.HazmatBoots.shiftedIndex) 
		{
			RadDamageDefenceBoots = 0;
		}
		else
		{
			RadDamageDefenceBoots = 3;
		}
	    return false;
	}
}
