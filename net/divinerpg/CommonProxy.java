package net.divinerpg;

import net.divinerpg.helper.blocks.*;
import net.divinerpg.helper.config.*;
import net.divinerpg.helper.event.EventHelper;
import net.divinerpg.helper.items.*;
import net.divinerpg.helper.mobs.OverworldMobRegistry;
import net.divinerpg.helper.recipes.OverworldRecipeHelper;
import net.divinerpg.overworld.worldgen.WorldGenOverworld;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void renderThings(){}
	
	//ClientProxy
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHelper.init(event);
		MinecraftForge.EVENT_BUS.register(new EventHelper());
		OverworldBlocks.init();
		OverworldItems.init();
		OverworldMobRegistry.init();
		OverworldRecipeHelper.init();
		TwilightBlocks.init();
	}
	
	public void init(FMLInitializationEvent event){
		int wut = 10;//What the hell does the int even do?
		GameRegistry.registerWorldGenerator(new WorldGenOverworld(), wut);
	}
	
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}