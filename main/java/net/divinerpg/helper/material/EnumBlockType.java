package net.divinerpg.helper.material;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;

public enum EnumBlockType {

    ROCK(Material.rock, Block.soundTypeStone),
    DIRT(Material.ground, Block.soundTypeGravel),
    LEAVES(Material.leaves, Block.soundTypeGrass),
    WOOD(Material.wood, Block.soundTypeWood);

    private Material  material;
    private SoundType sound;

    private EnumBlockType(Material material, SoundType sound) {
        this.material = material;
        this.sound = sound;
    }

    public Material getMaterial() {
        return material;
    }

    public SoundType getSound() {
        return sound;
    }

}
