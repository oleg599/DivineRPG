package net.divinerpg.entity.twilight;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityApalachiaArcher extends EntityDivineRPGMob implements IRangedAttackMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(TwilightItemsWeapons.apalachiaBow, 1);

    public EntityApalachiaArcher(World var1)
    {
        super(var1);
        this.tasks.addTask(7, new EntityAIArrowAttack(this, 0.25F, 60, 10.0F));   
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.tasks.addTask(6, new EntityAIWander(this, getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.setSize(2.0F, 5.0F);
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(430D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(30D);
    }

    @Override
    public boolean isAIEnabled()
    {
        return true;
    }


    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    @Override
    public int getTotalArmorValue()
    {
        return 10;
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
        return playSound(Sounds.archer);
    }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    @Override
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return playSound(Sounds.highHit);
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return playSound(Sounds.highHit);
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return TwilightItemsOther.apalachiaSoul;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase var1, float f)
    {
        EntityArrow var2 = new EntityArrow(this.worldObj, this, var1, 1.6F, 12.0F);
        var2.setDamage(17D);

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }

	@Override
	public String mobName() {
		return "Apalachia Archer";
	}
}
