package McSystem.systemCore.Commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class godcommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull org.bukkit.command.CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String label, String[] args) {

        if (sender instanceof Player p) {

            if (p.isInvulnerable()) {
                p.setInvulnerable(false);
                p.sendMessage("Non sei più invulnerabile");
            } else {
                p.setInvulnerable(true);
                p.sendMessage("Sei invulnerabile");

            }

        }
        return true;
    }
}