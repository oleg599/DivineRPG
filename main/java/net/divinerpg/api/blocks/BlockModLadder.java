package net.divinerpg.api.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;

public class BlockModLadder extends BlockLadder { 

	public BlockModLadder() {
		LangRegistry.addBlock(this);
		setCreativeTab(DivineRPGTabs.blocks);
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