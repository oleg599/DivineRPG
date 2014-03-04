package net.divinerpg.api.blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.Reference;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.item.Item;

public class BlockModChest extends BlockChest {
	
	protected String           name;

	public BlockModChest() {
		super(0);
		setCreativeTab(DivineRPGTabs.blocks);
	}
	//TODO: Let it have its own texture
	
	public Item getItemDropped(int par1, Random par2, int par3) {
		return (this == IceikaBlocks.frostedChest) ? IceikaItems.snowflake
				: getBlock(this);
	}
	
	public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}
	
	public Block setTextureName(String name) {
        return setBlockTextureName(Reference.PREFIX + name);
    }

    public Block setName(String name) {
        this.name = name;
        setTextureName(name);
        setBlockName(name);
        register();
        return this;
    }

    public String getName() {
        return name;
    }

    public String getTextureName() {
        return Reference.PREFIX + name;
    }

    public void register() {
        int numChars = 0;
        char firstLetter = name.charAt(0);
        if (Character.isLowerCase(firstLetter))
            firstLetter = Character.toUpperCase(firstLetter);
        String inGame = name.substring(1);
        for (int k = 0; k < name.length(); k++) {
            char c = name.charAt(k);
            int code = (int) c;

            if (k != 0) {
                for (int p = 65; p < 90; p++) {
                    if (code == p) {
                        numChars++;
                        if (numChars == 1) inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
                        else inGame = new StringBuffer(inGame).insert(k, " ").toString();
                    }
                }
            }
        }
        GameRegistry.registerBlock(this, name);
    }

}
