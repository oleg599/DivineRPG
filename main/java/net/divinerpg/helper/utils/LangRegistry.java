package net.divinerpg.helper.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class LangRegistry {

    private static ArrayList<Block> blocks    = new ArrayList<Block>();
    private static ArrayList<Item>  items     = new ArrayList<Item>();
    private static ArrayList<Item>  key       = new ArrayList<Item>();
    private static ArrayList<DivineRPGTabs> tabs = new ArrayList<DivineRPGTabs>();
    private static BufferedWriter   writer;
    private final static String     FILE_NAME = "/en_US.lang";
    private static String           DIRECTORY = "./DivineRPG/resources/assets/drpg/lang";
    private static String           PATH;

    public static void init() {
        if (Reference.DEBUG) {
            PATH = DIRECTORY + FILE_NAME;
            File file = new File(PATH);
            if (!file.exists()) {
                DIRECTORY = "./resources/assets/drpg/lang";
                PATH = DIRECTORY + FILE_NAME;
                file = new File(PATH);
                if (!file.exists()) {
                    file = new File("./main/resources/assets/drpg/lang" + FILE_NAME);
                    if (!file.exists()) {
                        file = new File("./src/main/resources/assets/drpg/lang" + FILE_NAME);
                        if (!file.exists())
                            file = new File("." + FILE_NAME);
                    }
                }
            }
            try {
                if(file.exists()) file.delete();
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
            } catch (IOException e) {
                e.printStackTrace();
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

    public static void addBlock(Block block) {
        blocks.add(block);
    }

    public static void addItem(Item item) {
        items.add(item);
    }

    public static void addKeyItem(Item item) {
        key.add(item);
    }
    
    public static void addTab(DivineRPGTabs tab){
        tabs.add(tab);
    }

    public static void addBlockNames() {
        for (int k = 0; k < blocks.size(); k++) {
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
                            if (numChars == 1) inGame = new StringBuffer(inGame).insert(p - 1, " ").toString();
                            else inGame = new StringBuffer(inGame).insert(p, " ").toString();
                        }
                    }
                }
            }
            String finalName = firstLetter + inGame;
            addToFile("tile." + name + ".name=" + finalName);
        }
    }

    public static void addItemNames() {
        for (int k = 0; k < items.size(); k++) {
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
                            if (numChars == 1) inGame = new StringBuffer(inGame).insert(p - 1, " ").toString();
                            else inGame = new StringBuffer(inGame).insert(p, " ").toString();
                        }
                    }
                }
            }
            String finalName = firstLetter + inGame;
            addToFile("item." + name + ".name=" + finalName);
        }
    }

    public static void addKeyItemNames() {
        for (int k = 0; k < key.size(); k++) {
            Item item = key.get(k);
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
                            if (numChars == 1) inGame = new StringBuffer(inGame).insert(p - 1, " ").toString();
                            else inGame = new StringBuffer(inGame).insert(p, " ").toString();
                        }
                    }
                }
            }
            String finalName = "Key";
            addToFile("item." + name + ".name=" + finalName);
        }
    }
    
    public static void addTabNames(){
        for(int i = 0; i < tabs.size(); i++){
            String label = tabs.get(i).getTabLabel();
            String name = tabs.get(i).getName();
            addToFile("itemGroup." + label + "=DivineRPG: " + name);
        }
    }

    public static void addToFile(String text) {
        try {
            writer.write(text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeFile() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
