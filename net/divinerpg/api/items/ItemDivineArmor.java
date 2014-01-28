package net.divinerpg.api.items;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class ItemDivineArmor extends ItemArmor implements ISpecialArmor{

	double damageReduction;
	String name;
	boolean unbreakable;
	static VanillaItems v; static TwilightItems t; static IceikaItems i;
	String PREFIX = Reference.MOD_ID + "textures/armor/";
	
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, boolean unbreakable){
		this(armor, par1, par2, 0.0D, unbreakable);	
		this.unbreakable = unbreakable;
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
	}
	
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, double damReduct, boolean unbreakable) {
		super(armor, par1, par2);
		damageReduction = damReduct;
		this.unbreakable = unbreakable;
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == v.angelicBody || stack.getItem() == v.angelicBoots || stack.getItem() == v.angelicHelmet){
			return PREFIX + "angelic_1"; //Not sure if it needs .png at the end (been a while since ive added armor)
		}
		if(stack.getItem() == v.angelicLegs){
			return PREFIX + "angelic_2";
		}
		return "";
	}
	
	@Override
	public boolean isDamageable() {
		return !unbreakable;
	}
	
	@Override
	public void damageArmor(EntityLivingBase var1, ItemStack var2, DamageSource var3, int var4, int var5) {
		if(isDamageable()){
			var2.damageItem(1, var1);
		}
	}

	@Override
	public int getArmorDisplay(EntityPlayer par1, ItemStack par2, int par3) {
		return par3 != 0 && par3 != 2 ? (par3 == 1 ? 4 : 2) : 3;
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase arg0, ItemStack arg1, DamageSource arg2, double arg3, int arg4) {
		return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
	}
	
	@Override
	public void addInformation(ItemStack item, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		if(item.getItem() == v.angelicBody || item.getItem() == v.angelicBoots || item.getItem() == v.angelicHelmet || item.getItem() == v.angelicLegs){
			list.add("Full Set: No fall damage"); list.add("Full Set: Allows flight");
		}
		if(item.getItem() == i.santaBody || item.getItem() == i.santaBoots || item.getItem() == i.santaHead || item.getItem() == i.santaLegs){
			list.add("Full Set: Massive buff in Iceika"); list.add("Iceika: Speeds up player"); list.add("Iceika: Adds 6x melee damage"); list.add("Iceika: Refills hunger"); list.add("Iceika: 80% Damage reduction");
		}
		if(item.getItem() == v.divineBody || item.getItem() == v.divineBoots || item.getItem() == v.divineHelmet || item.getItem() == v.divineLegs){
			list.add("Full Set: 6x Melee damage"); list.add("Full Set: 2x Jump height"); list.add("Full Set: No fall damage");
		}
		if(item.getItem() == t.edenBody || item.getItem() == t.edenBoots || item.getItem() == t.edenHelmet || item.getItem() == t.edenLegs){
			list.add("Full Set: 3+ Twilight ore drops");
		}
		if(item.getItem() == t.wildBody || item.getItem() == t.wildBoots || item.getItem() == t.wildHelmet || item.getItem() == t.wildLegs){
			list.add("Full Set: Fast health regen under water");
		}
		if(item.getItem() == t.apalachiaBody || item.getItem() == t.apalachiaBoots || item.getItem() == t.apalachiaHelmet || item.getItem() == t.apalachiaLegs){
			list.add("Full Set: Block damage protection");
		}
		if(item.getItem() == t.skythernBody || item.getItem() == t.skythernBoots || item.getItem() == t.skythernHelmet || item.getItem() == t.skythernLegs){
			list.add("Full Set: 5x Jump height"); list.add("Full Set: No fall damage");
		}
		if(item.getItem() == t.mortumBody || item.getItem() == t.mortumBoots || item.getItem() == t.mortumHelmet || item.getItem() == t.mortumLegs){
			list.add("Full Set: Night vision");
		}
		if(item.getItem() == t.haliteBody || item.getItem() == t.haliteBoots || item.getItem() == t.haliteHelmet || item.getItem() == t.haliteLegs){
			list.add("Full Set: 24+ Melee damage");
		}
		list.add((damageReduction * 100) + "% Damage Reduction");
        list.add(!unbreakable ? (item.getMaxDamage() - item.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
	}

	public Item setTextureName(String par1Str)
	{
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
		LanguageRegistry.addName(this, finalName);
	}
}