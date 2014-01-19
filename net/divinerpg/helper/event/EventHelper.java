package net.divinerpg.helper.event;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHelper {
	
	@SubscribeEvent
	public void playerJoinWorld(EntityJoinWorldEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer p = (EntityPlayer) e.entity;
			if(p.worldObj.isRemote) {
				p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "Thank you for downloading and playing DivineRPG!"));
				p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "[Version: " + Reference.MOD_VERSION + "]"));
			}
		}
	}
}
