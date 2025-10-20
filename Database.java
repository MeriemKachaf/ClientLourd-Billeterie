import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/billeterie?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // ton utilisateur MySQL
    private static final String PASSWORD = ""; // ton mot de passe MySQL

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
