package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockStatue;
import net.divinerpg.blocks.vanilla.*;
import net.divinerpg.client.render.*;
import net.divinerpg.client.render.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VanillaBlocks {

	private static Material   rock                = Material.rock;
	private static Material   wool                = Material.cloth;
	private static Material   ground              = Material.ground;
	
	public static final Block rupeeOre            = new VanillaBlock(rock).setName("rupeeOre").setHardness(3.0F);
	public static final Block arlemiteOre         = new VanillaBlock(rock).setName("arlemiteOre").setHardness(3.0F);
	public static final Block realmiteOre         = new VanillaBlock(rock).setName("realmiteOre").setHardness(3.0F);
	public static final Block bloodgemOre         = new VanillaBlock(rock).setName("bloodgemOre").setHardness(3.0F);
	public static final Block netheriteOre        = new VanillaBlock(rock).setName("netheriteOre").setHardness(3.0F);

	public static final Block rupeeBlock          = new VanillaBlock(rock).setName("rupeeBlock").setHardness(3.0F);
	public static final Block arlemiteBlock       = new VanillaBlock(rock).setName("arlemiteBlock").setHardness(3.0F);
	public static final Block realmiteBlock       = new VanillaBlock(rock).setName("realmiteBlock").setHardness(3.0F);
	public static final Block bloodgemBlock       = new VanillaBlock(rock).setName("bloodgemBlock").setHardness(3.0F);
	public static final Block netheriteBlock      = new VanillaBlock(rock).setName("netheriteBlock").setHardness(3.0F);

	public static final Block spiderPumpkin       = new MobPumpkin().setName("spiderPumpkin");
	public static final Block enderPumpkin        = new MobPumpkin().setName("enderPumpkin");
	public static final Block creeperPumpkin      = new MobPumpkin().setName("creeperPumpkin");
	public static final Block skeletonPumpkin     = new MobPumpkin().setName("skeletonPumpkin");
	public static final Block blazePumpkin        = new MobPumpkin().setName("blazePumpkin");
	public static final Block zombiePumpkin       = new MobPumpkin().setName("zombiePumpkin");
	public static final Block frostPumpkin        = new MobPumpkin().setName("frostPumpkin");
	public static final Block cyclopsPumpkin      = new MobPumpkin().setName("cyclopsPumpkin");
	public static final Block ghastPumpkin        = new MobPumpkin().setName("ghastPumpkin");
	public static final Block glaconPumpkin       = new MobPumpkin().setName("glaconPumpkin");
	public static final Block enderWatcherPumpkin = new MobPumpkin().setName("enderWatcherPumpkin");
	public static final Block jungleSpiderPumpkin = new MobPumpkin().setName("jungleSpiderPumpkin");
	public static final Block hellSpiderPumpkin   = new MobPumpkin().setName("hellSpiderPumpkin");

	public static final Block checker             = new VanillaBlock(wool).setName("checker").setHardness(0.5F);
	public static final Block rainbowWool         = new VanillaBlock(wool).setName("rainbowWool").setHardness(0.5F);
	public static final Block crate               = new VanillaBlock(wool).setName("crate").setHardness(1.0F);
	public static final Block blueStone           = new VanillaBlock(wool).setName("blueStone").setHardness(1.0F);
	public static final Block purpleStone         = new VanillaBlock(wool).setName("purpleStone").setHardness(1.0F);

	public static final Block blueVane            = new VanillaBlock(rock).setName("blueVane").setHardness(2.0F);
	public static final Block cyanVane            = new VanillaBlock(rock).setName("cyanVane").setHardness(2.0F);
	public static final Block purpleVane          = new VanillaBlock(rock).setName("purpleVane").setHardness(2.0F);
	public static final Block redVane             = new VanillaBlock(rock).setName("redVane").setHardness(2.0F);
	public static final Block yellowVane          = new VanillaBlock(rock).setName("yellowVane").setHardness(2.0F);

	public static final Block divineRock          = new VanillaBlock(rock).setName("divineRock").setHardness(1.5F);
	public static final Block divineCraftingTable = new BlockDivineTable().setName("divineTable").setHardness(3.0F);
	public static final Block acceleron		  	  = new BlockAcceleron().setName("acceleron");
	public static final Block tar 				  = new BlockTar();

	public static final Block dyeBlockWhite 	  = new VanillaBlock(rock).setName("dyeBlock");
	public static final Block dyeBlockBlack 	  = new VanillaBlock(rock).setName("blackDyeBlock");
	public static final Block dyeBlockBrown 	  = new VanillaBlock(rock).setName("brownDyeBlock");
	public static final Block dyeBlockRed   	  = new VanillaBlock(rock).setName("redDyeBlock");
	public static final Block dyeBlockGreen 	  = new VanillaBlock(rock).setName("greenDyeBlock");
	public static final Block dyeBlockBlue  	  = new VanillaBlock(rock).setName("blueDyeBlock");
	public static final Block dyeBlockYellow	  = new VanillaBlock(rock).setName("yellowDyeBlock");
	public static final Block dyeBlockGray  	  = new VanillaBlock(rock).setName("grayDyeBlock");
	public static final Block dyeBlockLightGray   = new VanillaBlock(rock).setName("lightGrayDyeBlock");
	public static final Block dyeBlockOrange   	  = new VanillaBlock(rock).setName("orangeDyeBlock");
	public static final Block dyeBlockLightGreen  = new VanillaBlock(rock).setName("lightGreenDyeBlock");
	public static final Block dyeBlockLightBlue   = new VanillaBlock(rock).setName("lightBlueDyeBlock");
	public static final Block dyeBlockCyan   	  = new VanillaBlock(rock).setName("cyanDyeBlock");
	public static final Block dyeBlockPink        = new VanillaBlock(rock).setName("pinkDyeBlock");
	public static final Block dyeBlockPurple   	  = new VanillaBlock(rock).setName("purpleDyeBlock");
	public static final Block dyeBlockMagenta     = new VanillaBlock(rock).setName("magentaDyeBlock");
	
	public static final Block fancyWool 		  = new VanillaBlock(wool).setName("fancyWool");
	public static final Block iceBlock 			  = new VanillaBlock(ground).setName("iceBlock");
	public static final Block dirtBlock 		  = new VanillaBlock(ground).setName("dirtBlock");
	public static final Block soulSandBlock       = new VanillaBlock(ground).setName("soulSandBlock");
	public static final Block sandBlock 		  = new VanillaBlock(ground).setName("sandBlock");
	
	public static final Block lightFenceBlue 	  = new BlockLightFence(false, "blueFence").setName("blueFence");
    public static final Block lightFenceRed 	  = new BlockLightFence(false, "redFence").setName("redFence");
    public static final Block lightFenceGreen 	  = new BlockLightFence(false, "greenFence").setName("greenFence");

    public static final Block lightFenceBlueOn 	  = new BlockLightFence(true, "blueFenceOn").setName("blueFence");
    public static final Block lightFenceRedOn 	  = new BlockLightFence(true, "redFenceOn").setName("redFence");
    public static final Block lightFenceGreenOn   = new BlockLightFence(true, "greenFenceOn").setName("greenFence");
    
	public static final BlockStatue KingStatue 	  = new BlockStatue(EntityResourceLocation.KING_STATUE, new ModelKingStatue()).setName("kingOfScorchersStatue");
	public static final BlockStatue AncientStatue = new BlockStatue(EntityResourceLocation.ANCIENT_STATUE, new ModelAncientStatue()).setName("ancientEntityStatue");
	public static final BlockStatue AyeracoStatue = new BlockStatue(EntityResourceLocation.AYERACO_STATUE, new ModelAyeracoStatue()).setName("ayeracoStatue");
	public static final BlockStatue TDemonStatue  = new BlockStatue(EntityResourceLocation.TWILIGHT_STATUE, new ModelTwilightStatue()).setName("twilightDemonStatue");
	public static final BlockStatue VamacheronStatue = new BlockStatue(EntityResourceLocation.VAMACHERON_STATUE, new ModelVamacheronStatue()).setName("vamacheronStatue");
	public static final BlockStatue DensosStatue  = new BlockStatue(EntityResourceLocation.DENSOS_STATUE, new ModelDensosStatue()).setName("densosStatue");
	public static final BlockStatue DexStatue 	  = new BlockStatue(EntityResourceLocation.DEX_STATUE, new ModelDexStatue()).setName("dexStatue"); 
	public static final BlockStatue DramixStatue  = new BlockStatue(EntityResourceLocation.DRAMIX_STATUE, new ModelDramixStatue()).setName("dramixStatue");
	//public static final BlockStatue ParasectaStatue = new BlockStatue(EntityResourceLocation.PARASECTA_STATUE, new ModelParasecta()).setName("parasectaStatue");
	public static final BlockStatue SoulFiendStatue = new BlockStatue(EntityResourceLocation.SOUL_STATUE, new ModelSoulStatue()).setName("soulFiendStatue");
	public static final BlockStatue WatcherStatue = new BlockStatue(EntityResourceLocation.WATCHER_STATUE, new ModelWatcherStatue()).setName("theWatcherStatue");
}