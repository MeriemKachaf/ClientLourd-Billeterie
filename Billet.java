import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Billet {
    private int id;
    private String codeUnique;
    private Client client;
    private Evenement evenement;
    private StatutBillet statut;
    private LocalDateTime dateAchat;
    private BigDecimal prixPaye;

    public Billet(int id, String codeUnique, Client client, Evenement evenement, StatutBillet statut, LocalDateTime dateAchat, BigDecimal prixPaye) {
        this.id = id;
        this.codeUnique = codeUnique;
        this.client = client;
        this.evenement = evenement;
        this.statut = statut;
        this.dateAchat = dateAchat;
        this.prixPaye = prixPaye;
    }

    // getters
    public int getId() { return id; }
    public String getCodeUnique() { return codeUnique; }
    public Client getClient() { return client; }
    public Evenement getEvenement() { return evenement; }
    public StatutBillet getStatut() { return statut; }
    public LocalDateTime getDateAchat() { return dateAchat; }
    public BigDecimal getPrixPaye() { return prixPaye; }
}
