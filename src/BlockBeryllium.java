package net.minecraft.src;

import net.minecraft.src.forge.*;
import java.util.Random;

public class BlockBeryllium extends Block
implements ITextureProvider
{
    public String getTextureFile()
    {
		return "/elements/Blocks/EModBlocks.png";
    }
    
	public BlockBeryllium(int i, int j)
	{
		super(i, j, Material.ground);
	}
	public int quantityDroppedWithBonus(int i, Random random)
    {
        return MathHelper.clamp_int(quantityDropped(random) + random.nextInt(i + 1), 1, 4);
    }

    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(2);
    }

    public int idDropped(int i, Random random, int j)
    {
        return mod_ElementsModItems.BerylGem.shiftedIndex;
    }
		    
}
