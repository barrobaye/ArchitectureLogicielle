package models;

public class Medecin extends Personne{
    public String grade;

    public Medecin() {
    }

    public Medecin( String nom, String tel, String grade) {
        super(nom, tel);
        this.grade = grade;
    }

    public Medecin(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
