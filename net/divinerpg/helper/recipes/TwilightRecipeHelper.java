package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.*;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TwilightRecipeHelper {
	

	public static void init(){
		
		DivineAPI.addShapelessRecipe(IS.edenFragments, TwilightItemsOther.edenSoul);
		DivineAPI.addShapelessRecipe(IS.wildWoodFragments, TwilightItemsOther.wildWoodSoul);
		DivineAPI.addShapelessRecipe(IS.apalachiaFragments, TwilightItemsOther.apalachiaSoul);
		DivineAPI.addShapelessRecipe(IS.skythernFragments, TwilightItemsOther.skythernSoul);
		DivineAPI.addShapelessRecipe(IS.mortumFragments, TwilightItemsOther.mortumSoul);
		
		DivineAPI.addRecipe(IS.edenGem, "GGG", 'G', TwilightItemsOther.edenFragments);
		DivineAPI.addRecipe(IS.wildWoodGem, "GGG", 'G', TwilightItemsOther.wildWoodFragments);
		DivineAPI.addRecipe(IS.apalachiaGem, "GGG", 'G', TwilightItemsOther.apalachiaFragments);
		DivineAPI.addRecipe(IS.skythernGem, "GGG", 'G', TwilightItemsOther.skythernFragments);
		DivineAPI.addRecipe(IS.mortumGem, "GGG", 'G', TwilightItemsOther.mortumFragments);
		
		DivineAPI.addRecipe(IS.edenChunk, "GGG", "G G", "G G", 'G', TwilightItemsOther.edenGem);
		DivineAPI.addRecipe(IS.wildWoodChunk, "GGG", "G G", "G G", 'G', TwilightItemsOther.wildWoodGem);
		DivineAPI.addRecipe(IS.apalachiaChunk, "GGG", "G G", "G G", 'G', TwilightItemsOther.apalachiaGem);
		DivineAPI.addRecipe(IS.skythernChunk, "GGG", "G G", "G G", 'G', TwilightItemsOther.skythernGem);
		DivineAPI.addRecipe(IS.mortumChunk, "GGG", "G G", "G G", 'G', TwilightItemsOther.mortumGem);

	}
}