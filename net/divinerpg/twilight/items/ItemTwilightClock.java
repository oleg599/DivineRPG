package net.divinerpg.twilight.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTwilightClock extends ItemMod {
	public ItemTwilightClock(){
		super();
		setCreativeTab(DivineRPGTabs.spawner);
		LangRegistry.addItem(this);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return new ItemStack(TwilightBlocks.blueFire);
    }
}
