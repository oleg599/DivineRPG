package net.divinerpg.helper.recipes;

import net.divinerpg.helper.blocks.OverworldBlocks;
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

		GameRegistry.addRecipe(new ItemStack(OverworldBlocks.arlemiteBlock, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.arlemiteIngot});
		GameRegistry.addRecipe(new ItemStack(OverworldBlocks.rupeeBlock, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.rupeeIngot});
		GameRegistry.addRecipe(new ItemStack(OverworldBlocks.realmiteBlock, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.realmiteIngot});
		GameRegistry.addRecipe(new ItemStack(OverworldBlocks.netheriteBlock, 1), new Object[] {"III", "III", "III", 'I', NetherItems.netheriteIngot});
		GameRegistry.addRecipe(new ItemStack(OverworldBlocks.bloodGemBlock, 1), new Object[] {"III", "III", "III", 'I', NetherItems.bloodGem});

		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.arlemiteIngot, 9), new Object[] {OverworldBlocks.arlemiteBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.rupeeIngot, 9), new Object[] {OverworldBlocks.rupeeBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.realmiteIngot, 9), new Object[] {OverworldBlocks.realmiteBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(NetherItems.netheriteIngot, 9), new Object[] {OverworldBlocks.netheriteBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(NetherItems.bloodGem, 9), new Object[] {OverworldBlocks.bloodGemBlock});

		GameRegistry.addShapelessRecipe(new ItemStack(OverworldItems.shadowBar, 1), new Object[] {OverworldItems.rupeeIngot, OverworldItems.arlemiteIngot});

		GameRegistry.addRecipe(new ItemStack(OverworldItems.corruptedStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.corruptedShard});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.jungleStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.jungleShard});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.iceStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.iceShard});
		GameRegistry.addRecipe(new ItemStack(NetherItems.moltenStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.moltenShard});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.divineStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.divineShard});
		GameRegistry.addRecipe(new ItemStack(EndItems.enderStone, 1), new Object[] {"III", "III", "III", 'I', EndItems.enderShard});

		GameRegistry.addRecipe(new ItemStack(OverworldItems.legendaryEnderEye, 1), new Object[] {"III", "III", "III", 'I', EndItems.enderStone});

	}
	
}
