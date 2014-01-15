package net.divinerpg.helper.config;

import java.io.File;
import java.util.HashMap;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHelper {
	
	static FMLPreInitializationEvent event;
	public static Configuration cfg;
	private static HashMap<String, Integer> configMap = new HashMap<String, Integer>();

	public static void init(FMLPreInitializationEvent e) {
		event = e;
		cfg = new Configuration(new File(event.getModConfigurationDirectory() + "DivineRPG.cfg"));

		cfg.load();
		dimensionInit();
		cfg.save();
	}

	public static boolean keepLoadingEden, keepLoadingWildWoods, keepLoadingApalachia, keepLoadingSkythern, keepLoadingMortum,
	keepLoadingVethea, keepLoadingArcana, keepLoadingIceika;

	public static int Eden, WildWoods, Apalachia, Skythern, Mortum, Vethea, Arcana, Iceika;

	static void dimensionInit(){
		Eden = cfg.get("Dimension", "Eden ID", 10).getInt();
		WildWoods = cfg.get("Dimension", "The Wild Woods ID", 11).getInt();
		Apalachia = cfg.get("Dimension", "Apalcha ID", 12).getInt();
		Skythern = cfg.get("Dimension", "Skythern ID", 13).getInt();
		Mortum = cfg.get("Dimension", "Mortum ID", 14).getInt();
		Vethea = cfg.get("Dimension", "Vethea ID", 15).getInt();
		Arcana = cfg.get("Dimension", "Arcana ID", 16).getInt();
		Iceika = cfg.get("Dimension", "Iceika ID", 17).getInt();

		keepLoadingEden = cfg.get("Dimension", "Keep Loading Eden", true).getBoolean(keepLoadingEden);
		keepLoadingWildWoods = cfg.get("Dimension", "Keep Loading The Wild Woods", true).getBoolean(keepLoadingWildWoods);
		keepLoadingApalachia = cfg.get("Dimension", "Keep Loading Apalachia", true).getBoolean(keepLoadingApalachia);
		keepLoadingSkythern = cfg.get("Dimension", "Keep Loading Skythern", true).getBoolean(keepLoadingSkythern);
		keepLoadingMortum = cfg.get("Dimension", "Keep Loading Mortum", true).getBoolean(keepLoadingMortum);
		keepLoadingVethea = cfg.get("Dimension", "Keep Loading Vethea", true).getBoolean(keepLoadingVethea);
		keepLoadingArcana = cfg.get("Dimension", "Keep Loading Arcana", true).getBoolean(keepLoadingArcana);
		keepLoadingIceika = cfg.get("Dimension", "Keep Loading Iceika", true).getBoolean(keepLoadingIceika);
	}	

	public static void addConfig(String cat, String name, int value) {
		cfg.get(cat, name, value);
		configMap.put(name, cfg.get(cat, name, value).getInt());
	}

	public static int getConfig(String name) {
		return configMap.get(name);
	}	
}
