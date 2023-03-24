
package clase;


public class Profesor {
    private Persoana persoana;
    
    public Profesor(){}
    
    public Profesor(String nume, String prenume, String CNP){
        persoana = new Persoana(nume, prenume, CNP);
    }

    /**
     * @return the persoana
     */
    public Persoana getPersoana() {
        return persoana;
    }

    /**
     * @param persoana the persoana to set
     */
    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }
    
    

}
