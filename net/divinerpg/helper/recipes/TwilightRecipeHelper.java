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
		
		DivineAPI.addShapelessRecipe(IS.edenFragments, TwilightItems.edenSoul);
		DivineAPI.addShapelessRecipe(IS.wildWoodFragments, TwilightItems.wildWoodSoul);
		DivineAPI.addShapelessRecipe(IS.apalachiaFragments, TwilightItems.apalachiaSoul);
		DivineAPI.addShapelessRecipe(IS.skythernFragments, TwilightItems.skythernSoul);
		DivineAPI.addShapelessRecipe(IS.mortumFragments, TwilightItems.mortumSoul);
		
		DivineAPI.addRecipe(IS.edenGem, "GGG", 'G', TwilightItems.edenFragments);
		DivineAPI.addRecipe(IS.wildWoodGem, "GGG", 'G', TwilightItems.wildWoodFragments);
		DivineAPI.addRecipe(IS.apalachiaGem, "GGG", 'G', TwilightItems.apalachiaFragments);
		DivineAPI.addRecipe(IS.skythernGem, "GGG", 'G', TwilightItems.skythernFragments);
		DivineAPI.addRecipe(IS.mortumGem, "GGG", 'G', TwilightItems.mortumFragments);
		
		DivineAPI.addRecipe(IS.edenChunk, "GGG", "G G", "G G", 'G', TwilightItems.edenGem);
		DivineAPI.addRecipe(IS.wildWoodChunk, "GGG", "G G", "G G", 'G', TwilightItems.wildWoodGem);
		DivineAPI.addRecipe(IS.apalachiaChunk, "GGG", "G G", "G G", 'G', TwilightItems.apalachiaGem);
		DivineAPI.addRecipe(IS.skythernChunk, "GGG", "G G", "G G", 'G', TwilightItems.skythernGem);
		DivineAPI.addRecipe(IS.mortumChunk, "GGG", "G G", "G G", 'G', TwilightItems.mortumGem);

	}
}