package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.*;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldRecipeHelper {

	public static void init(){
		DivineAPI.addRecipe(IS.slimeSword, "SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball);
		DivineAPI.addRecipe(IS.enderSword, " L ", " L ", " S ", 'L', VanillaItems.legendaryEnderEye, 'S', VanillaItems.shadowBar);

		DivineAPI.addRecipe(IS.netherChuck, " I ", "III", " I ", 'I', VanillaItems.netheriteIngot);

		DivineAPI.addRecipe(IS.arlemiteBlock, "III", "III", "III", 'I', VanillaItems.arlemiteIngot);
		DivineAPI.addRecipe(IS.rupeeBlock, "III", "III", "III", 'I', VanillaItems.rupeeIngot);
		DivineAPI.addRecipe(IS.realBlock, "III", "III", "III", 'I', VanillaItems.realmiteIngot);
		DivineAPI.addRecipe(IS.netherBlock, "III", "III", "III", 'I', VanillaItems.netheriteIngot);
		DivineAPI.addRecipe(IS.bloodBlock, "III", "III", "III", 'I', VanillaItems.bloodgem);

		DivineAPI.addShapelessRecipe(IS.arlemiteIngot, VanillaBlocks.arlemiteBlock);
		DivineAPI.addShapelessRecipe(IS.rupeeIngot, VanillaBlocks.rupeeBlock);
		DivineAPI.addShapelessRecipe(IS.realIngot, VanillaBlocks.realmiteBlock);
		DivineAPI.addShapelessRecipe(IS.netherIngot, VanillaBlocks.netheriteBlock);
		DivineAPI.addShapelessRecipe(IS.bloodgem, VanillaBlocks.bloodgemBlock);
		DivineAPI.addShapelessRecipe(IS.shadow, VanillaItems.rupeeIngot, VanillaItems.arlemiteIngot);
		
		DivineAPI.addRecipe(IS.corruptStone, "III", "III", "III", 'I', VanillaItems.corruptedShards);
		DivineAPI.addRecipe(IS.enderStone, "III", "III", "III", 'I', VanillaItems.jungleShards);
		DivineAPI.addRecipe(IS.iceStone, "III", "III", "III", 'I', VanillaItems.iceShards);
		DivineAPI.addRecipe(IS.moltenStone, "III", "III", "III", 'I', VanillaItems.moltenShards);
		DivineAPI.addRecipe(IS.divineStone, "III", "III", "III", 'I', VanillaItems.divineShards);
		DivineAPI.addRecipe(IS.enderStone, "III", "III", "III", 'I', VanillaItems.enderShard);

		DivineAPI.addRecipe(IS.legEnderEye, "III", "III", "III", 'I', VanillaItems.enderStone);
		
		DivineAPI.addShapelessRecipe(IS.bacon, Items.porkchop);
		DivineAPI.addRecipe(IS.cheese, "MMM", "MMM", "MMM", 'M', Items.milk_bucket);
		DivineAPI.addSmelting(IS.egg, IS.boiledEgg, 0.3F);
		DivineAPI.addShapelessRecipe(IS.advStew, VanillaItems.whiteMushroom, Items.mushroom_stew);
		DivineAPI.addShapelessRecipe(IS.chickDinner, VanillaItems.advMushroomStew, Items.cooked_chicken, Items.bread);
	}
}