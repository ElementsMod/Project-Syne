//BlockNeonLight.java

package net.minecraft.src;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.src.forge.*;
import net.minecraft.src.forge.ITextureProvider;

public class BlockNeonLight extends Block
implements ITextureProvider
{
	
	public String getTextureFile()
    {
	    return "/elements/misc/neon/GreenLightOff.png";
    }
	
	public int ticRate(){
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
        public BlockNeonLight(int i, int j, Material material)
        {
                super(i, j, material.glass);
                setLightValue(0F);
                setBlockBounds(0.0F, 0.0F, 0.3F, 1.0F, 0.4F, 0.7F);
        }

        public int idDropped(int i, Random random)
        {
            return mod_miscBlocks.neonLightOff.blockID;
        }
        public void onNeighborBlockChange(World world, int i, int j, int k, int l)
        {
            if(l > 0 && Block.blocksList[l].canProvidePower())
            {
            	world.scheduleBlockUpdate(i, j, k, blockID, tickRate());
            }
            if(mod_miscBlocks.neonLightOn.canProvidePower())
            {
            	world.scheduleBlockUpdate(i, j, k, blockID, tickRate());
            }
        }

        public void updateTick(World world, int i, int j, int k, Random random)
        {
            if(world.isBlockIndirectlyGettingPowered(i, j, k) || world.isBlockIndirectlyGettingPowered(i, j + 1, k))
            {
                world.setBlockWithNotify(i,j,k, mod_miscBlocks.neonLightOn.blockID);
            }
            else{
            	world.setBlockWithNotify(i,j,k, mod_miscBlocks.neonLightOff.blockID);
            }
        }
    }