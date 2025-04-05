public class DatabaseConnection {
    private String name;

    //This is the lazy initialization + Double Locking
    private static DatabaseConnection connectionObject;

    private DatabaseConnection() {
        this.name = "MySQL";
    }

    public static DatabaseConnection getDatabaseConnection() {

        if(connectionObject == null)
        {
            synchronized(DatabaseConnection.class)
            {
                if(connectionObject == null)
                {
                    connectionObject = new DatabaseConnection();
                }
            }
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