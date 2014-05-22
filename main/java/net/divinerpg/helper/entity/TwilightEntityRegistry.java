package net.divinerpg.helper.entity;

import net.divinerpg.entity.twilight.EntityAngryBunny;
import net.divinerpg.entity.twilight.EntityApalachiaArcher;
import net.divinerpg.entity.twilight.EntityApalachiaCadillion;
import net.divinerpg.entity.twilight.EntityApalachiaGolem;
import net.divinerpg.entity.twilight.EntityApalachiaTomo;
import net.divinerpg.entity.twilight.EntityApalachiaWarrior;
import net.divinerpg.entity.twilight.EntityBaslisk;
import net.divinerpg.entity.twilight.EntityBunny;
import net.divinerpg.entity.twilight.EntityCadillion;
import net.divinerpg.entity.twilight.EntityCori;
import net.divinerpg.entity.twilight.EntityCori2;
import net.divinerpg.entity.twilight.EntityDensos;
import net.divinerpg.entity.twilight.EntityEdenTomo;
import net.divinerpg.entity.twilight.EntityKarot;
import net.divinerpg.entity.twilight.EntityMadivel;
import net.divinerpg.entity.twilight.EntityMoonWolf;
import net.divinerpg.entity.twilight.EntityMortumCadillion;
import net.divinerpg.entity.twilight.EntityMortumDemon;
import net.divinerpg.entity.twilight.EntityNesro;
import net.divinerpg.entity.twilight.EntityReyvor;
import net.divinerpg.entity.twilight.EntitySamek;
import net.divinerpg.entity.twilight.EntitySkythernArcher;
import net.divinerpg.entity.twilight.EntitySkythernFiend;
import net.divinerpg.entity.twilight.EntitySkythernGolem;
import net.divinerpg.entity.twilight.EntitySoulFiend;
import net.divinerpg.entity.twilight.EntitySoulStealer;
import net.divinerpg.entity.twilight.EntityTwilightDemon;
import net.divinerpg.entity.twilight.EntityVamacheron;
import net.divinerpg.entity.twilight.EntityVerek;
import net.divinerpg.entity.twilight.EntityWildWoodGolem;
import net.divinerpg.entity.twilight.EntityWildWoodTomo;
import net.divinerpg.entity.twilight.projectile.EntityApalachiaArrow;
import net.divinerpg.entity.twilight.projectile.EntityEdenArrow;
import net.divinerpg.entity.twilight.projectile.EntityHaliteArrow;
import net.divinerpg.entity.twilight.projectile.EntityMortumArrow;
import net.divinerpg.entity.twilight.projectile.EntityPhaserApalachia;
import net.divinerpg.entity.twilight.projectile.EntityPhaserEden;
import net.divinerpg.entity.twilight.projectile.EntityPhaserHalite;
import net.divinerpg.entity.twilight.projectile.EntityPhaserMortum;
import net.divinerpg.entity.twilight.projectile.EntityPhaserSkythern;
import net.divinerpg.entity.twilight.projectile.EntityPhaserWildWood;
import net.divinerpg.entity.twilight.projectile.EntitySkythernArrow;
import net.divinerpg.entity.twilight.projectile.EntitySlicerApalachia;
import net.divinerpg.entity.twilight.projectile.EntitySlicerEden;
import net.divinerpg.entity.twilight.projectile.EntitySlicerHalite;
import net.divinerpg.entity.twilight.projectile.EntitySlicerMortum;
import net.divinerpg.entity.twilight.projectile.EntitySlicerSkythern;
import net.divinerpg.entity.twilight.projectile.EntitySlicerWildWoods;
import net.divinerpg.entity.twilight.projectile.EntityWildArrow;
import net.divinerpg.helper.Util;

public class TwilightEntityRegistry {

	
	
