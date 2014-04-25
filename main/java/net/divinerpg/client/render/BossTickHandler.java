package net.divinerpg.client.render;

import net.divinerpg.Reference;
import net.divinerpg.api.entity.DivineBossStatus;
import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.api.entity.IDivineRPGBoss;
import net.divinerpg.entity.vanilla.EntityAncientEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BossTickHandler {
	
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
		ResourceLocation r = null;
		
		//if(EntityDivineRPGBoss.getName().equalsIgnoreCase("Ancient Entity")){
			r = set("ancientEntity");
		//}
		
		if(DivineBossStatus.statusBarTime > 0) {
            DivineBossStatus.statusBarTime--;
            FontRenderer fontrenderer = this.mc.fontRenderer;
            ScaledResolution scaledresolution = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
            GuiIngame gig = mc.ingameGUI;
            int i = scaledresolution.getScaledWidth();
            short short1 = 182;
            int j = i / 2 - short1 / 2;
            int k = (int)(DivineBossStatus.healthScale * (float)(short1 + 1));
            byte b0 = 12;
            this.mc.getTextureManager().bindTexture(r);

            gig.drawTexturedModalRect(j, b0, 0, 0, short1 + 1, 10);
            gig.drawTexturedModalRect(j, b0, 0, 10, short1 + 1, 10);

            if (k > 0) 
            	gig.drawTexturedModalRect(j, b0, 0, 0, k, 10);

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
	}
	
	public ResourceLocation set(String name){
		return new ResourceLocation(Reference.PREFIX + "textures/gui/bossBar/" + name + ".png");
	}

	private void onTickEnd() {
		
	}

	private void onTickStart() { }
}