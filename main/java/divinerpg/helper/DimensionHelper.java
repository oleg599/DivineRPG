package net.divinerpg.helper;

import net.divinerpg.helper.config.*;
import net.divinerpg.twilight.gen.eden.*;
import net.divinerpg.twilight.gen.wildwoods.*;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.*;

public class DimensionHelper {

	public static BiomeGenBase Eden 		= new BiomeGenEden(ConfigurationHelper.EdenBiome);
	public static BiomeGenBase WildWoods 	= new BiomeGenWildWoods(ConfigurationHelper.WildWoodsBiome);
	public static BiomeGenBase Apalachia 	= new BiomeGenEden(ConfigurationHelper.ApalachiaBiome);
	public static BiomeGenBase Skythern 	= new BiomeGenEden(ConfigurationHelper.SkythernBiome);
	public static BiomeGenBase Mortum 		= new BiomeGenEden(ConfigurationHelper.MortumBiome);
	public static BiomeGenBase Iceika 		= new BiomeGenEden(ConfigurationHelper.IceikaBiome);
	public static BiomeGenBase Vethea 		= new BiomeGenEden(ConfigurationHelper.VetheaBiome);
	public static BiomeGenBase Arcana 		= new BiomeGenEden(ConfigurationHelper.ArcanaBiome);

	public static void init(){
		addDimension(ConfigurationHelper.Eden, WorldProviderEden.class, ConfigurationHelper.keepLoadingEden);

		addDimension(ConfigurationHelper.WildWoods, WorldProviderWildWoods.class, ConfigurationHelper.keepLoadingWildWoods);
		/*addDimension(ConfigurationHelper.Apalachia, WorldProviderApalachia.class, ConfigurationHelper.keepLoadingApalachia);
		addDimension(ConfigurationHelper.Skythern, WorldProviderSkythern.class, ConfigurationHelper.keepLoadingSkythern);
		addDimension(ConfigurationHelper.Mortum, WorldProviderMortum.class, ConfigurationHelper.keepLoadingMortum);
		addDimension(ConfigurationHelper.Vethea, WorldProviderVethea.class, ConfigurationHelper.keepLoadingVethea);
		addDimension(ConfigurationHelper.Iceika, WorldProviderIceika.class, ConfigurationHelper.keepLoadingIceika);
		addDimension(ConfigurationHelper.Arcana, WorldProviderArcana.class, ConfigurationHelper.keepLoadingArcana);*/


	}

	static void addDimension(int id, Class<? extends WorldProvider> w, boolean kl){
		DimensionManager.registerProviderType(id, w, kl);
		DimensionManager.registerDimension(id, id);
	}

}
