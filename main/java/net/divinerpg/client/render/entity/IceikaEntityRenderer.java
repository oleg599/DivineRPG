package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.entity.iceika.projectile.EntityMusic;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaEntityRenderer {

	private static EntityResourceLocation x;
	
	public static void init(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMusic.class, new RenderProjectile(x.music));
		
	}
}