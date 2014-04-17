package net.divinerpg.entity.vanilla;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityDesertCrawler extends EntityDivineRPGMob
{
    public EntityDesertCrawler(World par1World)
    {
        super(par1World);
    }
    
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15.0D);
	}

    protected String getLivingSound()
    {
        return playSound(Sounds.crawler);
    }

    protected String getHurtSound()
    {
        return playSound(Sounds.crawlerHurt);
    }

    protected String getDeathSound()
    {
        return playSound(Sounds.crawlerHurt);
    }

    protected Item getDropItem() {
        return Item.getItemFromBlock(Blocks.sandstone);
    }

    protected void dropFewItems(boolean par1, int par2) {
    	
    	Item i = getDropItem();
    	
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(i, 20);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(i, 60);
        }
    }

    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

	@Override
	public String mobName() {
		return "Desert Crawler";
	}
}