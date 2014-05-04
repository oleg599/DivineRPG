package net.divinerpg;

import net.divinerpg.blocks.iceika.tile_entity.TileEntityFrostedChest;
import net.divinerpg.blocks.twilight.TileEntityTwilightFurnace;
import net.divinerpg.blocks.vethea.container.tile_entity.TileEntityInfusionTable;
import net.divinerpg.client.ArcanaTickHandler;
import net.divinerpg.client.render.BossTickHandler;
import net.divinerpg.client.render.block.TileEntityStatue;
import net.divinerpg.dimension.gen.vanilla.WorldGenOverworld;
import net.divinerpg.helper.DimensionHelper;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.ArcanaBlocks;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.entity.ArcanaEntityRegistry;
import net.divinerpg.helper.entity.IceikaEntityRegistry;
import net.divinerpg.helper.entity.MobSpawning;
import net.divinerpg.helper.entity.OverworldEntityRegistry;
import net.divinerpg.helper.entity.TwilightEntityRegistry;
import net.divinerpg.helper.entity.VetheaEntityRegistry;
import net.divinerpg.helper.event.DivineRPGCommands;
import net.divinerpg.helper.event.EventArmorFullSet;
import net.divinerpg.helper.event.EventBonemeal;
import net.divinerpg.helper.event.EventBucketFill;
import net.divinerpg.helper.event.EventClientLogin;
import net.divinerpg.helper.event.EventDeath;
import net.divinerpg.helper.event.EventOverlay;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.recipes.TwilightRecipeHelper;
import net.divinerpg.helper.recipes.VanillaRecipeHelper;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CommonProxy{

	public void renderThings(){}

	//ClientProxy
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("[DIVINERPG] ADDING EVENTS");
		if(!Reference.DEBUG)
			DivineAPI.addEventBus(new EventClientLogin());
		DivineAPI.addEventBus(new EventBucketFill());
		DivineAPI.addEventBus(new EventBonemeal());
		DivineAPI.addEventBus(new EventArmorFullSet());
		//DivineAPI.addEventBus(new EventDeath());
		System.out.println("[DIVINERPG] REGISTERING TILE ENTITIES");
		GameRegistry.registerTileEntity(TileEntityTwilightFurnace.class, "Twilight Furnace");
		GameRegistry.registerTileEntity(TileEntityInfusionTable.class, "Infusion Table");
		GameRegistry.registerTileEntity(TileEntityStatue.class, "Statue");
		GameRegistry.registerTileEntity(TileEntityFrostedChest.class, "Iceika Chest");
		System.out.println("[DIVINERPG] ADDING CONFIGURATIONS");
		ConfigurationHelper.init();
		System.out.println("[DIVINERPG] ADDING ENTITYS");
		OverworldEntityRegistry.init();
		TwilightEntityRegistry.init();
		IceikaEntityRegistry.init();
		VetheaEntityRegistry.init();//TODO Figure out why it crashes when vethean mob spawns
		ArcanaEntityRegistry.init();
		System.out.println("[DIVINERPG] ADDING CRAFTING/SMELTING RECIPES");
		VanillaRecipeHelper.init();
		TwilightRecipeHelper.init();

		System.out.println("[DIVINERPG] ADDING BLOCKS");
		TwilightBlocks.init();
		IceikaBlocks.init();
		VetheaBlocks.init();
		ArcanaBlocks.init();

		if(Reference.DEBUG){
			System.out.println("[DIVINERPG] DEBUG MODE");
			DivineAPI.addEventBus(new EventOverlay());
			LangRegistry.init();
			LangRegistry.addBlockNames();
			LangRegistry.addItemNames();
			LangRegistry.closeFile();

			SoundGenerator.init();
			SoundGenerator.addSounds();
			SoundGenerator.addToFile("{");
			SoundGenerator.addSingleSound();
			SoundGenerator.addMobSound();
			SoundGenerator.addItemSound();
			SoundGenerator.addToFile("}");
			SoundGenerator.addToFile("\n");
			SoundGenerator.addObject();
			SoundGenerator.closeFile();
		}
		System.out.println("[DIVINERPG] ADDING DIMENSIONS");
		DimensionHelper.init();
		System.out.println("[DIVINERPG] ADDING MOB SPAWNS");
		MobSpawning.addSpawns();
		DivineAPI.addSpecialEventBus(new ArcanaTickHandler());
	}

	public void init(FMLInitializationEvent event){
		int wut = 10;//What the hell does the int even do?
		System.out.println("[DIVINERPG] ADDING WORLD GENERATIONS");
		GameRegistry.registerWorldGenerator(new WorldGenOverworld(), wut);
		DivineAPI.addSpecialEventBus(new EventArmorFullSet());
		DivineAPI.addSpecialEventBus(new BossTickHandler());
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
