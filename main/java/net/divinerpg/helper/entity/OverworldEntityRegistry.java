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
import net.divinerpg.helper.Util;

public class OverworldEntityRegistry {

	public static void init(){
		Util.registerProjectile(EntityScythe.class, "Scythe");
		Util.registerProjectile(EntityShuriken.class, "Shuriken");
		Util.registerProjectile(EntityVileStorm.class, "Vile Storm");
		Util.registerProjectile(EntityModSnowball.class, "Snowball");
		Util.registerProjectile(EntityDeath.class, "Death");

		Util.registerDivineRPGMob(EntityEnderWatcher.class, "Ender Watcher", Util.mobID++);		
		Util.registerDivineRPGMob(EntityCrab.class, "Crab", Util.mobID++);	
		Util.registerDivineRPGMob(EntityBabyCrab.class, "Baby Crab", Util.mobID++);
		Util.registerDivineRPGMob(EntityMiner.class, "Un Dead Miner", Util.mobID++);		
		Util.registerDivineRPGMob(EntityKingCrab.class, "King Crab", Util.mobID++);	
		Util.registerDivineRPGMob(EntityDesertCrawler.class, "Desert Crawler", Util.mobID++);		
		Util.registerDivineRPGMob(EntityCaveCrawler.class, "Cave Crawler", Util.mobID++);		
		Util.registerDivineRPGMob(EntityJungleDramcryx.class, "Jungle Dramcryx", Util.mobID++);		
		Util.registerDivineRPGMob(EntityCyclops.class, "Cyclops", Util.mobID++);		
		Util.registerDivineRPGMob(EntityCaveclops.class, "Caveclops", Util.mobID++);		
		Util.registerDivineRPGMob(EntityAncientEntity.class, "Ancient Entity", Util.mobID++);		
		Util.registerDivineRPGMob(EntityWhale.class, "Whale", Util.mobID++);	
		Util.registerDivineRPGMob(EntityHellSpider.class, "Hell Spider", Util.mobID++);	
		Util.registerDivineRPGMob(EntityScorcher.class, "Scorhcer", Util.mobID++);		
		Util.registerDivineRPGMob(EntityEnderSpider.class, "Ender Spider", Util.mobID++);		
		Util.registerDivineRPGMob(EntityEnderTriplets.class, "Ender Triplets", Util.mobID++);
		Util.registerDivineRPGMob(EntityAridWarrior.class, "Arid Warrior", Util.mobID++);
		Util.registerDivineRPGMob(EntityAyeracoBlue.class, "Ayeraco Blue", Util.mobID++);
		Util.registerDivineRPGMob(EntityAyeracoGreen.class, "Ayeraco Green", Util.mobID++);
		Util.registerDivineRPGMob(EntityAyeracoPurple.class, "Ayeraco Purple", Util.mobID++);
		Util.registerDivineRPGMob(EntityAyeracoRed.class, "Ayeraco Red", Util.mobID++);
		Util.registerDivineRPGMob(EntityAyeracoYellow.class, "Ayeraco Yellow", Util.mobID++);
		Util.registerDivineRPGMob(EntityCorruptedDramcryx.class, "Corrupted Dramcryx", Util.mobID++);
		Util.registerDivineRPGMob(EntityTheEye.class, "The Eye", Util.mobID++);
		Util.registerDivineRPGMob(EntityFrost.class, "Frost", Util.mobID++);
		Util.registerDivineRPGMob(EntityIceMan.class, "Ice Man", Util.mobID++);
		Util.registerDivineRPGMob(EntityKingOfScorchers.class, "King Of Scorchers", Util.mobID++);
		Util.registerDivineRPGMob(EntityRainbour.class, "Rainbour", Util.mobID++);
		Util.registerDivineRPGMob(EntityRotatick.class, "Rotatick", Util.mobID++);
		Util.registerDivineRPGMob(EntityShark.class, "Shark", Util.mobID++);
		Util.registerDivineRPGMob(EntityNetherWatcher.class, "The Watcher", Util.mobID++);
		Util.registerDivineRPGMob(EntityWildFire.class, "Wild Fire", Util.mobID++);
		Util.registerDivineRPGMob(EntityGlacon.class, "Glacon", Util.mobID++);
	}
}
