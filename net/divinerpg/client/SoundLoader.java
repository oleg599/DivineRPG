package net.divinerpg.client;

import net.divinerpg.Reference;
import net.divinerpg.Sounds;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
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
