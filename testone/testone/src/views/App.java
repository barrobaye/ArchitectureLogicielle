package views;

import java.util.List;
import java.util.Scanner;

import models.Consultation;
import services.ServiceConsultation;

public class App {
    public static void main(String[] args) throws Exception {
        ServiceConsultation liste = new ServiceConsultation();
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("choisir 1 pour lister");
            choix = sc.nextInt();
            switch(choix){
                case 1:
                List<Consultation>consultations=liste.listConsultation();
                for(Consultation cons:consultations){
                    System.out.println(cons);
                }
                default:
                break;
            }

        }while(choix!=3);
    }
}
