package net.divinerpg.twilight;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockModDirt extends Block {

	static Material dirt = Material.field_151578_c;
    public BlockModDirt() {
        super(dirt);
        func_149647_a(DivineRPGTabs.blocks);
    }
    
    public Block setTextureName(String name){
        return func_149658_d(Reference.PREFIX + name);
    }
	
}
