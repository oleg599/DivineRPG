package net.divinerpg.overworld.entity.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityDesertCrawler extends EntityMob
{
    public EntityDesertCrawler(World par1World)
    {
        super(par1World);
    }
    
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(15.0D);
	}

    protected String getLivingSound()
    {
        return "";
    }

    protected String getHurtSound()
    {
        return "";
    }

    protected String getDeathSound()
    {
        return "";
    }

    protected Item func_146068_u() {
        return Item.func_150898_a(Blocks.sandstone);
    }

    protected void dropFewItems(boolean par1, int par2) {
    	
    	Item i = func_146068_u();
    	
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.func_145779_a(i, 20);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.func_145779_a(i, 60);
        }
    }

    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }
    
    public void onDeath(DamageSource d) {
		EntityPlayer p = Minecraft.getMinecraft().thePlayer;
		if(ConfigurationHelper.canShowDeathChat){
			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_AQUA, p.getDisplayName() + " Has Slain A Desert Crawler."));
		}
	}
}
