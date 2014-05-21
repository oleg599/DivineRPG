package net.divinerpg.api.entity;

import net.divinerpg.Sounds;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public abstract class EntityDivineRPGBoss extends EntityMob implements IDivineRPGBoss{

	private static String name;
	
	public EntityDivineRPGBoss(World par1World) {
		super(par1World);
	}

	public double setMaxHP(double d){
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(d);
		return d;
	}

	public double setMoveSpeed(double d){
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(d);
		return d;
	}

	public double setAttackDamage(double d){
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(d);
		return d;
	}

	public double setFollowRange(double d){
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(d);
		return d;
	}

	public double setKnockbackResistance(double d){
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(d);
		return d;
	}

	public double getHP() {
		return getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
	} 

	public double getMoveSpeed() { 
		return getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();
	}

	public double getAttackDamage(){
		return getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
	}

	public double getFollowRange(){
		return getEntityAttribute(SharedMonsterAttributes.followRange).getAttributeValue();
	}

	public double getKnockbackResistance(){
		return getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue();
	}

	public abstract String mobName();

	public String setName(String name){
		return this.name = name;
	}
	
	public static String getName(){
		return name;
	}
	
	@Override
	public boolean canDespawn() {
		return false;	
	}
	
	@Override
	protected boolean isAIEnabled() {
		return true;
	}
	
	public String playSound(String sounds){
		return Sounds.playSound(sounds, worldObj, this);
	}

	public void onDeath(DamageSource d) {
		super.onDeath(d);
		if(!worldObj.isRemote && ConfigurationHelper.canShowDeathChat){
			if(d.getSourceOfDamage() != null && d.getSourceOfDamage() instanceof EntityPlayer){
				DivineAPI.sendMessageToAll(DivineAPI.AQUA + "[" + DivineAPI.BLUE + "DivineRPG" + DivineAPI.AQUA + "]" + " " + "The " + mobName() + " Has Fallen.");
			}
		}
	}
}
