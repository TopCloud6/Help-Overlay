package dev.salisbury.overlay;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static dev.salisbury.overlay.Main.translate;

public class HelpOverlay implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(translate("&cThis command can only be executed by players."));
        } else {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("help")) {
                TextComponent link1 = new TextComponent(translate("   &d* &bExample Link 1"));
                link1.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://google.com"));

                TextComponent link2 = new TextComponent(translate("   &d* &bExample Link 2"));
                link2.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://google.com"));

                TextComponent link3 = new TextComponent(translate("   &d* &bExample Link 3"));
                link3.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://google.com"));

                p.sendRawMessage(translate("&e&lUSEFUL LINKS"));
                p.sendRawMessage(translate("&eHere are some useful links:"));
                p.sendRawMessage("");
                p.spigot().sendMessage(link1);
                p.spigot().sendMessage(link2);
                p.spigot().sendMessage(link3);
                p.sendRawMessage("");
                p.sendRawMessage(translate("&eStill need further help? Contact us &f@ &ediscord.gg/example"));

            }
        }
        return false;
    }


}
