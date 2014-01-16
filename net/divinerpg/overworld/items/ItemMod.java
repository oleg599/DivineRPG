package net.divinerpg.overworld.items;

import net.divinerpg.Reference;
import net.minecraft.item.Item;

public class ItemMod extends Item {
	
	public ItemMod(){
		super();
	}
	
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.prefix + par1Str);
        return this;
    }

}
