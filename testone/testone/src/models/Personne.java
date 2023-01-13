package models;

public class Personne {
    public static int nbr = 0;
    private int id;
    private String nom;
    private String tel;
    public Personne( String nom, String tel) {
        nbr++;
        this.id = nbr;
        this.nom = nom;
        this.tel = tel;
    }
    public Personne() {
    }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        Personne.nbr = nbr;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    @Override
    public String toString() {
        return "Personne [id=" + id + ", nom=" + nom + ", tel=" + tel + "]";
    }
    
}
