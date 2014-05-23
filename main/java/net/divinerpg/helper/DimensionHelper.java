package net.divinerpg.helper;

import net.divinerpg.dimension.gen.arcana.BiomeGenArcana;
import net.divinerpg.dimension.gen.arcana.WorldProviderArcana;
import net.divinerpg.dimension.gen.iceika.BiomeGenIceika;
import net.divinerpg.dimension.gen.iceika.WorldProviderIceika;
import net.divinerpg.dimension.gen.twilight.eden.BiomeGenEden;
import net.divinerpg.dimension.gen.twilight.eden.WorldProviderEden;
import net.divinerpg.dimension.gen.twilight.wild_woods.BiomeGenWildWoods;
import net.divinerpg.dimension.gen.twilight.wild_woods.WorldProviderWildWoods;
import net.divinerpg.dimension.gen.vethea.BiomeGenVethea;
import net.divinerpg.dimension.gen.vethea.WorldProviderVethea;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class DimensionHelper {

	protected static final BiomeGenBase.Height IceikaHeight = new BiomeGenBase.Height(0.0F, 0.7F); 
	protected static final BiomeGenBase.Height VetheaHeight = new BiomeGenBase.Height(-1.0F, 0.0F);
	
	public static BiomeGenBase Eden 		= new BiomeGenEden(ConfigurationHelper.edenBiome);
	public static BiomeGenBase WildWoods 	= new BiomeGenWildWoods(ConfigurationHelper.wildWoodsBiome);
	public static BiomeGenBase Apalachia 	= new BiomeGenEden(ConfigurationHelper.apalachiaBiome);
	public static BiomeGenBase Skythern 	= new BiomeGenEden(ConfigurationHelper.skythernBiome);
	public static BiomeGenBase Mortum 		= new BiomeGenEden(ConfigurationHelper.mortumBiome);
	public static BiomeGenBase Iceika 		= new BiomeGenIceika(ConfigurationHelper.iceikaBiome).setHeight(IceikaHeight);
	public static BiomeGenBase Vethea 		= new BiomeGenVethea(ConfigurationHelper.vetheaBiome).setHeight(VetheaHeight);
	public static BiomeGenBase Arcana 		= new BiomeGenArcana(ConfigurationHelper.arcanaBiome);

	public static void init(){
		addDimension(ConfigurationHelper.eden, WorldProviderEden.class, ConfigurationHelper.keepLoadingEden);
		addDimension(ConfigurationHelper.wildWoods, WorldProviderWildWoods.class, ConfigurationHelper.keepLoadingWildWoods);
		addDimension(ConfigurationHelper.arcana, WorldProviderArcana.class, ConfigurationHelper.keepLoadingArcana);
		addDimension(ConfigurationHelper.iceika, WorldProviderIceika.class, ConfigurationHelper.keepLoadingIceika);
		addDimension(ConfigurationHelper.vethea, WorldProviderVethea.class, ConfigurationHelper.keepLoadingVethea);
		/*addDimension(ConfigurationHelper.Apalachia, WorldProviderApalachia.class, ConfigurationHelper.keepLoadingApalachia);
		addDimension(ConfigurationHelper.Skythern, WorldProviderSkythern.class, ConfigurationHelper.keepLoadingSkythern);
		addDimension(ConfigurationHelper.Mortum, WorldProviderMortum.class, ConfigurationHelper.keepLoadingMortum);
		*/
	}

	private static void addDimension(int id, Class<? extends WorldProvider> w, boolean keeploading){
		DimensionManager.registerProviderType(id, w, keeploading);
		DimensionManager.registerDimension(id, id);
	}

}
