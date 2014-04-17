package net.divinerpg.api.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemModFood extends ItemFood {
	
	private int food;
	private float sat;
	private boolean wolf;
	private EntityPlayer p = Minecraft.getMinecraft().thePlayer;
	
	public ItemModFood(int food, float sat, boolean wolfFood){
		super(food, sat, wolfFood);
		setCreativeTab(DivineRPGTabs.food);
		this.food = food;
		this.sat = sat;
		wolf = wolfFood;
		LangRegistry.addItem(this);
	}

	public ItemModFood(int food, float sat, boolean wolfFood, int potionID, int potionDuration, int potionAmplifier, float potionEffectProbability){
        super(food, sat, wolfFood);
        setCreativeTab(DivineRPGTabs.food);
        this.food = food;
        this.sat = sat;
        wolf = wolfFood;
        LangRegistry.addItem(this);
        setPotionEffect(potionID, potionDuration, potionAmplifier, potionEffectProbability);
    }
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Fills " + (double) food/2 + " Hunger Bars");
		par3List.add(sat + " Saturation");
		par3List.add(!wolf ? "Pet Food: false" : "Pet Food: true");
	}
	
	public Item setImageName(String par1Str) {
        return setTextureName(Reference.PREFIX + par1Str);
    }
	
    public Item setName(String name){
        setImageName(name);
        setUnlocalizedName(name);
        GameRegistry.registerItem(this, name);
        return this;
    }
}