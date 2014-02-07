package net.divinerpg.helper.blocks;

import net.divinerpg.vanilla.blocks.BlockAcceleron;
import net.divinerpg.vanilla.blocks.BlockDivineTable;
import net.divinerpg.vanilla.blocks.MobPumpkin;
import net.divinerpg.vanilla.blocks.VanillaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VanillaBlocks {

    static Material           rock                = Material.rock;
    static Material           wool                = Material.cloth;

    public static final Block rupeeOre            = new VanillaBlock(rock).setName("rupeeOre").setHardness(3.0F);
    public static final Block arlemiteOre         = new VanillaBlock(rock).setName("arlemiteOre").setHardness(3.0F);
    public static final Block realmiteOre         = new VanillaBlock(rock).setName("realmiteOre").setHardness(3.0F);
    public static final Block bloodgemOre         = new VanillaBlock(rock).setName("bloodgemOre").setHardness(3.0F);
    public static final Block netheriteOre        = new VanillaBlock(rock).setName("netheriteore").setHardness(3.0F);

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
}
