package models;

public class Patient extends Personne{
    public int numero;
    
    public Patient(String nom, String tel, int numero) {
        super(nom, tel);
        this.numero = numero;
    }
    public Patient(int numero) {
        this.numero = numero;
    }
    public Patient() {
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
  
}
