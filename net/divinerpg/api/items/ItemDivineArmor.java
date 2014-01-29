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

	double damageReduction;
	String name;
	boolean unbreakable;
	int durability;
	private String texturePath = "divinerpg:";
	static VanillaItems v; static TwilightItems t; static IceikaItems i;
	String PREFIX = Reference.MOD_ID + "textures/armor/";

	/**
	 * Normal constructor
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, double damReduct, boolean unbreakable, String type) {
		super(armor, par1, par2);
		damageReduction = damReduct/100;
		this.unbreakable = unbreakable;
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
	}
	
	/**
	 * Constructor to use if no damage reduction
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, boolean unbreakable, String type){
		this(armor, par1, par2, 0.0D, unbreakable, type);	
		this.unbreakable = unbreakable;
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
	}
	
	public String addArmorTexture (ItemStack stack, Entity entity, int slot, int layer, String type, int par2) {
		switch(par2) {
		case 0:
			PREFIX += type + "_1.png";
			return PREFIX;
		case 1:
			PREFIX += type + "_1.png";
			return PREFIX;
		case 2:
			PREFIX += type + "_2.png";
			return PREFIX;
		case 3:
			PREFIX += type + "_1.png";
			return PREFIX;
		}
		return null;
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
	public int getArmorDisplay(EntityPlayer par1, ItemStack par2, int bars) {
		int damRe = (int) Math.round((damageReduction*100)/4); 
		return bars = damRe;
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
		if(item.getItem() == v.bedrockBody || item.getItem() == v.bedrockBoots || item.getItem() == v.bedrockHelmet || item.getItem() == v.bedrockLegs){
			list.add("Full Set: Lava pretection"); list.add("Full Set: Fire protection"); list.add("Full Set: Explosion protection");
		}
		if(item.getItem() == v.eliteRealmiteBody || item.getItem() == v.eliteRealmiteBoots || item.getItem() == v.eliteRealmiteHelmet || item.getItem() == v.eliteRealmiteLegs){
			list.add("Full Set: No fall damage");
		}
		if(item.getItem() == v.eliteRealmiteBody || item.getItem() == v.eliteRealmiteBoots || item.getItem() == v.eliteRealmiteHelmet || item.getItem() == v.eliteRealmiteLegs){
			list.add("Full Set: No fall damage");
		}
		if(item.getItem() == v.arlemiteBody || item.getItem() == v.arlemiteBoots || item.getItem() == v.arlemiteHelmet || item.getItem() == v.arlemiteLegs){
			list.add("Full Set: 80% Ranged damage protection");
		}
		if(item.getItem() == v.rupeeBody || item.getItem() == v.rupeeBoots || item.getItem() == v.rupeeHelmet || item.getItem() == v.rupeeLegs){
			list.add("Full Set: 80% Melee damage protection");
		}
		if(item.getItem() == v.krakenBody || item.getItem() == v.krakenBoots || item.getItem() == v.krakenHelmet || item.getItem() == v.krakenLegs){
			list.add("Full Set: Breath under water");
		}
		if(item.getItem() == v.jackOManBody || item.getItem() == v.jackOManBoots || item.getItem() == v.jackOManHelmet || item.getItem() == v.jackOManLegs){
			list.add("Full Set: 4x Scythe damage");
		}
		if(item.getItem() == v.infernoBody || item.getItem() == v.infernoBoots || item.getItem() == v.infernoHelmet || item.getItem() == v.infernoLegs){
			list.add("Full Set: Fire protection"); list.add("Full Set: Lava protection");
		}
		if(item.getItem() == v.aquastriveBody || item.getItem() == v.aquastriveBoots || item.getItem() == v.aquastriveHelmet || item.getItem() == v.aquastriveLegs){
			list.add("Full Set: Breath under water"); list.add("Full Set: Swim faster");
		}
		if(item.getItem() == v.shadowBody || item.getItem() == v.shadowBoots || item.getItem() == v.shadowHelmet || item.getItem() == v.shadowLegs){
			list.add("Full Set: Move faster");
		}
		if(item.getItem() == v.netheriteBody || item.getItem() == v.netheriteBoots || item.getItem() == v.netheriteHelmet || item.getItem() == v.netheriteLegs){
			list.add("Full Set: Fire protection");
		}
		if(item.getItem() == v.skelemanBody || item.getItem() == v.skelemanBoots || item.getItem() == v.skelemanHelmet || item.getItem() == v.skelemanLegs){
			list.add("Full Set: Replenishes hunger");
		}
		if(item.getItem() == v.witherReaperBody || item.getItem() == v.witherReaperBoots || item.getItem() == v.witherReaperHelmet || item.getItem() == v.witherReaperLegs){
			list.add("Full Set: Wither protection");
		}
		if(item.getItem() == v.enderBody || item.getItem() == v.enderBoots || item.getItem() == v.enderHelmet || item.getItem() == v.enderLegs){
			list.add("Full Set: Explosion protection");
		}
		if(damageReduction != 0.0D){
			list.add((damageReduction * 100) + "% Damage Reduction");	
		}
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
	}
}