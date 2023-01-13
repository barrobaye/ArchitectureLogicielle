package models;
public class Paiement{
    public String date;
    public String type;
    public String refers;

    public Paiement(String date, String type, String refers) {
        this.date = date;
        this.type = type;
        this.refers = refers;
    }
    public Paiement() {
    }
    public void setRefers(String refers) {
        this.refers = refers;
    }
    public String getRefers() {
        return refers;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Paiement [date=" + date + ", type=" + type + ", refers=" + refers + "]";
    }

}