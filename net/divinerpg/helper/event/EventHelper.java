package net.divinerpg.helper.event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VanillaItems;
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

public class EventHelper {

	public boolean hasSeen;
	
	@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void clientLoggedIn(EntityJoinWorldEvent e) {

        if (e.entity instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) e.entity;
            if (p.worldObj.isRemote) {
                try {
                    if(!UpdateChecker.isOnline()){
                    	if (p.getDisplayName().equals("sheenrox82")) {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Wait, your actually playing DivineRPG?!"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Turn your internets on noob."));
                    			hasSeen = true;}
                    	}
                    	else if (p.getDisplayName().equals("deathman12e3") || p.getDisplayName().equals("The_SlayerMC") || p.getDisplayName().equals("Mazetar")
                        		|| p.getDisplayName().equals("itzakillshot") || p.getDisplayName().equals("geekclb") || p.getDisplayName().equals("Instanity414all")) {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Oh hey! A DivineRPG Developer!"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Your internet crashed from how awesome you are."));
                    			hasSeen = true;}
                    	}
                    	else {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you " + p.getDisplayName() + ", for downloading and playing" + DivineAPI.GREEN + " DivineRPG!"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "[Version: " + Reference.MOD_VERSION + "]"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Unable to check for latest version, you may want to check your internet connection!"));
                    			hasSeen = true;}
                    	}
                    }
                    if (UpdateChecker.isUpdateAvailable() && UpdateChecker.isOnline()) {
                    	if (p.getDisplayName().equals("sheenrox82")) {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Wait, your actually playing DivineRPG?!"));
                        		p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "By the way your using a outdated version."));
                        		hasSeen = true;}
                    	}
                    	else if (p.getDisplayName().equals("deathman12e3") || p.getDisplayName().equals("The_SlayerMC") || p.getDisplayName().equals("Mazetar")
                        		|| p.getDisplayName().equals("itzakillshot") || p.getDisplayName().equals("geekclb") || p.getDisplayName().equals("Instanity414all")) {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Oh hey! A DivineRPG Developer!"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "Wow, you don't even have the newest version of your own mod."));
                    			hasSeen = true;}
                    	}
                    	else {
                    		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://raw.github.com/TheSlayerMC/DivineRPG/master/Version.txt").openStream()));
                    		String curVersion = versionFile.readLine();
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you " + p.getDisplayName() + ", for downloading and playing" + DivineAPI.GREEN + " DivineRPG!"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.RED, "[Version: " + Reference.MOD_VERSION + "]"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "A DivineRPG update is avaliable."));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "[New Version: " + curVersion + "]")); 
                    			hasSeen = true;}
                        }
                    }
                    if ((!UpdateChecker.isUpdateAvailable()) && UpdateChecker.isOnline()) {
                    	if (p.getDisplayName().contains("sheenrox82")) {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Wait, your actually playing DivineRPG?!"));
                    			hasSeen = true;}
                    	}
                    	else if (p.getDisplayName().equals("deathman12e3") || p.getDisplayName().equals("The_SlayerMC") || p.getDisplayName().equals("Mazetar")
                        		|| p.getDisplayName().equals("itzakillshot") || p.getDisplayName().equals("geekclb") || p.getDisplayName().equals("Instanity414all")) {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "Oh hey! A DivineRPG Developer!"));
                    			hasSeen = true;}
                    	}
                    	else {
                    		if(!hasSeen) {
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you "  + p.getDisplayName() + ", for downloading and playing" + DivineAPI.GREEN + " DivineRPG!"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "[Version: " + Reference.MOD_VERSION + "]"));
                    			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "DivineRPG is up to date."));
                    			hasSeen = true;}
                    	}
                    }
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
    
    private VanillaItems v;
    
    @SubscribeEvent
    public void onTickEvent(TickEvent ev) {
		
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		ItemStack boot = player.inventory.armorInventory[0];
		ItemStack leg = player.inventory.armorInventory[1];
		ItemStack chestplate = player.inventory.armorInventory[2];
		ItemStack head = player.inventory.armorInventory[3];
		
		Item boots = null;
		Item chest = null;
		Item legs = null;
		Item helmet = null;
		
		if (boot != null) {
			boots = boot.getItem();
		}
		if (chestplate != null) {
			chest = chestplate.getItem();
		}
		if (leg != null) {
			legs = leg.getItem();
		}
		if (head != null) {
			helmet = head.getItem();
		}

		if(boots == v.angelicBoots && chest == v.angelicBody && legs == v.angelicLegs && helmet == v.angelicHelmet){
			player.capabilities.isFlying = true;
			player.fallDistance = 0.0F;
		}//TODO Figure out why it isn't working.
    }   
}
