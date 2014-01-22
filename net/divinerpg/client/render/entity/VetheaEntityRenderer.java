package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.*;
import net.divinerpg.helper.items.*;
import net.divinerpg.vethea.entity.*;
import cpw.mods.fml.client.registry.*;

public class VetheaEntityRenderer {

	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityAmthirmisDisk.class, new RenderIconProjectile(VetheanItems.amthrimisDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityArksianeDisk.class, new RenderIconProjectile(VetheanItems.arksianeDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityCermileDisk.class, new RenderIconProjectile(VetheanItems.cermileDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarvenDisk.class, new RenderIconProjectile(VetheanItems.darvenDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeliosisDisk.class, new RenderIconProjectile(VetheanItems.heliosisDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityKarosDisk.class, new RenderIconProjectile(VetheanItems.karosDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityPardimalDisk.class, new RenderIconProjectile(VetheanItems.pardimalDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityQuadroticDisk.class, new RenderIconProjectile(VetheanItems.quadroticDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityTeakerDisk.class, new RenderIconProjectile(VetheanItems.teakerDisk));

		RenderingRegistry.registerEntityRenderingHandler(EntityBouncingProjectile.class, new RenderProjectile(EntityResourceLocation.staffProjectile));
		RenderingRegistry.registerEntityRenderingHandler(EntityEvernightProjectile.class, new RenderProjectile(EntityResourceLocation.evernight));
		RenderingRegistry.registerEntityRenderingHandler(EntityVetheanCannonShot.class, new RenderProjectile(EntityResourceLocation.cannon));
		RenderingRegistry.registerEntityRenderingHandler(EntityVetheanCannonEversight.class, new RenderProjectile(EntityResourceLocation.eversightCannon));
		RenderingRegistry.registerEntityRenderingHandler(EntityEversightProjectile.class, new RenderProjectile(EntityResourceLocation.eversight));
	}
}