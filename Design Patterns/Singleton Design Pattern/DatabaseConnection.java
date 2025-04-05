public class DatabaseConnection {
    private String name;

    //This is the early initialization
    private static DatabaseConnection connectionObject = new DatabaseConnection();

    private DatabaseConnection() {
        this.name = "MySQL";
    }

    public static DatabaseConnection getDatabaseConnection() {
        return connectionObject;
    }

    public String getDatabaseName() {
        return name;
    }

    public void connect() {
        System.out.println("Connecting to " + name + " database...");
    }
}