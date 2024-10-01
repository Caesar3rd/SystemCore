package McSystem.systemCore;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class  SystemCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("System Core has started!");
    }

    @Override
    public  boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        // command: /die, it kills the player and send him a message
        if (command.getName().equalsIgnoreCase("die")) {
            Player p = (Player) sender;
            p.setHealth(0);
            sender.sendMessage("Hai usato i comandi per killarti!");
        }
            return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("System Core has stopped!");
    }
}
