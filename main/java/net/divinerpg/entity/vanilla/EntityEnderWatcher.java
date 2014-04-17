package net.divinerpg.entity.vanilla;

import net.divinerpg.helper.DivineAPI;
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

public class EntityEnderWatcher extends EntityEnderman{

	public EntityEnderWatcher(World par1World) {
		super(par1World);
		this.setSize(0.6F, 0.6F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
	}

	protected Item getDropItem()
	{
		return VanillaItemsOther.enderShard;
	}

	protected void dropFewItems(boolean par1, int par2)
	{
		Item item = this.getDropItem();
		Item item2 = VanillaItemsOther.watchingEye;

		if (item != null)
		{
			int j = this.rand.nextInt(2 + par2);

			for (int k = 0; k < j; ++k)
			{
				this.dropItem(item, 2);
				this.dropItem(item2, 1);
			}
		}
	}

	/*public void onDeath(DamageSource d) {
		super.onDeath(d);
		if(!worldObj.isRemote){
			EntityPlayer p = Minecraft.getMinecraft().thePlayer;
			if(ConfigurationHelper.canShowDeathChat){
				DivineAPI.sendMessageToAll(DivineAPI.DARK_AQUA + p.getDisplayName() + " Has Slain A Ender Watcher.");
			}
		}
	}*/
}