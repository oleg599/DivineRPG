package net.divinerpg.vanilla.entity.mobs;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMiner extends EntityDivineRPGMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(Items.diamond_pickaxe, 1);

    public EntityMiner(World var1)
    {
        super(var1);
    }
    
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
	}

    public int getTotalArmorValue()
    {
        return 10;
    }

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

    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    protected Item getDropItem()
    {
        return Items.rotten_flesh;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    protected void dropRareDrop(int var1)
    {
        switch (this.rand.nextInt(5))
        {
            case 0:
                this.dropItem(Items.diamond_pickaxe, 1);
                break;

            case 1:
                this.dropItem(Items.gold_ingot, 1);
                break;

            case 2:
                this.dropItem(Items.iron_ingot, 1);
                break;

            case 3:
                this.dropItem(Items.diamond, 1);
                break;

            case 4:
                this.dropItem(Item.getItemFromBlock(Blocks.torch), 64);
        }
    }

	@Override
	public String mobName() {
		return "Undead Miner";
	}
}
