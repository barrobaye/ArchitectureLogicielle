import java.util.List;
import java.util.Scanner;

import dao.Data;
import models.Commande;
import services.PaiementService;

public class App {
   // public PaiementService paiementservice;

    public static void main(String[] args) throws Exception {
/* Data data = new Data();
 */        PaiementService service = new PaiementService();
/*         service.setData(data);
 */        int Choix = 0;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("faite  votre choix");
            System.out.println("1-Lister commande");
            System.out.println("2-Enregistrer Commande");
            System.out.println("3-quitter");
            Choix = sc.nextInt();
            switch(Choix){
                case 1:System.out.println("=======lister Commande=====");
                List<Commande> commandes = service.listerCommande();
                for(Commande cmd:commandes){
                    System.out.println(cmd);
                    
                }
                break;
                case 2:System.out.println("=======lister Commande=====");
                break;
                default:
                break;
            }
        }while(Choix != 3);
    }
    
  
}
