package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.material.Material;

public class BlockModGlass extends BlockMod {
		
	public BlockModGlass() {
		super(Material.glass);
		setCreativeTab(DivineRPGTabs.blocks);
		LangRegistry.addBlock(this);
	}
	
    public int getRenderBlockPass() {
        return 1;
    }
    
    public String getTextureName() {
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