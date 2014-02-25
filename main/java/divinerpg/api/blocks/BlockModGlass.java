package divinerpg.api.blocks;

import net.minecraft.block.material.Material;
import divinerpg.Reference;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;

public class BlockModGlass extends BlockMod {
		
	public BlockModGlass() {
		super(Material.glass);
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