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
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemMod extends Item {

	private String name;
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
		this.name = name;
		setTextureName(name);
		setUnlocalizedName(name);
		register();
		return this;
	}

	public void register(){
		int numChars = 0;
		char firstLetter = name.charAt(0);
		if(Character.isLowerCase(firstLetter))
			firstLetter = Character.toUpperCase(firstLetter);
		String inGame = name.substring(1);
		for(int k = 0; k < name.length(); k++){
			char c = name.charAt(k);
			int code = (int) c;

			if(k != 0){
				for(int p = 65; p < 90; p++){
					if(code == p){
						numChars++;
						if(numChars == 1)
							inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
						else
							inGame = new StringBuffer(inGame).insert(k, " ").toString();
					}
				}
			}
		}
		GameRegistry.registerItem(this, name);
	}
}
