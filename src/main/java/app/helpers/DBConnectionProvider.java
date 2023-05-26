package app.helpers;

import static app.Constants.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionProvider {
    private static DBConnectionProvider instance;

    private DBConnectionProvider() {

    }

    public Connection getConnection(String databaseName) {
        try {
            String connectionString = String.format("jdbc:sqlite:%s/%s", DB_FOLDER, databaseName);
            Class.forName("org.sqlite.JDBC");
            Connection dbConnection = DriverManager.getConnection(connectionString);
            return dbConnection;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public static DBConnectionProvider getInstance() {
        if (instance == null) {
            instance = new DBConnectionProvider();
        }
        return instance;
    }
}
