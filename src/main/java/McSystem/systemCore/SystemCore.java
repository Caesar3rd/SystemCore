package McSystem.systemCore;

import org.bukkit.plugin.java.JavaPlugin;

public final class  SystemCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("System Core has started!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("System Core has stopped!");
    }
}
