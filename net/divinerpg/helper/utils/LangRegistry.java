package net.divinerpg.helper.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import net.divinerpg.Reference;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.DivineAPI;
import net.minecraft.block.Block;
import net.minecraft.item.Item;


/**
 * <strong>Project:</strong> DivineRPG <br>
 *
 * <strong>Class:</strong> LangRegistry
 *
 * @author <a href = "http://youtube.com/BossLetsPlays"> BossLetsPlays</a>
 *
 */
public class LangRegistry {

	private static ArrayList<Block> blocks   = new ArrayList<Block>();
	private static ArrayList<Item>  items    = new ArrayList<Item>();
	private static boolean          canWrite = false;
	private static BufferedWriter   writer;

	public static void init() {
		if(Reference.DEBUG){
			File f = new File("./DivineRPG/en_US.lang");
			if (!f.exists()) {
				try {
					f.createNewFile();
					writer = new BufferedWriter(new FileWriter(f));
					addToFile("itemGroup.Swords=DivineRPG: Melee Weapons");
					addToFile("itemGroup.Blocks=DivineRPG: Blocks");
					addToFile("itemGroup.Ranged=DivineRPG: Ranged Weapons");
					addToFile("itemGroup.Tools=DivineRPG: Tools");
					addToFile("itemGroup.Armor=DivineRPG: Armor");
					addToFile("itemGroup.Vethea=DivineRPG: Vethea");
					addToFile("itemGroup.Utility=DivineRPG: Utility");
					addToFile("itemGroup.Herbalism=DivineRPG: Herbalism");
					addToFile("itemGroup.Materials=DivineRPG: Raw Materials");
					addToFile("itemGroup.Spawner=DivineRPG: Spawner");
					canWrite = true;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else{
				if(!readFile("./DivineRPG/en_US.lang").isEmpty()){
					f.delete();
					try {
						f.createNewFile();
						writer = new BufferedWriter(new FileWriter(f));
						addToFile("itemGroup.Swords=DivineRPG: Melee Weapons");
						addToFile("itemGroup.Blocks=DivineRPG: Blocks");
						addToFile("itemGroup.Ranged=DivineRPG: Ranged Weapons");
						addToFile("itemGroup.Tools=DivineRPG: Tools");
						addToFile("itemGroup.Armor=DivineRPG: Armor");
						addToFile("itemGroup.Vethea=DivineRPG: Vethea");
						addToFile("itemGroup.Utility=DivineRPG: Utility");
						addToFile("itemGroup.Herbalism=DivineRPG: Herbalism");
						addToFile("itemGroup.Materials=DivineRPG: Raw Materials");
						addToFile("itemGroup.Spawner=DivineRPG: Spawner");
					} catch (IOException e) {
						e.printStackTrace();
					}
					canWrite = true;
				}
				else{
					try {
						writer = new BufferedWriter(new FileWriter(f));
						addToFile("itemGroup.Swords=DivineRPG: Melee Weapons");
						addToFile("itemGroup.Blocks=DivineRPG: Blocks");
						addToFile("itemGroup.Ranged=DivineRPG: Ranged Weapons");
						addToFile("itemGroup.Tools=DivineRPG: Tools");
						addToFile("itemGroup.Armor=DivineRPG: Armor");
						addToFile("itemGroup.Vethea=DivineRPG: Vethea");
						addToFile("itemGroup.Utility=DivineRPG: Utility");
						addToFile("itemGroup.Herbalism=DivineRPG: Herbalism");
						addToFile("itemGroup.Materials=DivineRPG: Raw Materials");
						addToFile("itemGroup.Spawner=DivineRPG: Spawner");

					} catch (IOException e) {
						e.printStackTrace();
					}
					canWrite = true;
				}
			}
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

	public static void addBlock(Block block){
		blocks.add(block);
	}

	public static void addItem(Item item){
		items.add(item);
	}

	public static void addMob(){
		String name = DivineAPI.mobName;
		for(int k = 0; k < name.length(); k++){
			addToFile("entity." + name + ".name=" + name);
		}
	}

	public static void addBlockNames(){
		for(int k = 0; k < blocks.size(); k++){
			Block block = blocks.get(k);
			String name = block.getUnlocalizedName().substring(5);
			int numChars = 0;
			char firstLetter = name.charAt(0);
			if (Character.isLowerCase(firstLetter)) {
				firstLetter = Character.toUpperCase(firstLetter);
			}

			String inGame = name.substring(1);
			for (int p = 0; p < name.length(); p++) {
				char c = name.charAt(p);
				int code = (int) c;

				if (p != 0) {
					for (int n = 65; n < 90; n++) {
						if (code == n) {
							numChars++;
							if (numChars == 1)
								inGame = new StringBuffer(inGame).insert(p - 1, " ").toString();
							else
								inGame = new StringBuffer(inGame).insert(p, " ").toString();
						}
					}
				}
			}
			String finalName = firstLetter + inGame;
			addToFile("tile." + name + ".name=" + finalName);
		}
	}

	public static void addItemNames(){
		for(int k = 0; k < items.size(); k++){
			Item item = items.get(k);
			String name = item.getUnlocalizedName().substring(5);
			char firstLetter = name.charAt(0);
			int numChars = 0;
			if (Character.isLowerCase(firstLetter)) {
				firstLetter = Character.toUpperCase(firstLetter);
			}

			String inGame = name.substring(1);
			for (int p = 0; p < name.length(); p++) {
				char c = name.charAt(p);
				int code = (int) c;

				if (p != 0) {
					for (int n = 65; n < 90; n++) {
						if (code == n) {
							numChars++;
							if (numChars == 1)
								inGame = new StringBuffer(inGame).insert(p - 1, " ").toString();
							else
								inGame = new StringBuffer(inGame).insert(p, " ").toString();
						}
					}
				}
			}
			String finalName = firstLetter + inGame;
			addToFile("item." + name + ".name=" + finalName);
		}
	}

	public static void addToFile(String text){
		try {
			writer.write(text + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void closeFile(){
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
