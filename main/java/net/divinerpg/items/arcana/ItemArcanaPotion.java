package net.divinerpg.items.arcana;

import java.util.List;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.client.ArcanaHelper;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArcanaPotion extends ItemMod{

	private int amountToAdd;

	public ItemArcanaPotion(int a) {
		amountToAdd = a;
		setCreativeTab(DivineRPGTabs.utility);
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Replenishes: " + amountToAdd + " Arcana");
	}

	@Override
	public ItemStack onEaten(ItemStack i, World w, EntityPlayer p) {
		if(!p.capabilities.isCreativeMode)
			i.stackSize--;
		if(!w.isRemote){
			ArcanaHelper.setBarValue(amountToAdd);
		}
		return i;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.drink;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 10;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(ArcanaHelper.getBarValue() != 200)
			par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}

	@Override
	public boolean hasEffect(ItemStack i) {
		return true;
	}
}