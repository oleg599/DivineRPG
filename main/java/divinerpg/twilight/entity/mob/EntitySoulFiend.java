package net.divinerpg.twilight.entity.mob;

import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySoulFiend extends EntityDivineRPGBoss implements IBossDisplayData
{
	public EntitySoulFiend(World var1)
	{
		super(var1); 
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
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5); // speed
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50); // Attack
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5800); // MaxHP
	}

	@Override
	public int getTotalArmorValue()
	{
		return 10;
	}
	@Override
	protected boolean isAIEnabled() {
		return true;
	}

	@Override
	public boolean attackEntityAsMob(Entity var1)
	{
		if (super.attackEntityAsMob(var1))
		{
			if (var1 instanceof EntityLiving)
			{
				((EntityLiving)var1).addPotionEffect(new PotionEffect(Potion.confusion.id, 12 * 20, 0));
				((EntityLiving)var1).addPotionEffect(new PotionEffect(Potion.blindness.id, 12 * 20, 0));
			}
			return true;
		} else
			return false;
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

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound()
	{
		return "mob.zombie";
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
		return TwilightItemsWeapons.haliteBlade;
	}

	@Override
	public void dropFewItems(boolean par1, int par2)
	{
		this.dropItem(this.getDropItem(), 1);
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	@Override
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	public String mobName() {
		return "Soul Fiend";
	}
}