package net.divinerpg.helper.tabs;

import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.ItemsFood;
import net.divinerpg.helper.items.VanillaItemsArmor;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.items.VanillaItemsTools;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DivineRPGTabs {
	public static CreativeTabs blocks = new CreativeTabs("Blocks") 
		{public Item getTabIconItem() {return Item.getItemFromBlock(TwilightBlocks.edenOre);}};
	public static CreativeTabs swords = new CreativeTabs("Swords") 
		{public Item getTabIconItem() {return VanillaItemsWeapons.aquaton;}};
	public static CreativeTabs ranged = new CreativeTabs("Ranged")
		{public Item getTabIconItem() {return VanillaItemsWeapons.vileStorm;}};
	public static CreativeTabs tools = new CreativeTabs("Tools")
		{public Item getTabIconItem() {return VanillaItemsTools.rupeeShickaxe;}};
	public static CreativeTabs items = new CreativeTabs("Materials")
		{public Item getTabIconItem() {return VanillaItemsOther.rupeeIngot;}};
	public static CreativeTabs armor = new CreativeTabs("Armor")
		{public Item getTabIconItem() {return VanillaItemsOther.angelicHelmet;}};
	public static CreativeTabs spawner = new CreativeTabs("Spawner")
		{public Item getTabIconItem() {return VanillaItemsOther.callWatcher;}};
	public static CreativeTabs utility = new CreativeTabs("Utility")
		{public Item getTabIconItem() {return VanillaItemsOther.tarBucket;}};
	public static CreativeTabs food = new CreativeTabs("Herbalism")
		{public Item getTabIconItem() {return ItemsFood.bacon;}};
	public static CreativeTabs vethea = new CreativeTabs("Vethea")
		{public Item getTabIconItem() {return VetheanItems.karosStaff;}};
}