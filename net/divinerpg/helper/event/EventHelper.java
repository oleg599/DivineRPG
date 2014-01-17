package net.divinerpg.helper.event;

import net.divinerpg.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHelper {
	
	@SubscribeEvent
	public void playerJoinWorld(EntityJoinWorldEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer p = (EntityPlayer) e.entity;
			if(p.worldObj.isRemote) {
				FMLClientHandler.instance().getClientPlayerEntity().sendChatMessage("Thank you for downloading and playing DivineRPG! [Version: " + Reference.MOD_VERSION + "]  Enjoy! :)");
			}
		}
	}
}
