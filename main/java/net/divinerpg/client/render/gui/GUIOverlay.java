package net.divinerpg.client.render.gui;

import net.divinerpg.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;

public class GUIOverlay {
	
	public void draw(){
        String text = Reference.MOD_NAME + ": " + Reference.MOD_VERSION;
        Minecraft.getMinecraft().fontRenderer.drawString(EnumChatFormatting.AQUA + text, 2, 2, 4210752);
    }

}
