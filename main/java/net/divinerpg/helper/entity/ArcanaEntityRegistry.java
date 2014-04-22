package net.divinerpg.helper.entity;

import net.divinerpg.entity.arcana.projectile.*;
import net.divinerpg.helper.DivineAPI;

public class ArcanaEntityRegistry {

	public static void init(){
		DivineAPI.registerProjectile(EntityStar.class, "Star");
		DivineAPI.registerProjectile(EntitySparkler.class, "Sparkler");

	}
}