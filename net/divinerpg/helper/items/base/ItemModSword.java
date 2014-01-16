package net.divinerpg.helper.items.base;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword{

	public ItemModSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		setCreativeTab(DivineRPGTabs.swords);
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		if(item.getMaxDamage() == -1) {
			infoList.add("Infinite Uses");
		}
		else {
			infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		}
	}
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
}
