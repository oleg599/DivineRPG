package net.divinerpg.client;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.divinerpg.CommonProxy;
import net.divinerpg.DivineRPG;
import net.divinerpg.client.render.entity.IceikaEntityRenderer;
import net.divinerpg.client.render.entity.OverworldEntityRenderer;
import net.divinerpg.client.render.entity.TwilightEntityRenderer;
import net.divinerpg.client.render.entity.VetheaEntityRenderer;
import net.divinerpg.helper.mobs.IceikaMobRegistry;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{

	@Override
	public void renderThings() {
		OverworldEntityRenderer.init();
		TwilightEntityRenderer.init();
		IceikaEntityRenderer.init();
		VetheaEntityRenderer.init();
		MinecraftForge.EVENT_BUS.register(new SoundLoader());
		NetworkRegistry.INSTANCE.registerGuiHandler(DivineRPG.instance, new GuiHandler());
	}
}