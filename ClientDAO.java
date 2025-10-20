    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

    public class ClientDAO {

        public List<Client> getAllClients() throws SQLException {
            List<Client> clients = new ArrayList<>();
            String sql = "SELECT * FROM client";
            try (Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    clients.add(new Client(
                            rs.getInt("id_client"),
                            rs.getString("prenom"),
                            rs.getString("nom"),
                            rs.getString("email"),
                            rs.getString("telephone"),
                            rs.getString("ville"),
                            rs.getTimestamp("date_creation").toLocalDateTime()
                    ));
                }
            }
            return clients;
        }
    }
