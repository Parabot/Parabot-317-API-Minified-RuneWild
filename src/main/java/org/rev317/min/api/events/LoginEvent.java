package org.rev317.min.api.events;

public final class LoginEvent {
    private final String  username;
    private final String  password;
    private final boolean flag;

    public LoginEvent(String username, String password, boolean flag) {
        this.username = username;
        this.password = password;
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isFlag() {
        return flag;
    }
}
