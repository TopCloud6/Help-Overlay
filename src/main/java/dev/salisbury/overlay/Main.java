package dev.salisbury.overlay;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(translate("&aHypixelHelpClone has been enabled."));
        getCommand("help").setExecutor(new HelpOverlay());
    }

    public static String translate(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }

}
