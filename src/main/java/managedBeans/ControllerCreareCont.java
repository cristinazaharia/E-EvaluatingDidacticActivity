
package managedBeans;

import clase.ManagerConturi;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("controllerCreareCont")
@RequestScoped

public class ControllerCreareCont {
    private String nume, prenume, cnp, an_studiu, nr_matricol, mesaj="", id_specializare, id_facultate;
    private String email, id_disciplina1, id_disciplina2;
   
    
     public void clickConfirmaStudent() {
        //int idDepartment = TeacherManager.getTeacherDepartmentId(loginBean.getEmail());
     
        StringBuffer parola = new StringBuffer();
        Integer idstudent = ManagerConturi.creeazaContStudent(nume, prenume, cnp, Integer.parseInt(an_studiu), Integer.parseInt(nr_matricol), parola, Integer.parseInt(id_specializare));
        if (idstudent == null) {
            mesaj="Studentul există deja!";
            return;
        }
        else{

        
        clearFieldsStudent();
        mesaj="Cont creat cu succes.";
    }
     }
     
     public void clickConfirmaProfesor() {
        //int idDepartment = TeacherManager.getTeacherDepartmentId(loginBean.getEmail());
        //int idDisciplina1 = ManagerConturi.getIdDisciplinaProfesor(id_disciplina1());
       
        StringBuffer parola = new StringBuffer();
        Integer idProfesor = ManagerConturi.creazaContProfesor(nume, prenume, cnp, email, parola, Integer.parseInt(id_disciplina1), Integer.parseInt(id_disciplina2)); 
        if (idProfesor == null) {
            mesaj="Profesorul există deja!";
            return;
        }
        else{
        
        clearFieldsProfesor();
        mesaj="Cont creat cu succes.";
        }
     }

    private void clearFieldsStudent() {
        nume="";
        prenume="";
        cnp="";
        an_studiu="";
        nr_matricol="";
        id_specializare="";
        id_facultate="";
        
    }
        private void clearFieldsProfesor() {
        nume="";
        prenume="";
        cnp="";
        email="";
        id_facultate="";
        id_disciplina1="";
        id_disciplina2="";
        
        
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getAn_studiu() {
        return an_studiu;
    }

    public void setAn_studiu(String an_studiu) {
        this.an_studiu = an_studiu;
    }

    public String getNr_matricol() {
        return nr_matricol;
    }

    public void setNr_matricol(String nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id_specializare
     */
    public String getId_specializare() {
        return id_specializare;
    }

    /**
     * @param id_specializare the id_specializare to set
     */
    public void setId_specializare(String id_specializare) {
        this.id_specializare = id_specializare;
    }

    /**
     * @return the id_facultate
     */
    public String getId_facultate() {
        return id_facultate;
    }

    /**
     * @param id_facultate the id_facultate to set
     */
    public void setId_facultate(String id_facultate) {
        this.id_facultate = id_facultate;
    }

    /**
     * @return the id_disciplina1
     */
    public String getId_disciplina1() {
        return id_disciplina1;
    }

    /**
     * @param id_disciplina1 the id_disciplina1 to set
     */
    public void setId_disciplina1(String id_disciplina1) {
        this.id_disciplina1 = id_disciplina1;
    }

    /**
     * @return the id_disciplina2
     */
    public String getId_disciplina2() {
        return id_disciplina2;
    }

    /**
     * @param id_disciplina2 the id_disciplina2 to set
     */
    public void setId_disciplina2(String id_disciplina2) {
        this.id_disciplina2 = id_disciplina2;
    }

   

   

}
