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

public class EntityApalachiaCadillion extends EntityDivineRPGMob {
	
    private int angerLevel = 0;
    private int randomSoundDelay = 5;

    public EntityApalachiaCadillion(World var1) {
        super(var1);

        this.setSize(1.0F, 1.3F);
        this.experienceValue = 40;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(21D);
    }
    
    @Override
    protected boolean isAIEnabled() {
        return false;
    }

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.entityToAttack != null ? 0.95F : 0.5F);

        if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0) {
            this.worldObj.playSoundAtEntity(this, Sounds.cadillion, this.getSoundVolume() * 2.0F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 1.8F);
        }
        super.onUpdate();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound var1) {
        super.writeEntityToNBT(var1);
        var1.setShort("Anger", (short)this.angerLevel);
    }
 
    @Override
    public void readEntityFromNBT(NBTTagCompound var1) {
        super.readEntityFromNBT(var1);
        this.angerLevel = var1.getShort("Anger");
    }
 
    @Override
    protected Entity findPlayerToAttack() {
        return this.angerLevel == 0 ? null : super.findPlayerToAttack();
    }
 
    public boolean attackEntityFrom(DamageSource var1, int var2) {
        Entity var3 = var1.getEntity();

        if (var3 instanceof EntityPlayer) {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

            for (int var5 = 0; var5 < var4.size(); ++var5) {
                Entity var6 = (Entity)var4.get(var5);

                if (var6 instanceof EntityPigZombie) {
                    EntityPigZombie var7 = (EntityPigZombie)var6;
                }
            }

            this.becomeAngryAt(var3);
        }

        return super.attackEntityFrom(var1, var2);
    }

    private void becomeAngryAt(Entity var1) {
        this.entityToAttack = var1;
        this.angerLevel = 400 + this.rand.nextInt(400);
        this.randomSoundDelay = this.rand.nextInt(40);
    }
 
    @Override
    protected String getLivingSound() {
        return playSound(Sounds.cadillion);
    }
 
    @Override
    protected String getHurtSound() {
        return playSound(Sounds.growlHurt);
    }
 
    @Override
    protected String getDeathSound() {
        return playSound(Sounds.growlHurt);
    }
 
    @Override
    protected void dropFewItems(boolean var1, int var2) {
        int var3 = this.rand.nextInt(2 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(getDropItem(), 1);
        }
        //this.dropItem(TwilightItemsOther.enrichedMagicMeat, 1);
    }
 
    @Override
    protected Item getDropItem() {
        return TwilightItemsOther.apalachiaSoul;
    }

	@Override
	public String mobName() {
		return "Apalachia Cadillion";
	}
}