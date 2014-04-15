package net.divinerpg.client;

import net.divinerpg.Reference;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

public class ArcanaTickHandler {

	Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
	public void onTick(PlayerTickEvent event){
		if(event.phase == Phase.START){
			onTickStart();
		} else {
			onTickEnd();
		}
	}
	
	@SubscribeEvent
	public void onRender(RenderTickEvent event){
		onTickRender();
	}

	private void onTickRender() {
		ConfigurationHelper cfg = new ConfigurationHelper();
		if(mc.currentScreen == null) {
			GuiIngame gig = mc.ingameGUI;
			ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/arcanaBar.png"));
			int y = k - cfg.arcanaY;
			int x = i - cfg.arcanaX;
			gig.drawTexturedModalRect(x, y, 0, 0, 200, 9);
			gig.drawTexturedModalRect(x, y, 0, 9, (int)ArcanaHelper.getBarValue(), 20);  
		}
	}

	private void onTickEnd() {
		ArcanaHelper.updateAllBars();
	}

	private void onTickStart() { }
}