package net.divinerpg.helper.entity;

import net.divinerpg.entity.arcana.projectile.*;
import net.divinerpg.helper.Util;

public class ArcanaEntityRegistry {

	public static void init(){
		Util.registerProjectile(EntityStar.class, "Star");
		Util.registerProjectile(EntitySparkler.class, "Sparkler");

	}
}