package models;

public class Commande {
    public int id;
    private static int nbrCmd = 0;
    public String date;
    public double montant;
    public Paiement paiement;
    
    public Commande(String date, double montant, Paiement paiement) 
    {
        nbrCmd++;
        this.id =nbrCmd;
        this.date = date;
        this.montant = montant;
        this.paiement = paiement;
    }
    public Commande(String date, double montant) {

        nbrCmd++;
        this.id =nbrCmd;
        this.date = date;
        this.montant = montant;
    }
    public Commande() {
    }
    public Paiement getPaiement() {
        return paiement;
    }
    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", date=" + date + ", montant=" + montant + ", paiement=" + paiement + "]";
    }
}
