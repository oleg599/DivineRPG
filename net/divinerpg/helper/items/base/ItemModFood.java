package net.divinerpg.helper.items.base;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemModFood extends ItemFood {
	
	public ItemModFood(int food, float sat, boolean wolf){
		super(food, sat, wolf);
		setCreativeTab(DivineRPGTabs.food);
	}
	
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.prefix + par1Str);
        return this;
    }
	
}
