package net.divinerpg.helper.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.vethea.entity.projectile.EntityAmthirmisDisk;
import net.divinerpg.vethea.entity.projectile.EntityArksianeDisk;
import net.divinerpg.vethea.entity.projectile.EntityBouncingProjectile;
import net.divinerpg.vethea.entity.projectile.EntityCermileDisk;
import net.divinerpg.vethea.entity.projectile.EntityDarvenDisk;
import net.divinerpg.vethea.entity.projectile.EntityEvernightProjectile;
import net.divinerpg.vethea.entity.projectile.EntityEversightProjectile;
import net.divinerpg.vethea.entity.projectile.EntityHeliosisDisk;
import net.divinerpg.vethea.entity.projectile.EntityKarosDisk;
import net.divinerpg.vethea.entity.projectile.EntityPardimalDisk;
import net.divinerpg.vethea.entity.projectile.EntityQuadroticDisk;
import net.divinerpg.vethea.entity.projectile.EntityTeakerDisk;
import net.divinerpg.vethea.entity.projectile.EntityVetheanCannonEversight;
import net.divinerpg.vethea.entity.projectile.EntityVetheanCannonShot;

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