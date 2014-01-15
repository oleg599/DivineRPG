package net.divinerpg.helper.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.tab.DivineRPGTabs;
import net.divinerpg.overworld.items.ItemInfernoSword;
import net.divinerpg.overworld.items.ItemMysteriousClock;
import net.divinerpg.overworld.items.ItemShickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OverworldItems {

	public static Reference x;
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static ToolMaterial Rupee = EnumHelper.addToolMaterial("rupee", 6, 2500, 16.0F, 1, 0);
	public static ToolMaterial Arlemite = EnumHelper.addToolMaterial("arlemite", 3, 3000, 13.0F, 1, 10);
	public static ToolMaterial Realmite = EnumHelper.addToolMaterial("realmite", 3, 4000, 12.0F, 1, 10);
	public static ToolMaterial Inferno = EnumHelper.addToolMaterial("infernosword", 0, -1, 0, 9, 22);
	public static ToolMaterial RupeeShick = EnumHelper.addToolMaterial("RupeeShick", 4, -1, 16.0F, 7, 15);
	public static ToolMaterial ArlemiteSword = EnumHelper.addToolMaterial("arlemite", 1, 4000, 1.5F, 6, 10);
	public static ToolMaterial arlemiteShick = EnumHelper.addToolMaterial("ArlemiteShick", 4, 13000, 15.0F, 7, 15);
	public static ToolMaterial EnderSword = EnumHelper.addToolMaterial("enderSword", 0, -1, 0, 23, 16);
	public static ToolMaterial SlimeSword = EnumHelper.addToolMaterial("slimesword", 0, 1000, 0, 6, 22);
	public static ToolMaterial DivineSword = EnumHelper.addToolMaterial("divinesword", 0, -1, 0, 29, 22);
	public static ToolMaterial AquaSword = EnumHelper.addToolMaterial("aquasword", 1, 10000, 1.5F, 18, 10);
	public static ToolMaterial Aquatic = EnumHelper.addToolMaterial("Aquatic", 3, 7000, 1.5F, 15, 10);
	public static ToolMaterial OceanKnife = EnumHelper.addToolMaterial("OceanKnife", 3, 2000, 1.5F, 14, 10);
	public static ToolMaterial BedrockSword = EnumHelper.addToolMaterial("bedrocksword", 0, 14000, 0, 13, 22);
	public static ToolMaterial SandSlash = EnumHelper.addToolMaterial("sandslash", 0, 200, 0, 32, 22);
	public static ToolMaterial BloodgemTool = EnumHelper.addToolMaterial("bloodgem", 0, 520, 2.0F, 5, 15);
	public static ToolMaterial Cyclops = EnumHelper.addToolMaterial("Cyclopse", 0, 1000, 8.0F, 3.0F, 10);
	public static ToolMaterial Bedrock = EnumHelper.addToolMaterial("Bedrock", 3, -1, 9.0F, 1, 10);
	public static ToolMaterial Divine = EnumHelper.addToolMaterial("Divine", 3, 35000, 20.0F, 1, 10);
	public static ToolMaterial Corrupted = EnumHelper.addToolMaterial("Corrupted", 3, 6000, 16.0F, 1, 10);
	public static ToolMaterial Donator = EnumHelper.addToolMaterial("Donator", 0, 5000, 0.0F, 7, 22);
	public static ToolMaterial AquaticDagger = EnumHelper.addToolMaterial("AquaticDagger", 0, 2000, 0.0F, 5, 15);
	public static ToolMaterial AquaticTrident = EnumHelper.addToolMaterial("AquaticTrident", 0, 7000, 0.0F, 10, 15);
	public static ToolMaterial Aquaton = EnumHelper.addToolMaterial("Aquaton", 0, 10000, 0.0F, 13, 15);

	public static final Item rupeeIngot = new Item().setUnlocalizedName("RupeeIngot").setTextureName(x.prefix + "rupeeingot").setCreativeTab(DivineRPGTabs.items);
	public static final Item arlemiteIngot = new Item().setUnlocalizedName("ArlemiteIngot").setTextureName(x.prefix + "arlemiteingot").setCreativeTab(DivineRPGTabs.items);
	public static final Item realmiteIngot = new Item().setUnlocalizedName("RealmiteIngot").setTextureName(x.prefix + "realmiteingot").setCreativeTab(DivineRPGTabs.items);
	public static final Item shadowBar = new Item().setUnlocalizedName("shadowBar").setTextureName(x.prefix + "shadowbar").setCreativeTab(DivineRPGTabs.items);
	public static final Item netheriteIngot = new Item().setUnlocalizedName("netheriteIngot").setTextureName(x.prefix + "netheriteingot").setCreativeTab(DivineRPGTabs.items);
	public static final Item bloodGem = new Item().setUnlocalizedName("BloodGem").setTextureName(x.prefix + "bloodgem").setCreativeTab(DivineRPGTabs.items);
	public static final Item netheriteChunk = new Item().setUnlocalizedName("NetheriteChunk").setTextureName(x.prefix + "netheritechunk").setCreativeTab(DivineRPGTabs.items);
	
	public static final Item jungleShard = new Item().setTextureName(x.prefix + "jungleshards").setUnlocalizedName("Jungle").setCreativeTab(DivineRPGTabs.items);
	public static final Item iceShard = new Item().setTextureName(x.prefix + "iceshards").setUnlocalizedName("IceShard").setCreativeTab(DivineRPGTabs.items);    
	public static final Item moltenShard = new Item().setTextureName(x.prefix + "moltenshards").setUnlocalizedName("Molten").setCreativeTab(DivineRPGTabs.items);
	public static final Item divineShard = new Item().setTextureName(x.prefix + "divineshards").setUnlocalizedName("Divine").setCreativeTab(DivineRPGTabs.items);
	public static final Item enderShard = new Item().setTextureName(x.prefix + "endershards").setUnlocalizedName("Ender").setCreativeTab(DivineRPGTabs.items);
	public static final Item corruptedShard = new Item().setTextureName(x.prefix + "corruptedshards").setUnlocalizedName("Corrupted").setCreativeTab(DivineRPGTabs.items);

	public static final Item jungleStone = new Item().setTextureName(x.prefix + "junglestone").setUnlocalizedName("JungleS").setCreativeTab(DivineRPGTabs.items);
	public static final Item iceStone = new Item().setTextureName(x.prefix + "icestone").setUnlocalizedName("IceS").setCreativeTab(DivineRPGTabs.items);
	public static final Item moltenStone = new Item().setTextureName(x.prefix + "moltenstone").setUnlocalizedName("MoltenS").setCreativeTab(DivineRPGTabs.items);
	public static final Item enderStone = new Item().setTextureName(x.prefix + "enderstone").setUnlocalizedName("EnderS").setCreativeTab(DivineRPGTabs.items);
	public static final Item corruptedStone = new Item().setTextureName(x.prefix + "corruptedstone").setUnlocalizedName("CorruptedS").setCreativeTab(DivineRPGTabs.items);
	public static final Item divineStone = new Item().setTextureName(x.prefix + "divinestone").setUnlocalizedName("DivineS").setCreativeTab(DivineRPGTabs.items);
	public static final Item blueFireStone = new Item().setTextureName(x.prefix + "blueFirestone").setUnlocalizedName("BlueFireStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item healingStone = new Item().setTextureName(x.prefix + "healingstone").setUnlocalizedName("HS").setCreativeTab(DivineRPGTabs.items);
	public static final Item shadowStone = new Item().setTextureName(x.prefix + "shadowstone").setUnlocalizedName("shadowStone").setCreativeTab(DivineRPGTabs.items);
	
	public static final Item purpleBlaze = new Item().setTextureName(x.prefix + "purpleblaze").setUnlocalizedName("purpleBlaze").setCreativeTab(DivineRPGTabs.items);
	public static final Item aquaticIngot = new Item().setTextureName(x.prefix + "aquaticingot").setUnlocalizedName("aquaticIngot").setCreativeTab(DivineRPGTabs.items);
	public static final Item aquaticPellets = new Item().setTextureName(x.prefix + "aquaticpellets").setUnlocalizedName("aquaticPellets").setCreativeTab(DivineRPGTabs.items);
	public static final Item pureAquaticPellets = new Item().setTextureName(x.prefix + "pureaquaticpellets").setUnlocalizedName("aureAquaticPellets").setCreativeTab(DivineRPGTabs.items);
	public static final Item cyclopsEye = new Item().setTextureName(x.prefix + "cyclopseye").setUnlocalizedName("cyclopsEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item crabClaw = new Item().setTextureName(x.prefix + "crabclaw").setUnlocalizedName("crabClaw").setCreativeTab(DivineRPGTabs.items);
	public static final Item legendaryEnderEye = new Item().setTextureName(x.prefix + "legendaryendereye").setUnlocalizedName("legendaryEnderEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item furyFire = new Item().setTextureName(x.prefix + "furyfire").setUnlocalizedName("FuryFire").setCreativeTab(DivineRPGTabs.items);
	public static final Item hellstoneIngot = new Item().setTextureName(x.prefix + "hellstoneingot").setUnlocalizedName("HellstoneIngot").setCreativeTab(DivineRPGTabs.items);
	public static final Item sharkFin = new Item().setTextureName(x.prefix + "sharkfin").setUnlocalizedName("SharkFin").setCreativeTab(DivineRPGTabs.items);
	public static final Item watchingEye = new Item().setTextureName(x.prefix + "watchingeye").setUnlocalizedName("WatchingEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item whaleFin = new Item().setTextureName(x.prefix + "whalefin").setUnlocalizedName("WhaleFin").setCreativeTab(DivineRPGTabs.items);
	public static final Item myseriousClock = new ItemMysteriousClock().setTextureName(x.prefix + "myseriousclock").setUnlocalizedName("myseriousClock").setCreativeTab(DivineRPGTabs.spawner);
	 
	public static final Item enderSword = new ItemModSword(EnderSword).setTextureName(x.prefix + "endersword").setUnlocalizedName("enderSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordBlue = new ItemModSword(EnderSword).setTextureName(x.prefix + "enderswordblue").setUnlocalizedName("enderSwordBlue").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordDark = new ItemModSword(EnderSword).setTextureName(x.prefix + "enderswordblack").setUnlocalizedName("enderSwordDark").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordGreen = new ItemModSword(EnderSword).setTextureName(x.prefix + "enderswordgreen").setUnlocalizedName("enderSwordGreen").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordRed = new ItemModSword(EnderSword).setTextureName(x.prefix + "enderswordred").setUnlocalizedName("enderSwordRed").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordYellow = new ItemModSword(EnderSword).setTextureName(x.prefix + "enderswordyellow").setUnlocalizedName("enderSwordYellow").setCreativeTab(DivineRPGTabs.swords);
	public static final Item slimeSword = new ItemModSword(SlimeSword).setTextureName(x.prefix + "slimesword").setUnlocalizedName("SlimeSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item infernoSword = new ItemInfernoSword(Inferno).setTextureName(x.prefix + "infernosword").setUnlocalizedName("InfernoSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item oceanKnife = new ItemModSword(Aquatic).setTextureName(x.prefix + "oceanknife").setUnlocalizedName("AquaticKnife").setCreativeTab(DivineRPGTabs.swords);
	public static final Item aquaticMaul = new ItemModSword(AquaSword).setTextureName(x.prefix + "aquaticmaul").setUnlocalizedName("aquaMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item arlemiteSword = new ItemModSword(Arlemite).setTextureName(x.prefix + "arlemitesword").setUnlocalizedName("arlemiteSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bedrockSword = new ItemModSword(BedrockSword).setTextureName(x.prefix + "bedrocksword").setUnlocalizedName("bedrockSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bloodgemSword = new ItemModSword(BloodgemTool).setTextureName(x.prefix + "bloodgemsword").setUnlocalizedName("bloodgemSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item realmiteSword = new ItemModSword(Realmite).setTextureName(x.prefix + "realmitesword").setUnlocalizedName("realmiteSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item rupeeSword = new ItemModSword(Rupee).setTextureName(x.prefix + "rupeesword").setUnlocalizedName("rupeeSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item sandSlash = new ItemModSword(SandSlash).setTextureName(x.prefix + "sandslash").setUnlocalizedName("sandslashSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item divineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "divinesword").setUnlocalizedName("divineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item blueDivineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "bluedivinesword").setUnlocalizedName("bluedivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item yellowDivineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "yellowdivinesword").setUnlocalizedName("yellowdivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item pinkDivineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "pinkdivinesword").setUnlocalizedName("pinkdivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item purpleDivineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "purpledivinesword").setUnlocalizedName("purpledivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item redDivineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "reddivinesword").setUnlocalizedName("reddivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item greenDivineSword = new ItemModSword(DivineSword).setTextureName(x.prefix + "greendivinesword").setUnlocalizedName("greendivineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bedrockMaul = new ItemModSword(BedrockSword).setTextureName(x.prefix + "bedrockmaul").setUnlocalizedName("bedrockMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item jungleKnife = new ItemModSword(OceanKnife).setTextureName(x.prefix + "jungleknife").setUnlocalizedName("JungleKnife").setCreativeTab(DivineRPGTabs.swords);
	public static final Item cyclopsSword = new ItemModSword(Cyclops).setTextureName(x.prefix + "cyclopiansword").setUnlocalizedName("CyclopianSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item donatorSword = new ItemModSword(Donator).setTextureName(x.prefix + "donatorsword").setUnlocalizedName("donatorSword");
	public static final Item aquaticTrident = new ItemModSword(AquaticTrident).setTextureName(x.prefix + "aquatictrident").setUnlocalizedName("aquaticTrident").setCreativeTab(DivineRPGTabs.swords);
	public static final Item aquaticDagger = new ItemModSword(AquaticDagger).setTextureName(x.prefix + "aquaticdagegr").setUnlocalizedName("aquaticDagger").setCreativeTab(DivineRPGTabs.swords);
	public static final Item aquaton = new ItemModSword(Aquaton).setTextureName(x.prefix + "aquaton").setUnlocalizedName("aquaton").setCreativeTab(DivineRPGTabs.swords);

	public static final Item rupeeShickaxe = new ItemShickaxe(RupeeShick).setTextureName(x.prefix + "rupeeshickaxe").setUnlocalizedName("RupeeShickaxe");
	public static final Item rupeePickaxe = new ItemModPickaxe(Rupee).setTextureName(x.prefix + "rupeepickaxe").setUnlocalizedName("rupeePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item rupeeAxe = new ItemModAxe(Rupee).setTextureName(x.prefix + "rupeeaxe").setUnlocalizedName("rupeeAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item rupeeShovel = new ItemModShovel(Rupee).setTextureName(x.prefix + "rupeeshovel").setUnlocalizedName("rupeeShovel").setCreativeTab(DivineRPGTabs.tools);
	public static final Item rupeeHoe = new ItemModHoe(Rupee).setTextureName(x.prefix + "rupeehoe").setUnlocalizedName("rupeeHoe").setCreativeTab(DivineRPGTabs.tools);

	public static final Item arlemiteShickaxe = new ItemShickaxe(arlemiteShick).setTextureName(x.prefix + "arlemiteshickaxe").setUnlocalizedName("ArlemiteShickaxe");
	public static final Item arlemitePickaxe = new ItemModPickaxe(Arlemite).setTextureName(x.prefix + "arlemitepickaxe").setUnlocalizedName("arlemitePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item arlemiteAxe = new ItemModAxe(Arlemite).setTextureName(x.prefix + "arlemiteaxe").setUnlocalizedName("arlemiteAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item arlemiteShovel = new ItemModShovel(Arlemite).setTextureName(x.prefix + "arlemiteshovel").setUnlocalizedName("arlemiteShovel").setCreativeTab(DivineRPGTabs.tools);
	public static final Item arlemiteHoe = new ItemModHoe(Arlemite).setTextureName(x.prefix + "arlemitehoe").setUnlocalizedName("arlemiteHoe").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item realmitePickaxe = new ItemModPickaxe(Realmite).setTextureName(x.prefix + "realmitepickaxe").setUnlocalizedName("realmitePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item realmiteAxe = new ItemModAxe(Realmite).setTextureName(x.prefix + "realmiteaxe").setUnlocalizedName("realmiteAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item realmiteShovel = new ItemModShovel(Realmite).setTextureName(x.prefix + "realmiteshovel").setUnlocalizedName("realmiteShovel").setCreativeTab(DivineRPGTabs.tools);
	public static final Item realmiteHoe = new ItemModHoe(Realmite).setTextureName(x.prefix + "realmitehoe").setUnlocalizedName("realmiteHoe").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item bedrockPickaxe = new ItemModPickaxe(Bedrock).setTextureName(x.prefix + "bedrockpickaxe").setUnlocalizedName("bedrockPickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item bedrockAxe = new ItemModAxe(Bedrock).setTextureName(x.prefix + "bedrockaxe").setUnlocalizedName("bedrockAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item bedrockShovel = new ItemModShovel(Bedrock).setTextureName(x.prefix + "bedrockshovel").setUnlocalizedName("bedrockShovel").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item corruptedPickaxe = new ItemModPickaxe(Corrupted).setTextureName(x.prefix + "corruptedpickaxe").setUnlocalizedName("corruptedPickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item corruptedAxe = new ItemModAxe(Corrupted).setTextureName(x.prefix + "corruptedaxe").setUnlocalizedName("corruptedAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item corruptedShovel = new ItemModShovel(Corrupted).setTextureName(x.prefix + "corruptedshovel").setUnlocalizedName("corruptedShovel").setCreativeTab(DivineRPGTabs.tools);
	
	public static final Item divineShickaxe = new ItemShickaxe(Divine).setTextureName(x.prefix + "divineshickaxe").setUnlocalizedName("DivineShickaxe");
	public static final Item divinePickaxe = new ItemModPickaxe(Divine).setTextureName(x.prefix + "divinepickaxe").setUnlocalizedName("divinePickaxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item divineAxe = new ItemModAxe(Divine).setTextureName(x.prefix + "divineaxe").setUnlocalizedName("divineAxe").setCreativeTab(DivineRPGTabs.tools);
	public static final Item divineShovel = new ItemModShovel(Divine).setTextureName(x.prefix + "divineshovel").setUnlocalizedName("divineShovel").setCreativeTab(DivineRPGTabs.tools);
	
	public static void init(){
		//Materials
		addItem(rupeeIngot, "Rupee Ingot");
		addItem(arlemiteIngot, "Arlemite Ingot");
		addItem(realmiteIngot, "Realmite Ingot");
		addItem(shadowBar, "Shadow Bar");
		addItem(netheriteIngot, "Netherite Ingot");
		addItem(bloodGem, "Blood Gem");
		addItem(netheriteChunk, "Netherite Chunk");
		
		//Items
		addItem(jungleShard, "Jungle Shard");
		addItem(divineShard, "Divine Shard");
		addItem(enderShard , "Ender Shard");
		addItem(moltenShard , "Molten Shard");
		addItem(corruptedShard , "Corrupted Shard");
		addItem(iceShard, "Frozen Shards");
		addItem(jungleStone , "Jungle Stone");
		addItem(divineStone , "Divine Stone");
		addItem(enderStone , "Ender Stone");
		addItem(moltenStone , "Molten Stone");
		addItem(corruptedStone , "Corrupted Stone");
		addItem(iceStone , "Ice Stone");
		addItem(blueFireStone , "Blue Fire Stone");
		addItem(healingStone, "Healing Stone");
		addItem(shadowStone, "Shadow Stone");
		addItem(purpleBlaze, "Purple Blaze");
		addItem(aquaticIngot, "Aquatic Ingot");
		addItem(aquaticPellets, "Aquatic Pellets");
		addItem(pureAquaticPellets, "Pure Aquatic Pellets");
		addItem(cyclopsEye, "Cyclops Eye");
		addItem(crabClaw, "Crab Claw");
		addItem(legendaryEnderEye, "Legendary Ender Eye");
		addItem(furyFire, "Fury Fire");
		addItem(hellstoneIngot, "Hellstone Ingot");
		addItem(sharkFin, "Shark Fin");
		addItem(watchingEye, "Watching Eye");
		addItem(whaleFin, "Whale Fin");
		addItem(myseriousClock, "Mysterious Clock");
		
		//Weapons
		addItem(enderSword, "Ender Sword");
		addItem(enderSwordBlue, "Blue Ender Sword");
		addItem(enderSwordDark, "Dark Ender Sword");
		addItem(enderSwordGreen, "Green Ender Sword");
		addItem(enderSwordRed, "Red Ender Sword");
		addItem(enderSwordYellow, "Yellow Ender Sword");
		addItem(slimeSword, "Slime Sword");
		addItem(infernoSword, "Inferno Sword");
		addItem(oceanKnife, "Ocean Knife");
		addItem(aquaticMaul, "Aquatic Maul");
		addItem(arlemiteSword, "Arlemite Sword");
		addItem(bedrockSword, "Bedrock Sword");
		addItem(bloodgemSword, "Bloodgem Sword");
		addItem(realmiteSword, "Realmite Sword");
		addItem(rupeeSword, "rupee Sword");
		addItem(sandSlash, "Sand Slash");
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
		addItem(donatorSword, "Donator Sword");
		addItem(aquaticTrident, "Aquatic Trident");
		addItem(aquaticDagger, "Aquatic Dagger");
		addItem(aquaton, "Aquaton");
		
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
	}
	
	public static void addItem(Item item, String name){
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}	
}
