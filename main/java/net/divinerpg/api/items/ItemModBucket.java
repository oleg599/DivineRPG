package net.divinerpg.api.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemModBucket extends ItemBucket{

	public ItemModBucket(Block liquid) {
		super(liquid);
		LangRegistry.addItem(this);
	}

	public Item setName(String name){
		setCreativeTab(DivineRPGTabs.utility);
		setTextureName(Reference.PREFIX + name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		return this; 
	}
}