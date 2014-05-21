package net.divinerpg.entity.twilight;

import java.util.List;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWildWoodCadillion extends EntityDivineRPGMob
{
    private int angerLevel = 0;
    private int randomSoundDelay = 5;

    public EntityWildWoodCadillion(World var1)
    {
        super(var1);
        this.setSize(1.0F, 1.3F);
        this.experienceValue = 40;

    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25D);
    }

    @Override
    protected boolean isAIEnabled()
    {
        return false;
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
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.entityToAttack != null ? 0.95F : 0.5F);
        super.onUpdate();
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
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        Entity var3 = var1.getEntity();

        if (var3 instanceof EntityPlayer)
        {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

            for (int var5 = 0; var5 < var4.size(); ++var5)
            {
                Entity var6 = (Entity)var4.get(var5);

                if (var6 instanceof EntityPigZombie)
                {
                    EntityPigZombie var7 = (EntityPigZombie)var6;
                }
            }

            this.becomeAngryAt(var3);
        }

        return super.attackEntityFrom(var1, var2);
    }

    private void becomeAngryAt(Entity var1)
    {
        this.entityToAttack = var1;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sounds.cadillion;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sounds.growlHurt;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sounds.growlHurt;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(2 + var2);

        for (int var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(TwilightItemsOther.wildWoodSoul, 1);
        }
    }

    @Override
    protected void dropRareDrop(int var1)
    {
        int var2 = this.rand.nextInt(1);

        if (var2 == 0)
        {
            this.dropItem(TwilightItemsOther.wildWoodSoul, 2);
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return TwilightItemsOther.wildWoodSoul;
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

	@Override
	public String mobName() {
		return "Wild Wood Cadillion";
	}
}
