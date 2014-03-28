package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModBucket;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.vanilla.items.ItemHordeHorn;
import net.divinerpg.vanilla.items.ItemMysteriousClock;
import net.divinerpg.vanilla.items.ItemVanillaSpawner;
import net.minecraft.item.Item;

public class VanillaItemsOther {

    public static final Item myseriousClock     = new ItemMysteriousClock();

    public static final Item rupeeIngot         = new ItemMod().setName("rupeeIngot");
    public static final Item arlemiteIngot      = new ItemMod().setName("arlemiteIngot");
    public static final Item realmiteIngot      = new ItemMod().setName("realmiteIngot");
    public static final Item shadowBar          = new ItemMod().setName("shadowBar");
    public static final Item hellstoneIngot     = new ItemMod().setName("hellstoneIngot");
    public static final Item netheriteIngot     = new ItemMod().setName("netheriteIngot");
    public static final Item bloodgem           = new ItemMod().setName("bloodgem");

    public static final Item jungleShards       = new ItemMod().setName("jungleShards");
    public static final Item divineShards       = new ItemMod().setName("divineShards");
    public static final Item corruptedShards    = new ItemMod().setName("corruptedShards");
    public static final Item moltenShards       = new ItemMod().setName("moltenShards");
    public static final Item enderShard         = new ItemMod().setName("enderShards");

    public static final Item jungleStone        = new ItemMod().setName("jungleStone");
    public static final Item divineStone        = new ItemMod().setName("divineStone");
    public static final Item corruptedStone     = new ItemMod().setName("corruptedStone");
    public static final Item moltenStone        = new ItemMod().setName("moltenStone");
    public static final Item enderStone         = new ItemMod().setName("enderStone");
    public static final Item healingStone       = new ItemMod().setName("healingStone");
    public static final Item shadowStone        = new ItemMod().setName("shadowStone");

    public static final Item aquaticIngot       = new ItemMod().setName("aquaticIngot");
    public static final Item aquaticPellets     = new ItemMod().setName("aquaticPellets");
    public static final Item pureAquaticPellets = new ItemMod().setName("pureAquaticPellets");
    public static final Item cyclopsEye         = new ItemMod().setName("cyclopsEye");
    public static final Item crabClaw           = new ItemMod().setName("crabClaw");
    public static final Item legendaryEnderEye  = new ItemMod().setName("legendaryEnderEye");
    public static final Item sharkFin           = new ItemMod().setName("sharkFin");
    public static final Item whaleFin           = new ItemMod().setName("whaleFin");
    public static final Item noImage            = new ItemMod().setName("noImage").setCreativeTab(null);
    public static final Item netheriteChunk     = new ItemMod().setName("netheriteChunk");
    public static final Item blueFireStone      = new ItemMod().setName("bluefireStone");
    public static final Item purpleBlaze        = new ItemMod().setName("purpleBlaze");
    public static final Item furyFire           = new ItemMod().setName("furyFire");

    public static final Item greenDiamondChunk  = new ItemMod().setName("greenDiamondChunk");
    public static final Item grayDiamondChunk   = new ItemMod().setName("grayDiamondChunk");
    public static final Item blueDiamondChunk   = new ItemMod().setName("blueDiamondChunk");
    public static final Item redDiamondChunk  	= new ItemMod().setName("redDiamondChunk");
    public static final Item yellowDiamondChunk = new ItemMod().setName("yellowDiamondChunk");
    
    public static final Item tarBucket 			= new ItemModBucket(VanillaBlocks.tar).setName("bucketOfTar");
    
    public static final Item watchingEye        = new ItemMod().setName("watchingEye");
    public static final Item callWatcher        = new ItemVanillaSpawner().setName("callOfTheWatcher");
    public static final Item infernalFlame      = new ItemVanillaSpawner().setName("infernalFlame");
    public static final Item hordeHorn      	= new ItemHordeHorn().setName("hordeHorn");
    
}