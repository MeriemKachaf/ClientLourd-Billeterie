    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

    public class StatutBilletDAO {

        public List<StatutBillet> getAllStatuts() throws SQLException {
            List<StatutBillet> statuts = new ArrayList<>();
            String sql = "SELECT * FROM statut_billet";
            try (Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    statuts.add(new StatutBillet(
                            rs.getInt("id_statut"),
                            rs.getString("libelle")
                    ));
                }
            }
            return statuts;
        }
    }
