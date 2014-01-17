package net.divinerpg.twilight.eden.gen;

import net.divinerpg.helper.blocks.TwilightBlocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenEden extends BiomeGenBase {

	public BiomeGenEden(int par1) {
		super(par1);
		this.topBlock = TwilightBlocks.edenGrass;
		this.fillerBlock = TwilightBlocks.edenDirt;
	}

}
