package org.rev317.min.randoms;

import org.parabot.core.Context;
import org.parabot.environment.randoms.Random;
import org.parabot.environment.randoms.RandomType;
import org.rev317.min.api.events.LoginEvent;
import org.rev317.min.api.events.listeners.LoginListener;
import org.parabot.core.reflect.RefClass;

import java.util.List;

public class UUIDSpoofer implements LoginListener {

    @Override
    public void loginReceived(LoginEvent event) {
        /*
         * This could probably be done much better, but this is one of my very few
         * commits. I read through the ASM docs, but wasn't 100% sure if the refField
         * desc would be in the exact same format as ASM. This should fix the login
         * issue for RuneWild though.
         *
         * private boolean loggingIn;
         *      This is just a flag which needs to be set before sending
         *      the login frames to the Stream; false means we are logged out and
         *      can log in.
         *
         * public String myEmail;
         *      This is kept separate to the String parameter that's passed to
         *      the Client's login() function. I'm guessing it's so that their
         *      remember me login details works.
         */
        RefClass clientRef = new RefClass(Context.getInstance().getClass(), Context.getInstance().getClient());
        clientRef.getField("loggingIn").setBoolean(false);
        clientRef.getField("myEmail").setString(event.getUsername());

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