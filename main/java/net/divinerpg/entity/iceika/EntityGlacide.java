package net.divinerpg.entity.iceika;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityGlacide extends EntityDivineRPGMob {
	
    public EntityGlacide(World var1) {
        super(var1);
        this.setSize(0.6F, 1.9F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25D);
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    protected String getLivingSound() {
        return Sounds.glacide;
    }

    @Override
    protected String getHurtSound() {
        return Sounds.glacideHurt;
    }

    @Override
    protected String getDeathSound() {
        return Sounds.glacideHurt;
    }

    @Override
    protected Item getDropItem() {
        return IceikaItems.iceShards;
    }
 
    @Override
    protected void dropFewItems(boolean var1, int var2) {
        int var3 = this.rand.nextInt(2 + var2), var4;
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(IceikaItems.iceShards, 3);
        }
    }

	@Override
	public String mobName() {
		return "Glacide";
	}
}