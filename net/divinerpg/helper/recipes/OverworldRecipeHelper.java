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
		GameRegistry.addRecipe(IS.slimeSword, new Object[] {"SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball});
		GameRegistry.addRecipe(IS.enderSword, " L ", " L ", " S ", 'L', IS.legEnderEye, 'S', IS.shadow);

		GameRegistry.addRecipe(IS.netherChuck, new Object[] {" I ", "III", " I ", 'I', NetherItems.netheriteIngot});

		GameRegistry.addRecipe(IS.arlemiteBlock, new Object[] {"III", "III", "III", 'I', OverworldItems.arlemiteIngot});
		GameRegistry.addRecipe(IS.rupeeBlock, new Object[] {"III", "III", "III", 'I', OverworldItems.rupeeIngot});
		GameRegistry.addRecipe(IS.realBlock, new Object[] {"III", "III", "III", 'I', OverworldItems.realmiteIngot});
		GameRegistry.addRecipe(IS.netherBlock, new Object[] {"III", "III", "III", 'I', NetherItems.netheriteIngot});
		GameRegistry.addRecipe(IS.bloodBlock, new Object[] {"III", "III", "III", 'I', NetherItems.bloodgem});

		GameRegistry.addShapelessRecipe(IS.arlemiteIngot, new Object[] {VanillaBlocks.arlemiteBlock});
		GameRegistry.addShapelessRecipe(IS.rupeeIngot, new Object[] {VanillaBlocks.rupeeBlock});
		GameRegistry.addShapelessRecipe(IS.realIngot, new Object[] {VanillaBlocks.realmiteBlock});
		GameRegistry.addShapelessRecipe(IS.netherIngot, new Object[] {VanillaBlocks.netheriteBlock});
		GameRegistry.addShapelessRecipe(IS.bloodgem, new Object[] {VanillaBlocks.bloodgemBlock});
		GameRegistry.addShapelessRecipe(IS.shadow, new Object[] {OverworldItems.rupeeIngot, OverworldItems.arlemiteIngot});
		
		GameRegistry.addRecipe(new ItemStack(OverworldItems.corruptedStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.corruptedShards});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.jungleStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.jungleShards});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.iceStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.iceShards});
		GameRegistry.addRecipe(new ItemStack(NetherItems.moltenStone, 1), new Object[] {"III", "III", "III", 'I', NetherItems.moltenShards});
		GameRegistry.addRecipe(new ItemStack(OverworldItems.divineStone, 1), new Object[] {"III", "III", "III", 'I', OverworldItems.divineShards});
		GameRegistry.addRecipe(new ItemStack(EndItems.enderStone, 1), new Object[] {"III", "III", "III", 'I', EndItems.enderShard});

		GameRegistry.addRecipe(IS.legEnderEye, new Object[] {"III", "III", "III", 'I', EndItems.enderStone});
		
		GameRegistry.addShapelessRecipe(IS.bacon, IS.rawPork);
		GameRegistry.addShapelessRecipe(IS.cheese, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk, IS.milk);
		GameRegistry.addSmelting(IS.egg, IS.boiledEgg, 0.3F);
		GameRegistry.addShapelessRecipe(IS.advStew, IS.whiteMush, IS.stew);
		GameRegistry.addShapelessRecipe(IS.chickDinner, IS.advStew, IS.chick, IS.bread);

	}
	
	
	
}
