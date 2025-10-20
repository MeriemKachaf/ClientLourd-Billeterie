import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Paiement {
    private int id;
    private Billet billet;
    private BigDecimal montant;
    private String modePaiement;
    private LocalDateTime datePaiement;
    private String reference;

    public Paiement(int id, Billet billet, BigDecimal montant, String modePaiement, LocalDateTime datePaiement, String reference) {
        this.id = id;
        this.billet = billet;
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.datePaiement = datePaiement;
        this.reference = reference;
    }

    public int getId() { return id; }
    public Billet getBillet() { return billet; }
    public BigDecimal getMontant() { return montant; }
    public String getModePaiement() { return modePaiement; }
    public LocalDateTime getDatePaiement() { return datePaiement; }
    public String getReference() { return reference; }
}
