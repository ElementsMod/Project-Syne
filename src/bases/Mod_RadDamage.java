package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.src.mod_Armor;

public class Mod_RadDamage extends BaseMod
{
	public int RadDamageBase;
	public static int RadDamageDealt;
	public int RadDamageDefenceHelm;
	public int RadDamageDefenceBody;
	public int RadDamageDefencePants;
	public int RadDamageDefenceBoots;
	public int RadDamageDefenceTotal;
	
	public boolean OnTickInGame(float f, Minecraft minecraft) 
	{
		RadDamageBase = 10;
		
	    ItemStack boots = minecraft.thePlayer.inventory.armorInventory[0]; 
	    ItemStack legs = minecraft.thePlayer.inventory.armorInventory[1]; 
	    ItemStack chest = minecraft.thePlayer.inventory.armorInventory[2]; 
	    ItemStack helm = minecraft.thePlayer.inventory.armorInventory[3]; 
		
		if(helm !=null && helm.itemID == mod_Armor.HazmatHelmet.shiftedIndex)
		{
			RadDamageDefenceHelm = 3;
		}
		else
		{
			RadDamageDefenceHelm = 0;
		}
		
		if(chest !=null && chest.itemID == mod_Armor.HazmatBody.shiftedIndex)
		{
			RadDamageDefenceBody = 4;
		}
		else
		{
			RadDamageDefenceBody = 0;
		}
		
		if(legs !=null && legs.itemID == mod_Armor.HazmatPants.shiftedIndex)
		{
			RadDamageDefencePants = 2;
		}
		else
		{
			RadDamageDefencePants = 0;
		}
		
		if(boots !=null && boots.itemID == mod_Armor.HazmatBoots.shiftedIndex) 
		{
			RadDamageDefenceBoots = 3;
		}
		else
		{
			RadDamageDefenceBoots = 0;
		}
		
		RadDamageDefenceTotal = RadDamageDefenceHelm += RadDamageDefenceBody += 
		RadDamageDefencePants += RadDamageDefenceBoots;
		
		RadDamageDealt = RadDamageBase -= RadDamageDefenceTotal;
		
	    return false;
	}
	
	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
}
