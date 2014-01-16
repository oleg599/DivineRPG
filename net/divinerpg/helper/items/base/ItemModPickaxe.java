package net.divinerpg.helper.items.base;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemModPickaxe extends ItemPickaxe{

	ToolMaterial t;
	
	public ItemModPickaxe(ToolMaterial tool) {
		super(tool);
		t = tool;
		setCreativeTab(DivineRPGTabs.tools);
	}

    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
        infoList.add("Efficiency: " + this.t.getEfficiencyOnProperMaterial());
    }
    public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
}
