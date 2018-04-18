package exercise_8;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/4/16 0016
 * To change this template use File | Settings | File Templates.
 * Description:
 */
class Connection{
    private static int count = 0;
    private Connection() {
        System.out.println("Connection()");

    }
    public static Connection makeConnection() {
        count++;
        return  new Connection();
    }
    public static int howMany() {
        return count;
    }
    public String toString() {
        return "Connection" + count;
    }
}

public class ConnectionManager {
    static int left = 5;
    static Connection[] connections = new Connection[5];
    {
        for (Connection c : connections) {
            c = Connection.makeConnection();
        }
    }
    static Connection getConnction() {
        if (left > 0) {
            return connections[--left];
        } else {
            System.out.println("no connections");
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        System.out.println(connectionManager.left);
        connectionManager.getConnction();
        System.out.println(connectionManager.left);
        connectionManager.getConnction();
    }

}