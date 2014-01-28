package net.divinerpg.vethea.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class VetheanDirt extends BlockMod {

    private static Material dirt = Material.field_151578_c;
    private static SoundType gravel = Block.field_149767_g;

    public VetheanDirt() {
        super(dirt);
        setCreativeTab(DivineRPGTabs.vethea);
        setSoundType(gravel);
    }
    
    public Block setCreativeTab(CreativeTabs name){
        return func_149647_a(name);
    }
    public Block setSoundType(Block.SoundType name){
    	return func_149672_a(name);
    }
    public Block setHardness(float p_149711_1_){
        this.field_149782_v = p_149711_1_;

        if (this.field_149781_w < p_149711_1_ * 5.0F)
        {
            this.field_149781_w = p_149711_1_ * 5.0F;
        }

        return this;
    }
    
    
    
}