	public static void init(){	
	    Util.registerProjectile(EntitySlicerEden.class, "edenSlicer");
	    Util.registerProjectile(EntitySlicerWildWoods.class, "wildSlicer");
        Util.registerProjectile(EntitySlicerApalachia.class, "apalachiaSlicer");
        Util.registerProjectile(EntitySlicerSkythern.class, "skythernSlicer");
        Util.registerProjectile(EntitySlicerMortum.class, "mortumSlicer");
        Util.registerProjectile(EntitySlicerHalite.class, "haliteSlicer");
        Util.registerProjectile(EntityPhaserEden.class, "edenPhaser");
        Util.registerProjectile(EntityPhaserWildWood.class, "wildPhaser");
        Util.registerProjectile(EntityPhaserApalachia.class, "apalachiaPhaser");
        Util.registerProjectile(EntityPhaserSkythern.class, "skythernPhaser");
        Util.registerProjectile(EntityPhaserMortum.class, "mortumPhaser");
        Util.registerProjectile(EntityPhaserHalite.class, "halitePhaser");
        
        Util.registerDivineRPGMob(EntityCadillion.class, "Cadillion", Util.mobID++);
        Util.registerDivineRPGMob(EntityEdenTomo.class, "Eden Tomo", Util.mobID++);
        Util.registerDivineRPGMob(EntityBunny.class, "Bunny", Util.mobID++);
        Util.registerDivineRPGMob(EntityAngryBunny.class, "Angry Bunny", Util.mobID++);
        Util.registerDivineRPGMob(EntityCori.class, "Eden Cori", Util.mobID++);
        Util.registerDivineRPGMob(EntityMadivel.class, "Madivel", Util.mobID++);
        Util.registerDivineRPGMob(EntityNesro.class, "Nesro", Util.mobID++);
        Util.registerDivineRPGMob(EntityWildWoodGolem.class, "WildWood Golem", Util.mobID++);
        Util.registerDivineRPGMob(EntityWildWoodTomo.class, "WildWood Tomo", Util.mobID++);
        Util.registerDivineRPGMob(EntityVerek.class, "Verek", Util.mobID++);
        Util.registerDivineRPGMob(EntityMoonWolf.class, "Moon Wolf", Util.mobID++);
        Util.registerDivineRPGMob(EntityApalachiaCadillion.class, "Apalachia Cadillion", Util.mobID++);
        Util.registerDivineRPGMob(EntityApalachiaTomo.class, "Apalachia Tomo", Util.mobID++);
        Util.registerDivineRPGMob(EntityApalachiaGolem.class, "Apalachia Golem", Util.mobID++);
        Util.registerDivineRPGMob(EntityApalachiaWarrior.class, "Enchant Warrior", Util.mobID++);
        Util.registerDivineRPGMob(EntitySkythernArcher.class, "Skythern Archer", Util.mobID++);
        Util.registerDivineRPGMob(EntityApalachiaArcher.class, "Twilight Archer", Util.mobID++);
        Util.registerDivineRPGMob(EntitySamek.class, "Samek", Util.mobID++);
        Util.registerDivineRPGMob(EntitySkythernGolem.class, "Skythern Golem", Util.mobID++);
        Util.registerDivineRPGMob(EntityCori2.class, "Skythern Cori", Util.mobID++);
        Util.registerDivineRPGMob(EntitySkythernFiend.class, "Skythern Fiend", Util.mobID++);
        Util.registerDivineRPGMob(EntityMortumCadillion.class, "Mortum Cadillion", Util.mobID++);
        Util.registerDivineRPGMob(EntityMortumDemon.class, "Mortum Demon", Util.mobID++);
        Util.registerDivineRPGMob(EntityBaslisk.class, "Baslisk", Util.mobID++);
        Util.registerDivineRPGMob(EntitySoulStealer.class, "Soul Stealer", Util.mobID++);
        Util.registerDivineRPGMob(EntityDensos.class, "Densos", Util.mobID++);
        Util.registerDivineRPGMob(EntityReyvor.class, "Reyvor", Util.mobID++);
        Util.registerDivineRPGMob(EntityTwilightDemon.class, "Twilight Demon", Util.mobID++);
        Util.registerDivineRPGMob(EntitySoulFiend.class, "Soul Fiend", Util.mobID++);
        Util.registerDivineRPGMob(EntityVamacheron.class, "Vamacheron", Util.mobID++);
        Util.registerDivineRPGMob(EntityKarot.class, "Karot", Util.mobID++);
        
        Util.registerProjectile(EntityEdenArrow.class, "Eden Arrow");
        Util.registerProjectile(EntityWildArrow.class, "Wild Arrow");
        Util.registerProjectile(EntityApalachiaArrow.class, "Apalachia Arrow");
        Util.registerProjectile(EntitySkythernArrow.class, "Skythern Arrow");
        Util.registerProjectile(EntityMortumArrow.class, "Mortum Arrow");
        Util.registerProjectile(EntityHaliteArrow.class, "Halite Arrow");
	}
}