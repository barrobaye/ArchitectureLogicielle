package models;

public class Rendervous {
    public int id;
    public String date;
    public String spécialiste;
    public Rendervous() {
    }
    public Rendervous(String date, String spécialiste) {
        this.date = date;
        this.spécialiste = spécialiste;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSpécialiste() {
        return spécialiste;
    }
    public void setSpécialiste(String spécialiste) {
        this.spécialiste = spécialiste;
    }
    @Override
    public String toString() {
        return "Rendervous [id=" + id + ", date=" + date + ", spécialiste=" + spécialiste + "]";
    }
}
