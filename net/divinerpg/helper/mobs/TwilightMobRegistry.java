package net.divinerpg.helper.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.twilight.entity.mob.*;
import net.divinerpg.twilight.entity.projectile.*;

public class TwilightMobRegistry {

	public static void init(){
	    DivineAPI.registerProjectile(EntitySlicerEden.class, "edenSlicer");
	    DivineAPI.registerProjectile(EntitySlicerWildWoods.class, "wildSlicer");
        DivineAPI.registerProjectile(EntitySlicerApalachia.class, "apalachiaSlicer");
        DivineAPI.registerProjectile(EntitySlicerSkythern.class, "skythernSlicer");
        DivineAPI.registerProjectile(EntitySlicerMortum.class, "mortumSlicer");
        DivineAPI.registerProjectile(EntitySlicerHalite.class, "haliteSlicer");
        DivineAPI.registerProjectile(EntityPhaserEden.class, "edenPhaser");
        DivineAPI.registerProjectile(EntityPhaserWildWood.class, "wildPhaser");
        DivineAPI.registerProjectile(EntityPhaserApalachia.class, "apalachiaPhaser");
        DivineAPI.registerProjectile(EntityPhaserSkythern.class, "skythernPhaser");
        DivineAPI.registerProjectile(EntityPhaserMortum.class, "mortumPhaser");
        DivineAPI.registerProjectile(EntityPhaserHalite.class, "halitePhaser");
        
        DivineAPI.registerDivineRPGMob(EntityCadillion.class, "Cadillion");
        DivineAPI.registerDivineRPGMob(EntityEdenTomo.class, "Eden Tomo");
        DivineAPI.registerDivineRPGMob(EntityBunny.class, "Bunny");
        DivineAPI.registerDivineRPGMob(EntityAngryBunny.class, "Angry Bunny");
        DivineAPI.registerDivineRPGMob(EntityCori.class, "Eden Cori");
        DivineAPI.registerDivineRPGMob(EntityMadivel.class, "Madivel");
        DivineAPI.registerDivineRPGMob(EntityNesro.class, "Nesro");
        DivineAPI.registerDivineRPGMob(EntityWildWoodGolem.class, "WildWood Golem");
        DivineAPI.registerDivineRPGMob(EntityWildWoodTomo.class, "WildWood Tomo");
        DivineAPI.registerDivineRPGMob(EntityVerek.class, "Verek");
        DivineAPI.registerDivineRPGMob(EntityMoonWolf.class, "Moon Wolf");
        DivineAPI.registerDivineRPGMob(EntityApalachiaCadillion.class, "Apalachia Cadillion");
        DivineAPI.registerDivineRPGMob(EntityApalachiaTomo.class, "Apalachia Tomo");
        DivineAPI.registerDivineRPGMob(EntityApalachiaGolem.class, "Apalachia Golem");
        DivineAPI.registerDivineRPGMob(EntityApalachiaWarrior.class, "Enchant Warrior");
        DivineAPI.registerDivineRPGMob(EntitySkythernArcher.class, "Skythern Archer");
        DivineAPI.registerDivineRPGMob(EntityApalachiaArcher.class, "Twilight Archer");
        DivineAPI.registerDivineRPGMob(EntitySamek.class, "Samek");
        DivineAPI.registerDivineRPGMob(EntitySkythernGolem.class, "Skythern Golem");
        DivineAPI.registerDivineRPGMob(EntityCori2.class, "Skythern Cori");
        DivineAPI.registerDivineRPGMob(EntitySkythernFiend.class, "Skythern Fiend");
        DivineAPI.registerDivineRPGMob(EntityMortumCadillion.class, "Mortum Cadillion");
        DivineAPI.registerDivineRPGMob(EntityMortumDemon.class, "Mortum Demon");
        DivineAPI.registerDivineRPGMob(EntityBaslisk.class, "Baslisk");
        DivineAPI.registerDivineRPGMob(EntitySoulStealer.class, "Soul Stealer");
        DivineAPI.registerDivineRPGMob(EntityDensos.class, "Densos");
        DivineAPI.registerDivineRPGMob(EntityReyvor.class, "Reyvor");
        DivineAPI.registerDivineRPGMob(EntityTwilightDemon.class, "Twilight Demon");
        DivineAPI.registerDivineRPGMob(EntitySoulFiend.class, "Soul Fiend");
        DivineAPI.registerDivineRPGMob(EntityVamacheron.class, "Vamacheron");
        DivineAPI.registerDivineRPGMob(EntityKarot.class, "Karot");
	}
}