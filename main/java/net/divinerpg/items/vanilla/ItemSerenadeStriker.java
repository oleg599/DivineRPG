package net.divinerpg.items.vanilla;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemSerenadeStriker extends ItemMod {
	
	public ItemSerenadeStriker(){
		setCreativeTab(DivineRPGTabs.tools);
		LangRegistry.addItem(this);
		setMaxDamage(100);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		final double eyeHeight = 1.62;
		final double reachDistance = 300;
		Vec3 startPos = player.getPosition(1.0F);
		if (!world.isRemote) startPos = startPos.addVector(0, eyeHeight, 0);
		Vec3 look = player.getLook(1.0F);
		Vec3 endPos = startPos.addVector(look.xCoord * reachDistance, look.yCoord * reachDistance, look.zCoord * reachDistance);
		MovingObjectPosition rarTrace = world.rayTraceBlocks(startPos, endPos);

		if (rarTrace != null && rarTrace.typeOfHit == MovingObjectType.BLOCK) {
			int x = rarTrace.blockX;
			int y = rarTrace.blockY;
			int z = rarTrace.blockZ;

			world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
			world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
			world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
			
			//idk how to make this take up less code
			world.setBlock(x, y, z, Blocks.air);
			world.setBlock(x+1, y, z, Blocks.air);
			world.setBlock(x-1, y, z, Blocks.air);
			world.setBlock(x, y, z-1, Blocks.air);
			world.setBlock(x, y, z+1, Blocks.air);
			world.setBlock(x-1, y, z-1, Blocks.air);
			world.setBlock(x-1, y, z+1, Blocks.air);
			world.setBlock(x+1, y, z-1, Blocks.air);
			world.setBlock(x+1, y, z+1, Blocks.air);
			//Lightning is enough sound.
		}
		return stack;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		infoList.add("Strikes lightning where you are looking");
		infoList.add("WARNING: Destroys blocks");
	}
}
