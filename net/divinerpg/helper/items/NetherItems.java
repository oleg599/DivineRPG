package net.divinerpg.helper.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.DivineRPGToolMaterial;
import net.divinerpg.overworld.items.ItemInfernoSword;
import net.minecraft.item.Item;

public class NetherItems {
	public static Reference x;
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item netheriteChunk = new Item().setUnlocalizedName("netheriteChunk").setTextureName(Reference.prefix + "netheritechunk").setCreativeTab(DivineRPGTabs.items);
	public static final Item moltenStone = new Item().setTextureName(Reference.prefix + "moltenstone").setUnlocalizedName("MoltenS").setCreativeTab(DivineRPGTabs.items);
	public static final Item blueFireStone = new Item().setTextureName(Reference.prefix + "blueFirestone").setUnlocalizedName("BlueFireStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item purpleBlaze = new Item().setTextureName(Reference.prefix + "purpleblaze").setUnlocalizedName("purpleBlaze").setCreativeTab(DivineRPGTabs.items);
	public static final Item hellstoneIngot = new Item().setTextureName(Reference.prefix + "hellstoneingot").setUnlocalizedName("HellstoneIngot").setCreativeTab(DivineRPGTabs.items);
	
	public static final Item infernoSword = new ItemInfernoSword(DivineRPGToolMaterial.Inferno).setTextureName(Reference.prefix + "infernosword").setUnlocalizedName("InfernoSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bloodgemSword = new ItemModSword(DivineRPGToolMaterial.BloodgemTool).setTextureName(Reference.prefix + "bloodgemsword").setUnlocalizedName("bloodgemSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item moltenSword = new ItemModSword(DivineRPGToolMaterial.MoltenSword).setTextureName(Reference.prefix + "moltensword").setUnlocalizedName("MoltenSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item scorchingSword = new ItemModSword(DivineRPGToolMaterial.ScorchingSword).setTextureName(Reference.prefix + "scorchingsword").setUnlocalizedName("scorchingSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item bluefireSword = new ItemModSword(DivineRPGToolMaterial.BluefireSword).setTextureName(Reference.prefix + "bluefiresword").setUnlocalizedName("bluefireSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item netheriteIngot = new Item().setUnlocalizedName("netheriteIngot").setTextureName(Reference.prefix + "netheriteingot").setCreativeTab(DivineRPGTabs.items);
	public static final Item bloodGem = new Item().setUnlocalizedName("bloodgem").setTextureName(Reference.prefix + "bloodgem").setCreativeTab(DivineRPGTabs.items);

	public static void init(){
		addItem(netheriteIngot, "Netherite Ingot");
		addItem(bloodGem, "Blood Gem");
		addItem(netheriteChunk, "Netherite Chunk");
		addItem(moltenStone , "Molten Stone");
		addItem(blueFireStone , "Blue Fire Stone");
		addItem(purpleBlaze, "Purple Blaze");
		addItem(hellstoneIngot, "Hellstone Ingot");
		
		addItem(infernoSword, "Inferno Sword");
		addItem(bloodgemSword, "Bloodgem Sword");
		addItem(moltenSword, "Molten Sword");
		addItem(scorchingSword, "Scorching Sword");
		addItem(bluefireSword, "Bluefire Sword");
	}
	
	public static void addItem(Item item, String name){
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}	
}
