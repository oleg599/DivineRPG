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
    public void clientLoggedIn(EntityJoinWorldEvent e) {

        if (e.entity instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) e.entity;
            if (p.worldObj.isRemote) {
                try {
                    if(!UpdateChecker.isOnline()){
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you for downloading and playing" + EnumChatFormatting.GREEN + " DivineRPG!"));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "[Version: " + Reference.MOD_VERSION + "]"));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.LIGHT_PURPLE, "Unable to check for latest version, you may want to check your internet connection!"));
                    }
                    if (UpdateChecker.isUpdateAvailable() && UpdateChecker.isOnline()) {
                        BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://dl.dropboxusercontent.com/s/xddtt5g4g8xz1ut/DivineRPG1.7Update.txt").openStream()));
                        String curVersion = versionFile.readLine();
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you for downloading and playing" + EnumChatFormatting.GREEN + " DivineRPG!"));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.RED, "[Version: " + Reference.MOD_VERSION + "]"));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "A DivineRPG update is avaliable."));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "[New Version: " + curVersion + "]"));
                    }
                    if ((!UpdateChecker.isUpdateAvailable()) && UpdateChecker.isOnline()) {
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "Thank you for downloading and playing" + EnumChatFormatting.GREEN + " DivineRPG!"));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "[Version: " + Reference.MOD_VERSION + "]"));
                        p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "DivineRPG is up to date."));
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
