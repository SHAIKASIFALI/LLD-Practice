public class Main {
    public static void main(String[] args) {
        // Get the database connection instance
        DatabaseConnection connection = DatabaseConnection.getDatabaseConnection();
        
        // Use the connection object's methods
        System.out.println("Database name: " + connection.getDatabaseName());
        connection.connect();
    }
}