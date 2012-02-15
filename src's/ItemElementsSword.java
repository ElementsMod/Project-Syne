// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.ITextureProvider;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, Block, ItemStack, 
//            EnumAction, EntityPlayer, EntityLiving, Entity, 
//            World

public class ItemElementsSword extends Item
implements ITextureProvider
{
	@Override
	public String getTextureFile() 
	{
		return "/elements/Items/EModItems.png";
	}
	
    private int weaponDamage;
    private final EnumElementsToolMaterial field_40439_b;

    public ItemElementsSword(int i, EnumElementsToolMaterial enumelementstoolmaterial)
    {
        super(i);
        field_40439_b = enumelementstoolmaterial;
        maxStackSize = 1;
        setMaxDamage(enumelementstoolmaterial.getMaxUses());
        weaponDamage = 4 + enumelementstoolmaterial.getDamageVsEntity();
    }
    
    public ItemElementsSword setPotionEffect(int i, int j, int k, float f)
    {
        potionId = i;
        potionDuration = j;
        potionAmplifier = k;
        potionEffectProbability = f;
        return this;
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        return block.blockID != Block.web.blockID ? 1.5F : 15F;
    }

    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        itemstack.damageItem(1, entityliving1);
        if(!world.isRemote && potionId > 0 && world.rand.nextFloat() < potionEffectProbability)
        {
            entityliving1.addPotionEffect(new PotionEffect(potionId, potionDuration * 20, potionAmplifier));
        }
        return true;
    }

    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(2, entityliving);
        return true;
    }

    public int getDamageVsEntity(Entity entity)
    {
        return weaponDamage;
    }

    public boolean isFull3D()
    {
        return true;
    }

    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.block;
    }

    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 0x11940;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        entityplayer.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
        return itemstack;
    }

    public boolean canHarvestBlock(Block block)
    {
        return block.blockID == Block.web.blockID;
    }

    public int getItemEnchantability()
    {
        return field_40439_b.getEnchantability();
    }
    private int potionId;
    private int potionDuration;
    private int potionAmplifier;
    private float potionEffectProbability;
    private World world;
}
