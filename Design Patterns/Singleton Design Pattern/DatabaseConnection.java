public class DatabaseConnection {
    private String name;

    //This is the lazy initialization
    private static DatabaseConnection connectionObject;

    private DatabaseConnection() {
        this.name = "MySQL";
    }

    public static synchronized DatabaseConnection getDatabaseConnection() {

        // Here we are doing the lazy initialization
        if(connectionObject == null)
        {
            DatabaseConnection.connectionObject = new DatabaseConnection();
        }
        return connectionObject;
    }

    public String getDatabaseName() {
        return name;
    }

    public void connect() {
        System.out.println("Connecting to " + name + " database...");
    }
}