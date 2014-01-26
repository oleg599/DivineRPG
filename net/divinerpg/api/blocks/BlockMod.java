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

    protected static SoundType stone = Block.field_149769_e;
    protected static SoundType grass = Block.field_149779_h;
    protected static SoundType cloth = Block.field_149775_l;
    protected static SoundType wood  = Block.field_149766_f;

    public static Material     rock  = Material.field_151576_e;
    public static Material     wool  = Material.field_151580_n;

    protected String           name;

    public BlockMod(Material mat) {
        super(mat);
        LangRegistry.addBlock(this);
    }

    public Block setUnlocalizedName(String name) {
        return func_149663_c(name);
    }

    public Block setTextureName(String name) {
        return func_149658_d(Reference.PREFIX + name);
    }

    public Block setName(String name) {
        this.name = name;
        setTextureName(name);
        setUnlocalizedName(name);
        register();
        return this;
    }

    public Block setHarvestLevel(int i) {
        setHarvestLevel("pickaxe", i);
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
        String finalName = firstLetter + inGame;
        GameRegistry.registerBlock(this, name);
        LanguageRegistry.addName(this, finalName);
    }

    public Block setCreativeTab(CreativeTabs name) {
        return func_149647_a(name);
    }

    public Block setSoundType(Block.SoundType name) {
        return func_149672_a(name);
    }
}