package net.divinerpg.helper.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.overworld.entity.mobs.EntityAncientEntity;
import net.divinerpg.overworld.entity.mobs.EntityCaveCrawler;
import net.divinerpg.overworld.entity.mobs.EntityCrab;
import net.divinerpg.overworld.entity.mobs.EntityCyclops;
import net.divinerpg.overworld.entity.mobs.EntityDesertCrawler;
import net.divinerpg.overworld.entity.mobs.EntityEnderSpider;
import net.divinerpg.overworld.entity.mobs.EntityEnderTriplets;
import net.divinerpg.overworld.entity.mobs.EntityEnderWatcher;
import net.divinerpg.overworld.entity.mobs.EntityHellSpider;
import net.divinerpg.overworld.entity.mobs.EntityJungleDramcryx;
import net.divinerpg.overworld.entity.mobs.EntityKingCrab;
import net.divinerpg.overworld.entity.mobs.EntityScorcher;
import net.divinerpg.overworld.entity.mobs.EntityWhale;

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
		//DivineAPI.registerDivineRPGMob(EntityAridWarrior.class, "Arid Warrior");
		//DivineAPI.registerDivineRPGMob(EntityAyeracoBlue.class, "Ayeraco Blue");
		//DivineAPI.registerDivineRPGMob(EntityAyeracoGreen.class, "Ayeraco Green");
		//DivineAPI.registerDivineRPGMob(EntityAyeracoPurple.class, "Ayeraco Purple");
		//DivineAPI.registerDivineRPGMob(EntityAyeracoRed.class, "Ayeraco Red");
		//DivineAPI.registerDivineRPGMob(EntityAyeracoYellow.class, "Ayeraco Yellow");
		//DivineAPI.registerDivineRPGMob(EntityCaveDramcryx.class, "Cave Dramcryx");
		//DivineAPI.registerDivineRPGMob(EntityTheEye.class, "The Eye");
		//DivineAPI.registerDivineRPGMob(EntityFrost.class, "Frost");
		//DivineAPI.registerDivineRPGMob(EntityIceMan.class, "Ice Man");
		//DivineAPI.registerDivineRPGMob(EntityKingOfScorchers.class, "King Of Scorchers");
		//DivineAPI.registerDivineRPGMob(EntityRainbour.class, "Rainbour");
		//DivineAPI.registerDivineRPGMob(EntityRotatick.class, "Rotatick");
		//DivineAPI.registerDivineRPGMob(EntityShark.class, "Shark");
		//DivineAPI.registerDivineRPGMob(EntityTheWatcher.class, "The Watcher");
		//DivineAPI.registerDivineRPGMob(EntityWildFire.class, "Wild Fire");
	}
}
