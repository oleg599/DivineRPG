package net.divinerpg.helper.mobs;

import net.divinerpg.helper.DimensionHelper;
import net.divinerpg.twilight.entity.mob.EntityAngryBunny;
import net.divinerpg.twilight.entity.mob.EntityApalachiaArcher;
import net.divinerpg.twilight.entity.mob.EntityApalachiaCadillion;
import net.divinerpg.twilight.entity.mob.EntityApalachiaGolem;
import net.divinerpg.twilight.entity.mob.EntityApalachiaTomo;
import net.divinerpg.twilight.entity.mob.EntityApalachiaWarrior;
import net.divinerpg.twilight.entity.mob.EntityBaslisk;
import net.divinerpg.twilight.entity.mob.EntityBunny;
import net.divinerpg.twilight.entity.mob.EntityCadillion;
import net.divinerpg.twilight.entity.mob.EntityCori;
import net.divinerpg.twilight.entity.mob.EntityCori2;
import net.divinerpg.twilight.entity.mob.EntityEdenTomo;
import net.divinerpg.twilight.entity.mob.EntityMadivel;
import net.divinerpg.twilight.entity.mob.EntityMoonWolf;
import net.divinerpg.twilight.entity.mob.EntityMortumCadillion;
import net.divinerpg.twilight.entity.mob.EntityMortumDemon;
import net.divinerpg.twilight.entity.mob.EntityNesro;
import net.divinerpg.twilight.entity.mob.EntitySamek;
import net.divinerpg.twilight.entity.mob.EntitySkythernArcher;
import net.divinerpg.twilight.entity.mob.EntitySkythernFiend;
import net.divinerpg.twilight.entity.mob.EntitySkythernGolem;
import net.divinerpg.twilight.entity.mob.EntitySoulStealer;
import net.divinerpg.twilight.entity.mob.EntityVerek;
import net.divinerpg.twilight.entity.mob.EntityWildWoodGolem;
import net.divinerpg.twilight.entity.mob.EntityWildWoodTomo;
import net.divinerpg.vanilla.entity.mobs.EntityAridWarrior;
import net.divinerpg.vanilla.entity.mobs.EntityCaveCrawler;
import net.divinerpg.vanilla.entity.mobs.EntityCaveclops;
import net.divinerpg.vanilla.entity.mobs.EntityCorruptedDramcryx;
import net.divinerpg.vanilla.entity.mobs.EntityCrab;
import net.divinerpg.vanilla.entity.mobs.EntityCyclops;
import net.divinerpg.vanilla.entity.mobs.EntityDesertCrawler;
import net.divinerpg.vanilla.entity.mobs.EntityEnderSpider;
import net.divinerpg.vanilla.entity.mobs.EntityEnderTriplets;
import net.divinerpg.vanilla.entity.mobs.EntityEnderWatcher;
import net.divinerpg.vanilla.entity.mobs.EntityFrost;
import net.divinerpg.vanilla.entity.mobs.EntityGlacon;
import net.divinerpg.vanilla.entity.mobs.EntityHellSpider;
import net.divinerpg.vanilla.entity.mobs.EntityIceMan;
import net.divinerpg.vanilla.entity.mobs.EntityJungleBat;
import net.divinerpg.vanilla.entity.mobs.EntityJungleDramcryx;
import net.divinerpg.vanilla.entity.mobs.EntityKingCrab;
import net.divinerpg.vanilla.entity.mobs.EntityMiner;
import net.divinerpg.vanilla.entity.mobs.EntityRainbour;
import net.divinerpg.vanilla.entity.mobs.EntityRotatick;
import net.divinerpg.vanilla.entity.mobs.EntityScorcher;
import net.divinerpg.vanilla.entity.mobs.EntityShark;
import net.divinerpg.vanilla.entity.mobs.EntityTheEye;
import net.divinerpg.vanilla.entity.mobs.EntityWhale;
import net.divinerpg.vanilla.entity.mobs.EntityWildFire;
import net.divinerpg.vethea.entity.EntityAcidHag;
import net.divinerpg.vethea.entity.EntityBiphron;
import net.divinerpg.vethea.entity.EntityBohemite;
import net.divinerpg.vethea.entity.EntityCymesoid;
import net.divinerpg.vethea.entity.EntityDissiment;
import net.divinerpg.vethea.entity.EntityDreamwrecker;
import net.divinerpg.vethea.entity.EntityDuo;
import net.divinerpg.vethea.entity.EntityEhu;
import net.divinerpg.vethea.entity.EntityEndiku;
import net.divinerpg.vethea.entity.EntityGalroid;
import net.divinerpg.vethea.entity.EntityGorgosion;
import net.divinerpg.vethea.entity.EntityHelio;
import net.divinerpg.vethea.entity.EntityHoverStinger;
import net.divinerpg.vethea.entity.EntityHusk;
import net.divinerpg.vethea.entity.EntityKazrotic;
import net.divinerpg.vethea.entity.EntityLheiva;
import net.divinerpg.vethea.entity.EntityLorga;
import net.divinerpg.vethea.entity.EntityLorgaFlight;
import net.divinerpg.vethea.entity.EntityMandragora;
import net.divinerpg.vethea.entity.EntityMysteriousManLayer1;
import net.divinerpg.vethea.entity.EntityMysteriousManLayer2;
import net.divinerpg.vethea.entity.EntityMysteriousManLayer3;
import net.divinerpg.vethea.entity.EntityShadahier;
import net.divinerpg.vethea.entity.EntityStoneGolem;
import net.divinerpg.vethea.entity.EntityTocaxin;
import net.divinerpg.vethea.entity.EntityTwins;
import net.divinerpg.vethea.entity.EntityVermenous;
import net.divinerpg.vethea.entity.EntityVhraak;
import net.divinerpg.vethea.entity.EntityZone;
import net.divinerpg.vethea.entity.EntityZoragon;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MobSpawning {

	public static BiomeGenBase[] iceBiomes = new BiomeGenBase[]{BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills};
	public static BiomeGenBase[] overworldBiomes = new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert,
		BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river,
		BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.deepOcean,
		BiomeGenBase.extremeHillsPlus, BiomeGenBase.jungleEdge, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F,
	    BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach};
	
	public static void addSpawns(){	
		EntityRegistry.addSpawn(EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, iceBiomes);
		EntityRegistry.addSpawn(EntityGlacon.class, 10, 1, 1, EnumCreatureType.monster, iceBiomes);
        EntityRegistry.addSpawn(EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, iceBiomes);
        EntityRegistry.addSpawn(EntityHellSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        //EntityRegistry.addSpawn(EntityHellBat.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityScorcher.class, 7, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        //EntityRegistry.addSpawn(EntityJungleSpider.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);
        //EntityRegistry.addSpawn(EntityJackOMan.class, 1, 1, 1, EnumCreatureType.creature, overworldBiomes);
        //EntityRegistry.addSpawn(EntityHellPig.class, 25, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityEnderWatcher.class, 10, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityCrab.class, 15, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityKingCrab.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityWhale.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityShark.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityCaveCrawler.class, 20, 2, 3, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityDesertCrawler.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(EntityAridWarrior.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(EntityRotatick.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityJungleDramcryx.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCorruptedDramcryx.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityTheEye.class, 7, 1, 4, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityEnderTriplets.class, 1, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityJungleBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCaveclops.class, 20, 1, 4, EnumCreatureType.monster, overworldBiomes);
		EntityRegistry.addSpawn(EntityEnderSpider.class, 2, 1, 4, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityRainbour.class, 2, 1, 1, EnumCreatureType.creature, overworldBiomes);
        EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
		
		EntityRegistry.addSpawn(EntityEdenTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityCori.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
        EntityRegistry.addSpawn(EntityNesro.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityMadivel.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
        
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityWildWoodTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityWildWoodGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityVerek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityMoonWolf.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.WildWoods});;
        
        EntityRegistry.addSpawn(EntityApalachiaCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        
        EntityRegistry.addSpawn(EntitySkythernFiend.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntitySkythernGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntitySkythernArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntitySamek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntityCori2.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityMortumDemon.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityBaslisk.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityMortumCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityApalachiaArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        
        EntityRegistry.addSpawn(EntityVermenous.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});
        EntityRegistry.addSpawn(EntityCymesoid.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityDreamwrecker.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityDuo.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityTwins.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityBohemite.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityTocaxin.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityMandragora.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityShadahier.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityLheiva.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityHoverStinger.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityAcidHag.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityKazrotic.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityVhraak.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityEndiku.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityHelio.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityBiphron.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityZoragon.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityGorgosion.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityDissiment.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityZone.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityLorga.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityLorgaFlight.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});	
        EntityRegistry.addSpawn(EntityGalroid.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Vethea});
        EntityRegistry.addSpawn(EntityMysteriousManLayer1.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.Vethea});
        EntityRegistry.addSpawn(EntityMysteriousManLayer2.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.Vethea});
        EntityRegistry.addSpawn(EntityMysteriousManLayer3.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.Vethea});
        
        EntityRegistry.addSpawn(EntityEhu.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.Vethea});
        EntityRegistry.addSpawn(EntityHusk.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.Vethea});
        EntityRegistry.addSpawn(EntityStoneGolem.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.Vethea});
	}
}