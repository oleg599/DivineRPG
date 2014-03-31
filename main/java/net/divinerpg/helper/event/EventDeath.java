package net.divinerpg.helper.event;

import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.api.entity.EntityDivineRPGFlying;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDeath {

	@SubscribeEvent
	public void onMobDeath(LivingDeathEvent e){
		EntityPlayer p = (EntityPlayer)e.source.getSourceOfDamage();

		if(ConfigurationHelper.canShowDeathChat){
			if(e.source.getSourceOfDamage() instanceof EntityPlayer){	
				if(!(e.entity instanceof EntityDivineRPGMob) || !(e.entity instanceof EntityDivineRPGBoss))
				p.addChatComponentMessage(DivineAPI.addChatMessage(DivineAPI.AQUA + "[" + DivineAPI.BLUE + "DivineRPG" + DivineAPI.AQUA + "]" + " " + p.getDisplayName() + " Has Slain A " + getEntityName((EntityLiving)e.entityLiving)));
			}
		}
	}
	
	private String getEntityName(EntityLiving entity) {
		return EntityList.getEntityString(entity);
	}
}