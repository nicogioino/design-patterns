package proxy;

public class DatabaseExecuterImpl implements DatabaseExecuter {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}
