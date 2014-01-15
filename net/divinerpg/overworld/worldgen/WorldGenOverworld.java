package net.divinerpg.overworld.worldgen;

import java.util.Random;

import net.divinerpg.helper.blocks.VanillaBlocks;
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

	private void generateOverworld(World world, Random rand, int chunkX, int chunkZ) {
		int i, posX, posZ, posY;
		
		for(i = 0; i < 6; i++){
			posX = chunkX + rand.nextInt(16);
			posY = rand.nextInt(15);
			posZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(VanillaBlocks.realmiteOre, 5).generate(world, rand, posX, posY, posZ);
		}
		
		for(i = 0; i < 4; i++){
			posX = chunkX + rand.nextInt(16);
			posY = rand.nextInt(15);
			posZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(VanillaBlocks.arlemiteOre, 3).generate(world, rand, posX, posY, posZ);
		}
		
		for(i = 0; i < 4; i++){
			posX = chunkX + rand.nextInt(16);
			posY = rand.nextInt(15);
			posZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(VanillaBlocks.rupeeOre, 3).generate(world, rand, posX, posY, posZ);
		}
		
		for(i = 0; i < 3; i++){
			posX = chunkX + rand.nextInt(16);
			posY = rand.nextInt(15);
			posZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(Blocks.diamond_ore, 6).generate(world, rand, posX, posY, posZ);
		}
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
			new WorldGenMinable(VanillaBlocks.bloodGemOre, 3, Blocks.netherrack).generate(world, rand, posX, posY, posZ);
		}
	}
	
	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) { }
}
