package net.divinerpg.helper.event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHelper {

	@SubscribeEvent
	public void playerJoinWorld(EntityJoinWorldEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer p = (EntityPlayer) e.entity;
			if(p.worldObj.isRemote) {
				try {
					if (UpdateChecker.isUpdateAvailable()) {
						p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "Thank you for downloading and playing DivineRPG!"));
						p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "[New Version: " + Reference.MOD_VERSION + "]"));
						p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.BLUE, "A DivineRPG update is avaliable."));
					}
					if ((!UpdateChecker.isUpdateAvailable())) {
						p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "Thank you for downloading and playing DivineRPG!"));
						p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "[Version: " + Reference.MOD_VERSION + "]"));
						p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.BLUE, "DivineRPG is up to date."));
					}
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			
			}
		}
	}
}
