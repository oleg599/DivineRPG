package net.divinerpg.api.blocks;

import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockModDirt extends BlockMod {

    private static Material dirt = Material.field_151578_c;
    private static SoundType gravel = Block.field_149767_g;

    public BlockModDirt() {
        super(dirt);
        setCreativeTab(DivineRPGTabs.blocks);
        setSoundType(gravel);
    }
    
    public Block setCreativeTab(CreativeTabs name){
        return func_149647_a(name);
    }
    public Block setSoundType(Block.SoundType name){
    	return func_149672_a(name);
    }
    
}
