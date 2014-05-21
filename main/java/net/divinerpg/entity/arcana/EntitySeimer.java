package net.divinerpg.entity.arcana;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntitySeimer extends EntityDivineRPGMob
{
    private int regenTimer;

    public EntitySeimer(World par1World)
    {
        super(par1World);
        this.setSize(1.0F, 1.0F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        //this.tasks.addTask(2, this.aiSit);
        //this.tasks.addTask(4, new EntityAIFollowOwner(this, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), 4.0F, 2.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.regenTimer = 0;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.46D); // speed
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150); // MaxHP
    }

    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    @Override
    public void entityInit()
    {
        super.entityInit();
    }

    /*@Override
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (var2 != null)
            {
                if (Item.itemsList[var2] instanceof ItemFood)
                {
                    ItemFood var3 = (ItemFood)Item.itemsList[var2];

                    if (var3.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 20)
                    {
                        if (!par1EntityPlayer.capabilities.isCreativeMode)
                        {
                            --var2.stackSize;
                        }

                        this.heal(var3.getHealAmount());

                        if (var2.stackSize <= 0)
                        {
                            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                        }

                        return true;
                    }
                }
            }
        }
        else
        {
            this.setTamed(true);
            this.setOwner(par1EntityPlayer.getEntityName());
        }

        return super.interact(par1EntityPlayer);
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();

        if (this.getOwner() != null)
        {
            if (this.regenTimer >= 2)
            {
                ArcanaHelper.regen(1);
                this.regenTimer = 0;
            }
            else
            {
                ++this.regenTimer;
            }
        }
    }*/

    @Override
    public void updateAITasks()
    {
        super.updateAITasks();
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    @Override
    public int getTotalArmorValue()
    {
        return 0;
    }

	@Override
	public String mobName() {
		return "Seimer";
	}


}