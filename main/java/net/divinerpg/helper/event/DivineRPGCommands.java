package net.divinerpg.helper.event;

import java.util.List;

import net.divinerpg.dimension.gen.arcana.TeleporterArcana;
import net.divinerpg.dimension.gen.twilight.eden.TeleporterEden;
import net.divinerpg.dimension.gen.twilight.wild_woods.TeleporterWildWoods;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class DivineRPGCommands extends CommandBase{

	@Override
	public String getCommandName() {
		return "DivineRPG";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/DivineRPG <var1> <dimension>";
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		EntityPlayerMP playerMP = (EntityPlayerMP)var1;
		if(!playerMP.worldObj.isRemote){
			if (var2[0].equalsIgnoreCase("Eden")) {
				if (playerMP.dimension != ConfigurationHelper.eden) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.eden, new TeleporterEden(playerMP.mcServer.worldServerForDimension(ConfigurationHelper.eden)));
				}
			}

			if (var2[0].equalsIgnoreCase("WildWoods")) {
				if (playerMP.dimension != ConfigurationHelper.wildWoods) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.eden, new TeleporterWildWoods(playerMP.mcServer.worldServerForDimension(ConfigurationHelper.wildWoods)));
				}
			}
			
			if (var2[0].equalsIgnoreCase("Arcana")) {
				if (playerMP.dimension != ConfigurationHelper.arcana) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.arcana, new TeleporterArcana(playerMP.mcServer.worldServerForDimension(ConfigurationHelper.arcana)));
				}
			}
		}
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 1;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2) {
		return par2.length == 1 ? getListOfStringsMatchingLastWord(par2, new String[] {"Eden", "WildWoods"}) : null;
	}
}