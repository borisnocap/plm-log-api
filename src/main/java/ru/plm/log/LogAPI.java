package ru.plm.log;

import org.bukkit.plugin.Plugin;

@SuppressWarnings("unused")
public interface LogAPI {

    void info(Plugin plugin, String message);

    void info(Plugin plugin, String message, Object... args);

    void error(Plugin plugin, String message);

    void error(Plugin plugin, String message, Object... args);
}
