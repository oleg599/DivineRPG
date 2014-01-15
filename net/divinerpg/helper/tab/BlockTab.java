package net.divinerpg.helper.tab;

import net.divinerpg.helper.blocks.OverworldBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTab extends CreativeTabs {
	public BlockTab(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Item getTabIconItem() {
		return Item.func_150898_a(OverworldBlocks.rupeeOre);
	}

}
