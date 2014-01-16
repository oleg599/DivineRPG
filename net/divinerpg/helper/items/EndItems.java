package net.divinerpg.helper.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.base.ItemMod;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.nether.items.ItemCallOfTheWatcher;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class EndItems {
	public static Reference x;
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item enderShard = new ItemMod().setTextureName("enderShards").setUnlocalizedName("enderShards").setCreativeTab(DivineRPGTabs.items);
	public static final Item enderStone = new ItemMod().setTextureName("enderStone").setUnlocalizedName("enderStone").setCreativeTab(DivineRPGTabs.items);
	public static final Item watchingEye = new ItemMod().setTextureName("watchingeye").setUnlocalizedName("watchingEye").setCreativeTab(DivineRPGTabs.items);
	public static final Item callWatcher = new ItemCallOfTheWatcher().setTextureName("callofthewatcher").setUnlocalizedName("callOfTheWatcher").setCreativeTab(DivineRPGTabs.spawner);

	public static final Item enderSword = new ItemModSword(ToolMaterialMod.EnderSword).setTextureName("endersword").setUnlocalizedName("enderSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordBlue = new ItemModSword(ToolMaterialMod.EnderSword).setTextureName("enderswordblue").setUnlocalizedName("enderSwordBlue").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordDark = new ItemModSword(ToolMaterialMod.EnderSword).setTextureName("enderswordblack").setUnlocalizedName("enderSwordDark").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordGreen = new ItemModSword(ToolMaterialMod.EnderSword).setTextureName("enderswordgreen").setUnlocalizedName("enderSwordGreen").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordRed = new ItemModSword(ToolMaterialMod.EnderSword).setTextureName("enderswordred").setUnlocalizedName("enderSwordRed").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderSwordYellow = new ItemModSword(ToolMaterialMod.EnderSword).setTextureName("enderswordyellow").setUnlocalizedName("enderSwordYellow").setCreativeTab(DivineRPGTabs.swords);
	
	public static void init(){
		DivineAPI.addItem(enderStone , "Ender Stone");
		DivineAPI.addItem(watchingEye, "Watching Eye");
		DivineAPI.addItem(callWatcher, "Call of the Watcher");
		DivineAPI.addItem(enderShard , "Ender Shard");
		
		DivineAPI.addItem(enderSword, "Ender Sword");
		DivineAPI.addItem(enderSwordBlue, "Blue Ender Sword");
		DivineAPI.addItem(enderSwordDark, "Dark Ender Sword");
		DivineAPI.addItem(enderSwordGreen, "Green Ender Sword");
		DivineAPI.addItem(enderSwordRed, "Red Ender Sword");
		DivineAPI.addItem(enderSwordYellow, "Yellow Ender Sword");
	}
	

}
