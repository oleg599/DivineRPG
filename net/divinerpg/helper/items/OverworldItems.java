package net.divinerpg.helper.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.base.ItemMod;
import net.divinerpg.helper.items.base.ItemModAxe;
import net.divinerpg.helper.items.base.ItemModFood;
import net.divinerpg.helper.items.base.ItemModHoe;
import net.divinerpg.helper.items.base.ItemModPickaxe;
import net.divinerpg.helper.items.base.ItemModShovel;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.nether.items.ItemCallOfTheWatcher;
import net.divinerpg.overworld.items.ItemInfernoSword;
import net.divinerpg.overworld.items.ItemMysteriousClock;
import net.divinerpg.overworld.items.ItemShickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OverworldItems {
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;

	public static final Item rupeeIngot = new ItemMod().setUnlocalizedName("rupeeIngot").setTextureName("rupeeingot");
	public static final Item arlemiteIngot = new ItemMod().setUnlocalizedName("arlemiteIngot").setTextureName("arlemiteingot");
	public static final Item realmiteIngot = new ItemMod().setUnlocalizedName("realmiteIngot").setTextureName("realmiteingot");
	public static final Item shadowBar = new ItemMod().setUnlocalizedName("shadowBar").setTextureName("shadowbar");
	
	public static final Item jungleShards = new ItemMod().setTextureName("jungleshards").setUnlocalizedName("jungleShards");
	public static final Item iceShards = new ItemMod().setTextureName("iceshards").setUnlocalizedName("iceShards");    
	public static final Item divineShards = new ItemMod().setTextureName("divineshards").setUnlocalizedName("divineShards");
	public static final Item corruptedShards = new ItemMod().setTextureName("corruptedshards").setUnlocalizedName("corruptedShards");

	public static final Item jungleStone = new ItemMod().setTextureName("junglestone").setUnlocalizedName("jungleStone");
	public static final Item iceStone = new ItemMod().setTextureName("icestone").setUnlocalizedName("iceStone");
	public static final Item corruptedStone = new ItemMod().setTextureName("corruptedstone").setUnlocalizedName("corruptedStone");
	public static final Item divineStone = new ItemMod().setTextureName("divinestone").setUnlocalizedName("divineStone");
	public static final Item healingStone = new ItemMod().setTextureName("healingstone").setUnlocalizedName("healingStone");
	public static final Item shadowStone = new ItemMod().setTextureName("shadowstone").setUnlocalizedName("shadowStone");
	
	public static final Item aquaticIngot = new ItemMod().setTextureName("aquaticingot").setUnlocalizedName("aquaticIngot");
	public static final Item aquaticPellets = new ItemMod().setTextureName("aquaticpellets").setUnlocalizedName("aquaticPellets");
	public static final Item pureAquaticPellets = new ItemMod().setTextureName("pureAquaticpellets").setUnlocalizedName("pureAquaticPellets");
	public static final Item cyclopsEye = new ItemMod().setTextureName("cyclopseye").setUnlocalizedName("cyclopsEye");
	public static final Item crabClaw = new ItemMod().setTextureName("crabclaw").setUnlocalizedName("crabClaw");
	public static final Item legendaryEnderEye = new ItemMod().setTextureName("legendaryendereye").setUnlocalizedName("legendaryEnderEye");
	public static final Item sharkFin = new ItemMod().setTextureName("sharkfin").setUnlocalizedName("sharkFin");
	public static final Item whaleFin = new ItemMod().setTextureName("whalefin").setUnlocalizedName("whaleFin");
	public static final Item myseriousClock = new ItemMysteriousClock().setTextureName("myseriousclock").setUnlocalizedName("myseriousClock");
	public static final Item noImage = new ItemMod().setTextureName("noimage").setUnlocalizedName("noImage");

	public static final Item slimeSword = new ItemModSword(ToolMaterialMod.SlimeSword).setTextureName("slimesword").setUnlocalizedName("slimeSword");
	public static final Item oceanKnife = new ItemModSword(ToolMaterialMod.OceanKnife).setTextureName("oceanknife").setUnlocalizedName("oceanKnife");
	public static final Item aquaticMaul = new ItemModSword(ToolMaterialMod.AquaMaul).setTextureName("aquaMaul").setUnlocalizedName("aquaMaul");
	public static final Item arlemiteSword = new ItemModSword(ToolMaterialMod.Arlemite).setTextureName("arlemitesword").setUnlocalizedName("arlemiteSword");
	public static final Item bedrockSword = new ItemModSword(ToolMaterialMod.BedrockSword).setTextureName("bedrocksword").setUnlocalizedName("bedrockSword");
	public static final Item realmiteSword = new ItemModSword(ToolMaterialMod.Realmite).setTextureName("realmitesword").setUnlocalizedName("realmiteSword");
	public static final Item rupeeSword = new ItemModSword(ToolMaterialMod.Rupee).setTextureName("rupeesword").setUnlocalizedName("rupeeSword");
	public static final Item sandslash = new ItemModSword(ToolMaterialMod.Sandslash).setTextureName("sandslash").setUnlocalizedName("sandslash");
	public static final Item divineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("divinesword").setUnlocalizedName("divineSword");
	public static final Item blueDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("bluedivinesword").setUnlocalizedName("blueDivineSword");
	public static final Item yellowDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("yellowdivinesword").setUnlocalizedName("yellowDivineSword");
	public static final Item pinkDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("pinkdivinesword").setUnlocalizedName("pinkDivineSword");
	public static final Item purpleDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("purpledivinesword").setUnlocalizedName("purpleDivineSword");
	public static final Item redDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("reddivinesword").setUnlocalizedName("redDivineSword");
	public static final Item greenDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("greendivinesword").setUnlocalizedName("greenDivineSword");
	public static final Item bedrockMaul = new ItemModSword(ToolMaterialMod.BedrockSword).setTextureName("bedrockMaul").setUnlocalizedName("bedrockMaul");
	public static final Item jungleKnife = new ItemModSword(ToolMaterialMod.OceanKnife).setTextureName("jungleKnife").setUnlocalizedName("jungleKnife");
	public static final Item cyclopsSword = new ItemModSword(ToolMaterialMod.Cyclops).setTextureName("cyclopianSword").setUnlocalizedName("cyclopianSword");
	public static final Item donatorSword = new ItemModSword(ToolMaterialMod.Donator).setTextureName("donatorSword").setUnlocalizedName("donatorSword");
	public static final Item aquaticTrident = new ItemModSword(ToolMaterialMod.AquaTrident).setTextureName("aquatictrident").setUnlocalizedName("aquaticTrident");
	public static final Item aquaticDagger = new ItemModSword(ToolMaterialMod.AquaDagger).setTextureName("aquaticdagger").setUnlocalizedName("aquaticDagger");
	public static final Item aquaton = new ItemModSword(ToolMaterialMod.Aquaton).setTextureName("aquaton").setUnlocalizedName("aquaton");
	public static final Item sharkSword = new ItemModSword(ToolMaterialMod.SharkSword).setTextureName("sharksword").setUnlocalizedName("sharkSword");
	public static final Item deathBringer = new ItemModSword(ToolMaterialMod.DeathBringer).setTextureName("deathbringer").setUnlocalizedName("deathBringer");
	public static final Item crabclawMaul = new ItemModSword(ToolMaterialMod.CrabclawMaul).setTextureName("crabclawmaul").setUnlocalizedName("crabclawMaul");
	public static final Item poisonSaber = new ItemModSword(ToolMaterialMod.PoisonSaber).setTextureName("poisonsaber").setUnlocalizedName("poisonSaber");
	public static final Item furyMaul = new ItemModSword(ToolMaterialMod.FuryMaul).setTextureName("furymaul").setUnlocalizedName("furyMaul");
	public static final Item corruptedMaul = new ItemModSword(ToolMaterialMod.CorruptedMaul).setTextureName("corruptedmaul").setUnlocalizedName("corruptedMaul");
	public static final Item frostSword = new ItemModSword(ToolMaterialMod.FrostSword).setTextureName("frostsword").setUnlocalizedName("frostSword");
	
	public static final Item rupeeShickaxe = new ItemShickaxe(ToolMaterialMod.RupeeShick).setTextureName("rupeeshickaxe").setUnlocalizedName("rupeeShickaxe");
	public static final Item rupeePickaxe = new ItemModPickaxe(ToolMaterialMod.Rupee).setTextureName("rupeepickaxe").setUnlocalizedName("rupeePickaxe");
	public static final Item rupeeAxe = new ItemModAxe(ToolMaterialMod.Rupee).setTextureName("rupeeaxe").setUnlocalizedName("rupeeAxe");
	public static final Item rupeeShovel = new ItemModShovel(ToolMaterialMod.Rupee).setTextureName("rupeeshovel").setUnlocalizedName("rupeeShovel");
	public static final Item rupeeHoe = new ItemModHoe(ToolMaterialMod.Rupee).setTextureName("rupeehoe").setUnlocalizedName("rupeeHoe");

	public static final Item arlemiteShickaxe = new ItemShickaxe(ToolMaterialMod.arlemiteShick).setTextureName("arlemiteshickaxe").setUnlocalizedName("arlemiteShickaxe");
	public static final Item arlemitePickaxe = new ItemModPickaxe(ToolMaterialMod.Arlemite).setTextureName("arlemitepickaxe").setUnlocalizedName("arlemitePickaxe");
	public static final Item arlemiteAxe = new ItemModAxe(ToolMaterialMod.Arlemite).setTextureName("arlemiteaxe").setUnlocalizedName("arlemiteAxe");
	public static final Item arlemiteShovel = new ItemModShovel(ToolMaterialMod.Arlemite).setTextureName("arlemiteshovel").setUnlocalizedName("arlemiteShovel");
	public static final Item arlemiteHoe = new ItemModHoe(ToolMaterialMod.Arlemite).setTextureName("arlemitehoe").setUnlocalizedName("arlemiteHoe");
	
	public static final Item realmitePickaxe = new ItemModPickaxe(ToolMaterialMod.Realmite).setTextureName("realmitepickaxe").setUnlocalizedName("realmitePickaxe");
	public static final Item realmiteAxe = new ItemModAxe(ToolMaterialMod.Realmite).setTextureName("realmiteaxe").setUnlocalizedName("realmiteAxe");
	public static final Item realmiteShovel = new ItemModShovel(ToolMaterialMod.Realmite).setTextureName("realmiteshovel").setUnlocalizedName("realmiteShovel");
	public static final Item realmiteHoe = new ItemModHoe(ToolMaterialMod.Realmite).setTextureName("realmitehoe").setUnlocalizedName("realmiteHoe");
	
	public static final Item bedrockPickaxe = new ItemModPickaxe(ToolMaterialMod.Bedrock).setTextureName("bedrockpickaxe").setUnlocalizedName("bedrockPickaxe");
	public static final Item bedrockAxe = new ItemModAxe(ToolMaterialMod.Bedrock).setTextureName("bedrockaxe").setUnlocalizedName("bedrockAxe");
	public static final Item bedrockShovel = new ItemModShovel(ToolMaterialMod.Bedrock).setTextureName("bedrockshovel").setUnlocalizedName("bedrockShovel");
	
	public static final Item corruptedPickaxe = new ItemModPickaxe(ToolMaterialMod.Corrupted).setTextureName("corruptedpickaxe").setUnlocalizedName("corruptedPickaxe");
	public static final Item corruptedAxe = new ItemModAxe(ToolMaterialMod.Corrupted).setTextureName("corruptedaxe").setUnlocalizedName("corruptedAxe");
	public static final Item corruptedShovel = new ItemModShovel(ToolMaterialMod.Corrupted).setTextureName("corruptedshovel").setUnlocalizedName("corruptedShovel");
	
	public static final Item divineShickaxe = new ItemShickaxe(ToolMaterialMod.Divine).setTextureName("divineshickaxe").setUnlocalizedName("divineShickaxe");
	public static final Item divinePickaxe = new ItemModPickaxe(ToolMaterialMod.Divine).setTextureName("divinepickaxe").setUnlocalizedName("divinePickaxe");
	public static final Item divineAxe = new ItemModAxe(ToolMaterialMod.Divine).setTextureName("divineaxe").setUnlocalizedName("divineAxe");
	public static final Item divineShovel = new ItemModShovel(ToolMaterialMod.Divine).setTextureName("divineshovel").setUnlocalizedName("divineShovel");
	
	public static final Item bacon = new ItemModFood(5, 3.0F, false).setTextureName("bacon").setUnlocalizedName("bacon");
	public static final Item boiledEgg = new ItemModFood(4, 0.5F, false).setTextureName("boiledegg").setUnlocalizedName("boiledEgg");
	public static final Item cheese = new ItemModFood(2, 0.2F, false).setTextureName("cheese").setUnlocalizedName("cheese");
	public static final Item whiteMushroom = new ItemModFood(1, 0.1F, false).setTextureName("whitemushroom").setUnlocalizedName("whiteMushroom");
	public static final Item advMushroomStew = new ItemModFood(10, 10.0F, false).setTextureName("advancedmushroomstew").setUnlocalizedName("advancedMushroomStew");
	public static final Item chickenDinner = new ItemModFood(20, 20.0F, false).setTextureName("chickendinner").setUnlocalizedName("chickenDinner");

	public static void init(){
		//Materials
		DivineAPI.addItem(realmiteIngot, "Realmite Ingot");
		DivineAPI.addItem(rupeeIngot, "Rupee Ingot");
		DivineAPI.addItem(arlemiteIngot, "Arlemite Ingot");
		DivineAPI.addItem(shadowBar, "Shadow Bar");
		DivineAPI.addItem(jungleShards, "Jungle Shard");
		DivineAPI.addItem(divineShards, "Divine Shard");
		DivineAPI.addItem(corruptedShards , "Corrupted Shard");
		DivineAPI.addItem(iceShards, "Frozen Shards");
		DivineAPI.addItem(jungleStone , "Jungle Stone");
		DivineAPI.addItem(divineStone , "Divine Stone");
		DivineAPI.addItem(corruptedStone , "Corrupted Stone");
		DivineAPI.addItem(iceStone , "Ice Stone");
		DivineAPI.addItem(healingStone, "Healing Stone");
		DivineAPI.addItem(shadowStone, "Shadow Stone");
		DivineAPI.addItem(aquaticIngot, "Aquatic Ingot");
		DivineAPI.addItem(aquaticPellets, "Aquatic Pellets");
		DivineAPI.addItem(pureAquaticPellets, "Pure Aquatic Pellets");
		DivineAPI.addItem(cyclopsEye, "Cyclops Eye");
		DivineAPI.addItem(crabClaw, "Crab Claw");
		DivineAPI.addItem(legendaryEnderEye, "Legendary Ender Eye");
		DivineAPI.addItem(sharkFin, "Shark Fin");
		DivineAPI.addItem(whaleFin, "Whale Fin");
		//Temporary
		DivineAPI.addItem(noImage, "NO IMAGE");
		
		//Spawner
		DivineAPI.addItem(myseriousClock, "Mysterious Clock");
		
		//Weapons
		DivineAPI.addItem(slimeSword, "Slime Sword");
		DivineAPI.addItem(oceanKnife, "Ocean Knife");
		DivineAPI.addItem(aquaticMaul, "Aquatic Maul");
		DivineAPI.addItem(arlemiteSword, "Arlemite Sword");
		DivineAPI.addItem(bedrockSword, "Bedrock Sword");
		DivineAPI.addItem(realmiteSword, "Realmite Sword");
		DivineAPI.addItem(rupeeSword, "rupee Sword");
		DivineAPI.addItem(sandslash, "Sandslash");
		DivineAPI.addItem(divineSword, "Divine Sword");
		DivineAPI.addItem(blueDivineSword, "Blue Divine Sword");
		DivineAPI.addItem(yellowDivineSword, "Yellow Divine Sword");
		DivineAPI.addItem(pinkDivineSword, "Pink Divine Sword");
		DivineAPI.addItem(purpleDivineSword, "Purple Divine Sword");
		DivineAPI.addItem(redDivineSword, "Red Divine Sword");
		DivineAPI.addItem(greenDivineSword, "Green Divine Sword");
		DivineAPI.addItem(bedrockMaul, "Bedrock Maul");
		DivineAPI.addItem(jungleKnife, "Jungle Knife");
		DivineAPI.addItem(cyclopsSword, "Cyclopsian Sword");
		DivineAPI.addItem(donatorSword, "Donator Sword");
		DivineAPI.addItem(aquaticTrident, "Aquatic Trident");
		DivineAPI.addItem(aquaticDagger, "Aquatic Dagger");
		DivineAPI.addItem(aquaton, "Aquaton");
		DivineAPI.addItem(frostSword, "Frost Sword");
		DivineAPI.addItem(sharkSword, "Shark Sword");
		DivineAPI.addItem(deathBringer, "Death Bringer");
		DivineAPI.addItem(crabclawMaul, "Crabclaw Maul");
		DivineAPI.addItem(poisonSaber, "Poison Saber");
		DivineAPI.addItem(furyMaul, "Fury Maul");
		DivineAPI.addItem(corruptedMaul, "Corrupted Maul");
		
		//Tools
		DivineAPI.addItem(rupeeShickaxe, "Rupee Shickaxe");
		DivineAPI.addItem(arlemiteShickaxe, "Arlemite Shickaxe");
		DivineAPI.addItem(rupeePickaxe, "Rupee Pickaxe");
		DivineAPI.addItem(rupeeAxe, "Rupee Axe");
		DivineAPI.addItem(rupeeShovel, "Rupee Shovel");
		DivineAPI.addItem(rupeeHoe, "Rupee Hoe");
		DivineAPI.addItem(arlemitePickaxe, "Arlemite Pickaxe");
		DivineAPI.addItem(arlemiteAxe, "Arlemite Axe");
		DivineAPI.addItem(arlemiteShovel, "Arlemite Shovel");
		DivineAPI.addItem(arlemiteHoe, "Arlemite Hoe");
		DivineAPI.addItem(realmitePickaxe, "Realmite Pickaxe");
		DivineAPI.addItem(realmiteAxe, "Realmite Axe");
		DivineAPI.addItem(realmiteShovel, "Realmite Shovel");
		DivineAPI.addItem(realmiteHoe, "Realmite Hoe");
		DivineAPI.addItem(bedrockPickaxe, "Bedrock Pickaxe");
		DivineAPI.addItem(bedrockAxe, "Bedrock Axe");
		DivineAPI.addItem(bedrockShovel, "Bedrock Shovel");
		DivineAPI.addItem(corruptedPickaxe, "Corrupted Pickaxe");
		DivineAPI.addItem(corruptedAxe, "Corrupted Axe");
		DivineAPI.addItem(corruptedShovel, "Corrupted Shovel");
		DivineAPI.addItem(divineShickaxe, "Divine Shickaxe");
		DivineAPI.addItem(divinePickaxe, "Divine Pickaxe");
		DivineAPI.addItem(divineAxe, "Divine Axe");
		DivineAPI.addItem(divineShovel, "Divine Shovel");
		
		//Food
		DivineAPI.addItem(bacon, "Raw Bacon");
		DivineAPI.addItem(boiledEgg, "Boiled Egg");
		DivineAPI.addItem(cheese, "Cheese");
		DivineAPI.addItem(whiteMushroom, "White Mushroom");
		DivineAPI.addItem(advMushroomStew, "Advanced Mushroom Stew");
		DivineAPI.addItem(chickenDinner, "Chicken Dinner");
	}
}