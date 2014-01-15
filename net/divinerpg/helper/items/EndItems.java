package net.divinerpg.helper.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.DivineRPGToolMaterial;
import net.divinerpg.nether.items.ItemCallOfTheWatcher;
import net.minecraft.item.Item;

public class EndItems {
	public static Reference x;
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item enderShard = new Item().setTextureName(Reference.prefix + "enderShards").setUnlocalizedName("enderShards").setCreativeTab(DivineRPGTabs.items);
	public static final Item enderStone = new Item().setTextureName(Reference.prefix + "enderStone").setUnlocalizedName("enderStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item watchingEye = new Item().setTextureName(Reference.prefix + "watchingeye").setUnlocalizedName("watchingEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item callWatcher = new ItemCallOfTheWatcher().setTextureName(Reference.prefix + "callofthewatcher").setUnlocalizedName("callOfTheWatcher").setCreativeTab(DivineRPGTabs.spawner);

	public static final Item enderSword = new ItemModSword(DivineRPGToolMaterial.EnderSword).setTextureName(Reference.prefix + "endersword").setUnlocalizedName("enderSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordBlue = new ItemModSword(DivineRPGToolMaterial.EnderSword).setTextureName(Reference.prefix + "enderswordblue").setUnlocalizedName("enderSwordBlue").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordDark = new ItemModSword(DivineRPGToolMaterial.EnderSword).setTextureName(Reference.prefix + "enderswordblack").setUnlocalizedName("enderSwordDark").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordGreen = new ItemModSword(DivineRPGToolMaterial.EnderSword).setTextureName(Reference.prefix + "enderswordgreen").setUnlocalizedName("enderSwordGreen").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordRed = new ItemModSword(DivineRPGToolMaterial.EnderSword).setTextureName(Reference.prefix + "enderswordred").setUnlocalizedName("enderSwordRed").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordYellow = new ItemModSword(DivineRPGToolMaterial.EnderSword).setTextureName(Reference.prefix + "enderswordyellow").setUnlocalizedName("enderSwordYellow").setCreativeTab(DivineRPGTabs.swords);
	
	public static void init(){
		addItem(enderStone , "Ender Stone");
		addItem(watchingEye, "Watching Eye");
		addItem(callWatcher, "Call of the Watcher");
		addItem(enderShard , "Ender Shard");
		
		addItem(enderSword, "Ender Sword");
		addItem(enderSwordBlue, "Blue Ender Sword");
		addItem(enderSwordDark, "Dark Ender Sword");
		addItem(enderSwordGreen, "Green Ender Sword");
		addItem(enderSwordRed, "Red Ender Sword");
		addItem(enderSwordYellow, "Yellow Ender Sword");
	}
	
	public static void addItem(Item item, String name){
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}	
}
