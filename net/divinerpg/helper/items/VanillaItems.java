package net.divinerpg.helper.items;

import net.divinerpg.api.items.*;
import net.divinerpg.helper.material.ArmorMaterialMod;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.vanilla.items.*;
import net.minecraft.item.Item;

public class VanillaItems {
    public static final int  HEAD               = 0, BODY = 1, LEGS = 2, BOOTS = 3;

    public static final Item myseriousClock     = new ItemMysteriousClock();

    public static final Item rupeeIngot         = new ItemMod().setName("rupeeIngot");
    public static final Item arlemiteIngot      = new ItemMod().setName("arlemiteIngot");
    public static final Item realmiteIngot      = new ItemMod().setName("realmiteIngot");
    public static final Item shadowBar          = new ItemMod().setName("shadowBar");
    public static final Item hellstoneIngot     = new ItemMod().setName("hellstoneIngot");
    public static final Item netheriteIngot     = new ItemMod().setName("netheriteIngot");
    public static final Item bloodgem           = new ItemMod().setName("bloodgem");

    public static final Item jungleShards       = new ItemMod().setName("jungleShards");
    public static final Item iceShards          = new ItemMod().setName("iceShards");
    public static final Item divineShards       = new ItemMod().setName("divineShards");
    public static final Item corruptedShards    = new ItemMod().setName("corruptedShards");
    public static final Item moltenShards       = new ItemMod().setName("moltenShards");
    public static final Item enderShard         = new ItemMod().setName("enderShards");

    public static final Item jungleStone        = new ItemMod().setName("jungleStone");
    public static final Item iceStone           = new ItemMod().setName("iceStone");
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

