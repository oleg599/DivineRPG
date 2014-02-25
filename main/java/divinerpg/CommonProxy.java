package divinerpg;

import net.minecraft.command.CommandHandler;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import divinerpg.helper.DimensionHelper;
import divinerpg.helper.blocks.IceikaBlocks;
import divinerpg.helper.blocks.TwilightBlocks;
import divinerpg.helper.blocks.VetheaBlocks;
import divinerpg.helper.config.ConfigurationHelper;
import divinerpg.helper.event.DivineRPGCommands;
import divinerpg.helper.event.EventBucketFill;
import divinerpg.helper.event.EventClientLogin;
import divinerpg.helper.event.EventOverlay;
import divinerpg.helper.items.VanillaItemsOther;
import divinerpg.helper.mobs.IceikaMobRegistry;
import divinerpg.helper.mobs.MobSpawning;
import divinerpg.helper.mobs.OverworldMobRegistry;
import divinerpg.helper.mobs.TwilightMobRegistry;
import divinerpg.helper.mobs.VetheaMobRegistry;
import divinerpg.helper.recipes.TwilightRecipeHelper;
import divinerpg.helper.recipes.VanillaRecipeHelper;
import divinerpg.helper.utils.LangRegistry;
import divinerpg.twilight.blocks.TileEntityTwilightFurnace;
import divinerpg.worldgen.WorldGenOverworld;

public class CommonProxy {

	public void renderThings(){}
	
	//ClientProxy
	public void preInit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new EventClientLogin());
		MinecraftForge.EVENT_BUS.register(new EventOverlay());
		//MinecraftForge.EVENT_BUS.register(new EventArmorFullSet());
		MinecraftForge.EVENT_BUS.register(new EventBucketFill());
		GameRegistry.registerTileEntity(TileEntityTwilightFurnace.class, "Twilight Furnace");
		ConfigurationHelper.init();
		OverworldMobRegistry.init();
		TwilightMobRegistry.init();
		IceikaMobRegistry.init();
		VetheaMobRegistry.init();
		VanillaRecipeHelper.init();
		TwilightRecipeHelper.init();
		TwilightBlocks.init();
		IceikaBlocks.init();
		VetheaBlocks.init();
		LangRegistry.init();
		if(Reference.DEBUG){
		    LangRegistry.addBlockNames();
		    LangRegistry.addItemNames();
		}
		LangRegistry.closeFile();
		DimensionHelper.init();
		MobSpawning.addSpawns();
	}
	
	public void init(FMLInitializationEvent event){
		int wut = 10;//What the hell does the int even do?
		GameRegistry.registerWorldGenerator(new WorldGenOverworld(), wut);
	}
	
	public void postInit(FMLPostInitializationEvent event){
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(DivineRPG.Mod.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(VanillaItemsOther.tarBucket), new ItemStack(Items.bucket)));
	}

	public void serverStarting(FMLServerStartingEvent event){ 
		if (MinecraftServer.getServer().getCommandManager() instanceof ServerCommandManager) {
			((CommandHandler) MinecraftServer.getServer().getCommandManager()).registerCommand(new DivineRPGCommands());
		}
	}
}
