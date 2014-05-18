package net.divinerpg.api.items;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.dimension.gen.iceika.village.WorldGenLibrary;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemModBucket extends ItemBucket{

	public ItemModBucket(Block liquid) {
		super(liquid);
		LangRegistry.addItem(this);
	}

	public Item setName(String name){
		setCreativeTab(DivineRPGTabs.utility);
		setTextureName(Reference.PREFIX + name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		return this; 
	}
	
	@Override
	public boolean onItemUse(ItemStack i, EntityPlayer p, World w, int x, int y, int z, int i1, float f, float f1, float f2) {
		Random r = new Random();
		(new WorldGenLibrary()).generate(w, r, x, y, z);
		return true;
	}
}