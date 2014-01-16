package net.divinerpg.helper.recipes;

import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.EndItems;
import net.divinerpg.helper.items.NetherItems;
import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class IS {
		//IS stands for ItemStack
		//Thank you captain Dipshit, <3 Brock
		//Food
		public static ItemStack milk = new ItemStack(Items.milk_bucket);
		public static ItemStack boiledEgg = new ItemStack(OverworldItems.boiledEgg);
		public static ItemStack egg = new ItemStack(Items.egg);
		public static ItemStack bacon = new ItemStack(OverworldItems.bacon, 6);
		public static ItemStack rawPork = new ItemStack(Items.porkchop);
		public static ItemStack cheese = new ItemStack(OverworldItems.cheese);
		public static ItemStack whiteMush = new ItemStack(OverworldItems.cheese);
		public static ItemStack advStew = new ItemStack(OverworldItems.cheese);
		public static ItemStack chickDinner = new ItemStack(OverworldItems.cheese);
		public static ItemStack stew = new ItemStack(Items.mushroom_stew);
		public static ItemStack chick = new ItemStack(Items.cooked_chicken);
		public static ItemStack bread = new ItemStack(Items.bread);
		
		//Weapons
		public static ItemStack enderSword = new ItemStack(EndItems.enderSword);
		public static ItemStack slimeSword = new ItemStack(OverworldItems.slimeSword);
		public static ItemStack legEnderEye = new ItemStack(OverworldItems.legendaryEnderEye);
		
		//Materials
		public static ItemStack shadow = new ItemStack(OverworldItems.shadowBar);
		public static ItemStack netherChuck = new ItemStack(NetherItems.netheriteChunk);
		public static ItemStack arlemiteIngot = new ItemStack(OverworldItems.arlemiteIngot, 9);
		public static ItemStack rupeeIngot = new ItemStack(OverworldItems.rupeeIngot, 9);
		public static ItemStack realIngot = new ItemStack(OverworldItems.realmiteIngot, 9);
		public static ItemStack netherIngot = new ItemStack(NetherItems.netheriteIngot, 9);
		public static ItemStack bloodgem = new ItemStack(NetherItems.bloodgem, 9);
		
		//Blocks
		public static ItemStack arlemiteBlock = new ItemStack(VanillaBlocks.arlemiteBlock);
		public static ItemStack rupeeBlock = new ItemStack(VanillaBlocks.rupeeBlock);
		public static ItemStack realBlock = new ItemStack(VanillaBlocks.realmiteBlock);
		public static ItemStack netherBlock = new ItemStack(VanillaBlocks.netheriteBlock);
		public static ItemStack bloodBlock = new ItemStack(VanillaBlocks.bloodgemBlock);

}
