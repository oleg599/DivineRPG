package net.divinerpg.api.blocks;

import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.material.Material;

public class BlockModDirt extends BlockMod {

    private static Material dirt = Material.field_151578_c;

    public BlockModDirt() {
        super(dirt);
        func_149647_a(DivineRPGTabs.blocks);
        this.func_149672_a(field_149767_g);
    }
}
