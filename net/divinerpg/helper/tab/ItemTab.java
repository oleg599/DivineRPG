package net.divinerpg.helper.tab;

import net.divinerpg.helper.blocks.OverworldBlocks;
import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTab extends CreativeTabs {
	public ItemTab(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Item getTabIconItem() {
		return OverworldItems.rupeeIngot;
	}

}