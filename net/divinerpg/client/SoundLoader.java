package net.divinerpg.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.divinerpg.Sounds;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class SoundLoader {

	@SubscribeEvent
	public void load(SoundLoadEvent e){
		try{
			for(String sound : Sounds.files){
				//e.manager.
			}
		}catch(Exception ex){

		}
	}
}
