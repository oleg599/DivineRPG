package net.divinerpg.vanilla.entity.mobs;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityCaveclops extends EntityDivineRPGMob implements IRangedAttackMob
{
    public EntityCaveclops(World par1World)
    {
        super(par1World);
        this.tasks.addTask(1, new EntityAIArrowAttack(this, 0.25F, 30, 10.0F));
        this.tasks.addTask(2, new EntityAIWander(this, 0.2F));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayerMP.class, 0, true, false));
        this.setSize(1.0F, 2.9F);
    }
    
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(80.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(12.0D);
	}

    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Cyclops";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.CyclopsHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.CyclopsHit";
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.func_145779_a(VanillaItems.realmiteIngot, 3);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.func_145779_a(Items.golden_pickaxe, 1);
        }
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 20.0D && super.getCanSpawnHere();
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase var1, float f)
    {
        //EntityCaveRock var2 = new EntityCaveRock(this.worldObj, this);
        double var3 = var1.posX - this.posX;
        //double var5 = var1.posY + (double)var1.getEyeHeight() - 1.100000023841858D - var2.posY;
        double var7 = var1.posZ - this.posZ;//TODO
        float var9 = MathHelper.sqrt_double(var3 * var3 + var7 * var7) * 0.2F;
        //var2.setThrowableHeading(var3, var5 + (double)var9, var7, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        //this.worldObj.spawnEntityInWorld(var2);
    }

	@Override
	public String mobName() {
		return "Caveclops";
	}
}