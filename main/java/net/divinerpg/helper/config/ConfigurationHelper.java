package net.divinerpg.helper.config;

import java.io.File;
import java.util.HashMap;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHelper {

    public static Configuration             cfg;
    private static HashMap<String, Integer> configMap = new HashMap<String, Integer>();

    public static void init() {
        cfg = new Configuration(new File("./DivineRPG/DivineRPG.cfg"));

        cfg.load();
        dimensionInit();
        miscInit();
        cfg.save();
    }

    public static boolean keepLoadingEden, keepLoadingWildWoods, keepLoadingApalachia, keepLoadingSkythern, keepLoadingMortum, keepLoadingVethea, keepLoadingArcana, keepLoadingIceika;
    public static boolean canShowDeathChat, canShowVanillaDeathChat, canShowIngameVersion;

    public static int     eden, wildWoods, apalachia, skythern, mortum, vethea, arcana, iceika;
    public static int     edenBiome, wildWoodsBiome, apalachiaBiome, skythernBiome, mortumBiome, vetheaBiome, arcanaBiome, iceikaBiome;
    public static int     arcanaX, arcanaY;

    public static void dimensionInit() {
        edenBiome = cfg.get("Dimension", "Eden Biome ID", 40).getInt();
        wildWoodsBiome = cfg.get("Dimension", "The Wild Woods Biome ID", 41).getInt();
        apalachiaBiome = cfg.get("Dimension", "Apalcha Biome ID", 42).getInt();
        skythernBiome = cfg.get("Dimension", "Skythern Biome ID", 43).getInt();
        mortumBiome = cfg.get("Dimension", "Mortum Biome ID", 44).getInt();
        vetheaBiome = cfg.get("Dimension", "Vethea Biome ID", 45).getInt();
        arcanaBiome = cfg.get("Dimension", "Arcana Biome ID", 46).getInt();
        iceikaBiome = cfg.get("Dimension", "Iceika Biome ID", 47).getInt();

        eden = cfg.get("Dimension", "Eden ID", 10).getInt();
        wildWoods = cfg.get("Dimension", "The Wild Woods ID", 11).getInt();
        apalachia = cfg.get("Dimension", "Apalcha ID", 12).getInt();
        skythern = cfg.get("Dimension", "Skythern ID", 13).getInt();
        mortum = cfg.get("Dimension", "Mortum ID", 14).getInt();
        vethea = cfg.get("Dimension", "Vethea ID", 15).getInt();
        arcana = cfg.get("Dimension", "Arcana ID", 16).getInt();
        iceika = cfg.get("Dimension", "Iceika ID", 17).getInt();

        keepLoadingEden = cfg.get("Dimension", "Keep Loading Eden", true).getBoolean(true);
        keepLoadingWildWoods = cfg.get("Dimension", "Keep Loading The Wild Woods", true).getBoolean(true);
        keepLoadingApalachia = cfg.get("Dimension", "Keep Loading Apalachia", true).getBoolean(true);
        keepLoadingSkythern = cfg.get("Dimension", "Keep Loading Skythern", true).getBoolean(true);
        keepLoadingMortum = cfg.get("Dimension", "Keep Loading Mortum", true).getBoolean(true);
        keepLoadingVethea = cfg.get("Dimension", "Keep Loading Vethea", true).getBoolean(true);
        keepLoadingArcana = cfg.get("Dimension", "Keep Loading Arcana", true).getBoolean(true);
        keepLoadingIceika = cfg.get("Dimension", "Keep Loading Iceika", true).getBoolean(true);
    }

    public static void miscInit() {
        canShowDeathChat = cfg.get("GUI", "Can Show Death Chat For DivineRPG Mobs", true).getBoolean(true);//TODO FALSE UNTILL FIGURED OUT WHY RANGED WEAPONS DO STUFFS
        canShowVanillaDeathChat = cfg.get("GUI", "Can Show Death Chat For Vanilla Mobs", true).getBoolean(true);
        canShowIngameVersion = cfg.get("GUI", "Can Show in-game version text in top left corner", true).getBoolean(true);
        arcanaX = 111;
        arcanaY = 18;
    }

    public static int getConfig(String name) {
        return configMap.get(name);
    }
}
