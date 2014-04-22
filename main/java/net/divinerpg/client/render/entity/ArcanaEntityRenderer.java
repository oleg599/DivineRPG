package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.*;
import net.divinerpg.client.render.entity.arcana.*;
import net.divinerpg.entity.arcana.projectile.*;
import cpw.mods.fml.client.registry.*;

public class ArcanaEntityRenderer {

	private static EntityResourceLocation x;
	
	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityStar.class, new RenderStarlight(x.starlight));
		RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderProjectile(x.sparkler));
	}	
}