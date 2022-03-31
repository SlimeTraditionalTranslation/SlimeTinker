package io.github.sefiraat.slimetinker.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import io.github.sefiraat.slimetinker.items.Guide;
import io.github.sefiraat.slimetinker.items.templates.ArmourDefinition;
import io.github.sefiraat.slimetinker.items.templates.ToolDefinition;
import io.github.sefiraat.slimetinker.utils.Experience;
import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@CommandAlias("SlimeTinker|st|tinker")
public class Commands extends BaseCommand {

    @Default
    public void onDefault(CommandSender sender) {
        if (sender instanceof Player) {
            sender.sendMessage(ThemeUtils.ERROR + "請提供有效的子命令.");
        }
    }

    @Subcommand("AddExp")
    @CommandPermission("SlimeTinker.Admin")
    @CommandCompletion("<amount>")
    @Description("向手持物品增加經驗")
    public void tool(CommandSender sender, int amount) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemStack i = p.getInventory().getItemInMainHand();
            if (ItemUtils.isTool(i) || ItemUtils.isArmour(i)) {
                Experience.addExp(i, amount, p, false);
            }
        } else {
            sender.sendMessage(ThemeUtils.ERROR + "只有玩家才能執行這指令.");
        }
    }

    @Subcommand("GenerateItem")
    @CommandPermission("SlimeTinker.Admin")
    @Description("生成匠魂物品")
    public class GenerateItem extends BaseCommand {

        @Subcommand("Armour")
        @CommandCompletion("@ITEM_CLASS_ARMOUR @PART_MATERIALS_PLATE @PART_MATERIALS_GAMBESON @PART_MATERIALS_LINKS")
        @Description("使用指定的材料生成匠魂防具")
        public void armour(CommandSender sender, String type, String plateMat, String gambesonMat, String linksMat) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                ArmourDefinition armour = new ArmourDefinition(Ids.PLATE, type, plateMat, gambesonMat, linksMat);
                p.getInventory().addItem(Guide.HELM.getStack(armour));
            } else {
                sender.sendMessage(ThemeUtils.ERROR + "只有玩家才能執行這指令");
            }
        }

        @Subcommand("Tool")
        @CommandCompletion("@ITEM_CLASS_TOOL @PART_MATERIALS_HEAD @PART_MATERIALS_BINDER @PART_MATERIALS_ROD")
        @Description("使用指定的材料生成匠魂工具")
        public void tool(CommandSender sender, String type, String headMat, String binderMat, String rodMat) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                ToolDefinition tool = new ToolDefinition(Ids.HEAD, type, headMat, binderMat, rodMat);
                if (ItemUtils.isToolExplosive(headMat, rodMat)) {
                    p.getInventory().addItem(Guide.EXP_SHOVEL.getStack(tool));
                } else {
                    p.getInventory().addItem(Guide.SHOVEL.getStack(tool));
                }
            } else {
                sender.sendMessage(ThemeUtils.ERROR + "只有玩家才能執行這指令");
            }
        }

    }

}
