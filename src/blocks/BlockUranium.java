package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.DamageSource;
import net.minecraft.src.forge.*;

public class BlockUranium extends Block
implements ITextureProvider
{	
	
    public String getTextureFile()
    {
	    return "/elements/solid/solid.png";
    }
    
	public BlockUranium(int i, int j)
	{
		super(i, j, Material.rock);
	}
	
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        entity.attackEntityFrom(DamageSource.generic, Mod_RadDamage.RadDamageDealt);
    }
}