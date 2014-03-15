package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockMod extends Block {

    protected static SoundType stone = Block.soundTypeStone;
    protected static SoundType grass = Block.soundTypeGrass;
    protected static SoundType cloth = Block.soundTypeCloth;
    protected static SoundType wood  = Block.soundTypeWood;

    public static Material     rock  = Material.rock;
    public static Material     wool  = Material.cloth;

    public BlockMod(Material mat) {
        super(mat);
        LangRegistry.addBlock(this);
    }
    
    public Block setHarvestLevel(int i) {
        setHarvestLevel("pickaxe", i);
        return this;
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