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

public class EntityCrab extends EntityDivineRPGMob {
	
	private int angerLevel = 0;
	private int randomSoundDelay = 5;

	public EntityCrab(World var1) {
		super(var1);
		this.setSize(1.5F, 1.0F);
		this.experienceValue = 40;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(160.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25.0D);
	}

	protected boolean isAIEnabled() {
		return false;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	public void onUpdate() {
		super.onUpdate();
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

	private void becomeAngryAt(Entity var1) {
		this.entityToAttack = var1;
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
	}

	protected String getLivingSound() {
		return playSound(Sounds.Crab);
	}

	protected String getHurtSound() {
		return playSound(Sounds.CrabHurt);
	}

	protected String getDeathSound() {
		return playSound(Sounds.CrabHurt);
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
		return "Crab";
	}
}
