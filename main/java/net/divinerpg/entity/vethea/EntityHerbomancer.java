package net.divinerpg.entity.vethea;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityHerbomancer extends EntityDivineRPGMob {
	
    private static final double spawnLayer = 2;
    private int spawnTick;

    public EntityHerbomancer(World var1) {
        super(var1);
        double moveSpeed = 0.1F;
        this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, moveSpeed));
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, moveSpeed, false));
        this.tasks.addTask(6, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.spawnTick = 40;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 64.0D * spawnLayer  && this.posY < 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40); // MaxHP
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (this.spawnTick == 0 && !this.worldObj.isRemote) {
            EntityHerbomancerMinion var2 = new EntityHerbomancerMinion(this.worldObj);
            var2.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rand.nextFloat() * 360.0F, 0.0F);
            this.worldObj.spawnEntityInWorld(var2);
            this.worldObj.spawnParticle("reddust", var2.posX, var2.posY + 0.5D, var2.posZ, this.rand.nextGaussian() * 2.0D - 1.0D, this.rand.nextGaussian() * 2.0D - 1.0D, this.rand.nextGaussian() * 2.0D - 1.0D);
            this.worldObj.playSoundAtEntity(var2, "" /*Sound.KarotSummon*/, 10.0F, 1.0F);
            this.spawnTick = 40;
        }

        this.spawnTick--;
    }

    @Override
    protected String getLivingSound() {
        return "";//Sound.Herbomancer;
    }

    @Override
    protected String getHurtSound() {
        return "";//Sound.HerbomancerHit;
    }

    @Override
    protected String getDeathSound() {
        return "";
    }

    @Override
    protected Item getDropItem() {
        return null;
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        this.dropItem(VetheanItems.cleanPearls, 1);
    }

	@Override
	public String mobName() {
		return "Herbomancer";
	}
}