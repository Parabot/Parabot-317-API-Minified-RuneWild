package org.rev317.min.api.events.listeners;

import org.rev317.min.api.events.LoginEvent;

public interface LoginListener {

    void loginReceived(LoginEvent event);
}
