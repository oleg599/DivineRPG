package net.divinerpg.helper.entity;

import net.divinerpg.entity.arcana.projectile.*;
import net.divinerpg.helper.DivineAPI;

public class ArcanaEntityRegistry {

	public static void init(){
		DivineAPI.registerProjectile(EntityStarlight.class, "Starlight");
		DivineAPI.registerProjectile(EntitySparkler.class, "Sparkler");

	}
}