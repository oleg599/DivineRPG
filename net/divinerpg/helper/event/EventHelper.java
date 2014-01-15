package net.divinerpg.helper.event;

import net.divinerpg.Reference;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.achievement.GuiAchievement;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.server.FMLServerHandler;

public class EventHelper {
	
	@SubscribeEvent
	public void playerJoinWorld(EntityJoinWorldEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer p = (EntityPlayer) e.entity;
			if(p.worldObj.isRemote) {
				FMLClientHandler.instance().getClientPlayerEntity().sendChatMessage("Thank you for downloading and playing DivineRPG " + Reference.MOD_VERSION + ". Enjoy :)");
				FMLClientHandler.instance().getClientPlayerEntity().sendChatMessage("~Love from the DivineRPG staff");
			}
		}
	}
}
