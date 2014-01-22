package net.divinerpg.vethea.items;

import net.minecraftforge.common.util.EnumHelper;

public class ItemVetheanHammerSword extends ItemVetheanSword
{
	static int weaponDamage;

    public ItemVetheanHammerSword(int damage) {
        super(tool);
        this.weaponDamage = damage;
    }
    static ToolMaterial tool = EnumHelper.addToolMaterial("enumz", 0, -1, 0, weaponDamage, 22);
}
