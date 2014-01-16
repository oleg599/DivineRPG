package net.divinerpg.helper.items.base;

import java.util.List;

import net.divinerpg.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
	}
	
    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
    }
    public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.prefix + par1Str);
        return this;
    }
}