    public static final Item slimeSword         = new ItemModSword(ToolMaterialMod.SlimeSword).setName("slimeSword");
    public static final Item oceanKnife         = new ItemModSword(ToolMaterialMod.OceanKnife).setName("oceanKnife");
    public static final Item aquaticMaul        = new ItemModSword(ToolMaterialMod.AquaMaul).setName("aquaMaul");
    public static final Item arlemiteSword      = new ItemModSword(ToolMaterialMod.Arlemite).setName("arlemiteSword");
    public static final Item bedrockSword       = new ItemModSword(ToolMaterialMod.BedrockSword).setName("bedrockSword");
    public static final Item realmiteSword      = new ItemModSword(ToolMaterialMod.Realmite).setName("realmiteSword");
    public static final Item rupeeSword         = new ItemModSword(ToolMaterialMod.Rupee).setName("rupeeSword");
    public static final Item sandslash          = new ItemModSword(ToolMaterialMod.Sandslash).setName("sandSlash");
    public static final Item divineSword        = new ItemModSword(ToolMaterialMod.DivineSword).setName("divineSword");
    public static final Item blueDivineSword    = new ItemModSword(ToolMaterialMod.DivineSword).setName("blueDivineSword");
    public static final Item yellowDivineSword  = new ItemModSword(ToolMaterialMod.DivineSword).setName("yellowDivineSword");
    public static final Item pinkDivineSword    = new ItemModSword(ToolMaterialMod.DivineSword).setName("pinkDivineSword");
    public static final Item purpleDivineSword  = new ItemModSword(ToolMaterialMod.DivineSword).setName("purpleDivineSword");
    public static final Item redDivineSword     = new ItemModSword(ToolMaterialMod.DivineSword).setName("redDivineSword");
    public static final Item greenDivineSword   = new ItemModSword(ToolMaterialMod.DivineSword).setName("greenDivineSword");
    public static final Item bedrockMaul        = new ItemModSword(ToolMaterialMod.BedrockSword).setName("bedrockMaul");
    public static final Item jungleKnife        = new ItemModSword(ToolMaterialMod.OceanKnife).setName("jungleKnife");
    public static final Item cyclopsSword       = new ItemModSword(ToolMaterialMod.Cyclops).setName("cyclopianSword");
    public static final Item donatorSword       = new ItemModSword(ToolMaterialMod.Donator).setName("donatorSword");
    public static final Item aquaticTrident     = new ItemModSword(ToolMaterialMod.AquaTrident).setName("aquaticTrident");
    public static final Item aquaticDagger      = new ItemModSword(ToolMaterialMod.AquaDagger).setName("aquaticDagger");
    public static final Item aquaton            = new ItemModSword(ToolMaterialMod.Aquaton).setName("aquaton");
    public static final Item sharkSword         = new ItemModSword(ToolMaterialMod.SharkSword).setName("sharkSword");
    public static final Item deathBringer       = new ItemModSword(ToolMaterialMod.DeathBringer).setName("deathBringer");
    public static final Item crabclawMaul       = new ItemModSword(ToolMaterialMod.CrabclawMaul).setName("crabclawMaul");
    public static final Item poisonSaber        = new ItemModSword(ToolMaterialMod.PoisonSaber).setName("poisonSaber");
    public static final Item furyMaul           = new ItemModSword(ToolMaterialMod.FuryMaul).setName("furyMaul");
    public static final Item corruptedMaul      = new ItemModSword(ToolMaterialMod.CorruptedMaul).setName("corruptedMaul");
    public static final Item frostSword         = new ItemModSword(ToolMaterialMod.FrostSword).setName("frostSword");
    public static final Item infernoSword       = new ItemInfernoSword(ToolMaterialMod.Inferno).setName("infernoSword");
    public static final Item bloodgemSword      = new ItemModSword(ToolMaterialMod.BloodgemTool).setName("bloodgemSword");
    public static final Item moltenSword        = new ItemModSword(ToolMaterialMod.MoltenSword).setName("moltenSword");
    public static final Item scorchingSword     = new ItemModSword(ToolMaterialMod.ScorchingSword).setName("scorchingSword");
    public static final Item bluefireSword      = new ItemModSword(ToolMaterialMod.BluefireSword).setName("bluefireSword");
    public static final Item enderSword         = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSword");
    public static final Item enderSwordBlue     = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordBlue");
    public static final Item enderSwordDark     = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordBlack");
    public static final Item enderSwordGreen    = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordGreen");
    public static final Item enderSwordRed      = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordRed");
    public static final Item enderSwordYellow   = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordYellow");
    public static final Item longsword   		= new ItemModSword(ToolMaterialMod.Longsword).setName("longsword").setFull3D();

    
    public static final Item shuriken       	= new ItemThrowable(4).setName("shuriken");
    public static final Item vileStorm       	= new ItemThrowable(4).setName("vileStorm");
    
    public static final Item rupeeShickaxe      = new ItemShickaxe(ToolMaterialMod.RupeeShick).setName("rupeeShickaxe");
    public static final Item rupeePickaxe       = new ItemModPickaxe(ToolMaterialMod.Rupee).setName("rupeePickaxe");
    public static final Item rupeeAxe           = new ItemModAxe(ToolMaterialMod.Rupee).setName("rupeeAxe");
    public static final Item rupeeShovel        = new ItemModShovel(ToolMaterialMod.Rupee).setName("rupeeShovel");
    public static final Item rupeeHoe           = new ItemModHoe(ToolMaterialMod.Rupee).setName("rupeeHoe");

    public static final Item arlemiteShickaxe   = new ItemShickaxe(ToolMaterialMod.arlemiteShick).setName("arlemiteShickaxe");
    public static final Item arlemitePickaxe    = new ItemModPickaxe(ToolMaterialMod.Arlemite).setName("arlemitePickaxe");
    public static final Item arlemiteAxe        = new ItemModAxe(ToolMaterialMod.Arlemite).setName("arlemiteAxe");
    public static final Item arlemiteShovel     = new ItemModShovel(ToolMaterialMod.Arlemite).setName("arlemiteShovel");
    public static final Item arlemiteHoe        = new ItemModHoe(ToolMaterialMod.Arlemite).setName("arlemiteHoe");

