package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        DatabaseExecuterProxy adminProxy = new DatabaseExecuterProxy("Admin","Admin@123");

        adminProxy.executeQuery("DELETE");

        DatabaseExecuterProxy regularProxy = new DatabaseExecuterProxy("user","user");

        regularProxy.executeQuery("ADD");
        regularProxy.executeQuery("DELETE");
    }
}
