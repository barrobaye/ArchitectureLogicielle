package models;

public class Consultation {
    public static int nbr = 0;
    private int id;
    public String date;
    public int heure;
    public Medecin medecin;
    public Patient patient;
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getHeure() {
        return heure;
    }
    public int getId() {
        return id;
    }
    public int setId(int id){
        return id;
    }
    public void setHeure(int heure) {
        this.heure = heure;
    }
    public Medecin getMedecin() {
        return medecin;
    }
    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
 
    public Consultation(String date, int heure, Medecin medecin,Patient patient) {
        nbr++;
        this.id = nbr;
        this.date = date;
        this.heure = heure;
        this.medecin = medecin;
        this.patient = patient;
    }
  
    public Consultation() {
    }
    @Override
    public String toString() {
        return "Consultation [id=" + id + ", date=" + date + ", heure=" + heure + ", medecin=" + medecin + ", patient="
                + patient + "]";
    }
}
