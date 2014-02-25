package divinerpg.helper.mobs;

import divinerpg.helper.DivineAPI;
import divinerpg.vanilla.entity.mobs.EntityAncientEntity;
import divinerpg.vanilla.entity.mobs.EntityAridWarrior;
import divinerpg.vanilla.entity.mobs.EntityAyeracoBlue;
import divinerpg.vanilla.entity.mobs.EntityAyeracoGreen;
import divinerpg.vanilla.entity.mobs.EntityAyeracoPurple;
import divinerpg.vanilla.entity.mobs.EntityAyeracoRed;
import divinerpg.vanilla.entity.mobs.EntityAyeracoYellow;
import divinerpg.vanilla.entity.mobs.EntityCaveCrawler;
import divinerpg.vanilla.entity.mobs.EntityCorruptedDramcryx;
import divinerpg.vanilla.entity.mobs.EntityCrab;
import divinerpg.vanilla.entity.mobs.EntityCyclops;
import divinerpg.vanilla.entity.mobs.EntityDesertCrawler;
import divinerpg.vanilla.entity.mobs.EntityEnderSpider;
import divinerpg.vanilla.entity.mobs.EntityEnderTriplets;
import divinerpg.vanilla.entity.mobs.EntityEnderWatcher;
import divinerpg.vanilla.entity.mobs.EntityFrost;
import divinerpg.vanilla.entity.mobs.EntityGlacon;
import divinerpg.vanilla.entity.mobs.EntityHellSpider;
import divinerpg.vanilla.entity.mobs.EntityIceMan;
import divinerpg.vanilla.entity.mobs.EntityJungleDramcryx;
import divinerpg.vanilla.entity.mobs.EntityKingCrab;
import divinerpg.vanilla.entity.mobs.EntityKingOfScorchers;
import divinerpg.vanilla.entity.mobs.EntityNetherWatcher;
import divinerpg.vanilla.entity.mobs.EntityRainbour;
import divinerpg.vanilla.entity.mobs.EntityRotatick;
import divinerpg.vanilla.entity.mobs.EntityScorcher;
import divinerpg.vanilla.entity.mobs.EntityShark;
import divinerpg.vanilla.entity.mobs.EntityTheEye;
import divinerpg.vanilla.entity.mobs.EntityWhale;
import divinerpg.vanilla.entity.mobs.EntityWildFire;

public class OverworldMobRegistry {

	public static void init(){
		DivineAPI.registerDivineRPGMob(EntityEnderWatcher.class, "Ender Watcher");		
		DivineAPI.registerDivineRPGMob(EntityCrab.class, "Crab");		
		DivineAPI.registerDivineRPGMob(EntityKingCrab.class, "King Crab");	
		DivineAPI.registerDivineRPGMob(EntityDesertCrawler.class, "Desert Crawler");		
		DivineAPI.registerDivineRPGMob(EntityCaveCrawler.class, "Cave Crawler");		
		DivineAPI.registerDivineRPGMob(EntityJungleDramcryx.class, "Jungle Dramcryx");		
		DivineAPI.registerDivineRPGMob(EntityCyclops.class, "Cyclops");		
		DivineAPI.registerDivineRPGMob(EntityAncientEntity.class, "Ancient Entity");		
		DivineAPI.registerDivineRPGMob(EntityWhale.class, "Whale");		
		DivineAPI.registerDivineRPGMob(EntityHellSpider.class, "Hell Spider");		
		DivineAPI.registerDivineRPGMob(EntityScorcher.class, "Scorhcer");		
		DivineAPI.registerDivineRPGMob(EntityEnderSpider.class, "Ender Spider");		
		DivineAPI.registerDivineRPGMob(EntityEnderTriplets.class, "Ender Triplets");
		DivineAPI.registerDivineRPGMob(EntityAridWarrior.class, "Arid Warrior");
		DivineAPI.registerDivineRPGMob(EntityAyeracoBlue.class, "Ayeraco Blue");
		DivineAPI.registerDivineRPGMob(EntityAyeracoGreen.class, "Ayeraco Green");
		DivineAPI.registerDivineRPGMob(EntityAyeracoPurple.class, "Ayeraco Purple");
		DivineAPI.registerDivineRPGMob(EntityAyeracoRed.class, "Ayeraco Red");
		DivineAPI.registerDivineRPGMob(EntityAyeracoYellow.class, "Ayeraco Yellow");
		DivineAPI.registerDivineRPGMob(EntityCorruptedDramcryx.class, "Cave Dramcryx");
		DivineAPI.registerDivineRPGMob(EntityTheEye.class, "The Eye");
		DivineAPI.registerDivineRPGMob(EntityFrost.class, "Frost");
		DivineAPI.registerDivineRPGMob(EntityIceMan.class, "Ice Man");
		DivineAPI.registerDivineRPGMob(EntityKingOfScorchers.class, "King Of Scorchers");
		DivineAPI.registerDivineRPGMob(EntityRainbour.class, "Rainbour");
		DivineAPI.registerDivineRPGMob(EntityRotatick.class, "Rotatick");
		DivineAPI.registerDivineRPGMob(EntityShark.class, "Shark");
		DivineAPI.registerDivineRPGMob(EntityNetherWatcher.class, "The Watcher");
		DivineAPI.registerDivineRPGMob(EntityWildFire.class, "Wild Fire");
		DivineAPI.registerDivineRPGMob(EntityGlacon.class, "Glacon");
	}
}
