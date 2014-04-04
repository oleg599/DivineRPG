package net.divinerpg;

import net.divinerpg.api.blocks.ModFluid;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class DivineRPG {

	@Instance(Reference.MOD_ID)
	public static DivineRPG instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	//Awesome seed: 1414274842007233730
	
	public static Fluid tarFluid = new ModFluid("Tar", 10, 5000);
	
	@SideOnly(Side.CLIENT)
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.renderThings();
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		proxy.serverStarting(event);
	}
}