package net.divinerpg.api.items;

import scala.util.Random;
import net.divinerpg.Reference;
import net.divinerpg.blocks.iceika.tile_entity.TileEntityFrostedChest;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
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