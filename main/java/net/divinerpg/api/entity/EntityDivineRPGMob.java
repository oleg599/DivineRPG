package net.divinerpg.api.entity;

import net.divinerpg.Sounds;
import net.divinerpg.entity.vethea.EntityTwins;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.event.EventDeath;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public abstract class EntityDivineRPGMob extends EntityMob{

	public EntityDivineRPGMob(World par1World) {
		super(par1World);
	}

	public void setMaxHP(double d){getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);}

	public void setMoveSpeed(double d){getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);}

	public void setAttackDamage(double d){getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(13.0D);}

	public void setFollowRange(double d){getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);}

	public void setKnockbackResistance(double d){getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(100.0D);}

	public void getHP(){getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();}

	public void getMoveSpeed(){getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();}

	public void getAttackDamage(){getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();}

	public void getFollowRange(){getEntityAttribute(SharedMonsterAttributes.followRange).getAttributeValue();}

	public void getKnockbackResistance(){getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue();}

	public abstract String mobName();	
	
	public String playSound(String sounds){
		return Sounds.playSound(sounds, worldObj, this);
	}
	
	@Override
	protected boolean isAIEnabled() {
		return true;
	}

	/*public void onDeath(DamageSource d) {
		super.onDeath(d);
		EntityPlayer p = (EntityPlayer)d.getSourceOfDamage();
		if(!worldObj.isRemote && ConfigurationHelper.canShowDeathChat){
			if(!(d.getSourceOfDamage() instanceof EntityThrowable) && d.getSourceOfDamage() != null && d.getSourceOfDamage() instanceof EntityPlayer){
				DivineAPI.sendMessageToAll(DivineAPI.AQUA + "[" + DivineAPI.BLUE + "DivineRPG" + DivineAPI.AQUA + "]" + " " + p.getDisplayName() + " has slain a " + mobName() + ".");
			}
		
		if(d.getEntity() instanceof EntityTwins){
				if(!(d.getSourceOfDamage() instanceof EntityThrowable) && d.getSourceOfDamage() != null && d.getSourceOfDamage() instanceof EntityPlayer){
					DivineAPI.sendMessageToAll(DivineAPI.AQUA + "[" + DivineAPI.BLUE + "DivineRPG" + DivineAPI.AQUA + "]" + " " + p.getDisplayName() + " has slain the " + mobName() + ".");
				}
			}
		}
	}*/
}