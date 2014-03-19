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

public class EntityCyclops extends EntityDivineRPGMob {
	private int angerLevel = 0;
	private int randomSoundDelay = 5;

	public EntityCyclops(World var1) {
		super(var1);
		this.setSize(2.0F, 3.9F);
		this.experienceValue = 40;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(16.0D);
	}

	protected boolean isAIEnabled() {
		return false;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	public void onUpdate() {

		if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0) {
			this.worldObj.playSoundAtEntity(this, "", this.getSoundVolume() * 2.0F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 1.8F);
		}

		super.onUpdate();
	}

	public boolean getCanSpawnHere() {
		return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).size() == 0 && !this.worldObj.isAnyLiquid(this.boundingBox);
	}

	public void writeEntityToNBT(NBTTagCompound var1) {
		super.writeEntityToNBT(var1);
		var1.setShort("Anger", (short) this.angerLevel);
	}

	public void readEntityFromNBT(NBTTagCompound var1) {
		super.readEntityFromNBT(var1);
		this.angerLevel = var1.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	public boolean attackEntityFrom(DamageSource var1, int var2) {
		Entity var3 = var1.getEntity();

		if (var3 instanceof EntityPlayer) {
			List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

			for (int var5 = 0; var5 < var4.size(); ++var5) {
				Entity var6 = (Entity) var4.get(var5);

				if (var6 instanceof EntityCyclops) {
					((EntityCyclops) var6).becomeAngryAt(var3);
				}
			}

			this.becomeAngryAt(var3);
		}

		return super.attackEntityFrom(var1, var2);
	}

	public void becomeAngryAt(Entity var1) {
		this.entityToAttack = var1;
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
	}

	protected String getLivingSound() {
		return playSound(Sounds.Cyclops);
	}

	protected String getHurtSound() {
		return playSound(Sounds.cyclopsHit);
	}

	protected String getDeathSound() {
		return playSound(Sounds.cyclopsHit);
	}

	protected void dropFewItems(boolean var1, int var2) {
		int var3 = this.rand.nextInt(2 + var2);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.dropItem(VanillaItemsOther.cyclopsEye, 1);
		}
	}

	protected void dropRareDrop(int var1) {
		this.dropItem(VanillaItemsOther.healingStone, 1);
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected Item getDropItem() {
		return VanillaItemsOther.cyclopsEye;
	}

	@Override
	public String mobName() {
		return "Cyclops";
	}
}
