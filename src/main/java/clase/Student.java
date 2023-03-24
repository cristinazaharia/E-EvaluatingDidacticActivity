
package clase;


public class Student {
    private Persoana persoana;
    
    public Student(){}
    
    public Student(String nume, String prenume, String CNP){
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
