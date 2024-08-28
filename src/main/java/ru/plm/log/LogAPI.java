package ru.plm.log;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

@SuppressWarnings("unused")
public interface LogAPI {

    void command(Plugin plugin, Player player, String command);

    void info(Plugin plugin, String message);

    void info(Plugin plugin, String message, Object... args);

    void error(Plugin plugin, String message);

    void error(Plugin plugin, String message, Object... args);
}
