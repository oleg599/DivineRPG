package net.divinerpg.helper.entity;

import net.divinerpg.entity.iceika.projectile.EntityMusic;
import net.divinerpg.helper.DivineAPI;

public class IceikaEntityRegistry {

	public static void init(){
		
		DivineAPI.registerProjectile(EntityMusic.class, "Music");
		
	}
	
}
