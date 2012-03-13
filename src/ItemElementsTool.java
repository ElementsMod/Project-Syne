// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Arrays;

import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.ForgeHooks;
import net.minecraft.src.forge.ITextureProvider;

// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, ItemStack, Block, 
//            EntityLiving, Entity

public class ItemElementsTool extends Item
{	
	PotionEffect potioneffect;
	
    private Block blocksEffectiveAgainst[];
    public float efficiencyOnProperMaterial;
    public int damageVsEntity;
    protected EnumElementsToolMaterial toolElementsMaterial;

    protected ItemElementsTool(int i, int j, EnumElementsToolMaterial enumelementstoolmaterial, Block ablock[])
    {
        super(i);
        efficiencyOnProperMaterial = 4F;
        toolElementsMaterial = enumelementstoolmaterial;
        blocksEffectiveAgainst = ablock;
        maxStackSize = 1;
        setMaxDamage(enumelementstoolmaterial.getMaxUses());
        efficiencyOnProperMaterial = enumelementstoolmaterial.getEfficiencyOnProperMaterial();
        damageVsEntity = j + enumelementstoolmaterial.getDamageVsEntity();
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        for(int i = 0; i < blocksEffectiveAgainst.length; i++)
        {
            if(blocksEffectiveAgainst[i] == block)
            {
                return efficiencyOnProperMaterial;
            }
        }

        return 1.0F;
    }
    
    public ItemElementsTool setPotionEffect(int i, int j, int k, float f)
    {
        potionId = i;
        potionDuration = j;
        potionAmplifier = k;
        potionEffectProbability = f;
        return this;
    }

    /* FORGE: Overridden to allow custom tool effectiveness
     */
    public float getStrVsBlock(ItemStack itemstack, Block block, int md) {
	    if(ForgeHooks.isToolEffective(itemstack,block,md))
                return efficiencyOnProperMaterial;
	    return getStrVsBlock(itemstack,block);
    }

    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        itemstack.damageItem(2, entityliving1);
        if(!world.isRemote && potionId > 0 && world.rand.nextFloat() < potionEffectProbability)
        {
            entityliving1.addPotionEffect(new PotionEffect(potionId, potionDuration * 20, potionAmplifier));
        }
        return true;
    }

    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(1, entityliving);
        return true;
    }

    public int getDamageVsEntity(Entity entity)
    {
        return damageVsEntity;
    }

    public boolean isFull3D()
    {
        return true;
    }

    public int getItemEnchantability()
    {
        return toolElementsMaterial.getEnchantability();
    }
    private World world;
    private int potionId;
    private int potionDuration;
    private int potionAmplifier;
    private float potionEffectProbability;
}
