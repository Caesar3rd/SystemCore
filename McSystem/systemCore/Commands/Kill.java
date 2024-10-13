package McSystem.systemCore.Commands;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class Kill implements CommandExecutor {


    public boolean onCommand(@NotNull org.bukkit.command.CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String label, String[] args) {
        // command: /kill, it kills the player and send him a message
        if (command.getName().equalsIgnoreCase("kill")) {
            Player p = (Player) sender;
            p.setHealth(0);
            sender.sendMessage("Hai usato i comandi per killarti!");
        }
        return true;
    }
}