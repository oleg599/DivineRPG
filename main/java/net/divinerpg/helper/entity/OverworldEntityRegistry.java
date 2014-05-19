package net.divinerpg.helper.entity;

import net.divinerpg.entity.vanilla.EntityAncientEntity;
import net.divinerpg.entity.vanilla.EntityAridWarrior;
import net.divinerpg.entity.vanilla.EntityAyeracoBlue;
import net.divinerpg.entity.vanilla.EntityAyeracoGreen;
import net.divinerpg.entity.vanilla.EntityAyeracoPurple;
import net.divinerpg.entity.vanilla.EntityAyeracoRed;
import net.divinerpg.entity.vanilla.EntityAyeracoYellow;
import net.divinerpg.entity.vanilla.EntityBabyCrab;
import net.divinerpg.entity.vanilla.EntityCaveCrawler;
import net.divinerpg.entity.vanilla.EntityCaveclops;
import net.divinerpg.entity.vanilla.EntityCorruptedDramcryx;
import net.divinerpg.entity.vanilla.EntityCrab;
import net.divinerpg.entity.vanilla.EntityCyclops;
import net.divinerpg.entity.vanilla.EntityDesertCrawler;
import net.divinerpg.entity.vanilla.EntityEnderSpider;
import net.divinerpg.entity.vanilla.EntityEnderTriplets;
import net.divinerpg.entity.vanilla.EntityEnderWatcher;
import net.divinerpg.entity.vanilla.EntityFrost;
import net.divinerpg.entity.vanilla.EntityGlacon;
import net.divinerpg.entity.vanilla.EntityHellSpider;
import net.divinerpg.entity.vanilla.EntityIceMan;
import net.divinerpg.entity.vanilla.EntityJungleDramcryx;
import net.divinerpg.entity.vanilla.EntityKingCrab;
import net.divinerpg.entity.vanilla.EntityKingOfScorchers;
import net.divinerpg.entity.vanilla.EntityMiner;
import net.divinerpg.entity.vanilla.EntityNetherWatcher;
import net.divinerpg.entity.vanilla.EntityRainbour;
import net.divinerpg.entity.vanilla.EntityRotatick;
import net.divinerpg.entity.vanilla.EntityScorcher;
import net.divinerpg.entity.vanilla.EntityShark;
import net.divinerpg.entity.vanilla.EntityTheEye;
import net.divinerpg.entity.vanilla.EntityWhale;
import net.divinerpg.entity.vanilla.EntityWildFire;
import net.divinerpg.entity.vanilla.projectile.EntityDeath;
import net.divinerpg.entity.vanilla.projectile.EntityModSnowball;
import net.divinerpg.entity.vanilla.projectile.EntityScythe;
import net.divinerpg.entity.vanilla.projectile.EntityShuriken;
import net.divinerpg.entity.vanilla.projectile.EntityVileStorm;
import net.divinerpg.helper.DivineAPI;

public class OverworldEntityRegistry {

	public static void init(){
		DivineAPI.registerProjectile(EntityScythe.class, "Scythe");
		DivineAPI.registerProjectile(EntityShuriken.class, "Shuriken");
		DivineAPI.registerProjectile(EntityVileStorm.class, "Vile Storm");
		DivineAPI.registerProjectile(EntityModSnowball.class, "Snowball");
		DivineAPI.registerProjectile(EntityDeath.class, "Death");

		DivineAPI.registerDivineRPGMob(EntityEnderWatcher.class, "Ender Watcher", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityCrab.class, "Crab", DivineAPI.mobID++);	
		DivineAPI.registerDivineRPGMob(EntityBabyCrab.class, "Baby Crab", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityMiner.class, "Un Dead Miner", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityKingCrab.class, "King Crab", DivineAPI.mobID++);	
		DivineAPI.registerDivineRPGMob(EntityDesertCrawler.class, "Desert Crawler", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityCaveCrawler.class, "Cave Crawler", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityJungleDramcryx.class, "Jungle Dramcryx", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityCyclops.class, "Cyclops", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityCaveclops.class, "Caveclops", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityAncientEntity.class, "Ancient Entity", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityWhale.class, "Whale", DivineAPI.mobID++);	
		DivineAPI.registerDivineRPGMob(EntityHellSpider.class, "Hell Spider", DivineAPI.mobID++);	
		DivineAPI.registerDivineRPGMob(EntityScorcher.class, "Scorhcer", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityEnderSpider.class, "Ender Spider", DivineAPI.mobID++);		
		DivineAPI.registerDivineRPGMob(EntityEnderTriplets.class, "Ender Triplets", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityAridWarrior.class, "Arid Warrior", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityAyeracoBlue.class, "Ayeraco Blue", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityAyeracoGreen.class, "Ayeraco Green", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityAyeracoPurple.class, "Ayeraco Purple", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityAyeracoRed.class, "Ayeraco Red", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityAyeracoYellow.class, "Ayeraco Yellow", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityCorruptedDramcryx.class, "Corrupted Dramcryx", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityTheEye.class, "The Eye", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityFrost.class, "Frost", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityIceMan.class, "Ice Man", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityKingOfScorchers.class, "King Of Scorchers", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityRainbour.class, "Rainbour", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityRotatick.class, "Rotatick", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityShark.class, "Shark", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityNetherWatcher.class, "The Watcher", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityWildFire.class, "Wild Fire", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityGlacon.class, "Glacon", DivineAPI.mobID++);
	}
}
