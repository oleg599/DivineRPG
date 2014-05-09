package net.divinerpg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SoundGenerator {

	private static ArrayList<String> single = new ArrayList<String>();
	private static ArrayList<String> item = new ArrayList<String>();
	private static ArrayList<String> mob = new ArrayList<String>();
	private static BufferedWriter writer;
	private static boolean canWrite;

	public static void init() {
		if(Reference.DEBUG){
			File f = new File("./DivineRPG/sounds.json");
			if(!f.exists()) { 
				try {
					f.createNewFile();
					writer = new BufferedWriter(new FileWriter(f));
					canWrite = true;
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				if(!readFile("./DivineRPG/sounds.json").isEmpty()){
					f.delete();
					try {
						f.createNewFile();
						writer = new BufferedWriter(new FileWriter(f));
					} catch (IOException e) {
						e.printStackTrace();
					}
					canWrite = true;
				} else {
					try {
						writer = new BufferedWriter(new FileWriter(f));
					} catch (IOException e) {
						e.printStackTrace();
					}
					canWrite = true;
				}
			}
		}
	}

	public static void addToFile(String text){
		try {
			writer.write(text + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readFile(String path) {
		StringBuilder source = new StringBuilder();
		BufferedReader reader = null;
		File file = new File(path);
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				source.append(line);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return source.toString();
	}

	public static void closeFile(){
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addSingleSound(String sound){
		single.add(sound);
	}

	public static void addItemSound(String sound){
		item.add(sound);
	}

	public static void addMobSound(String sound){
		mob.add(sound);
	}

	public static void addSingleSound(){
		for(String s : single)
			addToFile("	\"" + s + "\"" + ":{\"category\":\"master\",\"sounds\":[{\"name\":\"" + s + "\", stream\": false}]},");
	}

	public static void addMobSound(){
		for(String s : mob){
			addToFile("	\"" + s + "\"" + ":{\"category\":\"master\",\"sounds\":[{\"name\" :\"" + s + "\", stream\": false}]},");
			addToFile("	\"" + s + "Hurt" + "\"" + ":{\"category\":\"master\",\"sounds\":[{\"name\": \"" + s + "Hurt" + "\", stream\": false}]},");
		}
	}

	public static void addItemSound(){
		for(String s : item)
			addToFile("	\"" + s + "\":{\"category\":\"neutral\",\"sounds\":[\"" + s + "\"]},");
	}

	public static void addObject(){
		for(String s : mob){
			addToFile("		public static String " + s + " = \"" + "divinerpg:" + s + "\";");
			addToFile("		public static String " + s + "Hurt" + " = \"" + "divinerpg:" + s + "Hurt" + "\";");
		}
		for(String s : single)
			addToFile("		public static String " + s + " = \"" + "divinerpg:" + s + "\";");
		for(String s : item)
			addToFile("		public static String " + s + " = \"" + "divinerpg:" + s + "\";");
	}

	public static void addSounds(){
		//Overworld
		addMobSound("crab");
		addMobSound("aridWarrior");
		addMobSound("ayeraco");
		addMobSound("crawler");
		addMobSound("cyclops");
		addMobSound("dramcryx");
		addMobSound("glacide");
		addMobSound("kingScorcher");
		addMobSound("rainbour");
		addMobSound("rotatick");
		addMobSound("theEye");
		addMobSound("whale");
		addMobSound("wildFire");
		addSingleSound("jackOMan");
		addSingleSound("frost");
		addSingleSound("scorcher");
		addSingleSound("roar");
		addSingleSound("iceman");
		addSingleSound("hellSpider");
		addSingleSound("ayeracoTeleport");
		addSingleSound("ayeracoHalfHealth");
		addSingleSound("ayeracoPillar");
		addSingleSound("ayeracoSpawn");
		addItemSound("deepLaugh");
		addItemSound("heal");

		//Twilight
		addItemSound("phaser");
		addItemSound("blitz");

		//Iceika
		addItemSound("soundOfCarols");
		addItemSound("soundOfMusic");
		addItemSound("frostclawCannon");
		
		//Vethea
		addItemSound("staff");

		//Arcana
		addItemSound("starlight");
		addItemSound("sparkler");
	}
}