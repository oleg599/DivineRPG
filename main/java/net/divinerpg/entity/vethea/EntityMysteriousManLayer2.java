package net.divinerpg.entity.vethea;

import net.divinerpg.api.entity.EntityGive;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMysteriousManLayer2 extends EntityGive
{

    public EntityMysteriousManLayer2(World par1) 
    {
        super(par1, VetheanItems.darvenLump, 6);
    }
    
    public int spawnLayer = 2;
    
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * this.spawnLayer  && this.posY > 64.0D * (this.spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive())
        {
            if (!this.worldObj.isRemote)
            {

                switch (this.rand.nextInt(4))
                {
                    case 0:
                        DivineAPI.addChatMessage("Mysterious Man: You're progressing, good good.");
                        break;
                    case 1:
                        DivineAPI.addChatMessage("Mysterious Man: Can you hear the screams and roars from above?");
                        break;
                    case 2:
                        DivineAPI.addChatMessage("Mysterious Man: Everytime you infuse something, the gods become stronger.");
                        break;
                    case 3:
                        DivineAPI.addChatMessage("Mysterious Man: The gods are using your dreams as a battlefield.");
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