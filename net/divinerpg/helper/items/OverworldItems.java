package net.divinerpg.helper.items;

import net.divinerpg.Reference;
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

	public static final Item rupeeIngot = new ItemMod().setUnlocalizedName("rupeeIngot").setTextureName("rupeeIngot");
	public static final Item arlemiteIngot = new ItemMod().setUnlocalizedName("arlemiteIngot").setTextureName("arlemiteIngot");
	public static final Item realmiteIngot = new ItemMod().setUnlocalizedName("realmiteIngot").setTextureName("realmiteIngot");
	public static final Item shadowBar = new ItemMod().setUnlocalizedName("shadowBar").setTextureName("shadowBar");
	
	public static final Item jungleShards = new ItemMod().setTextureName("jungleShards").setUnlocalizedName("jungleShards");
	public static final Item iceShards = new ItemMod().setTextureName("iceShards").setUnlocalizedName("iceShards");    
	public static final Item divineShards = new ItemMod().setTextureName("divineShards").setUnlocalizedName("divineShards");
	public static final Item corruptedShards = new ItemMod().setTextureName("corruptedShards").setUnlocalizedName("corruptedShards");

	public static final Item jungleStone = new ItemMod().setTextureName("jungleStone").setUnlocalizedName("jungleStone");
	public static final Item iceStone = new ItemMod().setTextureName("iceStone").setUnlocalizedName("iceStone");
	public static final Item corruptedStone = new ItemMod().setTextureName("corruptedStone").setUnlocalizedName("corruptedStone");
	public static final Item divineStone = new ItemMod().setTextureName("divineStone").setUnlocalizedName("divineStone");
	public static final Item healingStone = new ItemMod().setTextureName("healingStone").setUnlocalizedName("healingStone");
	public static final Item shadowStone = new ItemMod().setTextureName("shadowStone").setUnlocalizedName("shadowStone");
	
	public static final Item aquaticIngot = new ItemMod().setTextureName("aquaticIngot").setUnlocalizedName("aquaticIngot");
	public static final Item aquaticPellets = new ItemMod().setTextureName("aquaticPellets").setUnlocalizedName("aquaticPellets");
	public static final Item pureAquaticPellets = new ItemMod().setTextureName("pureAquaticPellets").setUnlocalizedName("pureAquaticPellets");
	public static final Item cyclopsEye = new ItemMod().setTextureName("cyclopsEye").setUnlocalizedName("cyclopsEye");
	public static final Item crabClaw = new ItemMod().setTextureName("crabClaw").setUnlocalizedName("crabClaw");
	public static final Item legendaryEnderEye = new ItemMod().setTextureName("legendaryEnderEye").setUnlocalizedName("legendaryEnderEye");
	public static final Item sharkFin = new ItemMod().setTextureName("sharkFin").setUnlocalizedName("sharkFin");
	public static final Item whaleFin = new ItemMod().setTextureName("whaleFin").setUnlocalizedName("whaleFin");
	public static final Item myseriousClock = new ItemMysteriousClock().setTextureName("myseriousClock").setUnlocalizedName("myseriousClock");
	public static final Item noImage = new ItemMod().setTextureName("noimage").setUnlocalizedName("noImage");

	public static final Item slimeSword = new ItemModSword(ToolMaterialMod.SlimeSword).setTextureName("slimeSword").setUnlocalizedName("slimeSword");
	public static final Item oceanKnife = new ItemModSword(ToolMaterialMod.OceanKnife).setTextureName("oceanKnife").setUnlocalizedName("oceanKnife");
	public static final Item aquaticMaul = new ItemModSword(ToolMaterialMod.AquaMaul).setTextureName("aquaMaul").setUnlocalizedName("aquaMaul");
	public static final Item arlemiteSword = new ItemModSword(ToolMaterialMod.Arlemite).setTextureName("arlemiteSword").setUnlocalizedName("arlemiteSword");
	public static final Item bedrockSword = new ItemModSword(ToolMaterialMod.BedrockSword).setTextureName("bedrockSword").setUnlocalizedName("bedrockSword");
	public static final Item realmiteSword = new ItemModSword(ToolMaterialMod.Realmite).setTextureName("realmiteSword").setUnlocalizedName("realmiteSword");
	public static final Item rupeeSword = new ItemModSword(ToolMaterialMod.Rupee).setTextureName("rupeeSword").setUnlocalizedName("rupeeSword");
	public static final Item sandslash = new ItemModSword(ToolMaterialMod.Sandslash).setTextureName("sandslash").setUnlocalizedName("sandslash");
	public static final Item divineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("divineSword").setUnlocalizedName("divineSword");
	public static final Item blueDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("blueDivineSword").setUnlocalizedName("blueDivineSword");
	public static final Item yellowDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("yellowDivineSword").setUnlocalizedName("yellowDivineSword");
	public static final Item pinkDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("pinkDivineSword").setUnlocalizedName("pinkDivineSword");
	public static final Item purpleDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("purpleDivineSword").setUnlocalizedName("purpleDivineSword");
	public static final Item redDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("redDivineSword").setUnlocalizedName("redDivineSword");
	public static final Item greenDivineSword = new ItemModSword(ToolMaterialMod.DivineSword).setTextureName("greenDivineSword").setUnlocalizedName("greenDivineSword");
	public static final Item bedrockMaul = new ItemModSword(ToolMaterialMod.BedrockSword).setTextureName("bedrockMaul").setUnlocalizedName("bedrockMaul");
	public static final Item jungleKnife = new ItemModSword(ToolMaterialMod.OceanKnife).setTextureName("jungleKnife").setUnlocalizedName("jungleKnife");
	public static final Item cyclopsSword = new ItemModSword(ToolMaterialMod.Cyclops).setTextureName("cyclopianSword").setUnlocalizedName("cyclopianSword");
	public static final Item donatorSword = new ItemModSword(ToolMaterialMod.Donator).setTextureName("donatorSword").setUnlocalizedName("donatorSword");
	public static final Item aquaticTrident = new ItemModSword(ToolMaterialMod.AquaTrident).setTextureName("aquaticTrident").setUnlocalizedName("aquaticTrident");
	public static final Item aquaticDagger = new ItemModSword(ToolMaterialMod.AquaDagger).setTextureName("aquaticDagger").setUnlocalizedName("aquaticDagger");
	public static final Item aquaton = new ItemModSword(ToolMaterialMod.Aquaton).setTextureName("aquaton").setUnlocalizedName("aquaton");
	public static final Item sharkSword = new ItemModSword(ToolMaterialMod.SharkSword).setTextureName("sharkSword").setUnlocalizedName("sharkSword");
	public static final Item deathBringer = new ItemModSword(ToolMaterialMod.DeathBringer).setTextureName("deathBringer").setUnlocalizedName("deathBringer");
	public static final Item crabclawMaul = new ItemModSword(ToolMaterialMod.CrabclawMaul).setTextureName("crabclawMaul").setUnlocalizedName("crabclawMaul");
	public static final Item poisonSaber = new ItemModSword(ToolMaterialMod.PoisonSaber).setTextureName("poisonSaber").setUnlocalizedName("poisonSaber");
	public static final Item furyMaul = new ItemModSword(ToolMaterialMod.FuryMaul).setTextureName("furyMaul").setUnlocalizedName("furyMaul");
	public static final Item corruptedMaul = new ItemModSword(ToolMaterialMod.CorruptedMaul).setTextureName("corruptedMaul").setUnlocalizedName("corruptedMaul");
	public static final Item frostSword = new ItemModSword(ToolMaterialMod.FrostSword).setTextureName("frostSword").setUnlocalizedName("frostSword");
	
	public static final Item rupeeShickaxe = new ItemShickaxe(ToolMaterialMod.RupeeShick).setTextureName("rupeeShickaxe").setUnlocalizedName("rupeeShickaxe");
	public static final Item rupeePickaxe = new ItemModPickaxe(ToolMaterialMod.Rupee).setTextureName("rupeePickaxe").setUnlocalizedName("rupeePickaxe");
	public static final Item rupeeAxe = new ItemModAxe(ToolMaterialMod.Rupee).setTextureName("rupeeAxe").setUnlocalizedName("rupeeAxe");
	public static final Item rupeeShovel = new ItemModShovel(ToolMaterialMod.Rupee).setTextureName("rupeeShovel").setUnlocalizedName("rupeeShovel");
	public static final Item rupeeHoe = new ItemModHoe(ToolMaterialMod.Rupee).setTextureName("rupeeHoe").setUnlocalizedName("rupeeHoe");

	public static final Item arlemiteShickaxe = new ItemShickaxe(ToolMaterialMod.arlemiteShick).setTextureName("arlemiteShickaxe").setUnlocalizedName("arlemiteShickaxe");
	public static final Item arlemitePickaxe = new ItemModPickaxe(ToolMaterialMod.Arlemite).setTextureName("arlemitePickaxe").setUnlocalizedName("arlemitePickaxe");
	public static final Item arlemiteAxe = new ItemModAxe(ToolMaterialMod.Arlemite).setTextureName("arlemiteAxe").setUnlocalizedName("arlemiteAxe");
	public static final Item arlemiteShovel = new ItemModShovel(ToolMaterialMod.Arlemite).setTextureName("arlemiteShovel").setUnlocalizedName("arlemiteShovel");
	public static final Item arlemiteHoe = new ItemModHoe(ToolMaterialMod.Arlemite).setTextureName("arlemiteHoe").setUnlocalizedName("arlemiteHoe");
	
	public static final Item realmitePickaxe = new ItemModPickaxe(ToolMaterialMod.Realmite).setTextureName("realmitePickaxe").setUnlocalizedName("realmitePickaxe");
	public static final Item realmiteAxe = new ItemModAxe(ToolMaterialMod.Realmite).setTextureName("realmiteAxe").setUnlocalizedName("realmiteAxe");
	public static final Item realmiteShovel = new ItemModShovel(ToolMaterialMod.Realmite).setTextureName("realmiteShovel").setUnlocalizedName("realmiteShovel");
	public static final Item realmiteHoe = new ItemModHoe(ToolMaterialMod.Realmite).setTextureName("realmiteHoe").setUnlocalizedName("realmiteHoe");
	
	public static final Item bedrockPickaxe = new ItemModPickaxe(ToolMaterialMod.Bedrock).setTextureName("bedrockPickaxe").setUnlocalizedName("bedrockPickaxe");
	public static final Item bedrockAxe = new ItemModAxe(ToolMaterialMod.Bedrock).setTextureName("bedrockAxe").setUnlocalizedName("bedrockAxe");
	public static final Item bedrockShovel = new ItemModShovel(ToolMaterialMod.Bedrock).setTextureName("bedrockShovel").setUnlocalizedName("bedrockShovel");
	
	public static final Item corruptedPickaxe = new ItemModPickaxe(ToolMaterialMod.Corrupted).setTextureName("corruptedPickaxe").setUnlocalizedName("corruptedPickaxe");
	public static final Item corruptedAxe = new ItemModAxe(ToolMaterialMod.Corrupted).setTextureName("corruptedAxe").setUnlocalizedName("corruptedAxe");
	public static final Item corruptedShovel = new ItemModShovel(ToolMaterialMod.Corrupted).setTextureName("corruptedShovel").setUnlocalizedName("corruptedShovel");
	
	public static final Item divineShickaxe = new ItemShickaxe(ToolMaterialMod.Divine).setTextureName("divineShickaxe").setUnlocalizedName("divineShickaxe");
	public static final Item divinePickaxe = new ItemModPickaxe(ToolMaterialMod.Divine).setTextureName("divinePickaxe").setUnlocalizedName("divinePickaxe");
	public static final Item divineAxe = new ItemModAxe(ToolMaterialMod.Divine).setTextureName("divineAxe").setUnlocalizedName("divineAxe");
	public static final Item divineShovel = new ItemModShovel(ToolMaterialMod.Divine).setTextureName("divineShovel").setUnlocalizedName("divineShovel");
	
	public static final Item bacon = new ItemModFood(5, 3.0F, false).setTextureName("bacon").setUnlocalizedName("bacon");
	public static final Item boiledEgg = new ItemModFood(4, 0.5F, false).setTextureName("boiledEgg").setUnlocalizedName("boiledEgg");
	public static final Item cheese = new ItemModFood(2, 0.2F, false).setTextureName("cheese").setUnlocalizedName("cheese");
	public static final Item whiteMushroom = new ItemModFood(1, 0.1F, false).setTextureName("whiteMushroom").setUnlocalizedName("whiteMushroom");
	public static final Item advMushroomStew = new ItemModFood(10, 10.0F, false).setTextureName("advancedMushroomStew").setUnlocalizedName("advancedMushroomStew");
	public static final Item chickenDinner = new ItemModFood(20, 20.0F, false).setTextureName("chickenDinner").setUnlocalizedName("chickenDinner");

	public static void init(){
		//Materials
		addItem(realmiteIngot, "Realmite Ingot");
		addItem(rupeeIngot, "Rupee Ingot");
		addItem(arlemiteIngot, "Arlemite Ingot");
		addItem(shadowBar, "Shadow Bar");
		addItem(jungleShards, "Jungle Shard");
		addItem(divineShards, "Divine Shard");
		addItem(corruptedShards , "Corrupted Shard");
		addItem(iceShards, "Frozen Shards");
		addItem(jungleStone , "Jungle Stone");
		addItem(divineStone , "Divine Stone");
		addItem(corruptedStone , "Corrupted Stone");
		addItem(iceStone , "Ice Stone");
		addItem(healingStone, "Healing Stone");
		addItem(shadowStone, "Shadow Stone");
		addItem(aquaticIngot, "Aquatic Ingot");
		addItem(aquaticPellets, "Aquatic Pellets");
		addItem(pureAquaticPellets, "Pure Aquatic Pellets");
		addItem(cyclopsEye, "Cyclops Eye");
		addItem(crabClaw, "Crab Claw");
		addItem(legendaryEnderEye, "Legendary Ender Eye");
		addItem(sharkFin, "Shark Fin");
		addItem(whaleFin, "Whale Fin");
		//Temporary
		addItem(noImage, "NO IMAGE");
		
		//Spawner
		addItem(myseriousClock, "Mysterious Clock");
		
		//Weapons
		addItem(slimeSword, "Slime Sword");
		addItem(oceanKnife, "Ocean Knife");
		addItem(aquaticMaul, "Aquatic Maul");
		addItem(arlemiteSword, "Arlemite Sword");
		addItem(bedrockSword, "Bedrock Sword");
		addItem(realmiteSword, "Realmite Sword");
		addItem(rupeeSword, "rupee Sword");
		addItem(sandslash, "Sandslash");
		addItem(divineSword, "Divine Sword");
		addItem(blueDivineSword, "Blue Divine Sword");
		addItem(yellowDivineSword, "Yellow Divine Sword");
		addItem(pinkDivineSword, "Pink Divine Sword");
		addItem(purpleDivineSword, "Purple Divine Sword");
		addItem(redDivineSword, "Red Divine Sword");
		addItem(greenDivineSword, "Green Divine Sword");
		addItem(bedrockMaul, "Bedrock Maul");
		addItem(jungleKnife, "Jungle Knife");
		addItem(cyclopsSword, "Cyclopsian Sword");
		addItem(donatorSword, "Donator Sword");
		addItem(aquaticTrident, "Aquatic Trident");
		addItem(aquaticDagger, "Aquatic Dagger");
		addItem(aquaton, "Aquaton");
		addItem(frostSword, "Frost Sword");
		addItem(sharkSword, "Shark Sword");
		addItem(deathBringer, "Death Bringer");
		addItem(crabclawMaul, "Crabclaw Maul");
		addItem(poisonSaber, "Poison Saber");
		addItem(furyMaul, "Fury Maul");
		addItem(corruptedMaul, "Corrupted Maul");
		
		//Tools
		addItem(rupeeShickaxe, "Rupee Shickaxe");
		addItem(arlemiteShickaxe, "Arlemite Shickaxe");
		addItem(rupeePickaxe, "Rupee Pickaxe");
		addItem(rupeeAxe, "Rupee Axe");
		addItem(rupeeShovel, "Rupee Shovel");
		addItem(rupeeHoe, "Rupee Hoe");
		addItem(arlemitePickaxe, "Arlemite Pickaxe");
		addItem(arlemiteAxe, "Arlemite Axe");
		addItem(arlemiteShovel, "Arlemite Shovel");
		addItem(arlemiteHoe, "Arlemite Hoe");
		addItem(realmitePickaxe, "Realmite Pickaxe");
		addItem(realmiteAxe, "Realmite Axe");
		addItem(realmiteShovel, "Realmite Shovel");
		addItem(realmiteHoe, "Realmite Hoe");
		addItem(bedrockPickaxe, "Bedrock Pickaxe");
		addItem(bedrockAxe, "Bedrock Axe");
		addItem(bedrockShovel, "Bedrock Shovel");
		addItem(corruptedPickaxe, "Corrupted Pickaxe");
		addItem(corruptedAxe, "Corrupted Axe");
		addItem(corruptedShovel, "Corrupted Shovel");
		addItem(divineShickaxe, "Divine Shickaxe");
		addItem(divinePickaxe, "Divine Pickaxe");
		addItem(divineAxe, "Divine Axe");
		addItem(divineShovel, "Divine Shovel");
		
		//Food
		addItem(bacon, "Raw Bacon");
		addItem(boiledEgg, "Boiled Egg");
		addItem(cheese, "Cheese");
		addItem(whiteMushroom, "White Mushroom");
		addItem(advMushroomStew, "Advanced Mushroom Stew");
		addItem(chickenDinner, "Chicken Dinner");
	}
	
	public static void addItem(Item item, String name){
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}	
}
