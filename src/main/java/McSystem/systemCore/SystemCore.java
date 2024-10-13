package McSystem.systemCore;
import McSystem.systemCore.Commands.Kill;
import McSystem.systemCore.Commands.godcommand;
import org.bukkit.plugin.java.JavaPlugin;



public final class SystemCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("System Core has started!");

        getCommand("kill").setExecutor(new Kill());
        getCommand("Godcommand").setExecutor(new godcommand());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("System Core has stopped!");
    }
}
