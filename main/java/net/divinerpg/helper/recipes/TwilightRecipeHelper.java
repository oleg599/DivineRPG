package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.TwilightItemsArmor;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.items.VanillaItemsOther;

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
		
		DivineAPI.addRecipe(IS.edenHead, "III", "I I", "  ", 'I', TwilightItemsOther.edenGem);
		DivineAPI.addRecipe(IS.edenBody, "I I", "III", "III", 'I', TwilightItemsOther.edenGem);
		DivineAPI.addRecipe(IS.edenLegs, "III", "I I", "I I", 'I', TwilightItemsOther.edenGem);
		DivineAPI.addRecipe(IS.edenFeet, "   ", "I I", "I I", 'I', TwilightItemsOther.edenGem);

	}
}