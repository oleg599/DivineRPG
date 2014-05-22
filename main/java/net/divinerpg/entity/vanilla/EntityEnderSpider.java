package net.divinerpg.entity.vanilla;

import net.divinerpg.helper.Util;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityEnderSpider extends EntityEnderman
{
	public EntityEnderSpider(World var1)
	{
		super(var1);
		this.setSize(0.9F, 0.9F);
		this.experienceValue = 20;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(45.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(16.0D);
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound()
	{
		return "";
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected Item getDropItem()
	{
		return VanillaItemsOther.enderShard;
	}

	/**
	 * Drop 0-2 items of this living's type
	 */
	protected void dropFewItems(boolean var1, int var2)
	{   
		this.dropItem(VanillaItemsOther.enderShard, 1);
	}

	/*public void onDeath(DamageSource d) {
		super.onDeath(d);
		if(!worldObj.isRemote){
			EntityPlayer p = Minecraft.getMinecraft().thePlayer;
			if(ConfigurationHelper.canShowDeathChat){
				DivineAPI.sendMessageToAll(DivineAPI.DARK_AQUA + p.getDisplayName() + " Has Slain A Ender Spider.");
			}
		}
	}*/
}
