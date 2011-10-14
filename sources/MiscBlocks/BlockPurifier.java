package net.minecraft.src;

import java.util.Random;

public class BlockPurifier extends BlockContainer
{
    
    protected BlockPurifier(int i, boolean flag)
    {
        super(i, Material.ground);
        PurifierRand = new Random();
        isActive = flag;
    }

    public int idDropped(int i, Random random)
    {
        return mod_miscBlocks.Purifier.blockID;
    }

    public void onBlockAdded(World world, int i, int j, int k)
    {
        super.onBlockAdded(world, i, j, k);
        setDefaultDirection(world, i, j, k);
    }

    private void setDefaultDirection(World world, int i, int j, int k)
    {
        if(world.multiplayerWorld)
        {
            return;
        }
        int l = world.getBlockId(i, j, k - 1);
        int i1 = world.getBlockId(i, j, k + 1);
        int j1 = world.getBlockId(i - 1, j, k);
        int k1 = world.getBlockId(i + 1, j, k);
        byte byte0 = 3;
        if(Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
        {
            byte0 = 3;
        }
        if(Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
        {
            byte0 = 2;
        }
        if(Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
        {
            byte0 = 5;
        }
        if(Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
        {
            byte0 = 4;
        }
        world.setBlockMetadataWithNotify(i, j, k, byte0);
    }
    
    public int getBlockTexture(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return mod_miscBlocks.freezSide;
        }
        if(l == 0)
        {
            return mod_miscBlocks.freezSide;
        }
        int i1 = iblockaccess.getBlockMetadata(i, j, k);
        if(l != i1)
        {
            return mod_miscBlocks.freezSide;
        }
        else
        {
            return mod_miscBlocks.freezFront;
        }
    }

    public int getBlockTextureFromSide(int side)
    {
              if (side == 3)
              {
                return mod_miscBlocks.freezFront;
              }
              else
              {
                  return mod_miscBlocks.freezSide;
              }
    }


    public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        if(world.multiplayerWorld)
        {
            return true;
        } else
        {
            TileEntityPurifier tileentityPurifier = (TileEntityPurifier)world.getBlockTileEntity(i, j, k);
            ModLoader.OpenGUI(entityplayer, new GuiPurifier(entityplayer.inventory, tileentityPurifier));
            return true;
        }
    }
    public TileEntity getBlockEntity()
    {
        return new TileEntityPurifier();
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        if(l == 0)
        {
            world.setBlockMetadataWithNotify(i, j, k, 2);
        }
        if(l == 1)
        {
            world.setBlockMetadataWithNotify(i, j, k, 5);
        }
        if(l == 2)
        {
            world.setBlockMetadataWithNotify(i, j, k, 3);
        }
        if(l == 3)
        {
            world.setBlockMetadataWithNotify(i, j, k, 4);
        }
    }

    public void onBlockRemoval(World world, int i, int j, int k)
    {
        if(!keepPurifierInventory)
        {
            TileEntityPurifier tileentityPurifier = (TileEntityPurifier)world.getBlockTileEntity(i, j, k);
label0:
            for(int l = 0; l < tileentityPurifier.getSizeInventory(); l++)
            {
                ItemStack itemstack = tileentityPurifier.getStackInSlot(l);
                if(itemstack == null)
                {
                    continue;
                }
                float f = PurifierRand.nextFloat() * 0.8F + 0.1F;
                float f1 = PurifierRand.nextFloat() * 0.8F + 0.1F;
                float f2 = PurifierRand.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.stackSize <= 0)
                    {
                        continue label0;
                    }
                    int i1 = PurifierRand.nextInt(21) + 10;
                    if(i1 > itemstack.stackSize)
                    {
                        i1 = itemstack.stackSize;
                    }
                    itemstack.stackSize -= i1;
                    EntityItem entityitem = new EntityItem(world, (float)i + f, (float)j + f1, (float)k + f2, new ItemStack(itemstack.itemID, i1, itemstack.getItemDamage()));
                    float f3 = 0.05F;
                    entityitem.motionX = (float)PurifierRand.nextGaussian() * f3;
                    entityitem.motionY = (float)PurifierRand.nextGaussian() * f3 + 0.2F;
                    entityitem.motionZ = (float)PurifierRand.nextGaussian() * f3;
                    world.entityJoinedWorld(entityitem);
                } while(true);
            }

        }
        super.onBlockRemoval(world, i, j, k);
    }

    private Random PurifierRand;
    private final boolean isActive;
    private static boolean keepPurifierInventory = false;

}