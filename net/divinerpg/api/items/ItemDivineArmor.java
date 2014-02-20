package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.client.Minecraft;
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
	public boolean unbreakable;
	private int durability;
	private String prefix = "divinerpg:textures/armor/";
	private int damRe;

	/**
	 * Normal constructor
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, double damReduct, boolean undamageable, String type) {
		super(armor, par1, par2);
		if (par1 == 0) {
			damageReduction = (((damReduct)/24)*5)/100;
		}
		else if (par1 == 1) {
			damageReduction = (((damReduct)/24)*8)/100;
		}
		else if (par1 == 2) {
			damageReduction = (((damReduct)/24)*7)/100;
		}
		else if (par1 == 3) {
			damageReduction = (((damReduct)/24)*4)/100;
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
		this(armor, par1, par2, 0.0D, undamageable, type);	
		this.unbreakable = undamageable; 
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
		setArmorType(type, par2);
	}

	private void setArmorType(String type, int par2) {
		if(par2 == 0 || par2 == 1 || par2 == 3) {
			prefix = prefix + type + "_1.png";
		}
		else {
			prefix = prefix + type + "_2.png";
		}
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return prefix;
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
		setTextureName(name);
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		return this;
	}
}
