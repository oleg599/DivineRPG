package net.divinerpg.helper.mobs;

import net.divinerpg.helper.*;
import net.divinerpg.overworld.entity.mobs.*;

public class OverworldMobRegistry {

	public static void init(){
		DivineRPGMobRegistry.registerDivineRPGMob(EntityEnderWatcher.class, "Ender Watcher");		
		DivineRPGMobRegistry.registerDivineRPGMob(EntityCrab.class, "Crab");		
		DivineRPGMobRegistry.registerDivineRPGMob(EntityKingCrab.class, "King Crab");	
		DivineRPGMobRegistry.registerDivineRPGMob(EntityDesertCrawler.class, "Desert Crawler");		
		DivineRPGMobRegistry.registerDivineRPGMob(EntityCaveCrawler.class, "Cave Crawler");		
		DivineRPGMobRegistry.registerDivineRPGMob(EntityJungleDramcryx.class, "Jungle Dramcryx");		
		DivineRPGMobRegistry.registerDivineRPGMob(EntityCyclops.class, "Cyclops");		
	}
}
