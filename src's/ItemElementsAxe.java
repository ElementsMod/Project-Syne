// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, Material, EnumToolMaterial, 
//            ItemStack

public class ItemElementsAxe extends ItemElementsTool
implements ITextureProvider
{
	@Override
	public String getTextureFile() 
	{
		return "/elements/Items/EModItems.png";
	}

    private static Block blocksEffectiveAgainst[];

    protected ItemElementsAxe(int i, EnumElementsToolMaterial enumelementstoolmaterial)
    {
        super(i, 3, enumelementstoolmaterial, blocksEffectiveAgainst);
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        if(block != null && block.blockMaterial == Material.wood)
        {
            return efficiencyOnProperMaterial;
        } else
        {
            return super.getStrVsBlock(itemstack, block);
        }
    }

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stairDouble, Block.stairSingle, Block.pumpkin, Block.pumpkinLantern
        });
    }
}
