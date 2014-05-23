package net.divinerpg.helper.event;

import java.util.Random;

import net.divinerpg.blocks.twilight.TwilightBlock;
import net.divinerpg.client.ArcanaHelper;
import net.divinerpg.dimension.gen.iceika.TeleporterIceika;
import net.divinerpg.entity.vanilla.projectile.EntityScythe;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.ArcanaItems;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.TwilightItemsArmor;
import net.divinerpg.helper.items.VanillaItemsArmor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventArmorFullSet {

	private float flyTemp;

	private Item boots = null;
	private Item body = null;
	private Item legs = null;
	private Item helmet = null;

	public static final String[] isImmuneToFire	= new String[] {"ag","field_70178_ae", "isImmuneToFire"};
	public static final String[] isJumping 		= new String[] {"bd","field_70703_bu", "isJumping"};

	private VanillaItemsArmor v;
	private TwilightItemsArmor t;
	private World world;

	@SubscribeEvent
	public void onPlayerHurtEvent(LivingHurtEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)e.entity;

			ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			ItemStack stackBody = player.inventory.armorItemInSlot(2);
			ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			if(stackBoots != null)
				boots = stackBoots.getItem();
			else
				boots = null;

			if(stackBody != null)
				body = stackBody.getItem();
			else
				body = null;

			if(stackLegs != null) 
				legs = stackLegs.getItem();
			else
				legs = null;

			if(stackHelmet != null) 
				helmet = stackHelmet.getItem();
			else
				helmet = null;

			DamageSource s = e.source;
			System.out.println(e.ammount);

			//Ender and Bedrock
			if ((boots == v.enderBoots && legs == v.enderLegs && body == v.enderBody && helmet == v.enderHelmet) || (boots == v.bedrockBoots && legs == v.bedrockLegs && body == v.bedrockBody && helmet == v.bedrockHelmet)) {
				if (s.isExplosion()) {
					e.setCanceled(true);
				}
			}

			//Arlemite
			if (boots == v.arlemiteBoots && legs == v.arlemiteLegs && body == v.arlemiteBody && helmet == v.arlemiteHelmet) {
				if (s.isProjectile() || s.damageType.equals("thrown")) {
					e.ammount *= 0.4;
				}
			}

			//Rupee
			if (boots == v.rupeeBoots && legs == v.rupeeLegs && body == v.rupeeBody && helmet == v.rupeeHelmet) {
				if ((s.damageType.equals("mob")) && !s.isProjectile()) {
					e.ammount *= 0.4;
				}
			}

			//Santa
			if (boots == IceikaItems.santaBoots && legs == IceikaItems.santaLegs && body == IceikaItems.santaBody && helmet == IceikaItems.santaHead) {
				if (e.entityLiving.worldObj.provider.dimensionId == ConfigurationHelper.iceika) {
					e.ammount *= 0.2;
				}
			}

			//Divine

			/*//Degraded Melee
			else if (helmet == DivineRPG.degradedHelmetMelee)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.degradedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.degradedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.degradedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//Degraded Ranged
			else if (helmet == DivineRPG.degradedHelmetRanged)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.degradedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.degradedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.degradedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//Degraded Arcana
			else if (helmet == DivineRPG.degradedHelmetArcana)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.degradedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.degradedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.degradedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//glistening Melee
			else if (helmet == DivineRPG.glisteningHelmetMelee)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.glisteningChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.glisteningLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.glisteningBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//glistening Ranged
			else if (helmet == DivineRPG.glisteningHelmetRanged)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.glisteningChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.glisteningLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.glisteningBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//glistening Arcana
			else if (helmet == DivineRPG.glisteningHelmetArcana)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.glisteningChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.glisteningLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.glisteningBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//finished Melee
			else if (helmet == DivineRPG.finishedHelmetMelee)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.finishedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.finishedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.finishedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//finished Ranged
			else if (helmet == DivineRPG.finishedHelmetRanged)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.finishedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.finishedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.finishedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//finished Arcana
			else if (helmet == DivineRPG.finishedHelmetArcana)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.finishedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.finishedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.finishedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//demonized Melee
			else if (helmet == DivineRPG.demonizedHelmetMelee)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.demonizedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.demonizedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.demonizedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//demonized Ranged
			else if (helmet == DivineRPG.demonizedHelmetRanged)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.demonizedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.demonizedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.demonizedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//demonized Arcana
			else if (helmet == DivineRPG.demonizedHelmetArcana)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.demonizedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.demonizedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.demonizedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//tormented Melee
			else if (helmet == DivineRPG.tormentedHelmetMelee)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.tormentedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.tormentedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.tormentedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//tormented Ranged
			else if (helmet == DivineRPG.tormentedHelmetRanged)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.tormentedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.tormentedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.tormentedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

			//tormented Arcana
			else if (helmet == DivineRPG.tormentedHelmetArcana)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (body == DivineRPG.tormentedChest)
					{
						a += 0.15 * 0.4;
					}
					if (legs == DivineRPG.tormentedLegs)
					{
						a += 0.15 * 0.3;
					}
					if (boots == DivineRPG.tormentedBoots)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}
		}*/
		}
	}

	@SubscribeEvent
	public void onTickEvent(PlayerTickEvent ev) {
		world = ev.player.worldObj;
		ItemStack stackBoots = ev.player.inventory.armorItemInSlot(0);
		ItemStack stackLegs = ev.player.inventory.armorItemInSlot(1);
		ItemStack stackBody = ev.player.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = ev.player.inventory.armorItemInSlot(3);

		if(stackBoots != null)
			boots = stackBoots.getItem();
		else
			boots = null;

		if(stackBody != null)
			body = stackBody.getItem();
		else
			body = null;

		if(stackLegs != null) 
			legs = stackLegs.getItem();
		else
			legs = null;

		if(stackHelmet != null) 
			helmet = stackHelmet.getItem();
		else
			helmet = null;

		if (boots == v.angelicBoots && body == v.angelicBody && legs == v.angelicLegs && helmet == v.angelicHelmet){
			if(ev.player.capabilities.isFlying){
				ArcanaHelper.removeBarValue(1);
			}
			if(ArcanaHelper.getBarValue() >= 0){
				ev.player.capabilities.allowFlying = true;
			} else {
				ev.player.capabilities.isFlying = false;
			}
			ev.player.fallDistance = -0.5F;
		}

		//Elite Realmite
		if(boots == v.eliteRealmiteBoots && body == v.eliteRealmiteBody && legs == v.eliteRealmiteLegs && helmet == v.eliteRealmiteHelmet){
			ev.player.fallDistance = -0.5F;
		}

		//Divine
		if(boots == v.divineBoots && body == v.divineBody && legs == v.divineLegs && helmet == v.divineHelmet){
			ev.player.fallDistance = -0.5F;
		}

		//Wildwood
		if(boots == t.wildwoodBoots && body == t.wildwoodBody && legs == t.wildwoodLegs && helmet == t.wildwoodHelmet){
			if (ev.player.isInsideOfMaterial(Material.water)) {
				float current = ev.player.getHealth();
				if ((current > 0.0F) && (current < 20.0F)) {
					ev.player.setHealth(current + 0.1F);
				}
			}
		}

		//Vemos
		if(boots == ArcanaItems.vemosBoots && body == ArcanaItems.vemosBody && legs == ArcanaItems.vemosLegs && helmet == ArcanaItems.vemosHelmet){
			float current = ev.player.getHealth();
			if ((current > 0.0F) && (current < 20.0F)) {
				ev.player.setHealth(current + 0.1F);
			}
		}

		//Mortum
		if(boots == t.mortumBoots && body == t.mortumBody && legs == t.mortumLegs && helmet == t.mortumHelmet){
			boolean light = world.getBlockLightValue((int)ev.player.posX, (int)ev.player.posY, (int)ev.player.posZ) < 7;
			if (light) {
				ev.player.addPotionEffect(new PotionEffect(16, 210, 10)); //The 210 is necessary
				//TODO Render a duplicate of what the potion does, instead of adding the potion
			}
		}

		//Skythern
		if(boots == t.skythernBoots && body == t.skythernBody && legs == t.skythernLegs && helmet == t.skythernHelmet){
			ev.player.fallDistance = -0.5F;
		}

		//Netherite, Inferno, and Bedrock
		if ((boots == v.netheriteBoots && legs == v.netheriteLegs && body == v.netheriteBody && helmet == v.netheriteHelmet) || (boots == v.infernoBoots && legs == v.infernoLegs && body == v.infernoBody && helmet == v.infernoHelmet) || (boots == v.bedrockBoots && legs == v.bedrockLegs && body == v.bedrockBody && helmet == v.bedrockHelmet)) {
			ObfuscationReflectionHelper.setPrivateValue(Entity.class, ev.player, true, isImmuneToFire);
		}
		else {
			ObfuscationReflectionHelper.setPrivateValue(Entity.class, ev.player, false, isImmuneToFire);
		}

		if(boots == v.aquastriveBoots && body == v.aquastriveBody && legs == v.aquastriveLegs && helmet == v.aquastriveHelmet){
			float speed = 1.1F;
			boolean isJumping = false;
			isJumping = (Boolean)ObfuscationReflectionHelper.getPrivateValue(EntityLivingBase.class, ev.player, this.isJumping);

			if(ev.player.isInWater()) {
				if(!ev.player.isSneaking() && !isJumping) {
					if(ev.player.motionX > -speed && ev.player.motionX < speed) {
						ev.player.motionX *= speed;
						ev.player.motionY = 0F;
					}
					if(ev.player.motionZ > -speed && ev.player.motionZ < speed) {
						ev.player.motionZ *= speed;
						ev.player.motionY = 0F;
					}
				}
				if (isJumping || ev.player.isSneaking()) {
					ev.player.motionY *= speed;
					if(ev.player.motionX > -speed && ev.player.motionX < speed) {
						ev.player.motionX *= speed;
					}
					if(ev.player.motionZ > -speed && ev.player.motionZ < speed) {
						ev.player.motionZ *= speed;
					}
				}
			}
		}

		//Shadow
		if(boots == v.shadowBoots && body == v.shadowBody && legs == v.shadowLegs && helmet == v.shadowHelmet){
			ev.player.addPotionEffect(new PotionEffect(1, -1, 1));
		}

		//Skeleman
		if(boots == v.skelemanBoots && body == v.skelemanBody && legs == v.skelemanLegs && helmet == v.skelemanHelmet){
			if(ev.player.getFoodStats().needFood()) {
				ev.player.getFoodStats().addStats(1, 0);
			}
		}

		//Santa
		if(boots == IceikaItems.santaBoots && body == IceikaItems.santaBody && legs == IceikaItems.santaLegs && helmet == IceikaItems.santaHead){
			if (ev.player.worldObj.provider.dimensionId == ConfigurationHelper.iceika) {
				if(ev.player.getFoodStats().needFood()) {
					ev.player.getFoodStats().addStats(1, 0);
				}
				ev.player.addPotionEffect(new PotionEffect(1, -1, 1));
			}
		}

		//Jack O Man
		if(boots == v.jackOManBoots && body == v.jackOManBody && legs == v.jackOManLegs && helmet == v.jackOManHelmet){
			EntityScythe.damage = 16.0F;
		}
		else if (!(EntityScythe.damage == 4.0F)) {
			EntityScythe.damage = 4.0F;
		}
	}  

	@SubscribeEvent
	public void onJump(LivingJumpEvent ev) {
		if (ev.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)ev.entityLiving;
			ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			ItemStack stackBody = player.inventory.armorItemInSlot(2);
			ItemStack stackHelmet = player.inventory.armorItemInSlot(3);


			if(stackBoots != null)
				boots = stackBoots.getItem();
			else
				boots = null;

			if(stackBody != null)
				body = stackBody.getItem();
			else
				body = null;

			if(stackLegs != null) 
				legs = stackLegs.getItem();
			else
				legs = null;

			if(stackHelmet != null) 
				helmet = stackHelmet.getItem();
			else
				helmet = null;

			//Divine
			if(boots == v.divineBoots && body == v.divineBody && legs == v.divineLegs && helmet == v.divineHelmet){
				player.addVelocity(0, 0.2D, 0);
			}

			//Skythern
			if(boots == t.skythernBoots && body == t.skythernBody && legs == t.skythernLegs && helmet == t.skythernHelmet){
				player.addVelocity(0, 0.5D, 0);
			}

		}
	}

	@SubscribeEvent
	public void onInteractEvent(PlayerInteractEvent ev) {
		ItemStack stackBoots = ev.entityPlayer.inventory.armorItemInSlot(0);
		ItemStack stackLegs = ev.entityPlayer.inventory.armorItemInSlot(1);
		ItemStack stackBody = ev.entityPlayer.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = ev.entityPlayer.inventory.armorItemInSlot(3);

		if(stackBoots != null)
			boots = stackBoots.getItem();
		else
			boots = null;

		if(stackBody != null)
			body = stackBody.getItem();
		else
			body = null;

		if(stackLegs != null) 
			legs = stackLegs.getItem();
		else
			legs = null;

		if(stackHelmet != null) 
			helmet = stackHelmet.getItem();
		else
			helmet = null;

		//Eden
		if(boots == t.edenBoots && body == t.edenBody && legs == t.edenLegs && helmet == t.edenHelmet){
			Random rand = new Random();
			TwilightBlock.edenArmor = rand.nextInt(3) + 3;
		} else {
			TwilightBlock.edenArmor = 1;
		}
	}

	@SubscribeEvent
	public void onPlayerAttackEvent(LivingAttackEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)e.entity;

			ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			ItemStack stackBody = player.inventory.armorItemInSlot(2);
			ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			if(stackBoots != null)
				boots = stackBoots.getItem();
			else
				boots = null;

			if(stackBody != null)
				body = stackBody.getItem();
			else
				body = null;

			if(stackLegs != null) 
				legs = stackLegs.getItem();
			else
				legs = null;

			if(stackHelmet != null) 
				helmet = stackHelmet.getItem();
			else
				helmet = null;

			DamageSource s = e.source;

			//Kraken and Aquastrive
			if((boots == v.aquastriveBoots && body == v.aquastriveBody && legs == v.aquastriveLegs && helmet == v.aquastriveHelmet) || (boots == v.krakenBoots && body == v.krakenBody && legs == v.krakenLegs && helmet == v.krakenHelmet)) {
				if (s.equals(DamageSource.drown)) {
					e.setCanceled(true);
				}
			}

			//Uvite
			if (boots == TwilightItemsArmor.apalachiaBoots && legs == TwilightItemsArmor.apalachiaLegs && body == TwilightItemsArmor.apalachiaBody && helmet == TwilightItemsArmor.apalachiaHelmet) {
				if (s.equals(DamageSource.cactus) || s.equals(DamageSource.fallingBlock) || s.equals(DamageSource.anvil) || s.equals(DamageSource.inWall)) {
					e.setCanceled(true);
				}
			}

			//Wither Reaper
			if (boots == v.witherReaperBoots && legs == v.witherReaperLegs && body == v.witherReaperBody && helmet == v.witherReaperHelmet) {
				if (s.equals(DamageSource.wither)) {
					e.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent
	public void onLivingHurtEvent(LivingHurtEvent e) {
		if(e.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)e.entity;

			ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			ItemStack stackBody = player.inventory.armorItemInSlot(2);
			ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			if(stackBoots != null)
				boots = stackBoots.getItem();
			else
				boots = null;

			if(stackBody != null)
				body = stackBody.getItem();
			else
				body = null;

			if(stackLegs != null) 
				legs = stackLegs.getItem();
			else
				legs = null;

			if(stackHelmet != null) 
				helmet = stackHelmet.getItem();
			else
				helmet = null;
		}

		if(!(e.entity instanceof EntityPlayer)) {
			DamageSource s = e.source;

			//Santa
			if(boots == IceikaItems.santaBoots && body == IceikaItems.santaBody && legs == IceikaItems.santaLegs && helmet == IceikaItems.santaHead){
				if ((e.entityLiving.worldObj.provider.dimensionId == ConfigurationHelper.iceika) && ((s.getEntity() instanceof EntityPlayer) && !s.isProjectile())) {
					e.ammount += 6;
				}
			}

			//Halite
			if (boots == t.haliteBoots && legs == t.haliteLegs && body == t.haliteBody && helmet == t.haliteHelmet) {
				if ((s.getEntity() instanceof EntityPlayer) && !s.isProjectile()) {
					e.ammount += 24;
				}
			}
		}
	}
}