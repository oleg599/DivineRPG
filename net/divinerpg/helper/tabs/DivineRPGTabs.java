package net.divinerpg.helper.tabs;

import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DivineRPGTabs {
	public static CreativeTabs blocks = new CreativeTabs("Blocks") 
		{public Item getTabIconItem() {return Item.getItemFromBlock(TwilightBlocks.edenOre);}};
	public static CreativeTabs swords = new CreativeTabs("Swords") 
		{public Item getTabIconItem() {return VanillaItems.aquaton;}};
	public static CreativeTabs ranged = new CreativeTabs("Ranged")
		{public Item getTabIconItem() {return VanillaItems.vileStorm;}};
	public static CreativeTabs tools = new CreativeTabs("Tools")
		{public Item getTabIconItem() {return VanillaItems.rupeeShickaxe;}};
	public static CreativeTabs items = new CreativeTabs("Materials")
		{public Item getTabIconItem() {return VanillaItems.rupeeIngot;}};
	public static CreativeTabs armor = new CreativeTabs("Armor")
		{public Item getTabIconItem() {return VanillaItems.angelicHelmet;}};
	public static CreativeTabs spawner = new CreativeTabs("Spawner")
		{public Item getTabIconItem() {return VanillaItems.callWatcher;}};
	public static CreativeTabs utility = new CreativeTabs("Utility")
		{public Item getTabIconItem() {return VanillaItems.tarBucket;}};
	public static CreativeTabs food = new CreativeTabs("Herbalism")
		{public Item getTabIconItem() {return VanillaItems.bacon;}};
	public static CreativeTabs vethea = new CreativeTabs("Vethea")
		{public Item getTabIconItem() {return VetheanItems.karosStaff;}};
}