package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.material.EnumBlockType;
import net.divinerpg.helper.material.EnumToolType;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockMod extends Block {
    
    protected String name;
    protected String textureName;
    protected EnumBlockType blockType;

    public BlockMod(EnumBlockType blockType, String name) {
        this(blockType, name, DivineRPGTabs.blocks);
    }
    
    public BlockMod(EnumBlockType blockType, String name, DivineRPGTabs tab){
        super(blockType.getMaterial());
        this.blockType = blockType;
        this.name = name;
        this.textureName = Reference.PREFIX + name;
        setStepSound(blockType.getSound());
        setCreativeTab(tab);
        setBlockTextureName(textureName);
        setBlockName(name);
        GameRegistry.registerBlock(this, name);
        LangRegistry.addBlock(this);
    }
    
    public Block setHarvestLevel(EnumToolType type) {
        setHarvestLevel(type.getType(), type.getLevel());
        return this;
    }
}