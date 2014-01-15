package net.divinerpg.helper.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.base.ItemModAxe;
import net.divinerpg.helper.items.base.ItemModHoe;
import net.divinerpg.helper.items.base.ItemModPickaxe;
import net.divinerpg.helper.items.base.ItemModShovel;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.DivineRPGToolMaterial;
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

	public static final Item rupeeIngot = new Item().setUnlocalizedName("rupeeIngot").setTextureName(Reference.prefix + "rupeeIngot").setCreativeTab(DivineRPGTabs.items);
	public static final Item arlemiteIngot = new Item().setUnlocalizedName("arlemiteIngot").setTextureName(Reference.prefix + "arlemiteIngot").setCreativeTab(DivineRPGTabs.items);
	public static final Item realmiteIngot = new Item().setUnlocalizedName("realmiteIngot").setTextureName(Reference.prefix + "realmiteIngot").setCreativeTab(DivineRPGTabs.items);
	public static final Item shadowBar = new Item().setUnlocalizedName("shadowBar").setTextureName(Reference.prefix + "shadowBar").setCreativeTab(DivineRPGTabs.items);
	
	public static final Item jungleShards = new Item().setTextureName(Reference.prefix + "jungleShards").setUnlocalizedName("jungleShards").setCreativeTab(DivineRPGTabs.items);
	public static final Item iceShards = new Item().setTextureName(Reference.prefix + "iceShards").setUnlocalizedName("iceShards").setCreativeTab(DivineRPGTabs.items);    
	public static final Item divineShards = new Item().setTextureName(Reference.prefix + "divineShards").setUnlocalizedName("divineShards").setCreativeTab(DivineRPGTabs.items);
	public static final Item corruptedShards = new Item().setTextureName(Reference.prefix + "corruptedShards").setUnlocalizedName("corruptedShards").setCreativeTab(DivineRPGTabs.items);

	public static final Item jungleStone = new Item().setTextureName(Reference.prefix + "jungleStone").setUnlocalizedName("jungleStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item iceStone = new Item().setTextureName(Reference.prefix + "iceStone").setUnlocalizedName("iceStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item corruptedStone = new Item().setTextureName(Reference.prefix + "corruptedStone").setUnlocalizedName("corruptedStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item divineStone = new Item().setTextureName(Reference.prefix + "divineStone").setUnlocalizedName("divineStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item healingStone = new Item().setTextureName(Reference.prefix + "healingStone").setUnlocalizedName("healingStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item shadowStone = new Item().setTextureName(Reference.prefix + "shadowStone").setUnlocalizedName("shadowStone").setCreativeTab(DivineRPGTabs.items);
	
	public static final Item aquaticIngot = new Item().setTextureName(Reference.prefix + "aquaticIngot").setUnlocalizedName("aquaticIngot").setCreativeTab(DivineRPGTabs.items);
	public static final Item aquaticPellets = new Item().setTextureName(Reference.prefix + "aquaticPellets").setUnlocalizedName("aquaticPellets").setCreativeTab(DivineRPGTabs.items);
	public static final Item pureAquaticPellets = new Item().setTextureName(Reference.prefix + "pureAquaticPellets").setUnlocalizedName("pureAquaticPellets").setCreativeTab(DivineRPGTabs.items);
	public static final Item cyclopsEye = new Item().setTextureName(Reference.prefix + "cyclopsEye").setUnlocalizedName("cyclopsEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item crabClaw = new Item().setTextureName(Reference.prefix + "crabClaw").setUnlocalizedName("crabClaw").setCreativeTab(DivineRPGTabs.items);
	public static final Item legendaryEnderEye = new Item().setTextureName(Reference.prefix + "legendaryEnderEye").setUnlocalizedName("legendaryEnderEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item sharkFin = new Item().setTextureName(Reference.prefix + "sharkFin").setUnlocalizedName("sharkFin").setCreativeTab(DivineRPGTabs.items);
	public static final Item whaleFin = new Item().setTextureName(Reference.prefix + "whaleFin").setUnlocalizedName("whaleFin").setCreativeTab(DivineRPGTabs.items);
	public static final Item myseriousClock = new ItemMysteriousClock().setTextureName(Reference.prefix + "myseriousClock").setUnlocalizedName("myseriousClock").setCreativeTab(DivineRPGTabs.spawner);
	public static final Item noImage = new Item().setTextureName(Reference.prefix + "noimage").setUnlocalizedName("noImage");

	public static final Item slimeSword = new ItemModSword(DivineRPGToolMaterial.SlimeSword).setTextureName(Reference.prefix + "slimeSword").setUnlocalizedName("slimeSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item oceanKnife = new ItemModSword(DivineRPGToolMaterial.OceanKnife).setTextureName(Reference.prefix + "oceanKnife").setUnlocalizedName("oceanKnife").setCreativeTab(DivineRPGTabs.swords);
	public static final Item aquaticMaul = new ItemModSword(DivineRPGToolMaterial.AquaMaul).setTextureName(Reference.prefix + "aquaMaul").setUnlocalizedName("aquaMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item arlemiteSword = new ItemModSword(DivineRPGToolMaterial.Arlemite).setTextureName(Reference.prefix + "arlemiteSword").setUnlocalizedName("arlemiteSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bedrockSword = new ItemModSword(DivineRPGToolMaterial.BedrockSword).setTextureName(Reference.prefix + "bedrockSword").setUnlocalizedName("bedrockSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item realmiteSword = new ItemModSword(DivineRPGToolMaterial.Realmite).setTextureName(Reference.prefix + "realmiteSword").setUnlocalizedName("realmiteSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item rupeeSword = new ItemModSword(DivineRPGToolMaterial.Rupee).setTextureName(Reference.prefix + "rupeeSword").setUnlocalizedName("rupeeSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item sandslash = new ItemModSword(DivineRPGToolMaterial.Sandslash).setTextureName(Reference.prefix + "sandslash").setUnlocalizedName("sandslash").setCreativeTab(DivineRPGTabs.swords);
	public static final Item divineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "divineSword").setUnlocalizedName("divineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item blueDivineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "blueDivineSword").setUnlocalizedName("blueDivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item yellowDivineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "yellowDivineSword").setUnlocalizedName("yellowDivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item pinkDivineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "pinkDivineSword").setUnlocalizedName("pinkDivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item purpleDivineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "purpleDivineSword").setUnlocalizedName("purpleDivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item redDivineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "redDivineSword").setUnlocalizedName("redDivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item greenDivineSword = new ItemModSword(DivineRPGToolMaterial.DivineSword).setTextureName(Reference.prefix + "greenDivineSword").setUnlocalizedName("greenDivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bedrockMaul = new ItemModSword(DivineRPGToolMaterial.BedrockSword).setTextureName(Reference.prefix + "bedrockMaul").setUnlocalizedName("bedrockMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item jungleKnife = new ItemModSword(DivineRPGToolMaterial.OceanKnife).setTextureName(Reference.prefix + "jungleKnife").setUnlocalizedName("jungleKnife").setCreativeTab(DivineRPGTabs.swords);
	public static final Item cyclopsSword = new ItemModSword(DivineRPGToolMaterial.Cyclops).setTextureName(Reference.prefix + "cyclopianSword").setUnlocalizedName("cyclopianSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item donatorSword = new ItemModSword(DivineRPGToolMaterial.Donator).setTextureName(Reference.prefix + "donatorSword").setUnlocalizedName("donatorSword");
	public static final Item aquaticTrident = new ItemModSword(DivineRPGToolMaterial.AquaTrident).setTextureName(Reference.prefix + "aquaticTrident").setUnlocalizedName("aquaticTrident").setCreativeTab(DivineRPGTabs.swords);
	public static final Item aquaticDagger = new ItemModSword(DivineRPGToolMaterial.AquaDagger).setTextureName(Reference.prefix + "aquaticDagger").setUnlocalizedName("aquaticDagger").setCreativeTab(DivineRPGTabs.swords);
	public static final Item aquaton = new ItemModSword(DivineRPGToolMaterial.Aquaton).setTextureName(Reference.prefix + "aquaton").setUnlocalizedName("aquaton").setCreativeTab(DivineRPGTabs.swords);
	public static final Item sharkSword = new ItemModSword(DivineRPGToolMaterial.SharkSword).setTextureName(Reference.prefix + "sharkSword").setUnlocalizedName("sharkSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item deathBringer = new ItemModSword(DivineRPGToolMaterial.DeathBringer).setTextureName(Reference.prefix + "deathBringer").setUnlocalizedName("deathBringer").setCreativeTab(DivineRPGTabs.swords);
	public static final Item crabclawMaul = new ItemModSword(DivineRPGToolMaterial.CrabclawMaul).setTextureName(Reference.prefix + "crabclawMaul").setUnlocalizedName("crabclawMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item poisonSaber = new ItemModSword(DivineRPGToolMaterial.PoisonSaber).setTextureName(Reference.prefix + "poisonSaber").setUnlocalizedName("poisonSaber").setCreativeTab(DivineRPGTabs.swords);
	public static final Item furyMaul = new ItemModSword(DivineRPGToolMaterial.FuryMaul).setTextureName(Reference.prefix + "furyMaul").setUnlocalizedName("furyMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item corruptedMaul = new ItemModSword(DivineRPGToolMaterial.CorruptedMaul).setTextureName(Reference.prefix + "corruptedMaul").setUnlocalizedName("corruptedMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item frostSword = new ItemModSword(DivineRPGToolMaterial.FrostSword).setTextureName(Reference.prefix + "frostSword").setUnlocalizedName("frostSword").setCreativeTab(DivineRPGTabs.swords);
	
	public static final Item rupeeShickaxe = new ItemShickaxe(DivineRPGToolMaterial.RupeeShick).setTextureName(Reference.prefix + "rupeeShickaxe").setUnlocalizedName("rupeeShickaxe");
	public static final Item rupeePickaxe = new ItemModPickaxe(DivineRPGToolMaterial.Rupee).setTextureName(Reference.prefix + "rupeePickaxe").setUnlocalizedName("rupeePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item rupeeAxe = new ItemModAxe(DivineRPGToolMaterial.Rupee).setTextureName(Reference.prefix + "rupeeAxe").setUnlocalizedName("rupeeAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item rupeeShovel = new ItemModShovel(DivineRPGToolMaterial.Rupee).setTextureName(Reference.prefix + "rupeeShovel").setUnlocalizedName("rupeeShovel").setCreativeTab(DivineRPGTabs.tools);
	public static final Item rupeeHoe = new ItemModHoe(DivineRPGToolMaterial.Rupee).setTextureName(Reference.prefix + "rupeeHoe").setUnlocalizedName("rupeeHoe").setCreativeTab(DivineRPGTabs.tools);

	public static final Item arlemiteShickaxe = new ItemShickaxe(DivineRPGToolMaterial.arlemiteShick).setTextureName(Reference.prefix + "arlemiteShickaxe").setUnlocalizedName("arlemiteShickaxe");
	public static final Item arlemitePickaxe = new ItemModPickaxe(DivineRPGToolMaterial.Arlemite).setTextureName(Reference.prefix + "arlemitePickaxe").setUnlocalizedName("arlemitePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item arlemiteAxe = new ItemModAxe(DivineRPGToolMaterial.Arlemite).setTextureName(Reference.prefix + "arlemiteAxe").setUnlocalizedName("arlemiteAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item arlemiteShovel = new ItemModShovel(DivineRPGToolMaterial.Arlemite).setTextureName(Reference.prefix + "arlemiteShovel").setUnlocalizedName("arlemiteShovel").setCreativeTab(DivineRPGTabs.tools);
	public static final Item arlemiteHoe = new ItemModHoe(DivineRPGToolMaterial.Arlemite).setTextureName(Reference.prefix + "arlemiteHoe").setUnlocalizedName("arlemiteHoe").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item realmitePickaxe = new ItemModPickaxe(DivineRPGToolMaterial.Realmite).setTextureName(Reference.prefix + "realmitePickaxe").setUnlocalizedName("realmitePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item realmiteAxe = new ItemModAxe(DivineRPGToolMaterial.Realmite).setTextureName(Reference.prefix + "realmiteAxe").setUnlocalizedName("realmiteAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item realmiteShovel = new ItemModShovel(DivineRPGToolMaterial.Realmite).setTextureName(Reference.prefix + "realmiteShovel").setUnlocalizedName("realmiteShovel").setCreativeTab(DivineRPGTabs.tools);
	public static final Item realmiteHoe = new ItemModHoe(DivineRPGToolMaterial.Realmite).setTextureName(Reference.prefix + "realmiteHoe").setUnlocalizedName("realmiteHoe").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item bedrockPickaxe = new ItemModPickaxe(DivineRPGToolMaterial.Bedrock).setTextureName(Reference.prefix + "bedrockPickaxe").setUnlocalizedName("bedrockPickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item bedrockAxe = new ItemModAxe(DivineRPGToolMaterial.Bedrock).setTextureName(Reference.prefix + "bedrockAxe").setUnlocalizedName("bedrockAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item bedrockShovel = new ItemModShovel(DivineRPGToolMaterial.Bedrock).setTextureName(Reference.prefix + "bedrockShovel").setUnlocalizedName("bedrockShovel").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item corruptedPickaxe = new ItemModPickaxe(DivineRPGToolMaterial.Corrupted).setTextureName(Reference.prefix + "corruptedPickaxe").setUnlocalizedName("corruptedPickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item corruptedAxe = new ItemModAxe(DivineRPGToolMaterial.Corrupted).setTextureName(Reference.prefix + "corruptedAxe").setUnlocalizedName("corruptedAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item corruptedShovel = new ItemModShovel(DivineRPGToolMaterial.Corrupted).setTextureName(Reference.prefix + "corruptedShovel").setUnlocalizedName("corruptedShovel").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item divineShickaxe = new ItemShickaxe(DivineRPGToolMaterial.Divine).setTextureName(Reference.prefix + "divineShickaxe").setUnlocalizedName("divineShickaxe");
	public static final Item divinePickaxe = new ItemModPickaxe(DivineRPGToolMaterial.Divine).setTextureName(Reference.prefix + "divinePickaxe").setUnlocalizedName("divinePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item divineAxe = new ItemModAxe(DivineRPGToolMaterial.Divine).setTextureName(Reference.prefix + "divineAxe").setUnlocalizedName("divineAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item divineShovel = new ItemModShovel(DivineRPGToolMaterial.Divine).setTextureName(Reference.prefix + "divineShovel").setUnlocalizedName("divineShovel").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item bacon = new ItemFood(5, 3.0F, false).setTextureName(Reference.prefix + "bacon").setUnlocalizedName("bacon").setCreativeTab(DivineRPGTabs.food);

	
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
	}
	
	public static void addItem(Item item, String name){
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}	
}
