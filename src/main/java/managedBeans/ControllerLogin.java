
package managedBeans;

import clase.Student;
import clase.ManagerConturi;
import clase.Profesor;
import javax.faces.*;
import java.io.*;
import java.util.*;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named("controllerLogin")
@SessionScoped

public class ControllerLogin implements Serializable {
    
    private Student student;
    private Profesor profesor;
    private String CNP, parola, nume, prenume, cnp, specializare, facultate, program_studii, email;
    private String nume_profesor;
    private String prenume_profesor;
    private String cnp_profesor;
    private String facultate_profesor;
    private String disciplina1;
    private String disciplina2;
    int an_studiu, nr_matricol;
    private Boolean isLoggedIn = Boolean.FALSE;
    
    
    
     public String clickLogin() {
        Student student = ManagerConturi.getStudent(CNP, parola);
        
         nume=ManagerConturi.getNumeStudent(CNP);
         prenume=ManagerConturi.getPrenumeStudent(CNP);
         cnp=ManagerConturi.getCNPStudent(CNP);
         an_studiu=ManagerConturi.getAnStudiuStudent(CNP);
         nr_matricol=ManagerConturi.getNrMatricolStudent(CNP);
         specializare=ManagerConturi.getSpecializareStudent(CNP);
         facultate=ManagerConturi.getFacultateStudent(CNP);
         program_studii=ManagerConturi.getProgramStudiiStudent(CNP);
         
        Profesor profesor = ManagerConturi.getProfesor(CNP, parola);
         nume_profesor=ManagerConturi.getNumeProfesor(CNP);
         prenume_profesor=ManagerConturi.getPrenumeProfesor(CNP);
         cnp_profesor=ManagerConturi.getCNPProfesor(CNP);
         facultate_profesor=ManagerConturi.getFacultateProfesor(CNP);
         disciplina1=ManagerConturi.getDisciplina1Profesor(CNP);
         disciplina2=ManagerConturi.getDisciplina2Profesor(CNP);
         email=ManagerConturi.getEmailProfesor(CNP);
         
         
        if (student != null) {
            this.student=student;
            
            isLoggedIn= true;
            return "student?faces-redirect=true";
        }else 
        if (profesor != null) {
            this.profesor=profesor;
            
            isLoggedIn = true;
            return "profesor?faces-redirect=true";
        }else {
            clearFields();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Credentiale eronate!", null));
            return null;
        }
       
     }
      public String clickLogout() {
        student = null;
        profesor = null;
        isLoggedIn = false;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        session.invalidate();
        return "login.xhtml?faces-redirect=true";
    }
     public void clearFields(){
         CNP="";
         parola="";
         
     }
     
    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the CNP
     */
    public String getCNP() {
        return CNP;
    }

    /**
     * @param CNP the CNP to set
     */
    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the isLoggedIn
     */
    public Boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    /**
     * @param isLoggedIn the isLoggedIn to set
     */
    public void setIsLoggedIn(Boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the prenume
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * @param prenume the prenume to set
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    /**
     * @return the an_studiu
     */
    public int getAn_studiu() {
        return an_studiu;
    }

    /**
     * @param an_studiu the an_studiu to set
     */
    public void setAn_studiu(int an_studiu) {
        this.an_studiu = an_studiu;
    }

    /**
     * @return the nr_matricol
     */
    public int getNr_matricol() {
        return nr_matricol;
    }

    /**
     * @param nr_matricol the nr_matricol to set
     */
    public void setNr_matricol(int nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

    /**
     * @return the cnp
     */
    public String getCnp() {
        return cnp;
    }

    /**
     * @param cnp the cnp to set
     */
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    /**
     * @return the specializare
     */
    public String getSpecializare() {
        return specializare;
    }

    /**
     * @param specializare the specializare to set
     */
    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    /**
     * @return the facultate
     */
    public String getFacultate() {
        return facultate;
    }

    /**
     * @param facultate the facultate to set
     */
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    /**
     * @return the program_studii
     */
    public String getProgram_studii() {
        return program_studii;
    }

    /**
     * @param program_studii the program_studii to set
     */
    public void setProgram_studii(String program_studii) {
        this.program_studii = program_studii;
    }

    /**
     * @return the nume_profesor
     */
    public String getNume_profesor() {
        return nume_profesor;
    }

    /**
     * @param nume_profesor the nume_profesor to set
     */
    public void setNume_profesor(String nume_profesor) {
        this.nume_profesor = nume_profesor;
    }

    /**
     * @return the prenume_profesor
     */
    public String getPrenume_profesor() {
        return prenume_profesor;
    }

    /**
     * @param prenume_profesor the prenume_profesor to set
     */
    public void setPrenume_profesor(String prenume_profesor) {
        this.prenume_profesor = prenume_profesor;
    }

    /**
     * @return the cnp_profesor
     */
    public String getCnp_profesor() {
        return cnp_profesor;
    }

    /**
     * @param cnp_profesor the cnp_profesor to set
     */
    public void setCnp_profesor(String cnp_profesor) {
        this.cnp_profesor = cnp_profesor;
    }

    /**
     * @return the facultate_profesor
     */
    public String getFacultate_profesor() {
        return facultate_profesor;
    }

    /**
     * @param facultate_profesor the facultate_profesor to set
     */
    public void setFacultate_profesor(String facultate_profesor) {
        this.facultate_profesor = facultate_profesor;
    }

    /**
     * @return the disciplina1
     */
    public String getDisciplina1() {
        return disciplina1;
    }

    /**
     * @param disciplina1 the disciplina1 to set
     */
    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    /**
     * @return the disciplina2
     */
    public String getDisciplina2() {
        return disciplina2;
    }

    /**
     * @param disciplina2 the disciplina2 to set
     */
    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
     
}
