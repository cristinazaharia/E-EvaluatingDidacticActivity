
package managedBeans;

import clase.ManagerActivitati;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("controllerPerioadaEvaluare")
@RequestScoped

public class ControllerPerioadaEvaluare {
    private String semestru, mesaj;
    private Date data_incepere, data_incheiere;
    
    public void configurarePerioadaEvaluare(){
        Integer id_perioada_evaluare=ManagerActivitati.getPerioadaEvaluare(semestru, data_incepere, data_incheiere);
        
    }
    private void clearFields() {
        setSemestru("");
        mesaj="Perioada configurata cu succes";
       
        
    }

    /**
     * @return the semestru
     */
    public String getSemestru() {
        return semestru;
    }

    /**
     * @param semestru the semestru to set
     */
    public void setSemestru(String semestru) {
        this.semestru = semestru;
    }

    /**
     * @return the data_incepere
     */
    public Date getData_incepere() {
        return data_incepere;
    }

    /**
     * @param data_incepere the data_incepere to set
     */
    public void setData_incepere(Date data_incepere) {
        this.data_incepere = data_incepere;
    }

    /**
     * @return the data_incheiere
     */
    public Date getData_incheiere() {
        return data_incheiere;
    }

    /**
     * @param data_incheiere the data_incheiere to set
     */
    public void setData_incheiere(Date data_incheiere) {
        this.data_incheiere = data_incheiere;
    }

    /**
     * @return the mesaj
     */
    public String getMesaj() {
        return mesaj;
    }

    /**
     * @param mesaj the mesaj to set
     */
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
    
    
}
