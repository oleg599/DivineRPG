package net.divinerpg.helper.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
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
	public static final Item moltenStone = new ItemMod().setTextureName("moltenStone").setUnlocalizedName("moltenStone");
	public static final Item blueFireStone = new ItemMod().setTextureName("bluefireStone").setUnlocalizedName("bluefireStone");
	public static final Item purpleBlaze = new ItemMod().setTextureName("purpleBlaze").setUnlocalizedName("purpleBlaze");
	public static final Item hellstoneIngot = new ItemMod().setTextureName("hellstoneIngot").setUnlocalizedName("hellstoneIngot");
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
		DivineAPI.addItem(netheriteIngot, "Netherite Ingot");
		DivineAPI.addItem(bloodgem, "Blood Gem");
		DivineAPI.addItem(netheriteChunk, "Netherite Chunk");
		DivineAPI.addItem(moltenStone , "Molten Stone");
		DivineAPI.addItem(blueFireStone , "Blue Fire Stone");
		DivineAPI.addItem(purpleBlaze, "Purple Blaze");
		DivineAPI.addItem(hellstoneIngot, "Hellstone Ingot");
		DivineAPI.addItem(furyFire, "Fury Fire");
		DivineAPI.addItem(moltenShards , "Molten Shard");
		
		DivineAPI.addItem(infernoSword, "Inferno Sword");
		DivineAPI.addItem(bloodgemSword, "Bloodgem Sword");
		DivineAPI.addItem(moltenSword, "Molten Sword");
		DivineAPI.addItem(scorchingSword, "Scorching Sword");
		DivineAPI.addItem(bluefireSword, "Bluefire Sword");
	}
}
