package net.minecraft.src;

import net.minecraft.src.forge.*;
import java.util.Random;

public class mod_elementsModGasBlocks extends BaseMod {
	public static final Block gasblock;
	
	public static final int id = 250;
	
	static {		
		gasblock = (new BlockMultiple(id, Material.wood)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Gas").setRequiresSelfNotify(); 
	}	
	
	public mod_elementsModGasBlocks() {	
		ModLoader.RegisterBlock(gasblock);
		
		// Register the item
		Item.itemsList[id] = new ItemMultiblock(id-256, gasblock).setItemName("Gasblock");
		
		ModLoader.AddLocalization("tile.Gasblock.0.name", "Hydrogen");
		ModLoader.AddLocalization("tile.Gasblock.1.name", "Helium");
		ModLoader.AddLocalization("tile.Gasblock.2.name", "Nitrogen");
        ModLoader.AddLocalization("tile.Gasblock.3.name", "Oxygen");
		ModLoader.AddLocalization("tile.Gasblock.4.name", "Fluorine");
		ModLoader.AddLocalization("tile.Gasblock.5.name", "Neon");
        ModLoader.AddLocalization("tile.Gasblock.6.name", "Chlorine");
		ModLoader.AddLocalization("tile.Gasblock.7.name", "Argon");
		ModLoader.AddLocalization("tile.Gasblock.8.name", "Krypton");
        ModLoader.AddLocalization("tile.Gasblock.9.name", "Xenon");
		ModLoader.AddLocalization("tile.Gasblock.10.name", "Radon");
		
		// Add crafting recipes
		ModLoader.AddRecipe(new ItemStack(gasblock, 1, 0), new Object[]{"X", Character.valueOf('X'), Block.gravel});
		ModLoader.AddRecipe(new ItemStack(gasblock, 1, 1), new Object[]{"XX", Character.valueOf('X'), Block.gravel});
		ModLoader.AddRecipe(new ItemStack(gasblock, 1, 2), new Object[]{"XXX", Character.valueOf('X'), Block.gravel});
	}
    
    //generate floating blocks 
/*
    public void GenerateSurface(World world, Random random, int i, int j)
    {
        for( int a = 0; a < 2; a++ )
        {
            int posX = i + random.nextInt(16);
            int posY = random.nextInt(58) + 70;
            int posZ = j + random.nextInt(16);
            new worldGenFloating(Hydrogen.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Helium.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Nitrogen.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Oxygen.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Fluorine.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Neon.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Chlorine.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Argon.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Krypton.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Xenon.blockID, 2).generate(world, random, posX, posY, posZ);
            new worldGenFloating(Radon.blockID, 2).generate(world, random, posX, posY, posZ);
        }
    } */
    
    World world;
    
	@Override
	public String getVersion() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() 
	{
		// TODO Auto-generated method stub
		
	}
}