package divinerpg.helper.mobs;

import divinerpg.helper.DivineAPI;
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

public class VetheaMobRegistry {

	public static void init(){
		DivineAPI.registerProjectile(EntityAmthirmisDisk.class, "Amthirmis Disk");
		DivineAPI.registerProjectile(EntityArksianeDisk.class, "Arksiane Disk");
		DivineAPI.registerProjectile(EntityCermileDisk.class, "Cermile Disk");
		DivineAPI.registerProjectile(EntityDarvenDisk.class, "Darven Disk");
		DivineAPI.registerProjectile(EntityHeliosisDisk.class, "Heliosis Disk");
		DivineAPI.registerProjectile(EntityKarosDisk.class, "Karos Disk");
		DivineAPI.registerProjectile(EntityPardimalDisk.class, "Pardimal Disk");
		DivineAPI.registerProjectile(EntityQuadroticDisk.class, "Quadrotic Disk");
		DivineAPI.registerProjectile(EntityTeakerDisk.class, "Teaker Disk");
		
		DivineAPI.registerProjectile(EntityBouncingProjectile.class, "Staff");
		DivineAPI.registerProjectile(EntityEvernightProjectile.class, "Evernight");
		DivineAPI.registerProjectile(EntityVetheanCannonShot.class, "Cannon");
		DivineAPI.registerProjectile(EntityVetheanCannonEversight.class, "Cannon Eversight");
		DivineAPI.registerProjectile(EntityEversightProjectile.class, "Eversight");
	}
}