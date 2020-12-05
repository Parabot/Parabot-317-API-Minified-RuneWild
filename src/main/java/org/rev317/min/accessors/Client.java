package org.rev317.min.accessors;

/**
 * // Customized code is on line 56 (replaced #doAction with #performAction)
 */
public interface Client {

    Scene getScene();

    Player getMyPlayer();

    Interface[] getInterfaceCache();

    Npc[] getNpcs();

    Player[] getPlayers();

    int getOpenInterfaceId();

    int getBaseX();

    int getBaseY();

    void setInterface(int id);

    void setAmountOrNameInput(int amount);

    int[] getCurrentExp();

    Deque[][][] getGroundItems();

    int getLoopCycle();

    int getBackDialogId();

    int getPlane();

    int[] getMenuActionId();

    long[] getMenuHash();

    int[] getMenuAction1();

    int[] getMenuAction2();

    int[] getMenuAction3();

    int[] getMenuAction4();

    CollisionMap[] getCollisionMap();

    boolean walkTo(int clickType, int sizeX, int sizeY, int startX, int startY, int destX, int destY, int type, int face, boolean arbitrary, int rotation);

    boolean walkToPKH(boolean flag1, boolean flag2, int clickType, int sizeX, int sizeY, int startX, int startY, int destX, int destY, int type, int face, boolean arbitrary, int rotation);

    // Replacement for doAction, as this method already exists
    // void doAction(int i);
    void performAction(int i);

    void dropClient();

    void login(boolean reconnecting, String emailAddress, String username, String password);

    int[] getCurrentStats();

    int[] getSettings();

    boolean isLoggedIn();

    int getInputDialogState();

    long[] getFriendsListAsLong();

    void addFriend(long id);

    void deleteFriend(long id);
}
