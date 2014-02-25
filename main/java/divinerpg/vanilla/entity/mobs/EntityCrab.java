package divinerpg.vanilla.entity.mobs;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import divinerpg.Sounds;
import divinerpg.api.entity.EntityDivineRPGMob;
import divinerpg.helper.items.VanillaItemsOther;

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

	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	public void onUpdate()
	{
		super.onUpdate();
	}

	public void writeEntityToNBT(NBTTagCompound var1)
	{
		super.writeEntityToNBT(var1);
		var1.setShort("Anger", (short)this.angerLevel);
	}

	public void readEntityFromNBT(NBTTagCompound var1)
	{
		super.readEntityFromNBT(var1);
		this.angerLevel = var1.getShort("Anger");
	}

	protected Entity findPlayerToAttack()
	{
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	public boolean attackEntityFrom(DamageSource var1, int var2)
	{
		Entity var3 = var1.getEntity();

		if (var3 instanceof EntityPlayer)
		{
			List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

			for (int var5 = 0; var5 < var4.size(); ++var5)
			{
				Entity var6 = (Entity)var4.get(var5);

				if (var6 instanceof EntityCrab)
				{
					EntityCrab var7 = (EntityCrab)var6;
				}else if (var6 instanceof EntityKingCrab)
				{
					EntityKingCrab var7 = (EntityKingCrab)var6;
				}
			}

			this.becomeAngryAt(var3);
		}

		return super.attackEntityFrom(var1, var2);
	}

	private void becomeAngryAt(Entity var1) {
		this.entityToAttack = var1;
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
	}

	protected String getLivingSound() {//TODO LEFT THE ERROR HERE SO IT CAN GET CHANGED SO IT CAN FIX.
		return Sounds.playSound(Sounds.Crab, worldObj, this, 1, 1);
	}

	protected String getHurtSound() {
		return Sounds.CrabHurt;
	}

	protected String getDeathSound() {
		return Sounds.CrabHurt;
	}

	protected Item getDropItem() {
		return VanillaItemsOther.crabClaw;
	}
	
	protected void dropFewItems(boolean var1, int var2) {
		Item i = getDropItem();
		
		int var3 = this.rand.nextInt(2 + var2);

		for (int var4 = 0; var4 < var3; ++var4)
		{
			this.dropItem(i, 1);
		}
	}

	@Override
	public String mobName() {
		return "Crab";
	}
}
