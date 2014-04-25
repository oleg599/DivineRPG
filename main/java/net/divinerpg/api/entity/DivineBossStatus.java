package net.divinerpg.api.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class DivineBossStatus {
	
    public static float healthScale;
    public static int statusBarTime;
    public static String bossName;
    public static boolean hasColorModifier;

    public static void setBossStatus(IDivineRPGBoss b, boolean colour) {
        healthScale = b.getHealth() / b.getMaxHealth();
        statusBarTime = 100;
        hasColorModifier = colour;
    }
}