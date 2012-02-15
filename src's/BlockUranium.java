package net.minecraft.src;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.src.DamageSource;
import net.minecraft.src.forge.*;

public class BlockUranium extends Block
implements ITextureProvider
{	
	
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }

	public BlockUranium(int i, int j)
	{
		super(i, j, Material.rock);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        float f = 0.0925F;
        return AxisAlignedBB.getBoundingBoxFromPool((float)i + f, j, (float)k + f, (float)(i + 1) - f, (float)(j + 1) - f, (float)(k + 1) - f);
    }

    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k)
    {
        float f = 0.0925F;
        return AxisAlignedBB.getBoundingBoxFromPool((float)i + f, j, (float)k + f, (float)(i + 1) - f, j + 1, (float)(k + 1) - f);
    }

    //Reserved for later attempts with radiation
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {	
	
    }
	private Minecraft minecraft;
}