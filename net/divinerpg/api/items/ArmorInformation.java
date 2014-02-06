package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ArmorInformation {
	
	public static VanillaItems v;
	public static TwilightItems t;
	public static IceikaItems i;
	
	public static void addInfo(ItemStack item, EntityPlayer par2EntityPlayer, List list, boolean par4) {
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
	}
}
