package divinerpg.api.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import divinerpg.helper.DivineAPI;
import divinerpg.helper.config.ConfigurationHelper;

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
	
	public void onDeath(DamageSource d) {
		EntityPlayer p = Minecraft.getMinecraft().thePlayer;
		if(ConfigurationHelper.canShowDeathChat){
			p.addChatComponentMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_AQUA, p.getDisplayName() + " Has Slain A " + mobName() + "."));
		}
	}
}
