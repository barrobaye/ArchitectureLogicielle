package services;

import java.util.List;

import dao.ConsultationpatientDao;
import models.Consultation;

public class ServiceConsultation {
    private ConsultationpatientDao consultationpatientDao = new ConsultationpatientDao();

public List<Consultation> listConsultation(){
    return consultationpatientDao.getconsultation();
}

    public void setConsultationpatientDao(ConsultationpatientDao consultationpatientDao) {
        this.consultationpatientDao = consultationpatientDao;
    }

}
