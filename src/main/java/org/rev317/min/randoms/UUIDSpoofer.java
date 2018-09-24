package org.rev317.min.randoms;

import org.parabot.core.Context;
import org.parabot.environment.randoms.Random;
import org.parabot.environment.randoms.RandomType;
import org.rev317.min.api.events.LoginEvent;
import org.rev317.min.api.events.listeners.LoginListener;

import java.util.List;

public class UUIDSpoofer implements LoginListener {

    @Override
    public void loginReceived(LoginEvent event) {
        List<Random> randoms = Context.getInstance().getRandomHandler().getRandoms();
        for (Random random : randoms) {
            if (random.getRandomType().equals(RandomType.ON_SERVER_START)) {
                if (random.getName().equals("Mac Address Fix") && random.getServer().equals("RuneWild")) {
                    if (random.activate()) {
                        random.execute();
                    }
                }
            }
        }
    }
}
