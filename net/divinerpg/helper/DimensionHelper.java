package net.divinerpg.helper;

import net.divinerpg.helper.config.*;
import net.divinerpg.twilight.eden.gen.*;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.*;

public class DimensionHelper {

	static ConfigurationHelper x;

	public static BiomeGenBase Eden = new BiomeGenEden(x.EdenBiome);

	/** The dimension renames:
	 * Dravite = Eden
	 * Azurite = The Wild Wood
	 * Uvite = Apalachia
	 * Mythril = Skythern
	 * Augite = Mortum
	 * Vethea = Vethea
	 * Iceika = Iceika
	 * Arcana = Dungen Of Arcana
	 **/

	public static void init(){
		addDimension(x.Eden, WorldProviderEden.class, x.keepLoadingEden);

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
