package net.divinerpg.client.render.entity;

import net.divinerpg.api.entity.*;
import net.divinerpg.client.render.*;
import net.divinerpg.helper.items.*;
import net.divinerpg.twilight.entity.projectile.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	

	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerEden.class, new RenderIconProjectile(TwilightItems.edenSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerWildWoods.class, new RenderIconProjectile(TwilightItems.wildWoodSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerApalachia.class, new RenderIconProjectile(TwilightItems.apalachiaSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerSkythern.class, new RenderIconProjectile(TwilightItems.skythernSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMortum.class, new RenderIconProjectile(TwilightItems.mortumSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderIconProjectile(TwilightItems.haliteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzEden.class, new RenderBasicProjectile(EntityResourceLocation.blitzEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzWildWood.class, new RenderBasicProjectile(EntityResourceLocation.blitzWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAlapachia.class, new RenderBasicProjectile(EntityResourceLocation.blitzApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzSkythern.class, new RenderBasicProjectile(EntityResourceLocation.blitzSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMortum.class, new RenderBasicProjectile(EntityResourceLocation.blitzMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderBasicProjectile(EntityResourceLocation.blitzHalite));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserEden.class, new RenderBasicProjectile(EntityResourceLocation.phaserEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserWildWood.class, new RenderBasicProjectile(EntityResourceLocation.phaserWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserApalachia.class, new RenderBasicProjectile(EntityResourceLocation.phaserApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserSkythern.class, new RenderBasicProjectile(EntityResourceLocation.phaserSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMortum.class, new RenderBasicProjectile(EntityResourceLocation.phaserMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderBasicProjectile(EntityResourceLocation.phaserHalite));
        
        
	}
	
}
