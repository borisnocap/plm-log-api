package ru.plm.log;

import org.bukkit.plugin.Plugin;

@SuppressWarnings("unused")
public interface LogAPI {

    void info(Plugin plugin, String message);

    void info(Plugin plugin, String message, Object arg1);

    void info(Plugin plugin, String message, Object arg1, Object arg2);

    void info(Plugin plugin, String message, Object... args);

    void warn(Plugin plugin, String message);

    void warn(Plugin plugin, String message, Object arg1);

    void warn(Plugin plugin, String message, Object arg1, Object arg2);

    void warn(Plugin plugin, String message, Object... args);
}
