package net.divinerpg;

import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.OverworldItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class DivineRPG {

	@Instance(Reference.MOD_ID)
	public static DivineRPG instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	//Awesome seed: 1414274842007233730
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.renderThings();
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
	
	/** The dimension renames:
	 * Dravite = Eden
	 * Azurite = The Wild Wood
	 * Uvite = Apalachia
	 * Mythril = Skythern
	 * Augite = Mortum
	 * Vethea = Vethea
	 * Iceika = Iceika
	 * Arcana = Dungen Of Arcana
	 **/
	
	/**REMINDERS OF THE UN-NAMED FUNC_^&!!)&_!**/
	//func_149672_a(); >> setMaterial();
	//func_149647_a(); >> setCreativeTab();
	//func_149663_c("") >> setUnlocalizedName();
	//IIconRegister >> IconRegister
	//IIcon >> Icon
	//func_149658_d("") >> setTexture("");
}