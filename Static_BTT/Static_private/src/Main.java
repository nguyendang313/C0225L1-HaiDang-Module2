public class Main {
    public static void main(String[] args) {
        UserSession us1 = new UserSession();
        UserSession us2 = new UserSession();
        UserSession us3 = new UserSession();

        System.out.println("Số người dùng online sau khi đăng nhập: " + UserSession.getOnlineCount());

        us1.logout();

        System.out.println("Số người dùng online sau khi có người dùng đăng xuất: " + UserSession.getOnlineCount());
    }
}
class UserSession {
    private static int onlineCount;
    public UserSession() {
        onlineCount++;
    }
    public void logout() {
        if (onlineCount > 0) {
            onlineCount--;
        }
    }
    public static int getOnlineCount() {
        return onlineCount;
    }
}