
package clase;

public class Persoana {
    private String nume, prenume, cnp;
    
    public Persoana(){}
    
    public Persoana(String nume, String prenume){
        this.nume=nume;
        this.prenume=prenume;
    }
    
    public Persoana(String nume, String prenume, String CNP){
        this.nume=nume;
        this.prenume=prenume;
        this.cnp=cnp;
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
    
    
    
}
