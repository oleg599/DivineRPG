package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.material.EnumBlockType;
import net.divinerpg.helper.material.EnumToolType;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockMod extends Block {
    
    protected String name;
    public String textureName;
    protected EnumBlockType blockType;
    
    public BlockMod(String name){
        this(EnumBlockType.ROCK, name);
    }
    
    public BlockMod(String name, boolean breakable){
        this(EnumBlockType.ROCK, name, breakable);
    }

    public BlockMod(EnumBlockType blockType, String name) {
        this(blockType, name, DivineRPGTabs.blocks);
    }
    
    public BlockMod(EnumBlockType blockType, String name, boolean breakable) {
        this(blockType, name, DivineRPGTabs.blocks);
        if(!breakable) setBlockUnbreakable();
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
    
    @Override
    public Item getItemDropped(int par1, Random rand, int par3) {
        return Util.toItem(this);
    }
    
    public Block setHarvestLevel(EnumToolType type) {
        setHarvestLevel(type.getType(), type.getLevel());
        return this;
    }
}