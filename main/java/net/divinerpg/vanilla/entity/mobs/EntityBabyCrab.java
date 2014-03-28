package net.divinerpg.vanilla.entity.mobs;

import java.util.List;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBabyCrab extends EntityDivineRPGMob {
	
	private int angerLevel = 0;

	public EntityBabyCrab(World var1) {
		super(var1);
		this.setSize(1.5F, 1.0F);
		this.experienceValue = 30;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25.0D);
	}

	protected boolean isAIEnabled() {
		return false;
	}

	public void writeEntityToNBT(NBTTagCompound var1) {
		super.writeEntityToNBT(var1);
		var1.setShort("Anger", (short)this.angerLevel);
	}

	public void readEntityFromNBT(NBTTagCompound var1) {
		super.readEntityFromNBT(var1);
		this.angerLevel = var1.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	protected String getLivingSound() {
		return playSound(Sounds.crab);
	}

	protected String getHurtSound() {
		return playSound(Sounds.crabHurt);
	}

	protected String getDeathSound() {
		return playSound(Sounds.crabHurt);
	}

	protected Item getDropItem() {
		return VanillaItemsOther.crabClaw;
	}
	
	protected void dropFewItems(boolean var1, int var2) {
		Item i = getDropItem();
		
		int var3 = this.rand.nextInt(2 + var2);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.dropItem(i, 1);
		}
	}

	@Override
	public String mobName() {
		return "Baby Crab";
	}
}
