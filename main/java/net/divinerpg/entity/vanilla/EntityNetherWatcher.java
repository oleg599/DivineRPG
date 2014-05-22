package net.divinerpg.entity.vanilla;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGFlying;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityNetherWatcher extends EntityDivineRPGFlying implements IMob, IBossDisplayData
{
	public int courseChangeCooldown = 0;
	public double waypointX;
	public double waypointY;
	public double waypointZ;
	private Entity targetedEntity = null;
	private int aggroCooldown = 0;
	public int prevAttackCounter = 0;
	public int attackCounter = 0;

	public EntityNetherWatcher(World var1)
	{
		super(var1);
		this.setSize(4.0F, 4.0F);
		this.isImmuneToFire = true;
		this.experienceValue = 5000;
	}

	/**
	 * Gets the username of the entity.
	 */
	 public String getEntityName()
	 {
		 return "The Watcher";
	 }

	 /**
	  * Called when the entity is attacked.
	  */
	 public boolean attackEntityFrom(DamageSource var1, int var2)
	 {
		 return super.attackEntityFrom(var1, var2);
	 }

	 protected void applyEntityAttributes() {
		 super.applyEntityAttributes();
		 this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(3400.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
	 }

	 /**
	  * Called to update the entity's position/logic.
	  */
	 public void onUpdate()
	 {
		 super.onUpdate();
	 }

	 protected void updateEntityActionState()
	 {
		 this.despawnEntity();
		 this.prevAttackCounter = this.attackCounter;
		 double var1 = this.waypointX - this.posX;
		 double var3 = this.waypointY - this.posY;
		 double var5 = this.waypointZ - this.posZ;
		 double var7 = (double)MathHelper.sqrt_double(var1 * var1 + var3 * var3 + var5 * var5);

		 if (var7 < 1.0D || var7 > 60.0D)
		 {
			 this.waypointX = this.posX + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
			 this.waypointY = this.posY + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
			 this.waypointZ = this.posZ + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
		 }

		 if (this.courseChangeCooldown-- <= 0)
		 {
			 this.courseChangeCooldown += this.rand.nextInt(5) + 2;

			 if (this.isCourseTraversable(this.waypointX, this.waypointY, this.waypointZ, var7))
			 {
				 this.motionX += var1 / var7 * 0.1D;
				 this.motionY += var3 / var7 * 0.1D;
				 this.motionZ += var5 / var7 * 0.1D;
			 }
			 else
			 {
				 this.waypointX = this.posX;
				 this.waypointY = this.posY;
				 this.waypointZ = this.posZ;
			 }
		 }

		 if (this.targetedEntity != null && this.targetedEntity.isDead)
		 {
			 this.targetedEntity = null;
		 }

		 if (this.targetedEntity == null || this.aggroCooldown-- <= 0)
		 {
			 this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0D);

			 if (this.targetedEntity != null)
			 {
				 this.aggroCooldown = 20;
			 }
		 }

		 double var9 = 100.0D;

		 if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity(this) < var9 * var9)
		 {
			 double var11 = this.targetedEntity.posX - this.posX;
			 double var13 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
			 double var15 = this.targetedEntity.posZ - this.posZ;
			 this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(var11, var15)) * 180.0F / (float)Math.PI;

			 if (this.canEntityBeSeen(this.targetedEntity))
			 {
				 if (this.attackCounter == 20)
				 {
					 this.worldObj.playSoundAtEntity(this, "mob.RPG.roar", 10.0F, 0.9F);
				 }

				 ++this.attackCounter;

				 if (this.attackCounter == 20)
				 {
					 //EntityWatcherShot var17 = new EntityWatcherShot(this.worldObj, this);
					 //this.worldObj.spawnEntityInWorld(var17);
					 this.attackCounter = -40;
				 }
			 }
			 else if (this.attackCounter > 0)
			 {
				 --this.attackCounter;
			 }
		 }
		 else
		 {
			 this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI;

			 if (this.attackCounter > 0)
			 {
				 --this.attackCounter;
			 }
		 }
	 }

	 private boolean isCourseTraversable(double var1, double var3, double var5, double var7)
	 {
		 double var9 = (this.waypointX - this.posX) / var7;
		 double var11 = (this.waypointY - this.posY) / var7;
		 double var13 = (this.waypointZ - this.posZ) / var7;
		 AxisAlignedBB var15 = this.boundingBox.copy();

		 for (int var16 = 1; (double)var16 < var7; ++var16)
		 {
			 var15.offset(var9, var11, var13);

			 if (this.worldObj.getCollidingBoundingBoxes(this, var15).size() > 0)
			 {
				 return false;
			 }
		 }

		 return true;
	 }

	 protected String getHurtSound() {
		 return playSound(Sounds.roar);
	 }

	 protected String getDeathSound() {
		 return playSound(Sounds.roar);
	 }

	 protected Item getDropItem() {
		 return VanillaItemsOther.netheriteIngot;
	 }

	 protected void dropFewItems(boolean var1, int var2) {
		 this.dropItem(VanillaItemsOther.netheriteIngot, 100);
		 int var3 = this.rand.nextInt(4);
		 this.dropItem(VanillaItemsOther.blueFireStone, 1);

		 for (int var4 = 0; var4 < 3 + var3; ++var4) {
			 this.dropItem(VanillaItemsOther.divineShards, 1);
		 }

		 if (this.rand.nextInt(3) == 0) {
			 this.dropItem(Item.getItemFromBlock(VanillaBlocks.WatcherStatue), 1);
		 }
	 }

	 public void onDeath(DamageSource d) {
		 super.onDeath(d);
		 if(!worldObj.isRemote){
			 EntityPlayer p = Minecraft.getMinecraft().thePlayer;
			 if(ConfigurationHelper.canShowDeathChat){
				 p.addChatMessage(Util.addChatMessage(EnumChatFormatting.BLUE, "The Nether Watcher Has Fallen."));
			 }
		 }
	 }

	@Override
	public String mobName() {
		return "Nether Watcher";
	}
}
