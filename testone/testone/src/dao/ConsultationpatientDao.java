package dao;

import java.util.ArrayList;
import java.util.List;

import models.Consultation;
import models.Medecin;
import models.Patient;

public class ConsultationpatientDao {
    public List<Consultation>consultations = new ArrayList<>();
    public List<Consultation> getconsultation(){
       consultations.add(new Consultation("12/02/19",2,(new Medecin("Licence")),(new Patient("diop", "777751312", 3))));
        return consultations;
    }
    public List<Patient> patients = new ArrayList<>();
    
}
