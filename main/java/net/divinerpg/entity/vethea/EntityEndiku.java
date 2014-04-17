package net.divinerpg.entity.vethea;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityEndiku extends EntityDivineRPGMob
{
    private static final double spawnLayer = 3;
    public int eatX;
    public int eatY;
    public int eatZ;
    public Block[] edible = new Block[]{Blocks.log, VetheaBlocks.firewood, VetheaBlocks.mintwood, VetheaBlocks.hyrewood, VetheaBlocks.dreamWoodLog};
    private boolean isEaten;
    private int ability;
    float moveSpeed;

    public EntityEndiku(World var1)
    {
        super(var1);
        moveSpeed = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        // Need to set search range to 64.0F
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(17); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(70); // MaxHP
    }

    /*protected void updateAITasks()
    {
    	System.out.println(this.health);
    	if (this.health < this.getMaxHealth() * 0.2 && !this.isEaten)
    	{
    		for (int i = (int)this.posX - 2; i < (int)this.posX + 16; i++)
    		{
    			for (int j = (int)this.posZ - 2; j < (int)this.posZ + 16; j++)
        		{
    				for(int n = (int)this.posY - 2; n < (int)this.posY + 2; n++)
    				{
        				boolean var1 = this.worldObj.getBlockMaterial(i,(int)this.posY, j) == Material.wood;
        		    	System.out.println(i + " " + n + " " + j);
        		    	System.out.println(var1);
        				if (var1)
        				{
        			    	System.out.println("Moving");
        					this.isEaten = true;
        					this.eatX = i;
        					this.eatY = (int)this.posY;
        					this.eatZ = j;
        				}
    				}
        		}
    		}
    	}
    	super.updateAITasks();
    }*/
    //TODO: Look into this.

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if(this.isEaten && this.ability == 0)
        {
            if (this.getDistance(eatX, eatY, eatZ) < 2)
            {
                this.heal(70/8);
                this.worldObj.setBlock(eatX, eatY, eatZ, null);
                this.isEaten = false;
                this.ability = 5;
            }
            else
            {
                this.getMoveHelper().setMoveTo(eatX, eatY, eatZ, moveSpeed);
                this.getLookHelper().setLookPosition(eatX, eatY, eatZ, 15F, 15F);
                this.moveEntityWithHeading(0F, moveSpeed / 4);
            }
        }
        else if (this.isEaten && this.ability > 0)
        {
            this.ability--;
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
        return "";//Sound.Endiku;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "";//Sound.EndikuHit;
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
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheanItems.polishedPearls, 1);
    }

	@Override
	public String mobName() {
		return "Endiku";
	}
}