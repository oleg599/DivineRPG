package net.divinerpg.helper.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.vethea.entity.*;

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