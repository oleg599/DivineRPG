package net.divinerpg.api.blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityChest;

public class BlockModChest extends BlockChest {
	
	public BlockModChest() {
		super(0);
		setCreativeTab(DivineRPGTabs.blocks);
	}
	//TODO: Let it have its own texture
	
	public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}
	
	public Block setTextureName(String name) {
        return setBlockTextureName(Reference.PREFIX + name);
    }

    public Block setName(String name) {
        setTextureName(name);
        setBlockName(name);
        GameRegistry.registerBlock(this, name);
        return this;
    }
}