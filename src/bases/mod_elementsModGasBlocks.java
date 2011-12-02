package net.minecraft.src;

import java.util.Random;
import net.minecraft.src.forge.*;

public class mod_elementsModGasBlocks extends BaseMod
{

	public String Version(){
		return "1.8.1";
	}

	public mod_elementsModGasBlocks()
	{
		MinecraftForgeClient.preloadTexture("/elements/Gas/Gas.png");
		world = ModLoader.getMinecraftInstance().theWorld;
		
		ModLoader.RegisterBlock(Hydrogen);
		ModLoader.AddName(Hydrogen, "Hydrogen");

		ModLoader.RegisterBlock(Helium);
		ModLoader.AddName(Helium, "Helium");
		
		ModLoader.RegisterBlock(Nitrogen);
		ModLoader.AddName(Nitrogen, "Nitrogen");

		ModLoader.RegisterBlock(Oxygen);
		ModLoader.AddName(Oxygen, "Oxygen");
		
		ModLoader.RegisterBlock(Fluorine);
		ModLoader.AddName(Fluorine, "Fluorine");

		ModLoader.RegisterBlock(Neon);
		ModLoader.AddName(Neon, "Neon");
		
		ModLoader.RegisterBlock(Chlorine);
		ModLoader.AddName(Chlorine, "Chlorine");

		ModLoader.RegisterBlock(Argon);
		ModLoader.AddName(Argon, "Argon");
		
		ModLoader.RegisterBlock(Krypton);
		ModLoader.AddName(Krypton, "Krypton");

		ModLoader.RegisterBlock(Xenon);
		ModLoader.AddName(Xenon, "Xenon");
		
		ModLoader.RegisterBlock(Radon);
		ModLoader.AddName(Radon, "Radon");
	}
    
    //generate floating blocks
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
    }
    
    World world;
    
	// Block
	public static final Block Hydrogen;
    public static final Block Helium;
    public static final Block Nitrogen;
    public static final Block Oxygen;
    public static final Block Fluorine;
    public static final Block Neon;
    public static final Block Chlorine;
    public static final Block Argon;
    public static final Block Krypton;
    public static final Block Xenon;
    public static final Block Radon;
    
    // Block Info
	static
	{
		Hydrogen = (new BlockHydrogen(116, 0)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Hydrogen");
        Helium = (new BlockHelium(117, 1)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Helium");
        Nitrogen = (new BlockNitrogen(118,2)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nitrogen");
        Oxygen = (new BlockOxygen(119, 3)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Oxygen");
        Fluorine = (new BlockFluorine(120, 4)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Fluorine");
        Neon = (new BlockNeon(121, 5)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neon");
        Chlorine = (new BlockChlorine(122, 6)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chlorine");
        Argon = (new BlockArgon(123, 7)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Argon");
        Krypton = (new BlockKrypton(124, 18)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Krypton");
        Xenon = (new BlockXenon(125, 19)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Xenon");
        Radon = (new BlockRadon(126, 20)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radon");
	}
}