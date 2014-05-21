package net.divinerpg.entity.twilight;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.helper.items.TwilightItemsArmor;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDensos extends EntityDivineRPGBoss
{
    private static final ItemStack defaultHeldItem = new ItemStack(TwilightItemsWeapons.haliteBlade, 1);

    public EntityDensos(World var1)
    {
        super(var1);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5000.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(40D);
        this.setFollowRange(128.0D);
    }
    
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(100));
    }

    @Override
    public int getTotalArmorValue()
    {
        return 10;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sounds.densos;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sounds.densosHurt;
    }

    @Override
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }


    @Override
    public void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(2 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(TwilightItemsArmor.haliteHelmet, 1);
            this.dropItem(TwilightItemsArmor.haliteBody, 1);
            this.dropItem(TwilightItemsArmor.haliteLegs, 1);
            this.dropItem(TwilightItemsArmor.haliteBoots, 1);
        }
    }

	@Override
	public String mobName() {
		return "Densos";
	}

	@Override
	public String name() {
		return "Densos";
	}

	@Override
	public IChatComponent chat() {
		return null;
	}
}
