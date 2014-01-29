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
    public static final Item callWatcher        = new ItemVanillaSpawner().setName("callOfTheWatcher");
    public static final Item infernalFlame      = new ItemVanillaSpawner().setName("infernalFlame");
    public static final Item hordeHorn      	= new ItemHordeHorn().setName("hordeHorn");

    public static final Item greenDiamondChunk  = new ItemMod().setName("greenDiamondChunk");
    public static final Item grayDiamondChunk   = new ItemMod().setName("grayDiamondChunk");
    public static final Item blueDiamondChunk   = new ItemMod().setName("blueDiamondChunk");
    public static final Item redDiamondChunk  	= new ItemMod().setName("redDiamondChunk");
    public static final Item yellowDiamondChunk = new ItemMod().setName("yellowDiamondChunk");
    
    public static final Item angelicHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, HEAD, 0, 0.125D, true).setName("angelicHelmet");
    public static final Item angelicBody 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, BODY, 1, 0.125D, true).setName("angelicBody");
    public static final Item angelicLegs 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, LEGS, 2, 0.125D, true).setName("angelicLegs");
    public static final Item angelicBoots 		= new ItemDivineArmor(ArmorMaterialMod.Angelic, BOOTS, 3, 0.125D, true).setName("angelicBoots");
    
    public static final Item divineHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Divine, HEAD, 0, 0.1875D, false).setName("divineHelmet");
    public static final Item divineBody 		= new ItemDivineArmor(ArmorMaterialMod.Divine, BODY, 1, 0.1875D, false).setName("divineBody");
    public static final Item divineLegs 		= new ItemDivineArmor(ArmorMaterialMod.Divine, LEGS, 2, 0.1875D, false).setName("divineLegs");
    public static final Item divineBoots 		= new ItemDivineArmor(ArmorMaterialMod.Divine, BOOTS, 3, 0.1875D, false).setName("divineBoots");
    
    public static final Item bedrockHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Bedrock, HEAD, 0, 0.1825D, false).setName("bedrockHelmet");
    public static final Item bedrockBody 		= new ItemDivineArmor(ArmorMaterialMod.Bedrock, BODY, 1, 0.1825D, false).setName("bedrockBody");
    public static final Item bedrockLegs 		= new ItemDivineArmor(ArmorMaterialMod.Bedrock, LEGS, 2, 0.1825D, false).setName("bedrockLegs");
    public static final Item bedrockBoots 		= new ItemDivineArmor(ArmorMaterialMod.Bedrock, BOOTS, 3, 0.1825D, false).setName("bedrockBoots");
    
    public static final Item realmiteHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Realmite, HEAD, 0, 0.825D, false).setName("realmiteHelmet");
    public static final Item realmiteBody 		= new ItemDivineArmor(ArmorMaterialMod.Realmite, BODY, 1, 0.825D, false).setName("realmiteBody");
    public static final Item realmiteLegs 		= new ItemDivineArmor(ArmorMaterialMod.Realmite, LEGS, 2, 0.825D, false).setName("realmiteLegs");
    public static final Item realmiteBoots 		= new ItemDivineArmor(ArmorMaterialMod.Realmite, BOOTS, 3, 0.825D, false).setName("realmiteBoots");
    
    public static final Item eliteRealmiteHelmet= new ItemDivineArmor(ArmorMaterialMod.EliteRealmite, HEAD, 0, 0.125D, false).setName("eliteRealmiteHelmet");
    public static final Item eliteRealmiteBody 	= new ItemDivineArmor(ArmorMaterialMod.EliteRealmite, BODY, 1, 0.125D, false).setName("eliteRealmiteBody");
    public static final Item eliteRealmiteLegs 	= new ItemDivineArmor(ArmorMaterialMod.EliteRealmite, LEGS, 2, 0.125D, false).setName("eliteRealmiteLegs");
    public static final Item eliteRealmiteBoots = new ItemDivineArmor(ArmorMaterialMod.EliteRealmite, BOOTS, 3, 0.125D, false).setName("eliteRealmiteBoots");
    
    public static final Item arlemiteHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Arlemite, HEAD, 0, 0.125D, false).setName("arlemiteHelmet");
    public static final Item arlemiteBody 		= new ItemDivineArmor(ArmorMaterialMod.Arlemite, BODY, 1, 0.125D, false).setName("arlemiteBody");
    public static final Item arlemiteLegs 		= new ItemDivineArmor(ArmorMaterialMod.Arlemite, LEGS, 2, 0.125D, false).setName("arlemiteLegs");
    public static final Item arlemiteBoots 		= new ItemDivineArmor(ArmorMaterialMod.Arlemite, BOOTS, 3, 0.125D, false).setName("arlemiteBoots");
    
    public static final Item rupeeHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Rupee, HEAD, 0, 0.1375D, false).setName("rupeeHelmet");
    public static final Item rupeeBody 			= new ItemDivineArmor(ArmorMaterialMod.Rupee, BODY, 1, 0.1375D, false).setName("rupeeBody");
    public static final Item rupeeLegs 			= new ItemDivineArmor(ArmorMaterialMod.Rupee, LEGS, 2, 0.1375D, false).setName("rupeeLegs");
    public static final Item rupeeBoots 		= new ItemDivineArmor(ArmorMaterialMod.Rupee, BOOTS, 3, 0.1375D, false).setName("rupeeBoots");
    
    public static final Item krakenHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Kraken, HEAD, 0, 0.7D, false).setName("krakenHelmet");
    public static final Item krakenBody 		= new ItemDivineArmor(ArmorMaterialMod.Kraken, BODY, 1, 0.7D, false).setName("krakenBody");
    public static final Item krakenLegs 		= new ItemDivineArmor(ArmorMaterialMod.Kraken, LEGS, 2, 0.7D, false).setName("krakenLegs");
    public static final Item krakenBoots 		= new ItemDivineArmor(ArmorMaterialMod.Kraken, BOOTS, 3, 0.7D, false).setName("krakenBoots");
    
    public static final Item jackOManHelmet 	= new ItemDivineArmor(ArmorMaterialMod.JackOMan, HEAD, 0, false).setName("jackOManHelmet");
    public static final Item jackOManBody 		= new ItemDivineArmor(ArmorMaterialMod.JackOMan, BODY, 1, false).setName("jackOManBody");
    public static final Item jackOManLegs 		= new ItemDivineArmor(ArmorMaterialMod.JackOMan, LEGS, 2, false).setName("jackOManLegs");
    public static final Item jackOManBoots 		= new ItemDivineArmor(ArmorMaterialMod.JackOMan, BOOTS, 3, false).setName("jackOManBoots");
    
    public static final Item infernoHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Inferno, HEAD, 0, 0.15D, false).setName("infernoHelmet");
    public static final Item infernoBody 		= new ItemDivineArmor(ArmorMaterialMod.Inferno, BODY, 1, 0.15D, false).setName("infernoBody");
    public static final Item infernoLegs 		= new ItemDivineArmor(ArmorMaterialMod.Inferno, LEGS, 2, 0.15D, false).setName("infernoLegs");
    public static final Item infernoBoots 		= new ItemDivineArmor(ArmorMaterialMod.Inferno, BOOTS, 3, 0.15D, false).setName("infernoBoots");
    
    public static final Item aquaticHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Aquatic, HEAD, 0, 0.1375D, false).setName("aquaticHelmet");
    public static final Item aquaticBody 		= new ItemDivineArmor(ArmorMaterialMod.Aquatic, BODY, 1, 0.1375D, false).setName("aquaticBody");
    public static final Item aquaticLegs 		= new ItemDivineArmor(ArmorMaterialMod.Aquatic, LEGS, 2, 0.1375D, false).setName("aquaticLegs");
    public static final Item aquaticBoots 		= new ItemDivineArmor(ArmorMaterialMod.Aquatic, BOOTS, 3, 0.1375D, false).setName("aquaticBoots");
    
    public static final Item shadowHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Shadow, HEAD, 0, 0.15D, false).setName("shadowHelmet");
    public static final Item shadowBody 		= new ItemDivineArmor(ArmorMaterialMod.Shadow, BODY, 1, 0.15D, false).setName("shadowBody");
    public static final Item shadowLegs 		= new ItemDivineArmor(ArmorMaterialMod.Shadow, LEGS, 2, 0.15D, false).setName("shadowLegs");
    public static final Item shadowBoots 		= new ItemDivineArmor(ArmorMaterialMod.Shadow, BOOTS, 3, 0.15D, false).setName("shadowBoots");
    
    public static final Item netheriteHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Netherite, HEAD, 0, 0.5D, false).setName("netheriteHelmet");
    public static final Item netheriteBody 		= new ItemDivineArmor(ArmorMaterialMod.Netherite, BODY, 1, 0.5D, false).setName("netheriteBody");
    public static final Item netheriteLegs 		= new ItemDivineArmor(ArmorMaterialMod.Netherite, LEGS, 2, 0.5D, false).setName("netheriteLegs");
    public static final Item netheriteBoots 	= new ItemDivineArmor(ArmorMaterialMod.Netherite, BOOTS, 3, 0.5D, false).setName("netheriteBoots");
    
    public static final Item skeletonHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Iron, HEAD, 0, false).setName("skeletonHelmet");
    public static final Item skeletonBody 		= new ItemDivineArmor(ArmorMaterialMod.Iron, BODY, 1, false).setName("skeletonBody");//TODO make the ArmorMaterial for skeleton and wither!
    public static final Item skeletonLegs 		= new ItemDivineArmor(ArmorMaterialMod.Iron, LEGS, 2, false).setName("skeletonLegs");//Caleb, could you? AHAHAHIHNJADGUAJY
    public static final Item skeletonBoots 		= new ItemDivineArmor(ArmorMaterialMod.Iron, BOOTS, 3, false).setName("skeletonBoots");
    
    public static final Item witherHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Iron, HEAD, 0, false).setName("witherReaperHelmet");
    public static final Item witherBody 		= new ItemDivineArmor(ArmorMaterialMod.Iron, BODY, 1, false).setName("witherReaperBody");
    public static final Item witherLegs 		= new ItemDivineArmor(ArmorMaterialMod.Iron, LEGS, 2, false).setName("witherReaperLegs");
    public static final Item witherBoots 		= new ItemDivineArmor(ArmorMaterialMod.Iron, BOOTS, 3, false).setName("witherReaperBoots");
    
    public static final Item enderHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Ender, HEAD, 0, 0.15D, false).setName("enderHelmet");
    public static final Item enderBody	 		= new ItemDivineArmor(ArmorMaterialMod.Ender, BODY, 1, 0.15D, false).setName("enderBody");
    public static final Item enderLegs	 		= new ItemDivineArmor(ArmorMaterialMod.Ender, LEGS, 2, 0.15D, false).setName("enderLegs");
    public static final Item enderBoots 		= new ItemDivineArmor(ArmorMaterialMod.Ender, BOOTS, 3, 0.15D, false).setName("enderBoots");
    
    public static final Item ironHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Iron, HEAD, 0, false).setName("ironHelmet");
    public static final Item ironBody	 		= new ItemDivineArmor(ArmorMaterialMod.Iron, BODY, 1, false).setName("ironBody");
    public static final Item ironLegs	 		= new ItemDivineArmor(ArmorMaterialMod.Iron, LEGS, 2, false).setName("ironLegs");
    public static final Item ironBoots 			= new ItemDivineArmor(ArmorMaterialMod.Iron, BOOTS, 3, false).setName("ironBoots");
    
    public static final Item diamondHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Diamond, HEAD, 0, false).setName("diamondHelmet");
    public static final Item diamondBody 		= new ItemDivineArmor(ArmorMaterialMod.Diamond, BODY, 1, false).setName("diamondBody");
    public static final Item diamondLegs 		= new ItemDivineArmor(ArmorMaterialMod.Diamond, LEGS, 2, false).setName("diamondLegs");
    public static final Item diamondBoots 		= new ItemDivineArmor(ArmorMaterialMod.Diamond, BOOTS, 3, false).setName("diamondBoots");
    
}