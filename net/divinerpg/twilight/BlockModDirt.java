package net.divinerpg.twilight;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockModDirt extends Block {

	static Material dirt = Material.field_151578_c;
    private String name;
    public BlockModDirt() {
        super(dirt);
        func_149647_a(DivineRPGTabs.blocks);
    }
    
    public Block setUnlocalizedName(String name){
        return func_149663_c(name);
    }
    
    public Block setTextureName(String name){
        return func_149658_d(Reference.PREFIX + name);
    }
    
    public Block setName(String name){
        this.name = name;
        setTextureName(name);
        setUnlocalizedName(name);
        register();
        return this;
    }
    
    public String getName(){
        return name;
    }
    public void register(){
        int numChars = 0;
        char firstLetter = name.charAt(0);
        if(Character.isLowerCase(firstLetter))
            firstLetter = Character.toUpperCase(firstLetter);
        String inGame = name.substring(1);
        for(int k = 0; k < name.length(); k++){
            char c = name.charAt(k);
            int code = (int) c;
            
            if(k != 0){
                for(int p = 65; p < 90; p++){
                    if(code == p){
                        numChars++;
                        if(numChars == 1)
                            inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
                        else
                            inGame = new StringBuffer(inGame).insert(k, " ").toString();
                    }
                }
            }
        }
        String finalName = firstLetter + inGame;
        System.err.println(finalName);
        GameRegistry.registerBlock(this, name);
        LanguageRegistry.addName(this, finalName);
    }
	
}
