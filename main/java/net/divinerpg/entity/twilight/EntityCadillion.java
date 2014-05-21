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

public class EntityCadillion extends EntityDivineRPGMob
{
    private int angerLevel = 0;
    private int randomSoundDelay = 5;

    public EntityCadillion(World var1)
    {
        super(var1);
        this.setSize(1.0F, 1.3F);
        this.experienceValue = 40;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(160.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25D);
    }

    @Override
    protected boolean isAIEnabled()
    {
        return false;
    }

    @Override
    public void onUpdate()
    {
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(this.entityToAttack != null ? 0.95F : 0.5F);
        super.onUpdate();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setShort("Anger", (short)this.angerLevel);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.angerLevel = var1.getShort("Anger");
    }

    @Override
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
            this.dropItem(TwilightItemsOther.edenSoul, 1);
        }
    }

    @Override
    protected void dropRareDrop(int var1)
    {
        int var2 = this.rand.nextInt(1);

        if (var2 == 0)
        {
            this.dropItem(TwilightItemsOther.edenSoul, 1);
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return TwilightItemsOther.edenSoul;
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
		return "Eden Cadillion";
	}
}
