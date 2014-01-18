package net.divinerpg.helper.mobs;

import net.divinerpg.api.entity.EntitySlicer;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.twilight.entity.projectile.EntityPhaserApalachia;
import net.divinerpg.twilight.entity.projectile.EntityPhaserEden;
import net.divinerpg.twilight.entity.projectile.EntityPhaserHalite;
import net.divinerpg.twilight.entity.projectile.EntityPhaserMortum;
import net.divinerpg.twilight.entity.projectile.EntityPhaserSkythern;
import net.divinerpg.twilight.entity.projectile.EntityPhaserWildWood;

public class TwilightMobRegistry {

	public static void init(){
	    DivineAPI.registerProjectile(EntitySlicer.class, "edenSlicer");
	    DivineAPI.registerProjectile(EntitySlicer.class, "wildSlicer");
        DivineAPI.registerProjectile(EntitySlicer.class, "apalachiaSlicer");
        DivineAPI.registerProjectile(EntitySlicer.class, "skythernSlicer");
        DivineAPI.registerProjectile(EntitySlicer.class, "mortumSlicer");
        DivineAPI.registerProjectile(EntitySlicer.class, "haliteSlicer");
        DivineAPI.registerProjectile(EntityPhaserEden.class, "edenPhaser");
        DivineAPI.registerProjectile(EntityPhaserWildWood.class, "wildPhaser");
        DivineAPI.registerProjectile(EntityPhaserApalachia.class, "apalachiaPhaser");
        DivineAPI.registerProjectile(EntityPhaserSkythern.class, "skythernPhaser");
        DivineAPI.registerProjectile(EntityPhaserMortum.class, "mortumPhaser");
        DivineAPI.registerProjectile(EntityPhaserHalite.class, "halitePhaser");
	}
}