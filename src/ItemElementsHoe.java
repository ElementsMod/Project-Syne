// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, EntityPlayer, World, 
//            Block, BlockGrass, StepSound, ItemStack

public class ItemElementsHoe extends Item
implements ITextureProvider
{
	@Override
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}

    public ItemElementsHoe(int i, EnumElementsToolMaterial enumelementstoolmaterial)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(enumelementstoolmaterial.getMaxUses());
    }
    
    public ItemElementsHoe setPotionEffect(int i, int j, int k, float f)
    {
        potionId = i;
        potionDuration = j;
        potionAmplifier = k;
        potionEffectProbability = f;
        return this;
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

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(!entityplayer.canPlayerEdit(i, j, k))
        {
            return false;
        }
        int i1 = world.getBlockId(i, j, k);
        int j1 = world.getBlockId(i, j + 1, k);
        if(l != 0 && j1 == 0 && i1 == Block.grass.blockID || i1 == Block.dirt.blockID)
        {
            Block block = Block.tilledField;
            world.playSoundEffect((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
            if(world.isRemote)
            {
                return true;
            } else
            {
                world.setBlockWithNotify(i, j, k, block.blockID);
                itemstack.damageItem(1, entityplayer);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public boolean isFull3D()
    {
        return true;
    }
    private int potionId;
    private int potionDuration;
    private int potionAmplifier;
    private float potionEffectProbability;
    private World world;
}
