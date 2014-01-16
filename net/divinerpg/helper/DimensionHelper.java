package net.divinerpg.helper;

import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.twilight.eden.gen.BiomeGenEden;
import net.minecraft.world.biome.BiomeGenBase;

public class DimensionHelper {

	static ConfigurationHelper x;
	
	public static BiomeGenBase Eden = new BiomeGenEden(x.EdenBiome);
	
}
