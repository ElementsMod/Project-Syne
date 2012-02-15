// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.src.forge.ITextureProvider;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, EnumToolMaterial, Material, 
//            ItemStack

public class ItemElementsPickaxe extends ItemElementsTool
implements ITextureProvider
{
	public String getTextureFile()
	{
		return "/elements/Items/EModItems.png";
	}
	
	private static Block blocksEffectiveAgainst[];

    protected ItemElementsPickaxe(int i, EnumElementsToolMaterial enumelementstoolmaterial)
    {
        super(i, 2, enumelementstoolmaterial, blocksEffectiveAgainst);
    }

    public boolean canHarvestBlock(Block block)
    {
        if(block == Block.obsidian)
        {
            return toolElementsMaterial.getHarvestLevel() == 3;
        }
        if(block == Block.blockDiamond || block == Block.oreDiamond)
        {
            return toolElementsMaterial.getHarvestLevel() >= 2;
        }
        if(block == Block.blockGold || block == Block.oreGold)
        {
            return toolElementsMaterial.getHarvestLevel() >= 2;
        }
        if(block == Block.blockSteel || block == Block.oreIron)
        {
            return toolElementsMaterial.getHarvestLevel() >= 1;
        }
        if(block == Block.blockLapis || block == Block.oreLapis)
        {
            return toolElementsMaterial.getHarvestLevel() >= 1;
        }
        if(block == Block.oreRedstone || block == Block.oreRedstoneGlowing)
        {
            return toolElementsMaterial.getHarvestLevel() >= 2;
        }
        if(block.blockMaterial == Material.rock)
        {
            return true;
        }
        return block.blockMaterial == Material.iron;
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        if(block != null && (block.blockMaterial == Material.iron || block.blockMaterial == Material.rock))
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
            Block.cobblestone, Block.stairDouble, Block.stairSingle, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockSteel, Block.oreCoal, Block.blockGold, 
            Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail, 
            Block.railDetector, Block.railPowered, 
        });
    }
}
