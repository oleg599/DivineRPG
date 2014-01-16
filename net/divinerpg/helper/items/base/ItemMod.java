package net.divinerpg.helper.items.base;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.item.Item;

public class ItemMod extends Item {
	
	private String unlocalizedName;
	public ItemMod(){
		super();
		setCreativeTab(DivineRPGTabs.items);
	}
	
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
}
