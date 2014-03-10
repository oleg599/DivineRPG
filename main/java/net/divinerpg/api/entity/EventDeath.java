package net.divinerpg.api.entity;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDeath {

	@SubscribeEvent
	public void onMobDeath(LivingDeathEvent e){
		String player = Minecraft.getMinecraft().thePlayer.getDisplayName();
		if(ConfigurationHelper.canShowDeathChat){
			if(e.source.getSourceOfDamage() instanceof EntityPlayer){
				if(e.entity instanceof EntityCreeper){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Creeper");
				}
				if(e.entity instanceof EntityDragon){
					DivineAPI.addChatMessage(EnumChatFormatting.BLUE, player + "Has Slain The Ender Dragon");
				}
				if(e.entity instanceof EntityWither){
					DivineAPI.addChatMessage(EnumChatFormatting.BLUE, player + "Has Slain The Wither");
				}
				if(e.entity instanceof EntityBlaze){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Blaze");
				}
				if(e.entity instanceof EntityCaveSpider){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Cave Spider");
				}
				if(e.entity instanceof EntityGhast){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Ghast");
				}
				if(e.entity instanceof EntityGolem){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Golem");
				}
				if(e.entity instanceof EntityIronGolem){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Iron");
				}
				if(e.entity instanceof EntityMagmaCube){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Magma Cube");
				}
				if(e.entity instanceof EntityPigZombie){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Zombie Pigman");
				}
				if(e.entity instanceof EntitySilverfish){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Silverfish");
				}
				if(e.entity instanceof EntitySkeleton){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Skeleton");
				}
				if(e.entity instanceof EntitySlime){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Slime");
				}
				if(e.entity instanceof EntitySnowman){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Snowman");
				}
				if(e.entity instanceof EntitySpider){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Spider");
				}
				if(e.entity instanceof EntityWitch){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Witch");
				}
				if(e.entity instanceof EntityZombie){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Zombie");
				}
				if(e.entity instanceof EntityBat){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Bat");
				}
				if(e.entity instanceof EntityChicken){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Chicken");
				}
				if(e.entity instanceof EntityCow){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Cow");
				}
				if(e.entity instanceof EntityHorse){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Horse");
				}
				if(e.entity instanceof EntityMooshroom){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Mooshroom");
				}
				if(e.entity instanceof EntityOcelot){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Ocelot");
				}
				if(e.entity instanceof EntityPig){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Pig");
				}
				if(e.entity instanceof EntitySquid){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Squid");
				}
				if(e.entity instanceof EntityVillager){
					DivineAPI.addChatMessage(EnumChatFormatting.DARK_BLUE, player + "Has Slain A Villager");
				}		
			}
		}
	}
}