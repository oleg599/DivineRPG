package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModBook extends BlockBookshelf {
    static Material wood = Material.wood;
    
	String name;
	
	public BlockModBook() {
		setCreativeTab(DivineRPGTabs.blocks);
		LangRegistry.addBlock(this);
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ != 1 && p_149691_1_ != 0 ? super.getIcon(p_149691_1_, p_149691_2_) : IceikaBlocks.coalstone.getBlockTextureFromSide(p_149691_1_);
    }
	
	
	public Block setTextureName(String name){
        return setBlockTextureName(Reference.PREFIX + name);
    }
	
	public Block setName(String name){
        this.name = name;
        setTextureName(name);
        setBlockName(name);
        GameRegistry.registerBlock(this, name);
        return this;
    }
	
	public String getName(){
        return name;
    }
    
    public String getTextureName(){
        return Reference.PREFIX + name;
    }
}