    public static final Item realmitePickaxe    = new ItemModPickaxe(ToolMaterialMod.Realmite).setName("realmitePickaxe");
    public static final Item realmiteAxe        = new ItemModAxe(ToolMaterialMod.Realmite).setName("realmiteAxe");
    public static final Item realmiteShovel     = new ItemModShovel(ToolMaterialMod.Realmite).setName("realmiteShovel");
    public static final Item realmiteHoe        = new ItemModHoe(ToolMaterialMod.Realmite).setName("realmiteHoe");

    public static final Item bedrockPickaxe     = new ItemModPickaxe(ToolMaterialMod.Bedrock).setName("bedrockPickaxe");
    public static final Item bedrockAxe         = new ItemModAxe(ToolMaterialMod.Bedrock).setName("bedrockAxe");
    public static final Item bedrockShovel      = new ItemModShovel(ToolMaterialMod.Bedrock).setName("bedrockShovel");

    public static final Item corruptedPickaxe   = new ItemModPickaxe(ToolMaterialMod.Corrupted).setName("corruptedPickaxe");
    public static final Item corruptedAxe       = new ItemModAxe(ToolMaterialMod.Corrupted).setName("corruptedAxe");
    public static final Item corruptedShovel    = new ItemModShovel(ToolMaterialMod.Corrupted).setName("corruptedShovel");

    public static final Item divineShickaxe     = new ItemShickaxe(ToolMaterialMod.Divine).setName("divineShickaxe");
    public static final Item divinePickaxe      = new ItemModPickaxe(ToolMaterialMod.Divine).setName("divinePickaxe");
    public static final Item divineAxe          = new ItemModAxe(ToolMaterialMod.Divine).setName("divineAxe");
    public static final Item divineShovel       = new ItemModShovel(ToolMaterialMod.Divine).setName("divineShovel");

    public static final Item bacon              = new ItemModFood(1, 3.0F, false).setName("bacon");
    public static final Item baconCooked        = new ItemModFood(10, 10.0F, false).setName("baconCooked");
    public static final Item boiledEgg          = new ItemModFood(4, 0.5F, false).setName("boiledEgg");
    public static final Item cheese             = new ItemModFood(2, 0.2F, false).setName("cheese");
    public static final Item whiteMushroom      = new ItemModFood(1, 0.1F, false).setName("whiteMushroom");
    public static final Item advMushroomStew    = new ItemModFood(10, 10.0F, false).setName("advancedMushroomStew");
    public static final Item chickenDinner      = new ItemModFood(20, 20.0F, false).setName("chickenDinner");

    public static final Item watchingEye        = new ItemMod().setName("watchingEye");
    public static final Item callWatcher        = new ItemCallOfTheWatcher().setName("callOfTheWatcher");
    
    public static final Item angelicHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, HEAD, 0, 0.125D, true).setName("angelicHelmet");
    public static final Item angelicBody 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, BODY, 1, 0.125D, true).setName("angelicBody");
    public static final Item angelicLegs 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, LEGS, 2, 0.125D, true).setName("angelicLegs");
    public static final Item angelicBoots 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, BOOTS, 3, 0.125D, true).setName("angelicBoots");

    public static final Item greenDiamondChunk  = new ItemMod().setName("greenDiamondChunk");
    public static final Item grayDiamondChunk   = new ItemMod().setName("greyDiamondChunk");
    public static final Item blueDiamondChunk   = new ItemMod().setName("blueDiamondChunk");
    public static final Item redDiamondChunk  	= new ItemMod().setName("redDiamondChunk");
    public static final Item yellowDiamondChunk = new ItemMod().setName("yellowDiamondChunk");
    
    public static final Item divineHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Divine, HEAD, 0, 0.1875D, false).setName("divineHelmet");
    public static final Item divineBody 		= new ItemDivineArmor(ArmorMaterialMod.Divine, BODY, 1, 0.1875D, false).setName("divineBody");
    public static final Item divineLegs 		= new ItemDivineArmor(ArmorMaterialMod.Divine, LEGS, 2, 0.1875D, false).setName("divineLegs");
    public static final Item divineBoots 		= new ItemDivineArmor(ArmorMaterialMod.Divine, BOOTS, 3, 0.1875D, false).setName("divineBoots");
    
}