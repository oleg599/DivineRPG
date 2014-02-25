package divinerpg.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import cpw.mods.fml.common.registry.GameRegistry;
import divinerpg.Reference;


public class BlockModLamp extends BlockRedstoneLight {

	private final boolean isLit;
	private String name;
	
	public BlockModLamp(boolean isLit) {
		super(isLit);
		this.isLit = isLit;

        if (isLit)
        {
            this.setLightLevel(1.0F);
        }
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
