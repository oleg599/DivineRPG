package net.divinerpg.helper;

import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DivineRPGTabs {
	public static CreativeTabs blocks = new CreativeTabs("Blocks")
		{public Item getTabIconItem() {return Item.func_150898_a(TwilightBlocks.edenOre);}};
	public static CreativeTabs swords = new CreativeTabs("Swords")
		{public Item getTabIconItem() {return VanillaItems.aquaton;}};
	public static CreativeTabs ranged = new CreativeTabs("Ranged")
		{public Item getTabIconItem() {return VanillaItems.noImage;}};
	public static CreativeTabs tools = new CreativeTabs("Tools")
		{public Item getTabIconItem() {return VanillaItems.rupeeShickaxe;}};
	public static CreativeTabs items = new CreativeTabs("Materials")
		{public Item getTabIconItem() {return VanillaItems.rupeeIngot;}};
	public static CreativeTabs armor = new CreativeTabs("Armor")
		{public Item getTabIconItem() {return VanillaItems.noImage;}};
	public static CreativeTabs spawner = new CreativeTabs("Spawner")
		{public Item getTabIconItem() {return VanillaItems.callWatcher;}};
	public static CreativeTabs utility = new CreativeTabs("Utility")
		{public Item getTabIconItem() {return VanillaItems.noImage;}};
	public static CreativeTabs food = new CreativeTabs("Herbalism")
		{public Item getTabIconItem() {return VanillaItems.bacon;}};
	public static CreativeTabs vethea = new CreativeTabs("Vethea")
		{public Item getTabIconItem() {return Items.bed;}};
}
	