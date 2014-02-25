package divinerpg.client.render.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;
import divinerpg.Reference;


public class GUIOverlay {
	
	public void draw(){
        if(Minecraft.getMinecraft().playerController.shouldDrawHUD()) return;
        String text = Reference.MOD_NAME + ": " + Reference.MOD_VERSION;
        Minecraft.getMinecraft().fontRenderer.drawString(EnumChatFormatting.AQUA + text, 2, 2, 4210752);
    }

}
