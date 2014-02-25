package net.divinerpg.helper.event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EventClientLogin {

	public boolean hasSeen;
	
	@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onPlayerLogin(EntityJoinWorldEvent e) {

        if (e.entity instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) e.entity;
            if (p.worldObj.isRemote) {
            	if(!hasSeen) {
                try {
                    if(!UpdateChecker.isOnline()){
                    	if (p.getDisplayName().equals("sheenrox82")) {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Wait, your actually playing DivineRPG?!"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Turn your internets on noob."));
                    	}
                    	else if (p.getDisplayName().equals("deathman12e3") || p.getDisplayName().equals("The_SlayerMC") || p.getDisplayName().equals("Mazetar")
                        		|| p.getDisplayName().equals("itzakillshot") || p.getDisplayName().equals("geekclb") || p.getDisplayName().equals("Instanity414all")) {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Oh hey! A DivineRPG Developer!"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Your internet crashed from how awesome you are."));
                    	}
                    	else {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you " + p.getDisplayName() + ", for downloading and playing" + DivineAPI.GREEN + " DivineRPG!"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "[Version: " + Reference.MOD_VERSION + "]"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Unable to check for latest version, you may want to check your internet connection!"));
                    	}
                    }
                    if (UpdateChecker.isUpdateAvailable() && UpdateChecker.isOnline()) {
                    	if (p.getDisplayName().equals("sheenrox82")) {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Wait, your actually playing DivineRPG?!"));
                        		p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "By the way your using a outdated version."));
                    	}
                    	else if (p.getDisplayName().equals("deathman12e3") || p.getDisplayName().equals("The_SlayerMC") || p.getDisplayName().equals("Mazetar")
                        		|| p.getDisplayName().equals("itzakillshot") || p.getDisplayName().equals("geekclb") || p.getDisplayName().equals("Instanity414all")) {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Oh hey! A DivineRPG Developer!"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "Wow, you don't even have the newest version of your own mod."));
                    	}
                    	else {
                    		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://raw.github.com/TheSlayerMC/DivineRPG/master/Version.txt").openStream()));
                    		String curVersion = versionFile.readLine();
                    		p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you " + p.getDisplayName() + ", for downloading and playing" + DivineAPI.GREEN + " DivineRPG!"));
                    		p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.RED, "[Version: " + Reference.MOD_VERSION + "]"));
                    		p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "A DivineRPG update is avaliable."));
                    		p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "[New Version: " + curVersion + "]")); 
                        }
                    }
                    if ((!UpdateChecker.isUpdateAvailable()) && UpdateChecker.isOnline()) {
                    	if (p.getDisplayName().contains("sheenrox82")) {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Wait, your actually playing DivineRPG?!"));
                    	}
                    	else if (p.getDisplayName().equals("deathman12e3") || p.getDisplayName().equals("The_SlayerMC") || p.getDisplayName().equals("Mazetar")
                        		|| p.getDisplayName().equals("itzakillshot") || p.getDisplayName().equals("geekclb") || p.getDisplayName().equals("Instanity414all")) {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Oh hey! A DivineRPG Developer!"));
                    	}
                    	else {
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you "  + p.getDisplayName() + ", for downloading and playing" + DivineAPI.GREEN + " DivineRPG!"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "[Version: " + Reference.MOD_VERSION + "]"));
                    			p.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "DivineRPG is up to date."));
                    	}
                    }
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
                hasSeen = true;
            }
        }
    } 
}
