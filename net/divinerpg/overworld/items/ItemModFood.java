package net.divinerpg.overworld.items;

import net.divinerpg.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemModFood extends ItemFood {
	
	public ItemModFood(int food, float sat, boolean wolf){
		super(food, sat, wolf);
	}
	
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.prefix + par1Str);
        return this;
    }

}
