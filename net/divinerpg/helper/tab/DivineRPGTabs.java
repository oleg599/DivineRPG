package net.divinerpg.helper.tab;

import net.divinerpg.helper.blocks.OverworldBlocks;
import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DivineRPGTabs {
	public static CreativeTabs blocks = new BlockTab("Blocks");
	public static CreativeTabs items = new ItemTab("Items");
	public static CreativeTabs swords = new SwordTab("Swords");
	public static CreativeTabs ranged = new RangedTab("Ranged");
	public static CreativeTabs tools = new ToolTab("Tools");
	public static CreativeTabs armor = new ArmorTab("Armor");
	public static CreativeTabs spawner = new CreativeTabs("Spawner"){public Item getTabIconItem() {return OverworldItems.myseriousClock;}};

}