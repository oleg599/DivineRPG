package net.divinerpg.helper.event;

import java.util.List;

import net.divinerpg.api.worldgen.DivineTeleporter;
import net.divinerpg.dimension.gen.arcana.TeleporterArcana;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class DivineRPGCommands extends CommandBase {

    @Override
    public String getCommandName() {
        return "DivineRPG";
    }

    @Override
    public String getCommandUsage(ICommandSender cmdSender) {
        return "/DivineRPG <var1> <dimension>";
    }

    @Override
    public void processCommand(ICommandSender cmdSender, String[] args) {
        EntityPlayerMP playerMP = (EntityPlayerMP) cmdSender;
        if (!playerMP.worldObj.isRemote) {
            if (args[0].equalsIgnoreCase("Eden")) {
                if (playerMP.dimension != ConfigurationHelper.eden) {
                    playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.eden,
                            new DivineTeleporter(playerMP.mcServer.worldServerForDimension(ConfigurationHelper.eden), ConfigurationHelper.eden,
                                    TwilightBlocks.edenPortal, VanillaBlocks.divineRock));
                }
            }

            if (args[0].equalsIgnoreCase("WildWoods")) {
                if (playerMP.dimension != ConfigurationHelper.wildWoods) {
                    playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.eden,
                            new DivineTeleporter(playerMP.mcServer.worldServerForDimension(ConfigurationHelper.wildWoods), ConfigurationHelper.wildWoods,
                                    TwilightBlocks.wildWoodPortal, TwilightBlocks.edenBlock));
                }
            }

            if (args[0].equalsIgnoreCase("Arcana")) {
                if (playerMP.dimension != ConfigurationHelper.arcana) {
                    playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.arcana,
                            new TeleporterArcana(playerMP.mcServer.worldServerForDimension(ConfigurationHelper.arcana)));
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
        return par2.length == 1 ? getListOfStringsMatchingLastWord(par2, new String[] { "Eden", "WildWoods" }) : null;
    }
}
