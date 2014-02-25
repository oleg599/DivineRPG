package divinerpg.client;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.NetworkRegistry;
import divinerpg.CommonProxy;
import divinerpg.DivineRPG;
import divinerpg.client.render.entity.IceikaEntityRenderer;
import divinerpg.client.render.entity.OverworldEntityRenderer;
import divinerpg.client.render.entity.TwilightEntityRenderer;
import divinerpg.client.render.entity.VetheaEntityRenderer;

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