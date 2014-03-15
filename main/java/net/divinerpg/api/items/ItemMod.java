package net.divinerpg.api.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemMod extends Item {

	public ItemMod(){
		super();
		setCreativeTab(DivineRPGTabs.items);
		LangRegistry.addItem(this);
	}

	public Item setTextureName(String par1Str) {
		this.iconString = (Reference.PREFIX + par1Str);
		return this;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(par1ItemStack.getItem() == VanillaItemsOther.healingStone){
			if (par3EntityPlayer.getHealth() < par3EntityPlayer.getMaxHealth()) {
				par3EntityPlayer.heal(10);
	        }
			par3EntityPlayer.inventory.consumeInventoryItem(this);
		}
		return par1ItemStack;
	}

	public Item setName(String name){
		setTextureName(name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		return this;
	}
}
