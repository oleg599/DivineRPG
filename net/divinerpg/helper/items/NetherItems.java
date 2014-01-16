package net.divinerpg.helper.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.base.ItemMod;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.overworld.items.ItemInfernoSword;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class NetherItems {
	public static Reference x;
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item netheriteChunk = new ItemMod().setUnlocalizedName("netheriteChunk").setTextureName("netheriteChunk");
	public static final Item moltenStone = new ItemMod().setTextureName("moltenstone").setUnlocalizedName("moltenStone");
	public static final Item blueFireStone = new ItemMod().setTextureName("blueFirestone").setUnlocalizedName("bluefireStone");
	public static final Item purpleBlaze = new ItemMod().setTextureName("purpleblaze").setUnlocalizedName("purpleBlaze");
	public static final Item hellstoneIngot = new ItemMod().setTextureName("hellstoneingot").setUnlocalizedName("hellstoneIngot");
	public static final Item furyFire = new ItemMod().setTextureName("furyFire").setUnlocalizedName("furyFire");
	public static final Item netheriteIngot = new ItemMod().setTextureName("netheriteIngot").setUnlocalizedName("netheriteIngot");
	public static final Item bloodgem = new ItemMod().setTextureName("bloodgem").setUnlocalizedName("bloodgem");
	public static final Item moltenShards = new ItemMod().setTextureName("moltenShards").setUnlocalizedName("moltenShards");

	public static final Item infernoSword = new ItemInfernoSword(ToolMaterialMod.Inferno).setTextureName("infernoSword").setUnlocalizedName("infernoSword");
	public static final Item bloodgemSword = new ItemModSword(ToolMaterialMod.BloodgemTool).setTextureName("bloodgemSword").setUnlocalizedName("bloodgemSword");
	public static final Item moltenSword = new ItemModSword(ToolMaterialMod.MoltenSword).setTextureName("moltenSword").setUnlocalizedName("moltenSword");
	public static final Item scorchingSword = new ItemModSword(ToolMaterialMod.ScorchingSword).setTextureName("scorchingSword").setUnlocalizedName("scorchingSword");
	public static final Item bluefireSword = new ItemModSword(ToolMaterialMod.BluefireSword).setTextureName("bluefireSword").setUnlocalizedName("bluefireSword");

	public static void init(){
		addItem(netheriteIngot, "Netherite Ingot");
		addItem(bloodgem, "Blood Gem");
		addItem(netheriteChunk, "Netherite Chunk");
		addItem(moltenStone , "Molten Stone");
		addItem(blueFireStone , "Blue Fire Stone");
		addItem(purpleBlaze, "Purple Blaze");
		addItem(hellstoneIngot, "Hellstone Ingot");
		addItem(furyFire, "Fury Fire");
		addItem(moltenShards , "Molten Shard");
		
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
