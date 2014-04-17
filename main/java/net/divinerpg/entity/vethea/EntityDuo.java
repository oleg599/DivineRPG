package net.divinerpg.entity.vethea;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityDuo extends EntityDivineRPGMob {

    private static final double spawnLayer = 1;
    public static int ability;
    private final int SLOW = 0;
    private final int FAST = 1;

    private int abilityCoolDown;

    private EntityAIBase meleeAI;
    float moveSpeed = 0.25F;

    public EntityDuo(World par1)
    {
        super(par1);
        meleeAI = new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, meleeAI);
        this.tasks.addTask(6, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        ability = SLOW;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20); // MaxHP
    }

    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    protected void updateAITasks()
    {
        this.manageAbilities();
        super.updateAITasks();
    }

    public void manageAbilities()
    {
        if (ability == SLOW && this.abilityCoolDown == 0)
        {
            ability = FAST;
            this.abilityCoolDown = 350;
            this.setAIMoveSpeed(moveSpeed * 3);
        }
        else if (ability == SLOW && this.abilityCoolDown > 0)
        {
            this.abilityCoolDown--;
        }
        else if (ability != 0 && this.abilityCoolDown == 0)
        {
            this.abilityCoolDown = 350;
        }
        else
        {
            ability = SLOW;
        }
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    @Override
    protected float getSoundVolume()
    {
        return 0.7F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "";//Sound.Duo;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "";//Sound.DuoHit;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return null;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    @Override
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) 
    {
        this.attackEntityAsMob(par1EntityPlayer);
    }


    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheanItems.dirtyPearls, 1);
    }

	@Override
	public String mobName() {
		return "Duo";
	}
}