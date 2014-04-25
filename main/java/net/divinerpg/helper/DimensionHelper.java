package net.divinerpg.helper;

import net.divinerpg.dimension.gen.arcana.BiomeGenArcana;
import net.divinerpg.dimension.gen.arcana.WorldProviderArcana;
import net.divinerpg.dimension.gen.iceika.BiomeGenIceika;
import net.divinerpg.dimension.gen.iceika.WorldProviderIceika;
import net.divinerpg.dimension.gen.twilight.eden.BiomeGenEden;
import net.divinerpg.dimension.gen.twilight.eden.WorldProviderEden;
import net.divinerpg.dimension.gen.twilight.wild_woods.BiomeGenWildWoods;
import net.divinerpg.dimension.gen.twilight.wild_woods.WorldProviderWildWoods;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class DimensionHelper {

	protected static final BiomeGenBase.Height IceikaHeight = new BiomeGenBase.Height(0.0F, 0.7F);
	
	public static BiomeGenBase Eden 		= new BiomeGenEden(ConfigurationHelper.EdenBiome);
	public static BiomeGenBase WildWoods 	= new BiomeGenWildWoods(ConfigurationHelper.WildWoodsBiome);
	public static BiomeGenBase Apalachia 	= new BiomeGenEden(ConfigurationHelper.ApalachiaBiome);
	public static BiomeGenBase Skythern 	= new BiomeGenEden(ConfigurationHelper.SkythernBiome);
	public static BiomeGenBase Mortum 		= new BiomeGenEden(ConfigurationHelper.MortumBiome);
	public static BiomeGenBase Iceika 		= new BiomeGenIceika(ConfigurationHelper.IceikaBiome).setHeight(IceikaHeight);
	public static BiomeGenBase Vethea 		= new BiomeGenEden(ConfigurationHelper.VetheaBiome);
	public static BiomeGenBase Arcana 		= new BiomeGenArcana(ConfigurationHelper.ArcanaBiome);

	public static void init(){
		addDimension(ConfigurationHelper.Eden, WorldProviderEden.class, ConfigurationHelper.keepLoadingEden);
		addDimension(ConfigurationHelper.WildWoods, WorldProviderWildWoods.class, ConfigurationHelper.keepLoadingWildWoods);
		addDimension(ConfigurationHelper.Arcana, WorldProviderArcana.class, ConfigurationHelper.keepLoadingArcana);
		addDimension(ConfigurationHelper.Iceika, WorldProviderIceika.class, ConfigurationHelper.keepLoadingIceika);
		/*addDimension(ConfigurationHelper.Apalachia, WorldProviderApalachia.class, ConfigurationHelper.keepLoadingApalachia);
		addDimension(ConfigurationHelper.Skythern, WorldProviderSkythern.class, ConfigurationHelper.keepLoadingSkythern);
		addDimension(ConfigurationHelper.Mortum, WorldProviderMortum.class, ConfigurationHelper.keepLoadingMortum);
		addDimension(ConfigurationHelper.Vethea, WorldProviderVethea.class, ConfigurationHelper.keepLoadingVethea);*/
	}

	private static void addDimension(int id, Class<? extends WorldProvider> w, boolean keeploading){
		DimensionManager.registerProviderType(id, w, keeploading);
		DimensionManager.registerDimension(id, id);
	}

}
