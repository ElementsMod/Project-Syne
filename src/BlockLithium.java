package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockLithium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockLithium(int i, int j)
	{
		super(i, j, Material.ground);
	
	}
	public int getBlockId(int i, int j, int k)
    {
        if(i < 0xfe363c80 || k < 0xfe363c80 || i >= 0x1c9c380 || k >= 0x1c9c380)
        {
            return 0;
        }
        if(j < 0)
        {
            return 0;
        }
        if(j >= 128)
        {
            return 0;
        } else
        {
            return getChunkFromBlockCoords(i >> 4, k >> 4).getBlockID(i & 0xf, j, k & 0xf);
        }
    }
	public Chunk getChunkFromBlockCoords(int i, int j)
    {
        return getChunkFromBlockCoords(i >> 4, j >> 4);
    }

    public boolean isWaterBlock(int i, int j, int k)
    {
    	return getBlockId(i, j, k) == 46;
    	}
    
	    public int quantityDropped(Random random)
	    {
	        return 1;
	    }

	    public void onBlockDestroyedByExplosion(World world, int i, int j, int k)
	    {
	        EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
	        entitytntprimed.fuse = world.rand.nextInt(entitytntprimed.fuse / 4) + entitytntprimed.fuse / 8;
	        world.spawnEntityInWorld(entitytntprimed);
	    }

	    public void onBlockDestroyedByPlayer(World world, int i, int j, int k, int l)
	    {
	        if(world.isRemote)
	        {
	            return;
	        }
	        if((l & 1) == 0)
	        {
	            dropBlockAsItem_do(world, i, j, k, new ItemStack(Block.tnt.blockID, 1, 0));
	        } else
	        {
	            EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F);
	            world.spawnEntityInWorld(entitytntprimed);
	            world.playSoundAtEntity(entitytntprimed, "random.fuse", 1.0F, 1.0F);
	        }
	    }

	    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer)
	    {
	        if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.flintAndSteel.shiftedIndex)
	        {
	            world.setBlockMetadata(i, j, k, 1);
	        }
	        super.onBlockClicked(world, i, j, k, entityplayer);
	    }

	    public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
	    {
	        return super.blockActivated(world, i, j, k, entityplayer);
	    }

}
