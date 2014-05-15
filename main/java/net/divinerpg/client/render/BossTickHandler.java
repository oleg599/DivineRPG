package net.divinerpg.client.render;

import net.divinerpg.Reference;
import net.divinerpg.api.entity.DivineBossStatus;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

public class BossTickHandler {

	private Minecraft mc = Minecraft.getMinecraft();

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
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(GL11.GL_BLEND);
         OpenGlHelper.glBlendFunc(770, 771, 1, 0);
         this.mc.mcProfiler.startSection("divineBossHealth");
         this.renderBossHealth();
         this.mc.mcProfiler.endSection();
         GL11.glDisable(GL11.GL_BLEND);
	}

	private void renderBossHealth() {
		ResourceLocation r = null;

		//if(EntityDivineRPGBoss.getName().equalsIgnoreCase("Ancient Entity")){
		r = set("ancientEntity");
		//}

		if(mc.currentScreen == null && DivineBossStatus.statusBarTime > 0) {
			DivineBossStatus.statusBarTime--;
			GuiIngame gig = mc.ingameGUI;
			FontRenderer fontrenderer = this.mc.fontRenderer;
			ScaledResolution scaledresolution = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
			int i = scaledresolution.getScaledWidth();
			short short1 = 182;
			int j = i / 2 - short1 / 2;
			int k = (int)(DivineBossStatus.healthScale * (float)(short1 + 1));
			int b0 = 12;
			this.mc.getTextureManager().bindTexture(r);
			int bar = short1 + 1;
			gig.drawTexturedModalRect(j, b0, 0, 10, bar, 10);

			//if(k > 0)
			//	gig.drawTexturedModalRect(j, b0, 0, 0, k, 10);
		}
	}

	public ResourceLocation set(String name){
		return new ResourceLocation(Reference.PREFIX + "textures/gui/bossBar/" + name + ".png");
	}

	private void onTickEnd() { }

	private void onTickStart() { }
}