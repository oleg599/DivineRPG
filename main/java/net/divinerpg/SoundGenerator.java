package net.divinerpg;

import java.util.ArrayList;

public class SoundGenerator {

	private static ArrayList<String> single;
	private static ArrayList<String> item;
	private static ArrayList<String> mob;

	public static void main(String[] args){
		single = new ArrayList<String>();
		item = new ArrayList<String>();
		mob = new ArrayList<String>();

		addSounds();
		System.out.println("{");
		addSingleSound();
		addMobSound();
		addItemSound();
		System.out.println("}");
		System.out.println("\n\n\n");
		addObject();
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
			System.out.println("	\"" + s + "\"" + ":{\"category\":\"master\",\"sounds\":[{\"name\":\"" + s + "\", stream\": false}]},");
	}

	public static void addMobSound(){
		for(String s : mob){
			System.out.println("	\"" + s + "\"" + ":{\"category\":\"master\",\"sounds\":[{\"name\" :\"" + s + "\", stream\": false}]},");
			System.out.println("	\"" + s + "Hurt" + "\"" + ":{\"category\":\"master\",\"sounds\":[{\"name\": \"" + s + "Hurt" + "\", stream\": false}]},");
		}
	}

	public static void addItemSound(){
		for(String s : item)
			System.out.println("	\"" + s + "\":{\"category\":\"neutral\",\"sounds\":[\"" + s + "\"]},");
	}

	public static void addObject(){
		for(String s : mob){
			System.out.println("public static String " + s + " = \"" + "divinerpg:" + s + "\";");
			System.out.println("public static String " + s + "Hurt" + " = \"" + "divinerpg:" + s + "Hurt" + "\";");
		}
		for(String s : single)
			System.out.println("public static String " + s + " = \"" + "divinerpg:" + s + "\";");
		for(String s : item)
			System.out.println("public static String " + s + " = \"" + "divinerpg:" + s + "\";");
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
		
		//Vethea
		addItemSound("staff");

		//Arcana
		
	}
}