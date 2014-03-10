package net.divinerpg.helper.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.vanilla.entity.mobs.EntityAncientEntity;
import net.divinerpg.vanilla.entity.mobs.EntityAridWarrior;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoBlue;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoGreen;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoPurple;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoRed;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoYellow;
import net.divinerpg.vanilla.entity.mobs.EntityCaveCrawler;
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
import net.divinerpg.vanilla.entity.mobs.EntityJungleDramcryx;
import net.divinerpg.vanilla.entity.mobs.EntityKingCrab;
import net.divinerpg.vanilla.entity.mobs.EntityKingOfScorchers;
import net.divinerpg.vanilla.entity.mobs.EntityMiner;
import net.divinerpg.vanilla.entity.mobs.EntityNetherWatcher;
import net.divinerpg.vanilla.entity.mobs.EntityRainbour;
import net.divinerpg.vanilla.entity.mobs.EntityRotatick;
import net.divinerpg.vanilla.entity.mobs.EntityScorcher;
import net.divinerpg.vanilla.entity.mobs.EntityShark;
import net.divinerpg.vanilla.entity.mobs.EntityTheEye;
import net.divinerpg.vanilla.entity.mobs.EntityWhale;
import net.divinerpg.vanilla.entity.mobs.EntityWildFire;

public class OverworldMobRegistry {

	public static void init(){
		DivineAPI.registerDivineRPGMob(EntityEnderWatcher.class, "Ender Watcher");		
		DivineAPI.registerDivineRPGMob(EntityCrab.class, "Crab");	
		DivineAPI.registerDivineRPGMob(EntityMiner.class, "Un Dead Miner");		
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
		DivineAPI.registerDivineRPGMob(EntityCorruptedDramcryx.class, "Corrupted Dramcryx");
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
