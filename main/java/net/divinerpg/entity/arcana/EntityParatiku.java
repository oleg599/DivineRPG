package net.divinerpg.entity.arcana;

import java.util.Calendar;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityParatiku extends EntityDivineRPGMob
{
	private ChunkCoordinates currentFlightTarget;
	public EntityParatiku(World par1World)
	{
		super(par1World);
		this.setSize(0.9F, 0.9F);
		this.setIsBatHanging(true);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
        //this.tasks.addTask(4, new EntityAIParatikuFollowOwner(this, (float) this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), 10.0F, 2.0F));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, 0.3D, true));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
       // this.targetTasks.addTask(1, new EntityAIParatikuOwnerHurtByTarget(this));
        //this.targetTasks.addTask(2, new EntityAIParatikuOwnerHurtTarget(this));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3); // speed
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60); // MaxHP
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(17, "");
		this.dataWatcher.addObject(16, new Byte((byte)0));
	}

	@Override
	public boolean attackEntityAsMob(Entity par1Entity)
	{
		int var2 = 9;

		if (this.isPotionActive(Potion.damageBoost))
		{
			var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
		}

		if (this.isPotionActive(Potion.weakness))
		{
			var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
		}

		int var3 = 0;

		if (par1Entity instanceof EntityLiving)
		{
			var2 += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLiving)par1Entity);
			var3 += EnchantmentHelper.getKnockbackModifier(this, (EntityLiving)par1Entity);
		}

		boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

		if (var4)
		{
			if (var3 > 0)
			{
				par1Entity.addVelocity(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * var3 * 0.5F, 0.1D, MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * var3 * 0.5F);
				this.motionX *= 0.6D;
				this.motionZ *= 0.6D;
			}

			int var5 = EnchantmentHelper.getFireAspectModifier(this);

			if (var5 > 0)
			{
				par1Entity.setFire(var5 * 4);
			}
		}

		return var4;
	}

	/**
	 * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
	 */
	@Override
	public int getTotalArmorValue()
	{
		return 0;
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);

		if (this.getOwnerName() == null)
		{
			par1NBTTagCompound.setString("Owner", "");
		}
		else
		{
			par1NBTTagCompound.setString("Owner", this.getOwnerName());
		}

		par1NBTTagCompound.setBoolean("Sitting", this.isSitting());
		par1NBTTagCompound.setByte("BatFlags", this.dataWatcher.getWatchableObjectByte(16));
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		String var2 = par1NBTTagCompound.getString("Owner");

		if (var2.length() > 0)
		{
			this.setOwner(var2);
			this.setTamed(true);
		}

		this.dataWatcher.updateObject(16, Byte.valueOf(par1NBTTagCompound.getByte("BatFlags")));
	}

	/**
	 * Play the taming effect, will either be hearts or smoke depending on status
	 */
	protected void playTameEffect(boolean par1)
	{
		String var2 = "heart";

		if (!par1)
		{
			var2 = "smoke";
		}

		for (int var3 = 0; var3 < 7; ++var3)
		{
			double var4 = this.rand.nextGaussian() * 0.02D;
			double var6 = this.rand.nextGaussian() * 0.02D;
			double var8 = this.rand.nextGaussian() * 0.02D;
			this.worldObj.spawnParticle(var2, this.posX + this.rand.nextFloat() * this.width * 2.0F - this.width, this.posY + 0.5D + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0F - this.width, var4, var6, var8);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte par1)
	{
		if (par1 == 7)
		{
			this.playTameEffect(true);
		}
		else if (par1 == 6)
		{
			this.playTameEffect(false);
		}
		else
		{
			super.handleHealthUpdate(par1);
		}
	}

	public boolean isTamed()
	{
		return (this.dataWatcher.getWatchableObjectByte(16) & 4) != 0;
	}

	public void setTamed(boolean par1)
	{
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 4)));
		}
		else
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -5)));
		}
	}

	public boolean isSitting()
	{
		return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
	}

	public void setSitting(boolean par1)
	{
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 1)));
		}
		else
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -2)));
		}
	}

	public String getOwnerName()
	{
		return this.dataWatcher.getWatchableObjectString(17);
	}

	public void setOwner(String par1Str)
	{
		this.dataWatcher.updateObject(17, par1Str);
	}

	public EntityLivingBase getOwner()
	{
		return this.worldObj.getPlayerEntityByName(this.getOwnerName());
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	@Override
	protected float getSoundVolume()
	{
		return 0.1F;
	}

	/**
	 * Gets the pitch of living sounds in living entities.
	 */
	@Override
	protected float getSoundPitch()
	{
		return super.getSoundPitch() * 0.95F;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound()
	{
		return this.getIsBatHanging() && this.rand.nextInt(4) != 0 ? null : "mob.bat.idle";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return "mob.bat.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return "mob.bat.death";
	}

	/**
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	protected void collideWithEntity(Entity par1Entity) {}

	protected void func_85033_bc() {}

	public boolean getIsBatHanging()
	{
		return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
	}

	public void setIsBatHanging(boolean par1)
	{
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 1)));
		}
		else
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -2)));
		}
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (this.getIsBatHanging())
		{
			this.motionX = this.motionY = this.motionZ = 0.0D;
			this.posY = MathHelper.floor_double(this.posY) + 1.0D - this.height;
		}
		else
		{
			this.motionY *= 0.6000000238418579D;
		}
	}

	@Override
	protected void updateAITasks()
	{
		super.updateAITasks();

		if (this.getAttackTarget() != null)
		{
			int var1 = (int) this.getAttackTarget().posX;
			int var2 = (int) this.getAttackTarget().posY;
			int var3 = (int) this.getAttackTarget().posZ;
			this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
		}
		else if (this.getOwner() != null)
		{
			this.currentFlightTarget = this.worldObj.getPlayerEntityByName(this.getOwnerName()).getPlayerCoordinates();
		}
		else
		{
			if (this.rand.nextInt(200) == 0)
			{
				this.rotationYawHead = this.rand.nextInt(360);
			}

			if (this.worldObj.getClosestPlayerToEntity(this, 4.0D) != null)
			{
				this.setIsBatHanging(false);
				this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
			}
		}

		if (this.currentFlightTarget != null)
		{
			double var1 = this.currentFlightTarget.posX - this.posX;
			double var3 = this.currentFlightTarget.posY - this.posY;
			double var5 = this.currentFlightTarget.posZ - this.posZ;

			if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
			{
				this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.10000000149011612D;
				this.motionY += (Math.signum(var3) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
				this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.10000000149011612D;
				float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
				float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
				this.moveForward = 0.5F;
				this.rotationYaw += var8;
			}
		}
	}


	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	@Override
	protected boolean canTriggerWalking()
	{
		return false;
	}

	/**
	 * Called when the mob is falling. Calculates and applies fall damage.
	 */
	@Override
	protected void fall(float par1) {}

	/**
	 * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
	 * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
	 */
	@Override
	protected void updateFallState(double par1, boolean par3) {}

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
		{
			if (this.isEntityInvulnerable())
				return false;
			else if (!this.worldObj.isRemote && this.getIsBatHanging())
			{
				this.setIsBatHanging(false);
			}

			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}

	/**
	 * Checks if the entity's current position is a valid location to spawn this entity.
	 */
	@Override
	public boolean getCanSpawnHere()
	{
		int var1 = MathHelper.floor_double(this.boundingBox.minY);

		if (var1 >= 63)
			return false;
		else
		{
			int var2 = MathHelper.floor_double(this.posX);
			int var3 = MathHelper.floor_double(this.posZ);
			int var4 = this.worldObj.getBlockLightValue(var2, var1, var3);
			byte var5 = 4;
			Calendar var6 = this.worldObj.getCurrentDate();

			if ((var6.get(2) + 1 != 10 || var6.get(5) < 20) && (var6.get(2) + 1 != 11 || var6.get(5) > 3))
			{
				if (this.rand.nextBoolean())
					return false;
			}
			else
			{
				var5 = 7;
			}

			return var4 > this.rand.nextInt(var5) ? false : super.getCanSpawnHere();
		}
	}

	/**
	 * Initialize this creature.
	 */
	public void initCreature() {}

	@Override
	public String mobName() {
		return "Paratiku";
	}
}
