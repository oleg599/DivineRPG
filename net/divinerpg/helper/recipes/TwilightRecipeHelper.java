package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.*;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TwilightRecipeHelper {
	

	public static void init(){
		
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
		
		DivineAPI.addRecipe(IS.draviteChunk, "GGG", "G G", "G G", 'G', TwilightItems.draviteGem);
		DivineAPI.addRecipe(IS.azuriteChunk, "GGG", "G G", "G G", 'G', TwilightItems.azuriteGem);
		DivineAPI.addRecipe(IS.uviteChunk, "GGG", "G G", "G G", 'G', TwilightItems.uviteGem);
		DivineAPI.addRecipe(IS.mythrilChunk, "GGG", "G G", "G G", 'G', TwilightItems.mythrilGem);
		DivineAPI.addRecipe(IS.augiteChunk, "GGG", "G G", "G G", 'G', TwilightItems.augiteGem);

	}
}