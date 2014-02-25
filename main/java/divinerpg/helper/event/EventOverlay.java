package divinerpg.helper.event;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import divinerpg.client.render.gui.GUIOverlay;
import divinerpg.helper.config.ConfigurationHelper;


public class EventOverlay {

	private final GUIOverlay gui = new GUIOverlay();

	@SubscribeEvent
	public void renderOverlay(RenderGameOverlayEvent event){
		if(event.isCancelable() || event.type != ElementType.EXPERIENCE) return;
		if(ConfigurationHelper.canShowIngameVersion)
			gui.draw();
	}
}
