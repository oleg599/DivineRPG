package net.divinerpg.helper.event;

import net.divinerpg.helper.items.VanillaItemsArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventArmorFullSet {

	EntityPlayer player = Minecraft.getMinecraft().thePlayer;

	private Item boots = null;
	private Item body = null;
	private Item legs = null;
	private Item helmet = null;
	private VanillaItemsArmor v;

	//TODO Figure out why it isn't working.

	@SubscribeEvent
	public void onLivingHurtEvent(LivingHurtEvent e) {
		if (!(e.entityLiving instanceof EntityPlayer))
			return;
		
		DamageSource s = e.source;
	    e.setCanceled(true);
		
		/*ItemStack stackBoots = player.inventory.armorItemInSlot(0);
		ItemStack stackLegs = player.inventory.armorItemInSlot(1);
		ItemStack stackBody = player.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = player.inventory.armorItemInSlot(3);
		
		if(stackBoots != null) 
			boots = stackBoots.getItem();
		
		if(stackLegs != null) 
			body = stackLegs.getItem();
		
		if(stackBody != null) 
			legs = stackBody.getItem();
		
		if(stackHelmet != null) 
			helmet = stackHelmet.getItem();

		if (boots == VanillaItemsArmor.netheriteBoots && legs == VanillaItemsArmor.netheriteLegs && body == VanillaItemsArmor.netheriteBody && helmet == VanillaItemsArmor.netheriteHelmet) {
			if (s.equals(DamageSource.inFire) || s.equals(DamageSource.onFire) || s.equals(DamageSource.lava)) {
				e.setCanceled(true);
			}
		}*/
	}

	/*@SubscribeEvent
	public void onTickEvent(PlayerTickEvent ev) {

		ItemStack boot = player.inventory.armorItemInSlot(0);
		ItemStack leg = player.inventory.armorItemInSlot(1);
		ItemStack chestplate = player.inventory.armorItemInSlot(2);
		ItemStack head = player.inventory.armorItemInSlot(3);
		
		if(boot != null) 
			boots = boot.getItem();

		if(chestplate != null) 
			body = chestplate.getItem();

		if(leg != null) 
			legs = leg.getItem();

		if(head != null) 
			helmet = head.getItem();


		if(boots == v.angelicBoots && body == v.angelicBody && legs == v.angelicLegs && helmet == v.angelicHelmet){
			player.capabilities.isFlying = true;
			player.fallDistance = 0.0F;
		}
	}   */
}
