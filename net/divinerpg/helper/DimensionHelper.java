package net.divinerpg.helper;

import net.divinerpg.helper.config.*;
import net.divinerpg.twilight.eden.gen.*;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.*;

public class DimensionHelper {

	public static BiomeGenBase Eden 		= new BiomeGenEden(ConfigurationHelper.EdenBiome);
	public static BiomeGenBase WildWoods 	= new BiomeGenEden(ConfigurationHelper.WildWoodsBiome);
	public static BiomeGenBase Apalachia 	= new BiomeGenEden(ConfigurationHelper.ApalachiaBiome);
	public static BiomeGenBase Skythern 	= new BiomeGenEden(ConfigurationHelper.SkythernBiome);
	public static BiomeGenBase Mortum 		= new BiomeGenEden(ConfigurationHelper.MortumBiome);
	public static BiomeGenBase Iceika 		= new BiomeGenEden(ConfigurationHelper.IceikaBiome);
	public static BiomeGenBase Vethea 		= new BiomeGenEden(ConfigurationHelper.VetheaBiome);
	public static BiomeGenBase Arcana 		= new BiomeGenEden(ConfigurationHelper.ArcanaBiome);

	public static void init(){
		addDimension(ConfigurationHelper.Eden, WorldProviderEden.class, ConfigurationHelper.keepLoadingEden);

		/*addDimension(x.WildWoods, WorldProviderWildWood.class, x.keepLoadingWildWoods);
		addDimension(x.Apalachia, WorldProviderApalachia.class, x.keepLoadingApalachia);
		addDimension(x.Skythern, WorldProviderSkythern.class, x.keepLoadingSkythern);
		addDimension(x.Mortum, WorldProviderMortum.class, x.keepLoadingMortum);
		addDimension(x.Vethea, WorldProviderVethea.class, x.keepLoadingVethea);
		addDimension(x.Iceika, WorldProviderIceika.class, x.keepLoadingIceika);
		addDimension(x.Arcana, WorldProviderArcana.class, x.keepLoadingArcana);*/


	}

	static void addDimension(int id, Class<? extends WorldProvider> w, boolean kl){
		DimensionManager.registerProviderType(id, w, kl);
		DimensionManager.registerDimension(id, id);
	}

}
