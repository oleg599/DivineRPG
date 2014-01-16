package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.EndItems;
import net.divinerpg.helper.items.NetherItems;
import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldRecipeHelper {
	

	public static void init(){
		DivineAPI.addRecipe(IS.slimeSword, "SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball);
		DivineAPI.addRecipe(IS.enderSword, " L ", " L ", " S ", 'L', IS.legEnderEye, 'S', IS.shadow);

		DivineAPI.addRecipe(IS.netherChuck, " I ", "III", " I ", 'I', NetherItems.netheriteIngot);

		DivineAPI.addRecipe(IS.arlemiteBlock, "III", "III", "III", 'I', OverworldItems.arlemiteIngot);
		DivineAPI.addRecipe(IS.rupeeBlock, "III", "III", "III", 'I', OverworldItems.rupeeIngot);
		DivineAPI.addRecipe(IS.realBlock, "III", "III", "III", 'I', OverworldItems.realmiteIngot);
		DivineAPI.addRecipe(IS.netherBlock, "III", "III", "III", 'I', NetherItems.netheriteIngot);
		DivineAPI.addRecipe(IS.bloodBlock, "III", "III", "III", 'I', NetherItems.bloodgem);

		DivineAPI.addShapelessRecipe(IS.arlemiteIngot, VanillaBlocks.arlemiteBlock);
		DivineAPI.addShapelessRecipe(IS.rupeeIngot, VanillaBlocks.rupeeBlock);
		DivineAPI.addShapelessRecipe(IS.realIngot, VanillaBlocks.realmiteBlock);
		DivineAPI.addShapelessRecipe(IS.netherIngot, VanillaBlocks.netheriteBlock);
		DivineAPI.addShapelessRecipe(IS.bloodgem, VanillaBlocks.bloodgemBlock);
		DivineAPI.addShapelessRecipe(IS.shadow, OverworldItems.rupeeIngot, OverworldItems.arlemiteIngot);
		
		DivineAPI.addRecipe(new ItemStack(OverworldItems.corruptedStone, 1), "III", "III", "III", 'I', OverworldItems.corruptedShards);
		DivineAPI.addRecipe(new ItemStack(OverworldItems.jungleStone, 1), "III", "III", "III", 'I', OverworldItems.jungleShards);
		DivineAPI.addRecipe(new ItemStack(OverworldItems.iceStone, 1), "III", "III", "III", 'I', OverworldItems.iceShards);
		DivineAPI.addRecipe(new ItemStack(NetherItems.moltenStone, 1), "III", "III", "III", 'I', NetherItems.moltenShards);
		DivineAPI.addRecipe(new ItemStack(OverworldItems.divineStone, 1), "III", "III", "III", 'I', OverworldItems.divineShards);
		DivineAPI.addRecipe(new ItemStack(EndItems.enderStone, 1), "III", "III", "III", 'I', EndItems.enderShard);

		DivineAPI.addRecipe(IS.legEnderEye, "III", "III", "III", 'I', EndItems.enderStone);
		
		DivineAPI.addShapelessRecipe(IS.bacon, IS.rawPork);
		DivineAPI.addShapelessRecipe(IS.cheese, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk);
		DivineAPI.addSmelting(IS.egg, IS.boiledEgg, 0.3F);
		DivineAPI.addShapelessRecipe(IS.advStew, IS.whiteMush, IS.stew);
		DivineAPI.addShapelessRecipe(IS.chickDinner, IS.advStew, IS.chick, IS.bread);
		

	}
	
	
	
}
