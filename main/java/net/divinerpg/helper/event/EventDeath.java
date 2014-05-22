package net.divinerpg.helper.event;

import net.divinerpg.helper.Util;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDeath {

	@SubscribeEvent
	public void onMobDeath(LivingDeathEvent e){
		EntityPlayer p = (EntityPlayer)e.source.getSourceOfDamage();

		if(ConfigurationHelper.canShowVanillaDeathChat){
			if(e.source.getSourceOfDamage() instanceof EntityPlayer){	
				if((e.entity instanceof EntityZombie) || (e.entity instanceof EntityCreeper) || (e.entity instanceof EntityWitch) || (e.entity instanceof EntityBlaze) || (e.entity instanceof EntityMagmaCube) || (e.entity instanceof EntitySilverfish) || (e.entity instanceof EntityCaveSpider) || (e.entity instanceof EntityEnderman) || (e.entity instanceof EntityPigZombie) || (e.entity instanceof EntityGhast) || (e.entity instanceof EntitySlime) || (e.entity instanceof EntitySpider) || (e.entity instanceof EntitySkeleton)) {
					Util.sendMessageToAll(Util.AQUA + "[" + Util.BLUE + "DivineRPG" + Util.AQUA + "]" + " " + p.getDisplayName() + " has slain a " + getEntityName((EntityLiving)e.entityLiving));
				}
			}
		}
	}
	
	private String getEntityName(EntityLiving entity) {
		return EntityList.getEntityString(entity);
	}
}