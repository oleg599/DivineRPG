package net.divinerpg;

import net.divinerpg.helper.DimensionHelper;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.ArcanaBlocks;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.event.DivineRPGCommands;
import net.divinerpg.helper.event.EventArmorFullSet;
import net.divinerpg.helper.event.EventBonemeal;
import net.divinerpg.helper.event.EventBucketFill;
import net.divinerpg.helper.event.EventClientLogin;
import net.divinerpg.helper.event.EventDeath;
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
import net.divinerpg.twilight.entity.mob.model.block.TileEntityStatue;
import net.divinerpg.vethea.blocks.tileentity.TileEntityInfusionTable;
import net.divinerpg.worldgen.WorldGenOverworld;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy{

	public void renderThings(){}
	
	//ClientProxy
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("[DIVINERPG] ADDING EVENTS");
		DivineAPI.addEventBus(new EventClientLogin());
		DivineAPI.addEventBus(new EventOverlay());
		DivineAPI.addEventBus(new EventBucketFill());
		DivineAPI.addEventBus(new EventBonemeal());
		DivineAPI.addEventBus(new EventArmorFullSet());
		DivineAPI.addEventBus(new EventDeath());
		System.out.println("[DIVINERPG] REGISTERING TILE ENTITIES");
		GameRegistry.registerTileEntity(TileEntityTwilightFurnace.class, "Twilight Furnace");
		GameRegistry.registerTileEntity(TileEntityInfusionTable.class, "Infusion Table");
		GameRegistry.registerTileEntity(TileEntityStatue.class, "Statue");
		System.out.println("[DIVINERPG] ADDING CONFIGURATIONS");
		ConfigurationHelper.init();
		System.out.println("[DIVINERPG] ADDING MOBS");
		OverworldMobRegistry.init();
		TwilightMobRegistry.init();
		IceikaMobRegistry.init();
		VetheaMobRegistry.init();
		System.out.println("[DIVINERPG] ADDING CRAFTING/SMELTING RECIPES");
		VanillaRecipeHelper.init();
		TwilightRecipeHelper.init();
		
		System.out.println("[DIVINERPG] ADDING BLOCKS");
		TwilightBlocks.init();
		IceikaBlocks.init();
		VetheaBlocks.init();
		ArcanaBlocks.init();
		
		LangRegistry.init();
		if(Reference.DEBUG){
		    LangRegistry.addBlockNames();
		    LangRegistry.addItemNames();
		}
		LangRegistry.closeFile();
		System.out.println("[DIVINERPG] ADDING DIMENSIONS");
		DimensionHelper.init();
		System.out.println("[DIVINERPG] ADDING MOB SPAWNS");
		MobSpawning.addSpawns();
	}
	
	public void init(FMLInitializationEvent event){
		int wut = 10;//What the hell does the int even do?
		System.out.println("[DIVINERPG] ADDING WORLD GENERATIONS");
		GameRegistry.registerWorldGenerator(new WorldGenOverworld(), wut);
		DivineAPI.addSpecialEventBus(new EventArmorFullSet());
	}
	
	public void postInit(FMLPostInitializationEvent event){
		DivineAPI.addBucket(DivineRPG.tarFluid, new ItemStack(VanillaItemsOther.tarBucket));
	}

	public void serverStarting(FMLServerStartingEvent event){ 
		System.out.println("[DIVINERPG] ADDING COMMANDS");
		if (MinecraftServer.getServer().getCommandManager() instanceof ServerCommandManager) {
			((CommandHandler) MinecraftServer.getServer().getCommandManager()).registerCommand(new DivineRPGCommands());
		}
	}
}
