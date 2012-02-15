package net.minecraft.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.src.forge.*;

public class BlockNeonLightGreenOn extends Block
implements ITextureProvider
{
	public String getTextureFile()
    {
	    return "/elements/misc/neon/GreenLightOn.png";
    }

	public boolean canProvidePower()
    {
        return true;
    }
	
	public int ticRate()
	{
		return 1;
	}
	
	public boolean renderAsNormalBlock()
    {
            return false;
    }
	
    public boolean isOpaqueCube()
    {
            return false;
    }
    
    public BlockNeonLightGreenOn(int i, int j, Material material)
    {
            super(i, j, material.glass);
            setLightValue(2F);
            setBlockBounds(0.0F, 0.0F, 0.3F, 1.0F, 0.4F, 0.7F);
            canProvidePower();
    }

    public int idDropped(int i, Random random)
    {
        return mod_miscBlocks.neonLightGreenOff.blockID;
    }
    
    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(l > 0 && Block.blocksList[l].canProvidePower())
        {
        	world.scheduleBlockUpdate(i, j, k, blockID, tickRate());
        }
    }

    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if(world.isBlockIndirectlyGettingPowered(i, j, k) || world.isBlockIndirectlyGettingPowered(i, j + 1, k))
        {
            world.setBlockWithNotify(i,j,k, mod_miscBlocks.neonLightGreenOn.blockID);
            powered = true;
        }
        else
        {
        	world.setBlockWithNotify(i,j,k, mod_miscBlocks.neonLightGreenOff.blockID);
        	powered = false;
        }
    }
    
    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        int l = world.getBlockMetadata(i, j, k);
        if(powered = true)
        {
            double d = (double)i + 0.5D + ((double)random.nextFloat() - 0.5D) * 1.20000000000000001D;
            double d1 = (float)j + 0.0625F;
            double d2 = (double)k + 0.5D + ((double)random.nextFloat() - 0.5D) * 1.20000000000000001D;
            float f = (float)l / 15F;
            float f1 = f * 0.6F + 0.4F;
            if(l == 0)
            {
                f1 = 0.0F;
            }
            float f2 = f * f * 0.7F - 0.5F;
            float f3 = f * f * 0.6F - 0.7F;
            if(f2 < 0.0F)
            {
                f2 = 0.0F;
            }
            if(f3 < 0.0F)
            {
                f3 = 0.0F;
            }
            world.spawnParticle("reddust", d, d1, d2, f1, f2, f3);
        }
    }
    boolean powered = false;
}

