import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Evenement {
    private int id;
    private String nom;
    private LocalDate dateEvent;
    private LocalTime heure;
    private String lieu;
    private int capacite;
    private BigDecimal prixBase;
    private String description;

    public Evenement(int id, String nom, LocalDate dateEvent, LocalTime heure, String lieu, int capacite, BigDecimal prixBase, String description) {
        this.id = id;
        this.nom = nom;
        this.dateEvent = dateEvent;
        this.heure = heure;
        this.lieu = lieu;
        this.capacite = capacite;
        this.prixBase = prixBase;
        this.description = description;
    }

    // getters et setters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public LocalDate getDateEvent() { return dateEvent; }
    public LocalTime getHeure() { return heure; }
    public String getLieu() { return lieu; }
    public int getCapacite() { return capacite; }
    public BigDecimal getPrixBase() { return prixBase; }
    public String getDescription() { return description; }
}
