package net.divinerpg.client.render.entity;

import net.divinerpg.Reference;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderBasicProjectile;
import net.divinerpg.client.render.RenderIconProjectile;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.twilight.entity.projectile.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	
	static EntityResourceLocation x;

	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerEden.class, new RenderIconProjectile(TwilightItems.edenSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerWildWood.class, new RenderIconProjectile(TwilightItems.wildWoodSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAlapachia.class, new RenderIconProjectile(TwilightItems.apalachiaSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerSkythern.class, new RenderIconProjectile(TwilightItems.skythernSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMortum.class, new RenderIconProjectile(TwilightItems.mortumSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderIconProjectile(TwilightItems.haliteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzEden.class, new RenderBasicProjectile(x.BlitzEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzWildWood.class, new RenderBasicProjectile(x.BlitzWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAlapachia.class, new RenderBasicProjectile(x.BlitzApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzSkythern.class, new RenderBasicProjectile(x.BlitzSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMortum.class, new RenderBasicProjectile(x.BlitzMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderBasicProjectile(x.BlitzHalite));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserEden.class, new RenderBasicProjectile(x.PhaserEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserWildWood.class, new RenderBasicProjectile(x.PhaserWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserApalachia.class, new RenderBasicProjectile(x.PhaserApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserSkythern.class, new RenderBasicProjectile(x.PhaserSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMortum.class, new RenderBasicProjectile(x.PhaserMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderBasicProjectile(x.PhaserHalite));
        
        
	}
	
}
