package net.divinerpg.vethea.entity;

import net.divinerpg.api.entity.EntityDivineRPGFlying;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityLorgaFlight extends EntityDivineRPGFlying {
	
    private static final double spawnLayer = 3;
    private ChunkCoordinates currentFlightTarget;
    private int flyTimer;
    private int lifeTick;
    private int spawnTick;
    public boolean canSpawnMinions;

    public EntityLorgaFlight(World var1, boolean canSpawnMinions) {
        super(var1);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.canSpawnMinions = canSpawnMinions;
        this.tasks.addTask(6, new EntityAIWander(this, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.flyTimer = 0;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.15); // Speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40); // MaxHP
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0f); // followRange
    }

    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    public EntityLorgaFlight(World var1, int life, boolean canSpawnMinions)
    {
        this(var1, canSpawnMinions);
        this.lifeTick = life;
    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    protected String getLivingSound()
    {
        return "";//Sound.LorgaFlight;
    }

    @Override
    protected String getHurtSound()
    {
        return "";//Sound.LorgaFlightHit;
    }

    @Override
    protected String getDeathSound()
    {
        return "";
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.lifeTick == -1 && this.spawnTick == 0 && this.canSpawnMinions)
        {
            this.spawnTick = 120;
            EntityLorgaFlight var2 = new EntityLorgaFlight(this.worldObj, 10, false);
            var2.setLocationAndAngles(this.posX + 1, this.posY, this.posZ + 1, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(var2);
        }
        else if (this.spawnTick > 0)
        {
            this.spawnTick--;
        }
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.motionY *= 0.6000000238418579D;
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();

        if (this.getAttackTarget() != null)
        {
            int var1 = (int) this.getAttackTarget().posX;
            int var2 = (int) this.getAttackTarget().posY;
            int var3 = (int) this.getAttackTarget().posZ;
            this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
        }
        else if (this.flyTimer != 0)
        {
            this.flyTimer = 120;
            this.currentFlightTarget = new ChunkCoordinates((int)(this.posX + this.rand.nextInt(16)) - 8, (int)(this.posY + this.rand.nextInt(32)) - 16, (int)(this.posZ + this.rand.nextInt(16)) - 8);
        }

        if (this.currentFlightTarget != null)
        {
            double var1 = this.currentFlightTarget.posX - this.posX;
            double var3 = this.currentFlightTarget.posY - this.posY;
            double var5 = this.currentFlightTarget.posZ - this.posZ;

            if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
            {
                this.motionX += (Math.signum(var1) * 0.15D - this.motionX) * 0.10000000149011612D;
                this.motionY += (Math.signum(var3) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
                this.motionZ += (Math.signum(var5) * 0.15D - this.motionZ) * 0.10000000149011612D;
                float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
                float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
                this.moveForward = 0.5F;
                this.rotationYaw += var8;
            }
            flyTimer--;
        }

    }

    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    @Override
    protected void fall(float par1) {}

    @Override
    protected void updateFallState(double par1, boolean par3) {}

    @Override
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheanItems.polishedPearls, 1);
    }

	@Override
	public String mobName() {
		return "Flying Lorga";
	}
}