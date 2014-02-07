package net.divinerpg.twilight.entity.mob;

import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityTwilightDemon extends EntityDivineRPGBoss implements IBossDisplayData
{
	public EntityTwilightDemon(World var1)
	{
		super(var1);
		this.setSize(2.0F, 4.0F);
		this.tasks.addTask(5, new EntityAIWander(this, 0.56D));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.56D, true));
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Integer(100));
	}



	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.46D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(45); // Attack
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(6800); // MaxHP
	}

	@Override
	public int getTotalArmorValue()
	{
		return 10;
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate()
	{
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
		{
			float var1 = this.getBrightness(1.0F);

			if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
			{
				this.setFire(8);
			}
		}

		super.onLivingUpdate();
	}

	@Override
	public boolean attackEntityAsMob(Entity var1)
	{
		if (super.attackEntityAsMob(var1))
		{
			if (var1 instanceof EntityLivingBase)
			{

				((EntityLivingBase)var1).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 50));

			}
			return true;
		} else
			return false;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	 @Override
	 protected String getLivingSound()
	{
		 return "";//Sound.Insect;
	}

	 /**
	  * Returns the sound this mob makes when it is hurt.
	  */
	 @Override
	 protected String getHurtSound()
	 {
		 return "mob.zombiehurt";
	 }

	 /**
	  * Returns the sound this mob makes on death.
	  */
	 @Override
	 protected String getDeathSound()
	 {
		 return "mob.zombiedeath";
	 }

	 /**
	  * Returns the item ID for the item the mob drops on death.
	  */
	 @Override
	 protected Item getDropItem()
	 {
		 return TwilightItems.apalachiaArrow;//TwilightItems.haliteBow;
	 }

	 @Override
	 public void dropFewItems(boolean par1, int par2)
	 {
		 this.dropItem(this.getDropItem(), 1);
	 }

	 @Override
	 public String mobName() {
		 return "Twilight Demon";
	 }
}