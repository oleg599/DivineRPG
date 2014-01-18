package net.divinerpg.api.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemModBow extends ItemBow {
    
	public static final int DEFAULT_MAX_USE_DURACTION = 72000;
    @SideOnly(Side.CLIENT)
    private IIcon[] IIconArray;
	String name;
	int damage;
	int maxUseDuraction;
	boolean unbreakable;
	
	Item arrow;
	
	public ItemModBow(int uses, int damage, boolean unbreakable, Item arrow) {
		this(uses, damage, DEFAULT_MAX_USE_DURACTION, unbreakable, arrow);
	}
	
	public ItemModBow(int uses, int damage, int maxUseDuraction, boolean unbreakable, Item arrow) {
		super();
		setMaxDamage(uses);
		this.arrow = arrow;
		this.damage = damage;
		this.maxUseDuraction = maxUseDuraction;
		this.unbreakable = unbreakable;
        this.maxStackSize = 1;
		this.setCreativeTab(DivineRPGTabs.ranged);
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister icon)
    {
        String prefix = Reference.MOD_ID + ":" + this.name;
        this.itemIcon = icon.registerIcon(prefix + "Bow_0");
        this.IIconArray = new IIcon[3];

        this.IIconArray[0] = icon.registerIcon(prefix + "Bow_1");
        this.IIconArray[1] = icon.registerIcon(prefix + "Bow_2");
        this.IIconArray[2] = icon.registerIcon(prefix + "Bow_3");
    }    
    
    public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
	
	   public Item setName(String name){
	        this.name = name;
	        setTextureName(name);
	        setUnlocalizedName(name);
	        register();
	        return this;
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
	        GameRegistry.registerItem(this, name);
	        LanguageRegistry.addName(this, finalName);
	    }
    
    @SideOnly(Side.CLIENT)
    @Override
    /**
     * used to cycle through IIcons based on their used duration, i.e. for the bow
     */
    public IIcon getItemIconForUseDuration(int par1)
    {
        return this.IIconArray[par1];
    }
	
	@Override
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
        int j = getMaxItemUseDuration(par1ItemStack) - par4;

        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return;
        j = event.charge;

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.func_146028_b(arrow)){
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;
            
            if ((double)f < 0.1D)
                return;

            if (f > 1.0F)
                f = 1.0F;

            EntityArrow entityarrow = spawnArrow(par1ItemStack, par2World, par3EntityPlayer, f * 2F);

            if (f == 1.0F)
                entityarrow.setIsCritical(true);

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (k > 0)
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (l > 0)
                entityarrow.setKnockbackStrength(l);

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
                entityarrow.setFire(100);

            if(!unbreakable)
            	par1ItemStack.damageItem(1, par3EntityPlayer);
            if(sound(par1ItemStack, par2World, par3EntityPlayer) != null)
            	par2World.playSoundAtEntity(par3EntityPlayer, sound(par1ItemStack, par2World, par3EntityPlayer), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
                entityarrow.canBePickedUp = 2;
            else par3EntityPlayer.inventory.func_146026_a(arrow);

            if (!par2World.isRemote)
                par2World.spawnEntityInWorld(entityarrow);
        }
    }
	
	public EntityArrow spawnArrow(ItemStack stack, World world, EntityPlayer player, float time) {
		return new EntityArrow(world, player, time);
	}
	
	public String sound(ItemStack stack, World world, EntityPlayer player) {
		return "random.bow";
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return maxUseDuraction;
	}
	
	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}
	
	/*@Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(damage + " Ranged Damage");
        double speed = (double) DEFAULT_MAX_USE_DURACTION / (double) getMaxItemUseDuration(par1ItemStack);
        if(speed > 1)
        	par3List.add(speed + " Times Faster");
        if(speed < 1)
        	par3List.add((1 / speed) + " Times Slower");
        par3List.add(!unbreakable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
    }*/
	
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        ArrowNockEvent var4 = new ArrowNockEvent(var3, var1);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.isCanceled())
        {
            return var4.result;
        }
        else
        {
            if (var3.capabilities.isCreativeMode || var3.inventory.func_146028_b(getItem()))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }
    
    public Item getItem(){
    	return arrow;
    }
}
