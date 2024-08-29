package ru.plm.log;

import org.bukkit.plugin.Plugin;

@SuppressWarnings("unused")
public interface LogAPI {

    void monitor(Plugin plugin, String message);

    void monitor(Plugin plugin, String message, Object... args);

    void info(Plugin plugin, String message);

    void info(Plugin plugin, String message, Object... args);

    void warning(Plugin plugin, String message);

    void warning(Plugin plugin, String message, Object... args);

    void warning(Plugin plugin, Throwable thrown, String message);

    void warning(Plugin plugin, Throwable thrown, String message, Object... args);
}
