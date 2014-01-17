package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.EndItems;
import net.divinerpg.helper.items.NetherItems;
import net.divinerpg.helper.items.OverworldItems;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldRecipeHelper {
	

	public static void init(){
		DivineAPI.addRecipe(IS.slimeSword, "SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball);
		DivineAPI.addRecipe(IS.enderSword, " L ", " L ", " S ", 'L', OverworldItems.legendaryEnderEye, 'S', OverworldItems.shadowBar);

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
		
		DivineAPI.addRecipe(IS.corruptStone, "III", "III", "III", 'I', OverworldItems.corruptedShards);
		DivineAPI.addRecipe(IS.enderStone, "III", "III", "III", 'I', OverworldItems.jungleShards);
		DivineAPI.addRecipe(IS.iceStone, "III", "III", "III", 'I', OverworldItems.iceShards);
		DivineAPI.addRecipe(IS.moltenStone, "III", "III", "III", 'I', NetherItems.moltenShards);
		DivineAPI.addRecipe(IS.divineStone, "III", "III", "III", 'I', OverworldItems.divineShards);
		DivineAPI.addRecipe(IS.enderStone, "III", "III", "III", 'I', EndItems.enderShard);

		DivineAPI.addRecipe(IS.legEnderEye, "III", "III", "III", 'I', EndItems.enderStone);
		
		DivineAPI.addShapelessRecipe(IS.bacon, Items.porkchop);
		DivineAPI.addRecipe(IS.cheese, "MMM", "MMM", "MMM", 'M', Items.milk_bucket);
		DivineAPI.addSmelting(IS.egg, IS.boiledEgg, 0.3F);
		DivineAPI.addShapelessRecipe(IS.advStew, OverworldItems.whiteMushroom, Items.mushroom_stew);
		DivineAPI.addShapelessRecipe(IS.chickDinner, OverworldItems.advMushroomStew, Items.cooked_chicken, Items.bread);
		
		DivineAPI.addShapelessRecipe(IS.draviteFragments, TwilightItems.draviteSoul);
		DivineAPI.addShapelessRecipe(IS.azuriteFragments, TwilightItems.azuriteSoul);
		DivineAPI.addShapelessRecipe(IS.uviteFragments, TwilightItems.uviteSoul);
		DivineAPI.addShapelessRecipe(IS.mythrilFragments, TwilightItems.mythrilSoul);
		DivineAPI.addShapelessRecipe(IS.augiteFragments, TwilightItems.augiteSoul);
		
		DivineAPI.addRecipe(IS.draviteGem, "GGG", 'G', TwilightItems.draviteFragments);
		DivineAPI.addRecipe(IS.azuriteGem, "GGG", 'G', TwilightItems.azuriteFragments);
		DivineAPI.addRecipe(IS.uviteGem, "GGG", 'G', TwilightItems.uviteFragments);
		DivineAPI.addRecipe(IS.mythrilGem, "GGG", 'G', TwilightItems.mythrilFragments);
		DivineAPI.addRecipe(IS.augiteGem, "GGG", 'G', TwilightItems.augiteFragments);

	}
	
	
	
}
