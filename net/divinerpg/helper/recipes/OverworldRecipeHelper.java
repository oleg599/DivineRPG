package net.divinerpg.helper.recipes;

import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.EndItems;
import net.divinerpg.helper.items.NetherItems;
import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldRecipeHelper {

	public static void init(){
		GameRegistry.addRecipe(new ItemStack(OverworldItems.slimeSword, 1), new Object[] {"SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball});
		GameRegistry.addRecipe(new ItemStack(EndItems.enderSword, 1), new Object[] {" L ", " L ", " S ", 'L', OverworldItems.legendaryEnderEye, 'S', OverworldItems.shadowBar});

		GameRegistry.addRecipe(new ItemStack(NetherItems.netheriteChunk, 1), new Object[] {" I ", "III", " I ", 'I', NetherItems.netheriteIngot});

		GameRegistry.addRecipe(new ItemStack(VanillaBlocks.arlemiteBlock, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.arlemiteIngot});
		GameRegistry.addRecipe(new ItemStack(VanillaBlocks.rupeeBlock, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.rupeeIngot});
		GameRegistry.addRecipe(new ItemStack(VanillaBlocks.realmiteBlock, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.realmiteIngot});
		GameRegistry.addRecipe(new ItemStack(VanillaBlocks.netheriteBlock, 1), new Object[] {"III", "III", "III", 'I', NetherItems.netheriteIngot});
		GameRegistry.addRecipe(new ItemStack(VanillaBlocks.bloodGemBlock, 1), new Object[] {"III", "III", "III", 'I', NetherItems.bloodGem});

		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.arlemiteIngot, 9), new Object[] {VanillaBlocks.arlemiteBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.rupeeIngot, 9), new Object[] {VanillaBlocks.rupeeBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.realmiteIngot, 9), new Object[] {VanillaBlocks.realmiteBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(NetherItems.netheriteIngot, 9), new Object[] {VanillaBlocks.netheriteBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(NetherItems.bloodGem, 9), new Object[] {VanillaBlocks.bloodGemBlock});

		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.shadowBar, 1), new Object[] {OverworldItems.rupeeIngot, OverworldItems.arlemiteIngot});

		GameRegistry.addRecipe(new ItemStack(OverworldItems.corruptedStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.corruptedShards});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.jungleStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.jungleShards});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.iceStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.iceShards});
		GameRegistry.addRecipe(new ItemStack(NetherItems.moltenStone, 1), new Object[] {"III", "III", "III", 'I', NetherItems.moltenShards});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.divineStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.divineShards});
		GameRegistry.addRecipe(new ItemStack(EndItems.enderStone, 1), new Object[] {"III", "III", "III", 'I', EndItems.enderShard});

		GameRegistry.addRecipe(new ItemStack(OverworldItems.legendaryEnderEye, 1), new Object[] {"III", "III", "III", 'I', EndItems.enderStone});

	}
	
}
