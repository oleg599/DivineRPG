package net.divinerpg.helper.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemModPickaxe extends ItemPickaxe{

	ToolMaterial t;
	
	public ItemModPickaxe(ToolMaterial tool) {
		super(tool);
		t = tool;
	}

    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        infoList.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
        infoList.add("Efficiency: " + this.t.getEfficiencyOnProperMaterial());
    }
	
}
