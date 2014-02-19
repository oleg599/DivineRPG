package net.divinerpg.vanilla.worldgen;

import java.util.Random;

import net.divinerpg.helper.blocks.VanillaBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOverworld implements IWorldGenerator{

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		case 0:
			generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
		case 1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateOverworld(World world, Random random, int x, int z) {
		addOreSpawn(VanillaBlocks.realmiteOre, world, random, x, z, 16, 16, 5, 4, 5, 25);
		addOreSpawn(VanillaBlocks.arlemiteOre, world, random, x, z, 16, 16, 2, 3, 1, 15);
		addOreSpawn(VanillaBlocks.arlemiteOre, world, random, x, z, 16, 16, 2, 3, 1, 15);
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {
		int i, posX, posZ, posY;

		for(i = 0; i < 7; i++){
			posX = chunkX + rand.nextInt(16);
			posY = rand.nextInt(128);
			posZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(VanillaBlocks.netheriteOre, 3, Blocks.netherrack).generate(world, rand, posX, posY, posZ);
		}
		
		for(i = 0; i < 7; i++){
			posX = chunkX + rand.nextInt(16);
			posY = rand.nextInt(128);
			posZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(VanillaBlocks.bloodgemOre, 3, Blocks.netherrack).generate(world, rand, posX, posY, posZ);
		}
	}
	
	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) { }
	
	/**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     * 
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for the Number of chances available for the vein to spawn per-chunk
     * @param An int for setting the max size of a vein
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int chancesToSpawn, int maxVeinSize, int minY, int maxY)
    {
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
 
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
