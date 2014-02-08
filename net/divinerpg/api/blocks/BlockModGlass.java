package net.divinerpg.api.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockModGlass extends BlockMod {
		
	public BlockModGlass(Material m) {
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		LangRegistry.addBlock(this);
	}
	
    public int getRenderBlockPass() {
        return 1;
    }
    
    public String getTextureName(){
        return Reference.PREFIX + name;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube() {
    	return false;
    }
}