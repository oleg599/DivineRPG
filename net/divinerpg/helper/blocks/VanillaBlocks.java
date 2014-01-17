package net.divinerpg.helper.blocks;

import net.divinerpg.overworld.blocks.MobPumpkin;
import net.divinerpg.overworld.blocks.VanillaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VanillaBlocks {


    static Material           rock                = Material.field_151576_e;
    static Material           wool                = Material.field_151580_n;

    public static final Block rupeeOre            = new VanillaBlock(rock).setName("rupeeOre").func_149711_c(3.0F);
    public static final Block arlemiteOre         = new VanillaBlock(rock).setName("arlemiteOre").func_149711_c(3.0F);
    public static final Block realmiteOre         = new VanillaBlock(rock).setName("realmiteOre").func_149711_c(3.0F);
    public static final Block bloodgemOre         = new VanillaBlock(rock).setName("bloodgemOre").func_149711_c(3.0F);
    public static final Block netheriteOre        = new VanillaBlock(rock).setName("netheriteore").func_149711_c(3.0F);

    public static final Block rupeeBlock          = new VanillaBlock(rock).setName("rupeeBlock").func_149711_c(3.0F);
    public static final Block arlemiteBlock       = new VanillaBlock(rock).setName("arlemiteBlock").func_149711_c(3.0F);
    public static final Block realmiteBlock       = new VanillaBlock(rock).setName("realmiteBlock").func_149711_c(3.0F);
    public static final Block bloodgemBlock       = new VanillaBlock(rock).setName("bloodgemBlock").func_149711_c(3.0F);
    public static final Block netheriteBlock      = new VanillaBlock(rock).setName("netheriteBlock").func_149711_c(3.0F);

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

    public static final Block checker             = new VanillaBlock(wool).setName("checker").func_149711_c(0.5F);
    public static final Block rainbowWool         = new VanillaBlock(wool).setName("rainbowWool").func_149711_c(0.5F);
    public static final Block crate               = new VanillaBlock(wool).setName("crate").func_149711_c(1.0F);
    public static final Block blueStone           = new VanillaBlock(wool).setName("blueStone").func_149711_c(1.0F);
    public static final Block purpleStone         = new VanillaBlock(wool).setName("purpleStone").func_149711_c(1.0F);

    public static final Block blueVane            = new VanillaBlock(rock).setName("blueVane").func_149711_c(2.0F);
    public static final Block cyanVane            = new VanillaBlock(rock).setName("cyanVane").func_149711_c(2.0F);
    public static final Block purpleVane          = new VanillaBlock(rock).setName("purpleVane").func_149711_c(2.0F);
    public static final Block redVane             = new VanillaBlock(rock).setName("redVane").func_149711_c(2.0F);
    public static final Block yellowVane          = new VanillaBlock(rock).setName("yellowVane").func_149711_c(2.0F);

    public static final Block divineRock          = new VanillaBlock(rock).setName("divineRock").func_149711_c(1.5F);

//    public static void init() {
//        DivineAPI.addBlock(rupeeOre, "Rupee Ore");
//        DivineAPI.addBlock(arlemiteOre, "Arlemite Ore");
//        DivineAPI.addBlock(realmiteOre, "Realmite Ore");
//        DivineAPI.addBlock(bloodgemOre, "BloodGem Ore");
//        DivineAPI.addBlock(netheriteOre, "Netherite Ore");
//
//        DivineAPI.addBlock(rupeeBlock, "Rupee Block");
//        DivineAPI.addBlock(arlemiteBlock, "Arlemite Block");
//        DivineAPI.addBlock(realmiteBlock, "Realmite Block");
//        DivineAPI.addBlock(bloodgemBlock, "BloodGem Block");
//        DivineAPI.addBlock(netheriteBlock, "Netherite Block");
//
//        DivineAPI.addBlock(spiderPumpkin, "Spider Pumpkin");
//        DivineAPI.addBlock(creeperPumpkin, "Creeper Pumpkin");
//        DivineAPI.addBlock(enderPumpkin, "Enderman Pumpkin");
//        DivineAPI.addBlock(skeletonPumpkin, "Skeleton Pumpkin");
//        DivineAPI.addBlock(blazePumpkin, "Blaze Pumpkin");
//        DivineAPI.addBlock(zombiePumpkin, "Zombie Pumpkin");
//        DivineAPI.addBlock(frostPumpkin, "Frost Pumpkin");
//        DivineAPI.addBlock(cyclopsPumpkin, "Cyclops Pumpkin");
//        DivineAPI.addBlock(ghastPumpkin, "Ghast Pumpkin");
//        DivineAPI.addBlock(glaconPumpkin, "Glacon Pumpkin");
//        DivineAPI.addBlock(enderWatcherPumpkin, "EnderWatcher Pumpkin");
//        DivineAPI.addBlock(jungleSpiderPumpkin, "Jungle Spider Pumpkin");
//        DivineAPI.addBlock(hellSpiderPumpkin, "Hell Spider Pumpkin");
//
//        DivineAPI.addBlock(checker, "Checker Block");
//        DivineAPI.addBlock(rainbowWool, "Rainbow Wool");
//        DivineAPI.addBlock(crate, "Crate");
//        DivineAPI.addBlock(blueStone, "Blue Stone");
//        DivineAPI.addBlock(purpleStone, "Purple Stone");
//        DivineAPI.addBlock(blueVane, "Blue Vane");
//        DivineAPI.addBlock(cyanVane, "Cyan Vane");
//        DivineAPI.addBlock(purpleVane, "Purple Vane");
//        DivineAPI.addBlock(redVane, "Red Vane");
//        DivineAPI.addBlock(yellowVane, "Yellow Vane");
//
//        DivineAPI.addBlock(divineRock, "Divine Rock");
//    }

}
