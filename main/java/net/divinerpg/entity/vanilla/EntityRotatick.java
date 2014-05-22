package net.divinerpg.entity.vanilla;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityRotatick extends EntityDivineRPGMob {
	
    public EntityRotatick(World par1World) {
        super(par1World);
        this.setSize(1.5F, 0.5F);
    }

    protected String getLivingSound() {
        return playSound(Sounds.rotatick);
    }

    protected String getHurtSound() {
        return playSound(Sounds.rotatickHurt);
    }

    protected String getDeathSound() {
    	return playSound(Sounds.rotatickHurt);
    }

    protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(55.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(18.0D);
	}

    protected void dropFewItems(boolean par1, int par2) {
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.diamond, 0);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Items.diamond, 1);
        }
    }

    @Override
    protected boolean isValidLightLevel() {
        return true;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 25.0D && super.getCanSpawnHere();
    }

	@Override
	public String mobName() {
		return "Rotatick";
	}
}
