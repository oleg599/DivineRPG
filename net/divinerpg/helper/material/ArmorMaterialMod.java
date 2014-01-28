package net.divinerpg.helper.material;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialMod {

	public static ArmorMaterial Angelic 			= EnumHelper.addArmorMaterial("Angelic", 200, new int[] {3, 4, 3, 2}, 10);
	public static ArmorMaterial Santa			    = EnumHelper.addArmorMaterial("Santa", 200, new int[] {1, 1, 1, 1}, 10);
	public static ArmorMaterial Divine				= EnumHelper.addArmorMaterial("Divine", 200, new int[] {9, 9, 9, 8}, 10);
 	public static ArmorMaterial Apalachia 			= EnumHelper.addArmorMaterial("Apalachia", 200, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Eden	 			= EnumHelper.addArmorMaterial("Eden", 200, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Wild				= EnumHelper.addArmorMaterial("Wild", 200, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Skythern 			= EnumHelper.addArmorMaterial("Skythern", 200, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Mortum 				= EnumHelper.addArmorMaterial("Mortum", 200, new int[] {3, 4, 3, 2}, 10);
 	public static ArmorMaterial Halite 				= EnumHelper.addArmorMaterial("Halite", 500, new int[] {4, 5, 4, 3}, 12);
 	public static ArmorMaterial Realmite 			= EnumHelper.addArmorMaterial("Realmite", 200, new int[] { 1, 2, 1, 1 }, 10);
	public static ArmorMaterial Arlemite 			= EnumHelper.addArmorMaterial("arlemite", 200, new int[] {3, 4, 3, 2}, 22);
	public static ArmorMaterial Rupee 				= EnumHelper.addArmorMaterial("RupeeArmor", 200, new int[] { 9, 9, 9, 8 }, 10);
	public static ArmorMaterial Shadow 				= EnumHelper.addArmorMaterial("Shadow", 200, new int[] { 3, 4, 3, 2 }, 10);
	public static ArmorMaterial Aquatic 			= EnumHelper.addArmorMaterial("Aquastrive", 200, new int[] { 6, 7, 6, 6 }, 10);
	public static ArmorMaterial EliteRealmite 		= EnumHelper.addArmorMaterial("Elite Realmite", 200, new int[] { 4, 4, 4, 3 }, 10);
	public static ArmorMaterial Diamond 			= EnumHelper.addArmorMaterial("Diamond", 33, new int[]{3, 8, 6, 3}, 10);//TODO Balance out
	public static ArmorMaterial Iron 				= EnumHelper.addArmorMaterial("Iron", 15, new int[]{2, 6, 5, 2}, 9);//TODO Balance out
	public static ArmorMaterial Grim 				= EnumHelper.addArmorMaterial("grim", 200, new int[] {3, 5, 3, 2}, 22);
	public static ArmorMaterial JackOMan 			= EnumHelper.addArmorMaterial("jack", 200, new int[] {3, 5, 3, 2}, 22);
	public static ArmorMaterial Ender 				= EnumHelper.addArmorMaterial("Ender", 200, new int[] { 7, 7, 6, 6 }, 10);
	public static ArmorMaterial Kraken 				= EnumHelper.addArmorMaterial("Kraken", 200, new int[] { 2, 4, 2, 2 }, 10);
	public static ArmorMaterial Netherite 			= EnumHelper.addArmorMaterial("Neterite", 200, new int[] { 2, 4, 3, 2 }, 10);
	public static ArmorMaterial Inferno 			= EnumHelper.addArmorMaterial("Inferno", 200, new int[] { 2, 6, 5, 2 }, 10);
	public static ArmorMaterial Bedrock 			= EnumHelper.addArmorMaterial("Bedrock", 200, new int[] { 9, 9, 9, 8 }, 10);
	public static ArmorMaterial Korma 				= EnumHelper.addArmorMaterial("korma", 200, new int[] {9, 9, 9, 9}, 22);
	
	
	//THIS IS ALL THE ARMOR DESCRIPTIONS THAT HAVENT BEEN DONE
	//THE DAMAGE REDUCTION INFORMATION IS AUTO DONE IN THE 4th PARAMETER IN THE ARMOR ITEM
	//For example, angelic armor reduction is 12.5% so the damage reduction is set as: 0.125D
	//Another example, divine armor reduction is 18.75% so its set as: 0.1875D
	public static String[] realmiteDesc = {"8.25% Damage reduction"};
	public static String[] eliteRealmiteDesc = {"12.5% Damage reduction", "Full Set: No fall damage"};
	public static String[] arlemiteDesc = {"12.5% Damage reduction", "Full Set: 80% Ranged damage protection"};
	public static String[] krakenDesc = {"7.5% Damage reduction", "Full Set: Breathe underwater"};
	public static String[] rupeeDesc = {"13.75% Damage reduction", "Full Set: 80% Melee damage protection"};
	public static String[] aquaticDesc = {"13.75% Damage reduction", "Full Set: Breathe underwater", "Full Set: Swim faster"};
	public static String[] shadowDesc = {"15% Damage reduction", "Full Set: Move faster"};
	public static String[] netheriteDesc = {"1.25% Damage reduction", "Fire protection"};
	public static String[] infernoDesc = {"15% Damage reduction", "Fire protection", "Lava protection"};
	public static String[] bedrockDesc = {"18.25% Damage reduction", "Explosion protection", "Fire protection", "Lava protection"};
	public static String[] donatorDesc = {"Unbreakable"};
	public static String[] jackDesc = {"4x Scythe damage"};
	public static String[] skeletonDesc = {"Replenishes hunger"};
	public static String[] witherDesc = {"Wither protection"};
	public static String[] vemosDesc = {"11% Damage reduction", "Health regen"};
	public static String[] kormaDesc = {"11% Damage reduction", "Arcana regen"};
}
