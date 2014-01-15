package net.divinerpg.client;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.divinerpg.CommonProxy;
import net.divinerpg.DivineRPG;
import net.divinerpg.client.render.entity.OverworldEntityRenderer;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{

	@Override
	public void renderThings() {
		OverworldEntityRenderer.init();
		MinecraftForge.EVENT_BUS.register(new SoundLoader());
		NetworkRegistry.INSTANCE.registerGuiHandler(DivineRPG.instance, new GuiHandler());
	}
	
}
