package net.divinerpg.helper.entity;

import net.divinerpg.entity.iceika.EntityAlicanto;
import net.divinerpg.entity.iceika.EntityFractite;
import net.divinerpg.entity.iceika.EntityFrostArcher;
import net.divinerpg.entity.iceika.EntityGlacide;
import net.divinerpg.entity.iceika.EntityHastreus;
import net.divinerpg.entity.iceika.EntityRollum;
import net.divinerpg.entity.iceika.EntityWorkshopMerchant;
import net.divinerpg.entity.iceika.EntityWorkshopTickerer;
import net.divinerpg.entity.iceika.projectile.EntityCarol;
import net.divinerpg.entity.iceika.projectile.EntityFrostclaw;
import net.divinerpg.entity.iceika.projectile.EntityMusic;
import net.divinerpg.helper.DivineAPI;

public class IceikaEntityRegistry {

	public static void init() {
		DivineAPI.registerProjectile(EntityCarol.class, "Carol");
		DivineAPI.registerProjectile(EntityMusic.class, "Music");
		DivineAPI.registerProjectile(EntityFrostclaw.class, "Frostclaw");
		
		DivineAPI.registerDivineRPGMob(EntityAlicanto.class, "Alicanto", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityFractite.class, "Fractite", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityGlacide.class, "Glacide", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityHastreus.class, "Hastreus", DivineAPI.mobID++);
		DivineAPI.registerDivineRPGMob(EntityFrostArcher.class, "Frost Archer", DivineAPI.mobID++);
        DivineAPI.registerDivineRPGMob(EntityRollum.class, "Rollum", DivineAPI.mobID++);
        DivineAPI.registerDivineRPGMob(EntityWorkshopTickerer.class, "Workshop Tinkerer", DivineAPI.mobID++);
        DivineAPI.registerDivineRPGMob(EntityWorkshopMerchant.class, "Workshop Merchant", DivineAPI.mobID++);
	}
	
}
