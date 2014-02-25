package divinerpg.client.render.entity;

import cpw.mods.fml.client.registry.RenderingRegistry;
import divinerpg.client.render.EntityResourceLocation;
import divinerpg.client.render.RenderIconProjectile;
import divinerpg.client.render.RenderProjectile;
import divinerpg.helper.items.VetheanItems;
import divinerpg.vethea.entity.projectile.EntityAmthirmisDisk;
import divinerpg.vethea.entity.projectile.EntityArksianeDisk;
import divinerpg.vethea.entity.projectile.EntityBouncingProjectile;
import divinerpg.vethea.entity.projectile.EntityCermileDisk;
import divinerpg.vethea.entity.projectile.EntityDarvenDisk;
import divinerpg.vethea.entity.projectile.EntityEvernightProjectile;
import divinerpg.vethea.entity.projectile.EntityEversightProjectile;
import divinerpg.vethea.entity.projectile.EntityHeliosisDisk;
import divinerpg.vethea.entity.projectile.EntityKarosDisk;
import divinerpg.vethea.entity.projectile.EntityPardimalDisk;
import divinerpg.vethea.entity.projectile.EntityQuadroticDisk;
import divinerpg.vethea.entity.projectile.EntityTeakerDisk;
import divinerpg.vethea.entity.projectile.EntityVetheanCannonEversight;
import divinerpg.vethea.entity.projectile.EntityVetheanCannonShot;

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