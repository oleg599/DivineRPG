package net.divinerpg.vethea.items;

import net.minecraftforge.common.util.EnumHelper;

public class ItemVetheanHammerSword extends ItemVetheanSword {
	
    public ItemVetheanHammerSword(int damage) {
        super(EnumHelper.addToolMaterial("sword", 0, -1, 0, damage - 4, 22));
    }
}
