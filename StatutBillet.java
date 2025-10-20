public class StatutBillet {
    private int id;
    private String libelle;

    public StatutBillet(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() { return id; }
    public String getLibelle() { return libelle; }
}
