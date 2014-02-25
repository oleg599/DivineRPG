/*   Copyright 2014 BossLetsPlays(Matthew Rogers)
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * <strong>Project:</strong> DivineRPG <br>
 *
 * <strong>Class:</strong> BlockMod
 *
 * @author <a href = "http://youtube.com/BossLetsPlays"> BossLetsPlays</a>
 *
 */
public class BlockMod extends Block {

    protected static SoundType stone = Block.soundTypeStone;
    protected static SoundType grass = Block.soundTypeGrass;
    protected static SoundType cloth = Block.soundTypeCloth;
    protected static SoundType wood  = Block.soundTypeWood;

    public static Material     rock  = Material.rock;
    public static Material     wool  = Material.cloth;

    protected String           name;

    public BlockMod(Material mat) {
        super(mat);
        LangRegistry.addBlock(this);
    }
    
    public Block setHarvestLevel(int i) {
        setHarvestLevel("pickaxe", i);
        return this;
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