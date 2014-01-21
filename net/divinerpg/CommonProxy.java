package net.divinerpg;

import net.divinerpg.helper.DimensionHelper;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.event.EventHelper;
import net.divinerpg.helper.mobs.OverworldMobRegistry;
import net.divinerpg.helper.mobs.TwilightMobRegistry;
import net.divinerpg.helper.recipes.OverworldRecipeHelper;
import net.divinerpg.helper.recipes.TwilightRecipeHelper;
import net.divinerpg.vanilla.worldgen.WorldGenOverworld;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void renderThings(){}
	
	//ClientProxy
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new EventHelper());
		ConfigurationHelper.init(event);
		OverworldMobRegistry.init();
		TwilightMobRegistry.init();
		OverworldRecipeHelper.init();
		TwilightRecipeHelper.init();
		TwilightBlocks.init();
		DimensionHelper.init();

	}
	
	public void init(FMLInitializationEvent event){
		int wut = 10;//What the hell does the int even do?
		GameRegistry.registerWorldGenerator(new WorldGenOverworld(), wut);
	}
	
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}