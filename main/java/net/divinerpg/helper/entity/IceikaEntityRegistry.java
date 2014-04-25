package net.divinerpg.helper.entity;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.entity.iceika.projectile.EntityCarols;
import net.divinerpg.entity.vanilla.projectile.EntityModSnowball;
import net.divinerpg.helper.DivineAPI;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaEntityRegistry {

	public static void init(){
		
		DivineAPI.registerProjectile(EntityModSnowball.class, "Snowball");
		
	}
	
}
