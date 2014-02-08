package net.divinerpg.helper.event;

import net.minecraftforge.event.entity.player.FillBucketEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventBucketFill {

	@SubscribeEvent
	public void onBucketFilledEvent(FillBucketEvent e){
		e.current.getItem();
	}
	
}
