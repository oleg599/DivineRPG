package net.divinerpg.vanilla.entity.mobs;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityJungleDramcryx extends EntityDivineRPGMob {
	
	public EntityJungleDramcryx(World par1World) {
		super(par1World);
	}

	protected String getLivingSound() {
		return playSound(Sounds.dramcryx);
	}

	protected String getHurtSound() {
		return playSound(Sounds.dramcryxHurt);
	}

	protected String getDeathSound() {
		return playSound(Sounds.dramcryxHurt);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(19.0D);
	}

	protected Item getDropItem() {
		return VanillaItemsOther.jungleShards;
	}

	@Override
	protected boolean isValidLightLevel() {
		return true;
	}

	@Override
	public String mobName() {
		return "Jungle Dramcryx";
	}
}
