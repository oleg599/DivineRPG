package net.divinerpg.helper.mobs;

import net.divinerpg.helper.*;
import net.divinerpg.twilight.entity.projectile.*;

public class TwilightMobRegistry {

	public static void init(){
	    DivineAPI.registerProjectile(EntitySlicerEden.class, "edenSlicer");
	    DivineAPI.registerProjectile(EntitySlicerWildWood.class, "wildSlicer");
        DivineAPI.registerProjectile(EntitySlicerAlapachia.class, "apalachiaSlicer");
        DivineAPI.registerProjectile(EntitySlicerSkythern.class, "skythernSlicer");
        DivineAPI.registerProjectile(EntitySlicerMortum.class, "mortumSlicer");
        DivineAPI.registerProjectile(EntitySlicerHalite.class, "haliteSlicer");
        DivineAPI.registerProjectile(EntityPhaserEden.class, "edenPhaser");
        DivineAPI.registerProjectile(EntityPhaserWildWood.class, "wildPhaser");
        DivineAPI.registerProjectile(EntityPhaserApalachia.class, "apalachiaPhaser");
        DivineAPI.registerProjectile(EntityPhaserSkythern.class, "skythernPhaser");
        DivineAPI.registerProjectile(EntityPhaserMortum.class, "mortumPhaser");
        DivineAPI.registerProjectile(EntityPhaserHalite.class, "halitePhaser");
	}
}