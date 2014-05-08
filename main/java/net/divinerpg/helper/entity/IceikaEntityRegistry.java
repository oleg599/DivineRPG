package net.divinerpg.helper.entity;

import net.divinerpg.entity.iceika.projectile.EntityCarol;
import net.divinerpg.entity.iceika.projectile.EntityMusic;
import net.divinerpg.helper.DivineAPI;

public class IceikaEntityRegistry {

	public static void init() {
		DivineAPI.registerProjectile(EntityCarol.class, "Carol");
		DivineAPI.registerProjectile(EntityMusic.class, "Music");
	}
	
}
