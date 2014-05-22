package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.BlockLadder;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockModLadder extends BlockLadder { 

    protected String name;
    
	public BlockModLadder(String name) {
	    this.name = name;
	    setBlockTextureName(Reference.PREFIX + name);
        setBlockName(name);
        setCreativeTab(DivineRPGTabs.blocks);
        GameRegistry.registerBlock(this, name);
		LangRegistry.addBlock(this);
	}
	
}