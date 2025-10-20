    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.math.BigDecimal;
    import java.time.LocalDate;
    import java.time.LocalTime;

    public class EvenementDAO {

        public List<Evenement> getAllEvenements() throws SQLException {
            List<Evenement> evenements = new ArrayList<>();
            String sql = "SELECT * FROM evenement";
            try (Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    Evenement e = new Evenement(
                            rs.getInt("id_evenement"),
                            rs.getString("nom"),
                            rs.getDate("date_event").toLocalDate(),
                            rs.getTime("heure").toLocalTime(),
                            rs.getString("lieu"),
                            rs.getInt("capacite"),
                            rs.getBigDecimal("prix_base"),
                            rs.getString("description")
                    );
                    evenements.add(e);
                }
            }
            return evenements;
        }

        public void addEvenement(Evenement e) throws SQLException {
            String sql = "INSERT INTO evenement (nom, date_event, heure, lieu, capacite, prix_base, description) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, e.getNom());
                ps.setDate(2, Date.valueOf(e.getDateEvent()));
                ps.setTime(3, Time.valueOf(e.getHeure()));
                ps.setString(4, e.getLieu());
                ps.setInt(5, e.getCapacite());
                ps.setBigDecimal(6, e.getPrixBase());
                ps.setString(7, e.getDescription());
                ps.executeUpdate();
            }
        }
    }
