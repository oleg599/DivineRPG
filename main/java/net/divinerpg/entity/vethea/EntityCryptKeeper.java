package net.divinerpg.entity.vethea;

import net.divinerpg.api.entity.EntityGive;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityCryptKeeper extends EntityGive {

    public EntityCryptKeeper(World par1) {
        super(par1, VetheanItems.amthrimisLump, 5);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200);
    }

    @Override
    public boolean interact(EntityPlayer var1) {
        if (this.isEntityAlive()) {
            if (!this.worldObj.isRemote) {

                switch (this.rand.nextInt(5)) {
                    case 0:
                        Util.addChatMessage("Crypt Keeper: You are safer down here.");
                        break;
                    case 1:
                    	Util.addChatMessage("Crypt Keeper: Beware of the higher layers.");
                        break;
                    case 2:
                    	Util.addChatMessage("Crypt Keeper: Take this reward, use it wisely.");
                        break;
                    case 3:
                    	Util.addChatMessage("Crypt Keeper: What the future holds is dark.");
                        break;
                    case 4:
                        Util.addChatMessage("Crypt Keeper: This isn't a nice world.");
                        break;
                }
            }

            return true;
        } else
            return super.interact(var1);
    }

	@Override
	public String mobName() {
		return "Crypt Keeper";
	}
}