package net.divinerpg.client.render.entity;

import net.divinerpg.api.entity.EntitySlicer;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderBasicProjectile;
import net.divinerpg.client.render.RenderIconProjectile;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.twilight.entity.projectile.EntityBlitzAlapachia;
import net.divinerpg.twilight.entity.projectile.EntityBlitzEden;
import net.divinerpg.twilight.entity.projectile.EntityBlitzHalite;
import net.divinerpg.twilight.entity.projectile.EntityBlitzMortum;
import net.divinerpg.twilight.entity.projectile.EntityBlitzSkythern;
import net.divinerpg.twilight.entity.projectile.EntityBlitzWildWood;
import net.divinerpg.twilight.entity.projectile.EntityPhaserApalachia;
import net.divinerpg.twilight.entity.projectile.EntityPhaserEden;
import net.divinerpg.twilight.entity.projectile.EntityPhaserHalite;
import net.divinerpg.twilight.entity.projectile.EntityPhaserMortum;
import net.divinerpg.twilight.entity.projectile.EntityPhaserSkythern;
import net.divinerpg.twilight.entity.projectile.EntityPhaserWildWood;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	

	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderIconProjectile(TwilightItems.edenSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderIconProjectile(TwilightItems.wildWoodSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderIconProjectile(TwilightItems.apalachiaSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderIconProjectile(TwilightItems.skythernSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderIconProjectile(TwilightItems.mortumSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicer.class, new RenderIconProjectile(TwilightItems.haliteSlicer));
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
