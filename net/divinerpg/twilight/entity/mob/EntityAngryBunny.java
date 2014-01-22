package net.divinerpg.twilight.entity.mob;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAngryBunny extends EntityDivineRPGMob
{
	public EntityAngryBunny(World var1)
	{
		super(var1);
		
		this.setSize(1F, 1.5F);
		this.experienceValue = 40;
		this.getNavigator().setAvoidsWater(true);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(60.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(18D);
	}


	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	protected String getLivingSound()
	{
		return "";//Sound.Hiss;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return "";//Sound.GrowlHit;
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return "";//Sound.GrowlHit;
	}

	@Override
	public String mobName() {
		return "Angry Bunny";
	}
}
