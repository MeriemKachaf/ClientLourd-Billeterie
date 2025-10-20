    import java.sql.*;
    import java.util.ArrayList;
    import java.util.List;

    public class BilletDAO {

        private ClientDAO clientDAO = new ClientDAO();
        private EvenementDAO evenementDAO = new EvenementDAO();
        private StatutBilletDAO statutDAO = new StatutBilletDAO();

        public List<Billet> getAllBillets() throws SQLException {
            List<Billet> billets = new ArrayList<>();
            String sql = "SELECT * FROM billet";
            try (Connection conn = Database.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    Client client = clientDAO.getAllClients().stream()
                            .filter(c -> c.getId() == rs.getInt("fk_client"))
                            .findFirst().orElse(null);

                    Evenement event = evenementDAO.getAllEvenements().stream()
                            .filter(e -> e.getId() == rs.getInt("fk_evenement"))
                            .findFirst().orElse(null);

                    StatutBillet statut = statutDAO.getAllStatuts().stream()
                            .filter(s -> s.getId() == rs.getInt("fk_statut"))
                            .findFirst().orElse(null);

                    Billet b = new Billet(
                            rs.getInt("id_billet"),
                            rs.getString("code_unique"),
                            client,
                            event,
                            statut,
                            rs.getTimestamp("date_achat").toLocalDateTime(),
                            rs.getBigDecimal("prix_paye")
                    );
                    billets.add(b);
                }
            }
            return billets;
        }

        public void addBillet(Billet b) throws SQLException {
            String sql = "INSERT INTO billet (code_unique, fk_client, fk_evenement, fk_statut, date_achat, prix_paye) VALUES (?, ?, ?, ?, ?, ?)";
            try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, b.getCodeUnique());
                ps.setInt(2, b.getClient().getId());
                ps.setInt(3, b.getEvenement().getId());
                ps.setInt(4, b.getStatut().getId());
                ps.setTimestamp(5, Timestamp.valueOf(b.getDateAchat()));
                ps.setBigDecimal(6, b.getPrixPaye());
                ps.executeUpdate();
            }
        }
    }
