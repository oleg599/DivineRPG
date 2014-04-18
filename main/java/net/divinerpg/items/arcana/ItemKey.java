package net.divinerpg.items.arcana;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;

public class ItemKey extends ItemMod{

	public ItemKey() {
		LangRegistry.addKeyItem(this);
		setCreativeTab(DivineRPGTabs.utility);
	}
}