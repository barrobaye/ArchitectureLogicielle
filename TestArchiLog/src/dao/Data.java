package dao;

import java.util.ArrayList;
import java.util.List;
import models.Paiement;
import models.Commande;

public class Data {
  
    List<Commande> commandes = new ArrayList<>();
    
 public List<Commande> getCommande(){
  commandes.add(new Commande("01/01/22",3000));
  commandes.add(new Commande("01/01/22",3000));
  commandes.add(new Commande("01/01/22",3000));
  commandes.add(new Commande("01/01/22",3000,new Paiement("01/01/22","OM", "222ro")));
  commandes.add(new Commande("01/01/22",3000,new Paiement("01/01/23","OM", "222ro")));


return commandes;
 }
}
