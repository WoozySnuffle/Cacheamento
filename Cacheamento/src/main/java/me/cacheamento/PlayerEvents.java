package me.cacheamento;

import me.cacheamento.objects.User;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import static me.cacheamento.Cacheamento.*;

public class PlayerEvents implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        getInstance().getUserManager().addUser(new User(e.getPlayer().getName(), "mceicanogmac@gmail.com"));

    }

}
