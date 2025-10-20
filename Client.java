import java.time.LocalDateTime;

public class Client {
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String telephone;
    private String ville;
    private LocalDateTime dateCreation;

    public Client(int id, String prenom, String nom, String email, String telephone, String ville, LocalDateTime dateCreation) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.ville = ville;
        this.dateCreation = dateCreation;
    }

    // getters
    public int getId() { return id; }
    public String getPrenom() { return prenom; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getVille() { return ville; }
    public LocalDateTime getDateCreation() { return dateCreation; }
}
