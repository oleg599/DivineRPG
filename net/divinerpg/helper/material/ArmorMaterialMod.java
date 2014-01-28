package net.divinerpg.helper.material;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialMod {

	/**
	 * Averages the durabilities to entered number so
	 * always divide durability by double ave
	 */
	private static double ave = 13.75;
	
	public static ArmorMaterial Angelic 			= EnumHelper.addArmorMaterial("Angelic", 0, new int[] {3, 4, 3, 2}, 10);
	public static ArmorMaterial Santa			    = EnumHelper.addArmorMaterial("Santa", 0, new int[] {1, 1, 1, 1}, 10);
	public static ArmorMaterial Divine				= EnumHelper.addArmorMaterial("Divine", 0, new int[] {9, 9, 9, 8}, 10);
 	public static ArmorMaterial Apalachia 			= EnumHelper.addArmorMaterial("Apalachia", 0, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Eden	 			= EnumHelper.addArmorMaterial("Eden", 0, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Wild				= EnumHelper.addArmorMaterial("Wild", 0, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Skythern 			= EnumHelper.addArmorMaterial("Skythern", 0, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Mortum 				= EnumHelper.addArmorMaterial("Mortum", 0, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Halite 				= EnumHelper.addArmorMaterial("Halite", 0, new int[] {4, 5, 4, 3}, 12);
 	public static ArmorMaterial Realmite 			= EnumHelper.addArmorMaterial("Realmite", (int) (5000/ave), new int[] {2, 2, 2, 2}, 10);
	public static ArmorMaterial Arlemite 			= EnumHelper.addArmorMaterial("Arlemite", 0, new int[] {3, 4, 3, 2}, 22);
	public static ArmorMaterial Rupee 				= EnumHelper.addArmorMaterial("RupeeArmor", 0, new int[] { 9, 9, 9, 8 }, 10);
	public static ArmorMaterial Shadow 				= EnumHelper.addArmorMaterial("Shadow", 0, new int[] { 3, 4, 3, 2 }, 10);
	public static ArmorMaterial Aquatic 			= EnumHelper.addArmorMaterial("Aquastrive", 0, new int[] { 6, 7, 6, 6 }, 10);
	public static ArmorMaterial EliteRealmite 		= EnumHelper.addArmorMaterial("Elite Realmite", 0, new int[] { 4, 4, 4, 3 }, 10);
	public static ArmorMaterial Diamond 			= EnumHelper.addArmorMaterial("Diamond", (int) (3500/ave), new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial Iron 				= EnumHelper.addArmorMaterial("Iron", (int) (1500/ave), new int[]{2, 6, 5, 2}, 9);
	public static ArmorMaterial Gold 				= EnumHelper.addArmorMaterial("Gold", (int) (700/ave), new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial Leather 			= EnumHelper.addArmorMaterial("Leather", (int) (150/ave), new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial Grim 				= EnumHelper.addArmorMaterial("Grim", 200, new int[] {3, 5, 3, 2}, 22);
	public static ArmorMaterial Ender 				= EnumHelper.addArmorMaterial("Ender", 0, new int[] { 7, 7, 6, 6 }, 10);
	public static ArmorMaterial Kraken 				= EnumHelper.addArmorMaterial("Kraken", (int) (5000/ave), new int[] { 2, 4, 2, 2 }, 10);
	public static ArmorMaterial Netherite 			= EnumHelper.addArmorMaterial("Netherite", 0, new int[] { 2, 4, 3, 2 }, 10);
	public static ArmorMaterial Inferno 			= EnumHelper.addArmorMaterial("Inferno", 0, new int[] { 2, 6, 5, 2 }, 10);
	public static ArmorMaterial Bedrock 			= EnumHelper.addArmorMaterial("Bedrock", 0, new int[] { 9, 9, 9, 8 }, 10);
	public static ArmorMaterial Korma 				= EnumHelper.addArmorMaterial("Korma", 0, new int[] {9, 9, 9, 9}, 22);
	public static ArmorMaterial Costumes 			= EnumHelper.addArmorMaterial("Costumes", 0, new int[] {0, 0, 0, 0}, 22);

	public static String[] donatorDesc = {"Unbreakable"};
	public static String[] vemosDesc = {"11% Damage reduction", "Health regen"};
	public static String[] kormaDesc = {"11% Damage reduction", "Arcana regen"};
}
