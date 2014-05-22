package net.divinerpg.helper;

import java.lang.reflect.Method;
import java.util.ArrayList;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.recipes.CraftingDivineTableManager;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Util {

    public static int      mobID                  = 275, projectileID = 230;

    private static Object  reflectionFactory      = null;
    private static Method  newConstructorAccessor = null;
    private static Method  newInstance            = null;
    private static Method  newFieldAccessor       = null;
    private static Method  fieldAccessorSet       = null;
    private static boolean isSetup                = false;
    public static String   mobName;

    public static void addRecipe(ItemStack i, Object... o) {
        GameRegistry.addRecipe(i, o);
    }

    public static void addBigRecipe(ItemStack i, Object... o) {
        CraftingDivineTableManager.getInstance().addRecipe(i, o);
    }

    public static void addBucket(Fluid fluid, ItemStack modBucket) {
        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack(fluid.getName(), FluidContainerRegistry.BUCKET_VOLUME), modBucket, new ItemStack(Items.bucket)));
    }

    public static void addEventBus(Object o) {
        MinecraftForge.EVENT_BUS.register(o);
    }

    public static void addSpecialEventBus(Object o) {
        FMLCommonHandler.instance().bus().register(o);
    }

    public static void addShapelessRecipe(ItemStack i, Object... o) {
        GameRegistry.addShapelessRecipe(i, o);
    }

    public static void addBigShapelessRecipe(ItemStack i, Object... o) {
        CraftingDivineTableManager.getInstance().addShapelessRecipe(i, o);
    }

    public static void addSmelting(ItemStack input, ItemStack output, float XP) {
        GameRegistry.addSmelting(input, output, XP);
    }

    public static void registerDivineRPGMob(Class entityClass, String entityName, int ID) {
        int modID = 275;
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID, 0x000000, 0xFFFFFF);
        EntityRegistry.registerModEntity(entityClass, entityName, ID, DivineRPG.instance, 120, 5, true);
    }

    public static void registerProjectile(Class entityClass, String entityName) {
        int ID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName + " Projectile", ID);
        EntityRegistry.registerModEntity(entityClass, entityName + " Projectile", ID, DivineRPG.instance, 250, 5, true);
    }

    public static ArmorMaterial addArmorMaterial(String name, int durability, int[] oldArmor, int enchantability) {
        int duraNew = (int) Math.round(durability / 13.75);
        return EnumHelper.addEnum(ArmorMaterial.class, name, duraNew, oldArmor, enchantability);
    }

    public static ChatComponentTranslation addChatMessage(EnumChatFormatting color, String str, Object... args) {
        ChatComponentTranslation ret = new ChatComponentTranslation(str, args);
        ret.getChatStyle().setColor(color);
        return ret;
    }

    public static ChatComponentTranslation addChatMessage(String str) {
        ChatComponentTranslation ret = new ChatComponentTranslation(str);
        return ret;
    }

    public static String BLACK = "\u00a70", DARK_BLUE = "\u00a71", DARK_GREEN = "\u00a72", DARK_AQUA = "\u00a73", DARK_RED = "\u00a74";
    public static String DARK_PURPLE = "\u00a75", GOLD = "\u00a76", GRAY = "\u00a77", DARK_GRAY = "\u00a78", BLUE = "\u00a79";
    public static String GREEN       = "\u00a7a", AQUA = "\u00a7b", RED = "\u00a7c", LIGHT_PURPLE = "\u00a7d", YELLOW = "\u00a7e";
    public static String WHITE       = "\u00a7f";

    public static void registerItemRenderer(Item i, IItemRenderer te) {
        MinecraftForgeClient.registerItemRenderer(i, te);
    }

    public static void registerItemRenderer(Block b, IItemRenderer te) {
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(b), te);
    }

    public static void sendMessageToAll(String message) {
        FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(new ChatComponentTranslation(AQUA + "[" + DARK_BLUE + "DivineRPG" + AQUA + "] " + WHITE + message));
    }

    public static ToolMaterial addMeleeMaterial(int maxUses, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", 0, maxUses, 0, damage - 5, enchantability);
    }

    public static ToolMaterial addMeleeMaterial(float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", 0, -1, 0, damage - 5, enchantability);
    }

    public static ToolMaterial addAxeMaterial(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, maxUses, efficiency, damage - 4, enchantability);
    }

    public static ToolMaterial addAxeMaterial(int harvestLevel, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, -1, efficiency, damage - 4, enchantability);
    }

    public static ToolMaterial addPickMaterial(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, maxUses, efficiency, damage - 3, enchantability);
    }

    public static ToolMaterial addPickMaterial(int harvestLevel, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, -1, efficiency, damage - 3, enchantability);
    }

    public static ToolMaterial addSpadeMaterial(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, maxUses, efficiency, damage - 2, enchantability);
    }

    public static ToolMaterial addSpadeMaterial(int harvestLevel, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, -1, efficiency, damage - 2, enchantability);
    }

    public static ToolMaterial addShickMaterial(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, maxUses, efficiency, damage - 1, enchantability);
    }

    public static ToolMaterial addShickMaterial(int harvestLevel, float efficiency, float damage, int enchantability) {
        return EnumHelper.addEnum(ToolMaterial.class, "", harvestLevel, -1, efficiency, damage - 1, enchantability);
    }

    public static void removeCraftingRecipe(Item removed) {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

        for (int i = 0; i < recipes.size(); i++) {
            IRecipe tmpRecipe = (IRecipe) recipes.get(i);

            if (tmpRecipe instanceof ShapedRecipes) {
                ShapedRecipes recipe = (ShapedRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(removed), recipeResult)) {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(i) + " -> " + recipeResult);
                recipes.remove(i);
            }
        }
    }
    
    public static Item toItem(Block block){
        return Item.getItemFromBlock(block);
    }
}
