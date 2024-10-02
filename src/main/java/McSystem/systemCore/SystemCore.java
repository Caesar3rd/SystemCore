package McSystem.systemCore;

import org.bukkit.command.ConsoleCommandSender;
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
        // command: /kill, it kills the player and send him a message
        if (command.getName().equalsIgnoreCase("kill")) {
            Player p = (Player) sender;
            p.setHealth(0);
            sender.sendMessage("Hai usato i comandi per killarti!");
        }else if(sender instanceof ConsoleCommandSender){
            System.out.println("The command was runned by Console");
        };
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("System Core has stopped!");
    }
}
