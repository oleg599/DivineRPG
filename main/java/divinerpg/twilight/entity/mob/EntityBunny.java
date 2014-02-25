package divinerpg.twilight.entity.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import divinerpg.api.entity.EntityDivineRPGMob;

public class EntityBunny extends EntityDivineRPGMob
{
    private int angerLevel = 0;
    private int randomSoundDelay = 5;

    public EntityBunny(World var1)
    {
        super(var1);
        double moveSpeed = 0.3;
        this.setSize(0.5F, 0.5F);
        this.experienceValue = 40;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        /*this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, moveSpeed, true));
        this.tasks.addTask(5, new EntityAIFollowOwner(this, moveSpeed, 10.0F, 2.0F));
        this.tasks.addTask(6, new EntityAIMate(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntitySheep.class, 200, false));
        setTamed(tamed);
        setOwner(ownerName);*/
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

	   @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.40D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10); // MaxHP
    }
	
    /**
     * Determines if an entity can be despawned, used on idle far away entities
     *
    @Override
    protected boolean canDespawn()
    {
        return !this.isTamed();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * Called when the mob's health reaches 0.
     *
    @Override
    public void onDeath(DamageSource var1)
    {
        super.onDeath(var1);

        if (!this.worldObj.isRemote && !this.isTamed())
        {

            Entity var3 = var1.getEntity();

            if (var3 instanceof EntityPlayer)
            {
                //((EntityPlayer) var3).addStat(AchievementPageDivineRPG.friendOrFoe, 1);
            }
            this.transform(false, var3);
        }
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).size() == 0 && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setShort("Anger", (short)this.angerLevel);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.angerLevel = var1.getShort("Anger");
    }

    /**
     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
     * (Animals, Spiders at day, peaceful PigZombies).
     */
    @Override
    protected Entity findPlayerToAttack()
    {
        return this.angerLevel == 0 ? null : super.findPlayerToAttack();
    }

    /**
     * Called when the entity is attacked.
     *
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        Entity var3 = var1.getEntity();

        if (var3 instanceof EntityPlayer)
        {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

            for (int var5 = 0; var5 < var4.size(); ++var5)
            {
                Entity var6 = (Entity)var4.get(var5);

                if (var6 instanceof EntitySerenityBunny)
                {
                    EntitySerenityBunny var7 = (EntitySerenityBunny)var6;
                }
            }

            this.becomeAngryAt(var3);
        }

        return super.attackEntityFrom(var1, var2);
    }

    /*
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        if (this.isTamed())
        {
            this.transform(true, par1Entity);
            return false;
        }

        return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float) this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
    }

    private void becomeAngryAt(Entity var1)
    {
        this.entityToAttack = var1;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }

    /**
     * Sets the active target the Task system uses for tracking
     *
    public void setAttackTarget(EntityLiving par1EntityLiving)
    {
        super.setAttackTarget(par1EntityLiving);
    }

    private void transform(boolean tamed, Entity var3) 
    {
        if (!this.worldObj.isRemote)
        {
            EntityAngryBunny var2 = new EntityAngryBunny(this.worldObj);
            var2.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(var2);
            if (var3 instanceof EntityLiving)
            {
                var2.setAttackTarget((EntityLiving) var3);
            }
            this.setDead();
        }
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     *
    @Override
    public boolean interact(EntityPlayer var1)
    {
        ItemStack var2 = var1.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (var2 != null && Item.itemsList[var2] instanceof ItemFood)
            {
                ItemFood var3 = (ItemFood)Item.itemsList[var2];

                if (var3.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 20)
                {
                    if (!var1.capabilities.isCreativeMode)
                    {
                        --var2.stackSize;
                    }

                    this.heal(var3.getHealAmount());

                    if (var2.stackSize <= 0)
                    {
                        var1.inventory.setInventorySlotContents(var1.inventory.currentItem, (ItemStack)null);
                    }

                    return true;
                }
            }

            if (var1.username.equalsIgnoreCase(this.getOwnerName()) && !this.worldObj.isRemote)
            {
                this.aiSit.setSitting(!this.isSitting());
                this.isJumping = false;
                this.setPathToEntity((PathEntity)null);
            }
        }
        else if (var2 != null && var2 == TwilightItems.edenSparkles)
        {
            if (!var1.capabilities.isCreativeMode)
            {
                --var2.stackSize;
            }

            if (var2.stackSize <= 0)
            {
                var1.inventory.setInventorySlotContents(var1.inventory.currentItem, (ItemStack)null);
            }

            if (!this.worldObj.isRemote)
            {
                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamed(true);
                    this.setPathToEntity((PathEntity)null);
                    this.setAttackTarget((EntityLiving)null);
                    this.aiSit.setSitting(true);
                    this.setHealth(20);
                    this.setOwner(var1.username);
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.interact(var1);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     *
    @Override
    protected String getLivingSound()
    {
        return "";//Sound.Rowl;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "";//Sound.BunnyHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";//Sound.BunnyHit;
    }

	@Override
	public String mobName() {
		return "Bunny";
	}
}
