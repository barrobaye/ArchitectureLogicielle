package services;

import java.util.List;

import dao.Data;
import models.Commande;

public class PaiementService {
    public Data data = new Data();
 /*   
  public PaiementService() {
        this.data = new Data();
    }
    
    */
    public  List <Commande> listerCommande (){
       return data.getCommande();
    } 
 /*    public void setData(Data data) {
        this.data = data;
    } */
    
}

