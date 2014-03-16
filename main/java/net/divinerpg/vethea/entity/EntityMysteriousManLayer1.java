package net.divinerpg.vethea.entity;

import net.divinerpg.api.entity.EntityGive;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMysteriousManLayer1 extends EntityGive {
	
    public EntityMysteriousManLayer1(World par1)  {
        super(par1, VetheanItems.teakerLump, 3);
    }
    
    public int spawnLayer = 1;
    
    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 64.0D * this.spawnLayer  && this.posY > 64.0D * (this.spawnLayer - 1) && super.getCanSpawnHere();
    }
    
    @Override
    public boolean interact(EntityPlayer var1) {
        if (this.isEntityAlive()) {
            if (!this.worldObj.isRemote) {
                switch (this.rand.nextInt(3)){
                    case 0:
                        DivineAPI.addChatMessage("Mysterious Man: You look new around here. Be careful.");
                        break;
                    case 1:
                        DivineAPI.addChatMessage("Mysterious Man: Take these, use them at an infusion table.");
                        break;
                    case 2:
                        DivineAPI.addChatMessage("Mysterious Man: Don't tell anybody you saw me.");
                        break;
                }
            }
            return true;
        } else
            return super.interact(var1);
    }
    
	@Override
	public String mobName() {
		return "Mysterious Man";
	}
}