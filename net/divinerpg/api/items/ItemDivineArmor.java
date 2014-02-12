package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemDivineArmor extends ItemArmor implements ISpecialArmor{

	private double damageReduction;
	private String name;
	public static boolean unbreakable;
	private int durability;
	private static String PREFIX = Reference.PREFIX + "textures/armor/";
	private int damRe;

	/**
	 * Normal constructor
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, double damReduct, boolean undamageable, String type) {
		super(armor, par1, par2);
		if (par1 == 0) {
			damageReduction = (((damReduct*4)/24)*5)/100;
		}
		else if (par1 == 1) {
			damageReduction = (((damReduct*4)/24)*8)/100;
		}
		else if (par1 == 2) {
			damageReduction = (((damReduct*4)/24)*7)/100;
		}
		else if (par1 == 3) {
			damageReduction = (((damReduct*4)/24)*4)/100;
		}

		unbreakable = undamageable; //This is not working because it registers the boolean while the game is starting so it just takes the last one given. TODO: find solution.
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
		setArmorType(type, par2);
	}

	/**
	 * Constructor to use if no damage reduction
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, boolean undamageable, String type){
		this(armor, par1, par2, 0.0D, unbreakable, type);	
		this.unbreakable = undamageable; //This is not working because it registers the boolean while the game is starting so it just takes the last one given. TODO: find solution.
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
		setArmorType(type, par2);
	}

	private void setArmorType(String type, int par2) {
		if(armorType == 0 || armorType == 1 || armorType == 3)
			this.PREFIX += type + "_1.png";

		else
			this.PREFIX += type + "_2.png";
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return PREFIX;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		double roundPH = Math.round(damageReduction*1000);
		double roundedDamage = roundPH/10;
		list.add(damageReduction == 0.0 ? ("No Protection") : "Damage Reduction: " + roundedDamage + "%");
		list.add(!unbreakable ? (item.getMaxDamage() - item.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
		ArmorInformation.addInfo(item, par2EntityPlayer, list, par4);
	}

	@Override
	public boolean isDamageable() {
		return !unbreakable;
	}

	@Override
	public void damageArmor(EntityLivingBase var1, ItemStack var2, DamageSource var3, int var4, int var5) {
		if(!unbreakable){
			var2.damageItem(1, var1);
		}
	}

	@Override
	public int getArmorDisplay(EntityPlayer par1, ItemStack par2, int bars) {
		int damRe = (int) Math.round((damageReduction*100)/4); 
		return bars = damRe;
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase arg0, ItemStack arg1, DamageSource arg2, double arg3, int arg4) {
		return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
	}

	public Item setTextureName(String par1Str) {
		this.iconString = (Reference.PREFIX + par1Str);
		return this;
	}

	public Item setName(String name){
		this.name = name;
		setTextureName(name);
		setUnlocalizedName(name);
		register();
		return this;
	}

	public void register(){
		int numChars = 0;
		char firstLetter = name.charAt(0);
		if(Character.isLowerCase(firstLetter))
			firstLetter = Character.toUpperCase(firstLetter);
		String inGame = name.substring(1);
		for(int k = 0; k < name.length(); k++){
			char c = name.charAt(k);
			int code = (int) c;

			if(k != 0){
				for(int p = 65; p < 90; p++){
					if(code == p){
						numChars++;
						if(numChars == 1)
							inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
						else
							inGame = new StringBuffer(inGame).insert(k, " ").toString();
					}
				}
			}
		}
		String finalName = firstLetter + inGame;
		GameRegistry.registerItem(this, name);
	}
}