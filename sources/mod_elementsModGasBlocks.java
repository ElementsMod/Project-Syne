package net.minecraft.src;

import java.util.Random;

public class mod_elementsModGasBlocks extends BaseMod
{

	public String Version(){
		return "1.8.1";
	}

	public mod_elementsModGasBlocks()
	{
		ModLoader.RegisterBlock(Hydrogen);
		ModLoader.AddName(Hydrogen, "Hydrogen");
		Hydrogen.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/1.png");

		ModLoader.RegisterBlock(Helium);
		ModLoader.AddName(Helium, "Helium");
		Helium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/2.png");
		
		ModLoader.RegisterBlock(Nitrogen);
		ModLoader.AddName(Nitrogen, "Nitrogen");
		Hydrogen.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/7.png");

		ModLoader.RegisterBlock(Oxygen);
		ModLoader.AddName(Oxygen, "Oxygen");
		Helium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/8.png");
		
		ModLoader.RegisterBlock(Fluorine);
		ModLoader.AddName(Fluorine, "Fluorine");
		Hydrogen.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/9.png");

		ModLoader.RegisterBlock(Neon);
		ModLoader.AddName(Neon, "Neon");
		Helium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/10.png");
		
		ModLoader.RegisterBlock(Chlorine);
		ModLoader.AddName(Chlorine, "Chlorine");
		Hydrogen.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/17.png");

		ModLoader.RegisterBlock(Argon);
		ModLoader.AddName(Argon, "Argon");
		Helium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/18.png");
		
		ModLoader.RegisterBlock(Krypton);
		ModLoader.AddName(Krypton, "Krypton");
		Hydrogen.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/36.png");

		ModLoader.RegisterBlock(Xenon);
		ModLoader.AddName(Xenon, "Xenon");
		Helium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/54.png");
		
		ModLoader.RegisterBlock(Radon);
		ModLoader.AddName(Radon, "Radon");
		Hydrogen.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/elements/Gas/86.png");
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
        Helium = (new BlockHelium(117, 0)).setHardness(0.1F).setResistance(.1F).setStepSound(Block.soundClothFootstep).setBlockName("Helium");
        Nitrogen = (new BlockNitrogen(118,17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Nitrogen");
        Oxygen = (new BlockOxygen(119, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Oxygen");
        Fluorine = (new BlockFluorine(120, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Fluorine");
        Neon = (new BlockNeon(121, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Neon");
        Chlorine = (new BlockChlorine(122, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Chlorine");
        Argon = (new BlockArgon(123, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Argon");
        Krypton = (new BlockKrypton(124, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Krypton");
        Xenon = (new BlockXenon(125, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Xenon");
        Radon = (new BlockRadon(126, 17)).setHardness(1F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setBlockName("Radon");
	}
}