package divinerpg.vanilla.items;

import net.minecraft.item.ItemBucket;
import cpw.mods.fml.common.registry.GameRegistry;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;

public class ItemTarBucket extends ItemBucket{

	private Block tar;

	public ItemTarBucket(Block liquid) {
		super(liquid);
		LangRegistry.addItem(this);
		tar = liquid;
	}

	public Item setName(String name){
		setCreativeTab(DivineRPGTabs.utility);
		setTextureName(Reference.PREFIX + name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		return this; 
	}

	/*@Override//TODO I farking wrote this for no reason ;_;
	public boolean tryPlaceContainedLiquid(World par1World, int par2, int par3, int par4) {
		Material material = par1World.getBlock(par2, par3, par4).getMaterial();
        boolean flag = !material.isSolid();
		
		if(tar == null){
			return false;
		} else if(!par1World.isAirBlock(par2, par3, par4) && flag || par1World.getBlock(par2, par3, par4) == tar){
			return false;
		} else {
			par1World.setBlock(par2, par3, par4, tar, 0, 3);
			return true;
		}
	}*/
}