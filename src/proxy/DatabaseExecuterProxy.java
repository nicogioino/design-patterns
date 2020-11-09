package proxy;

public class DatabaseExecuterProxy implements DatabaseExecuter{
    boolean isAdmin;
    DatabaseExecuterImpl databaseExecuter;

    public DatabaseExecuterProxy(String name, String password) {
        isAdmin = name.equals("Admin") && password.equals("Admin@123");
        databaseExecuter = new DatabaseExecuterImpl();
    }

    @Override
    public void executeQuery(String query) {
        if (isAdmin)
            databaseExecuter.executeQuery(query);
        else {
            if (query.equals("DELETE")) System.out.println("DELETE NOT ALLOWED");
            else databaseExecuter.executeQuery(query);
        }
    }
}
