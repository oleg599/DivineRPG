package net.divinerpg.client.render.entity;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.entity.iceika.projectile.EntityCarols;

public class IceikaEntityRenderer {

	private static EntityResourceLocation x;
	
	public static void init(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCarols.class, new RenderProjectile(x.music));
		
	}
}