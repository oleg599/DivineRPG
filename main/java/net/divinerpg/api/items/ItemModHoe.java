package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(ToolMaterial t) {
		super(t);
		setCreativeTab(DivineRPGTabs.tools);
		LangRegistry.addItem(this);
	}
	
    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        if(item.getMaxDamage() != -1) {
        	infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		} else {
			infoList.add(Util.GREEN + "Infinite Uses");
		}
    }
    
    public Item setTextureName(String par1Str) {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
    
    public Item setName(String name){
        setTextureName(name);
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        return this;
    }
}