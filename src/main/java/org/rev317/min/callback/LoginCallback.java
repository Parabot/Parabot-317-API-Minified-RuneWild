package org.rev317.min.callback;

import org.rev317.min.api.events.LoginEvent;
import org.rev317.min.script.ScriptEngine;

public class LoginCallback {

    public static void onLoginHook(String username, String password, boolean flag) {
        final LoginEvent loginEvent = new LoginEvent(username, password, flag);
        ScriptEngine.getInstance().dispatch(loginEvent);
    }
}
