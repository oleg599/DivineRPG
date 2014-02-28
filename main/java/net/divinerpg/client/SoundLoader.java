package net.divinerpg.client;

import net.divinerpg.Sounds;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SoundLoader {

	@SubscribeEvent
	public void load(SoundLoadEvent e){
		try{
			for(String sound : Sounds.files){
				
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
