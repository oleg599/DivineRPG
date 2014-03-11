package net.divinerpg;

import net.divinerpg.api.entity.EventDeath;
import net.divinerpg.helper.DimensionHelper;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.event.DivineRPGCommands;
import net.divinerpg.helper.event.EventArmorFullSet;
import net.divinerpg.helper.event.EventBonemeal;
import net.divinerpg.helper.event.EventBucketFill;
import net.divinerpg.helper.event.EventClientLogin;
import net.divinerpg.helper.event.EventOverlay;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.mobs.IceikaMobRegistry;
import net.divinerpg.helper.mobs.MobSpawning;
import net.divinerpg.helper.mobs.OverworldMobRegistry;
import net.divinerpg.helper.mobs.TwilightMobRegistry;
import net.divinerpg.helper.mobs.VetheaMobRegistry;
import net.divinerpg.helper.recipes.TwilightRecipeHelper;
import net.divinerpg.helper.recipes.VanillaRecipeHelper;
import net.divinerpg.helper.utils.LangRegistry;
import net.divinerpg.twilight.blocks.TileEntityTwilightFurnace;
import net.divinerpg.worldgen.WorldGenOverworld;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy{

	public void renderThings(){}
	
	//ClientProxy
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("[DIVINE RPG] ADDING EVENTS");
		MinecraftForge.EVENT_BUS.register(new EventClientLogin());
		MinecraftForge.EVENT_BUS.register(new EventOverlay());
		MinecraftForge.EVENT_BUS.register(new EventBucketFill());
		MinecraftForge.EVENT_BUS.register(new EventBonemeal());
		MinecraftForge.EVENT_BUS.register(new EventDeath());
		MinecraftForge.EVENT_BUS.register(new EventArmorFullSet());
		System.out.println("[DIVINE RPG] REGISTERING TILE ENTITIES");
		GameRegistry.registerTileEntity(TileEntityTwilightFurnace.class, "Twilight Furnace");
		System.out.println("[DIVINE RPG] ADDING CONFIGURATIONS");
		ConfigurationHelper.init();
		System.out.println("[DIVINE RPG] ADDING MOBS");
		OverworldMobRegistry.init();
		TwilightMobRegistry.init();
		IceikaMobRegistry.init();
		VetheaMobRegistry.init();
		System.out.println("[DIVINE RPG] ADDING CRAFTING/SMELTING RECIPES");
		VanillaRecipeHelper.init();
		TwilightRecipeHelper.init();
		
		System.out.println("[DIVINE RPG] ADDING BLOCKS");
		TwilightBlocks.init();
		IceikaBlocks.init();
		VetheaBlocks.init();
		
		LangRegistry.init();
		if(Reference.DEBUG){
		    LangRegistry.addBlockNames();
		    LangRegistry.addItemNames();
		}
		LangRegistry.closeFile();
		System.out.println("[DIVINERPG] ADDING DIMENSTIONS");
		DimensionHelper.init();
		System.out.println("[DIVINERPG] ADDING MOB SPAWNS");
		MobSpawning.addSpawns();
	}
	
	public void init(FMLInitializationEvent event){
		int wut = 10;//What the hell does the int even do?
		System.out.println("[DIVINER PG] ADDING WORLD GENERATIONS");
		GameRegistry.registerWorldGenerator(new WorldGenOverworld(), wut);
		FMLCommonHandler.instance().bus().register(new EventArmorFullSet());

	}
	
	public void postInit(FMLPostInitializationEvent event){
		DivineAPI.addBucket(DivineRPG.Mod, new ItemStack(VanillaItemsOther.tarBucket));
	}

	public void serverStarting(FMLServerStartingEvent event){ 
		System.out.println("[DIVINE RPG] ADDING COMMANDS");
		if (MinecraftServer.getServer().getCommandManager() instanceof ServerCommandManager) {
			((CommandHandler) MinecraftServer.getServer().getCommandManager()).registerCommand(new DivineRPGCommands());
		}
	}
}
