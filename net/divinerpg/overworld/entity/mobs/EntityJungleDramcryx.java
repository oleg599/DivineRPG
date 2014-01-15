package net.divinerpg.overworld.entity.mobs;

import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityJungleDramcryx extends EntityMob {
	
	public EntityJungleDramcryx(World par1World) {
		super(par1World);
	}

	protected String getLivingSound() {
		return "";
	}

	protected String getHurtSound() {
		return "";
	}

	protected String getDeathSound() {
		return "";
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(19.0D);
	}

	protected Item func_146068_u() {
		return OverworldItems.jungleShards;
	}

	@Override
	protected boolean isValidLightLevel() {
		return true;
	}
}
