package net.divinerpg.api.items;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class ItemDivineArmor extends ItemArmor implements ISpecialArmor{

	double damageReduction;
	String name;
	boolean unbreakable;
	int durability;
	static VanillaItems v; static TwilightItems t; static IceikaItems i;
	String PREFIX = Reference.MOD_ID + "textures/armor/";

	/**
	 * Normal constructor
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, double damReduct, boolean unbreakable) {
		super(armor, par1, par2);
		damageReduction = damReduct/100;
		this.unbreakable = unbreakable;
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
	}
	
	/**
	 * Constructor to use if no damage reduction
	 */
	public ItemDivineArmor(ArmorMaterial armor, int par1, int par2, boolean unbreakable){
		this(armor, par1, par2, 0.0D, unbreakable);	
		this.unbreakable = unbreakable;
		LangRegistry.addItem(this);
		setCreativeTab(DivineRPGTabs.armor);
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
		if (itemstack.getItem() == v.ironHelmet || itemstack.getItem() == v.ironBody || itemstack.getItem() == v.ironBoots){
			return addArmorTexture("iron_1.png");        
		}
		if (itemstack.getItem() == v.diamondHelmet || itemstack.getItem() == v.diamondBody || itemstack.getItem() == v.diamondBoots){
			return addArmorTexture("diamond_1.png");
		}        
		if (itemstack.getItem() == v.witherReaperHelmet || itemstack.getItem() == v.witherReaperBody || itemstack.getItem() == v.witherReaperBoots){
			return addArmorTexture("wither_1.png");
		}       
		if (itemstack.getItem() == v.jackOManHelmet || itemstack.getItem() == v.jackOManBody || itemstack.getItem() == v.jackOManBoots){
			return addArmorTexture("jackOMan_1.png");
		}
		if (itemstack.getItem() == v.eliteRealmiteHelmet || itemstack.getItem() == v.eliteRealmiteBody || itemstack.getItem() == v.eliteRealmiteBoots){
			return addArmorTexture("eliteRealmite_1.png");
		}
		if (itemstack.getItem() == v.krakenHelmet || itemstack.getItem() == v.krakenBody || itemstack.getItem() == v.krakenBoots){
			return addArmorTexture("kraken_1.png");
		}
		if (itemstack.getItem() == v.rupeeHelmet || itemstack.getItem() == v.rupeeBody || itemstack.getItem() == v.rupeeBoots){
			return addArmorTexture("rupee_1.png");
		}
		if (itemstack.getItem() == v.arlemiteHelmet || itemstack.getItem() == v.arlemiteBody || itemstack.getItem() == v.arlemiteBoots){
			return addArmorTexture("arlemite_1.png");
		}
		if (itemstack.getItem() == v.realmiteHelmet || itemstack.getItem() == v.realmiteBody || itemstack.getItem() == v.realmiteBoots){
			return addArmorTexture("realmite_1.png");
		}
		if (itemstack.getItem() == v.angelicHelmet || itemstack.getItem() == v.angelicBody || itemstack.getItem() == v.angelicBoots){
			return addArmorTexture("angelic_1.png");
		}
		if (itemstack.getItem() == v.aquastriveHelmet || itemstack.getItem() == v.aquastriveBody || itemstack.getItem() == v.aquastriveBoots){
			return addArmorTexture("aquatic_1.png");
		}
		if (itemstack.getItem() == v.shadowHelmet || itemstack.getItem() == v.shadowBody || itemstack.getItem() == v.shadowBoots){
			return addArmorTexture("shadow_1.png");
		}
		if (itemstack.getItem() == i.santaHead || itemstack.getItem() == i.santaBody || itemstack.getItem() == i.santaBoots){
			return addArmorTexture("santa_1.png");
		}
		if (itemstack.getItem() == t.haliteHelmet || itemstack.getItem() == t.haliteBody || itemstack.getItem() == t.haliteBoots){
			return addArmorTexture("halite_1.png");
		}
		if (itemstack.getItem() == t.apalachiaHelmet || itemstack.getItem() == t.apalachiaBody || itemstack.getItem() == t.apalachiaBoots){
			return addArmorTexture("apalachia_1.png");
		}
		if (itemstack.getItem() == t.mortumHelmet || itemstack.getItem() == t.mortumBody || itemstack.getItem() == t.mortumBoots){
			return addArmorTexture("mortum_1.png");
		}
		if (itemstack.getItem() == t.wildHelmet || itemstack.getItem() == t.wildBody || itemstack.getItem() == t.wildBoots){
			return addArmorTexture("wildWood_1.png");
		}
		if (itemstack.getItem() == t.edenHelmet || itemstack.getItem() == t.edenBody || itemstack.getItem() == t.edenBoots){
			return addArmorTexture("eden_1.png");
		}
		if (itemstack.getItem() == t.skythernHelmet || itemstack.getItem() == t.skythernBody || itemstack.getItem() == t.skythernBoots){
			return addArmorTexture("skythern_1.png");
		}
		if (itemstack.getItem() == v.netheriteHelmet || itemstack.getItem() == v.netheriteBody || itemstack.getItem() == v.netheriteBoots){
			return addArmorTexture("netherite_1.png");
		}
		if (itemstack.getItem() == v.infernoHelmet || itemstack.getItem() == v.infernoBody || itemstack.getItem() == v.infernoBoots){
			return addArmorTexture("inferno_1.png");
		}
		if (itemstack.getItem() == v.enderHelmet || itemstack.getItem() == v.enderBody || itemstack.getItem() == v.enderBoots){
			return addArmorTexture("ender_1.png");
		}
		if (itemstack.getItem() == v.bedrockHelmet || itemstack.getItem() == v.bedrockBody || itemstack.getItem() == v.bedrockBoots){
			return addArmorTexture("bedrock_1.png");
		}
		if (itemstack.getItem() == v.divineHelmet || itemstack.getItem() == v.divineBody || itemstack.getItem() == v.divineBoots){
			return addArmorTexture("divine_1.png");
		}
		if (itemstack.getItem() == v.ironLegs){ return addArmorTexture("iron_2.png"); }       
		if (itemstack.getItem() == v.diamondLegs){ return addArmorTexture("diamond_2.png"); }        
		if (itemstack.getItem() == v.skelemanLegs){ return addArmorTexture("skeleton_2.png"); }        
		if (itemstack.getItem() == v.jackOManLegs){ return addArmorTexture("jackOMan_2.png"); }   
		if (itemstack.getItem() == v.eliteRealmiteLegs){ return addArmorTexture("eliteRealmite_2.png"); }
		if (itemstack.getItem() == v.krakenLegs){ return addArmorTexture("kraken_2.png"); }
		if (itemstack.getItem() == v.rupeeLegs){ return addArmorTexture("rupee_2.png"); }
		if (itemstack.getItem() == v.arlemiteLegs){ return addArmorTexture("arlemite_2.png"); }
		if (itemstack.getItem() == v.realmiteLegs){ return addArmorTexture("realmite_2.png"); }
		if (itemstack.getItem() == v.angelicLegs){ return addArmorTexture("angelic_2.png"); }
		if (itemstack.getItem() == v.aquastriveLegs){ return addArmorTexture("aquatic_2.png"); }
		if (itemstack.getItem() == v.shadowLegs){ return addArmorTexture("shadow_2.png"); }
		if (itemstack.getItem() == i.santaLegs){ return addArmorTexture("santa_2.png"); }
		if (itemstack.getItem() == t.haliteLegs){ return addArmorTexture("halite_2.png"); }
		if (itemstack.getItem() == t.mortumLegs){ return addArmorTexture("mortum_2.png"); }
		if (itemstack.getItem() == t.apalachiaLegs){ return addArmorTexture("apalachia_2.png"); }
		if (itemstack.getItem() == t.wildLegs){ return addArmorTexture("wildWood_2.png"); }
		if (itemstack.getItem() == t.edenLegs){ return addArmorTexture("eden_2.png"); }
		if (itemstack.getItem() == t.skythernLegs){ return addArmorTexture("skythern_2.png"); }
		if (itemstack.getItem() == v.netheriteLegs){ return addArmorTexture("Netherite_2.png"); }
		if (itemstack.getItem() == v.infernoLegs){ return addArmorTexture("Inferno_2.png"); }
		if (itemstack.getItem() == v.enderLegs){ return addArmorTexture("ender_2.png"); }
		if (itemstack.getItem() == v.bedrockLegs){ return addArmorTexture("bedrock_2.png"); }
		if (itemstack.getItem() == v.divineLegs){ return addArmorTexture("divine_2.png"); }
		return getArmorTexture(itemstack, entity, slot, "");
	}

	public String addArmorTexture(String tex){
		return PREFIX + tex;
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