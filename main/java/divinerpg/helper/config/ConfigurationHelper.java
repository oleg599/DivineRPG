package divinerpg.helper.config;

import java.io.File;
import java.util.HashMap;

import javax.security.auth.login.Configuration;

public class ConfigurationHelper {
	
	public static Configuration cfg;
	private static HashMap<String, Integer> configMap = new HashMap<String, Integer>();

	public static void init() {
		cfg = new Configuration(new File("./DivineRPG/DivineRPG.cfg"));

		cfg.load();
		dimensionInit();
		miscInit();
		cfg.save();
	}

	public static boolean keepLoadingEden, keepLoadingWildWoods, keepLoadingApalachia, keepLoadingSkythern, keepLoadingMortum,
	keepLoadingVethea, keepLoadingArcana, keepLoadingIceika;
	public static boolean canShowDeathChat, canShowIngameVersion;

	public static int Eden, WildWoods, Apalachia, Skythern, Mortum, Vethea, Arcana, Iceika;
	public static int EdenBiome, WildWoodsBiome, ApalachiaBiome, SkythernBiome, MortumBiome, VetheaBiome, ArcanaBiome, IceikaBiome;

	public static void dimensionInit(){
		EdenBiome = cfg.get("Dimension", "Eden Biome ID", 40).getInt();
		WildWoodsBiome = cfg.get("Dimension", "The Wild Woods Biome ID", 41).getInt();
		ApalachiaBiome = cfg.get("Dimension", "Apalcha Biome ID", 42).getInt();
		SkythernBiome = cfg.get("Dimension", "Skythern Biome ID", 43).getInt();
		MortumBiome = cfg.get("Dimension", "Mortum Biome ID", 44).getInt();
		VetheaBiome = cfg.get("Dimension", "Vethea Biome ID", 45).getInt();
		ArcanaBiome = cfg.get("Dimension", "Arcana Biome ID", 46).getInt();
		IceikaBiome = cfg.get("Dimension", "Iceika Biome ID", 47).getInt();
		
		Eden = cfg.get("Dimension", "Eden ID", 10).getInt();
		WildWoods = cfg.get("Dimension", "The Wild Woods ID", 11).getInt();
		Apalachia = cfg.get("Dimension", "Apalcha ID", 12).getInt();
		Skythern = cfg.get("Dimension", "Skythern ID", 13).getInt();
		Mortum = cfg.get("Dimension", "Mortum ID", 14).getInt();
		Vethea = cfg.get("Dimension", "Vethea ID", 15).getInt();
		Arcana = cfg.get("Dimension", "Arcana ID", 16).getInt();
		Iceika = cfg.get("Dimension", "Iceika ID", 17).getInt();

		keepLoadingEden = cfg.get("Dimension", "Keep Loading Eden", true).getBoolean(true);
		keepLoadingWildWoods = cfg.get("Dimension", "Keep Loading The Wild Woods", true).getBoolean(true);
		keepLoadingApalachia = cfg.get("Dimension", "Keep Loading Apalachia", true).getBoolean(true);
		keepLoadingSkythern = cfg.get("Dimension", "Keep Loading Skythern", true).getBoolean(true);
		keepLoadingMortum = cfg.get("Dimension", "Keep Loading Mortum", true).getBoolean(true);
		keepLoadingVethea = cfg.get("Dimension", "Keep Loading Vethea", true).getBoolean(true);
		keepLoadingArcana = cfg.get("Dimension", "Keep Loading Arcana", true).getBoolean(true);
		keepLoadingIceika = cfg.get("Dimension", "Keep Loading Iceika", true).getBoolean(true);
	}	
	
	public static void miscInit(){
		canShowDeathChat = cfg.get("GUI", "Can Show Death Chat For DivineRPG Mobs", true).getBoolean(true);
		canShowIngameVersion = cfg.get("GUI", "Can Show in-game version text in top left corner", true).getBoolean(true);
	}

	public static int getConfig(String name) {
		return configMap.get(name);
	}	
}
