package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockHelium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
	    return "/elements/Gas/Gas.png";
    }
    
	public BlockHelium(int i, int j)
	{
		super(i, j, Material.air);
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
    public boolean renderAsNormalBlock()
    {
        return false;
	}
    
    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        for(int l = 0; l < 4; l++)
        {
            double d = (float)i + random.nextFloat();
            double d1 = (float)j + random.nextFloat();
            double d2 = (float)k + random.nextFloat();
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int i1 = random.nextInt(2) * 2 - 1;
            d3 = ((double)random.nextFloat() - 0.1D) * 0.1D;
            d4 = ((double)random.nextFloat() - 0.1D) * 0.1D;
            d5 = ((double)random.nextFloat() - 0.1D) * 0.1D;
            if(world.getBlockId(i - 1, j, k) == blockID || world.getBlockId(i + 1, j, k) == blockID)
            {
                d2 = (double)k + 0.5D + 0.25D * (double)i1;
                d5 = random.nextFloat() * 0.2F * (float)i1;
            } else
            {
                d = (double)i + 0.5D + 0.25D * (double)i1;
                d3 = random.nextFloat() * 0.2F * (float)i1;
            }
            world.spawnParticle("Element2FX", d, d1, d2, d3, d4, d5);
        }
    }
}