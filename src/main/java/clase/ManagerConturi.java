
package clase;

import java.io.*;
import java.sql.*;

public class ManagerConturi {
    
     public static Student getStudent(String CNP, String parola){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        String nume, prenume;
        //int id;
        try {
           
            PreparedStatement ps = connection.prepareStatement("select nume, prenume, cnp, parola from student where CNP=? and parola=?");
            ps.setString(1, CNP);
            ps.setString(2, parola);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            nume = rs.getString(1);
            prenume = rs.getString(2);
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return new Student(nume, prenume, CNP);
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
       public static String getNumeStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        
       
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from student where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String nume;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            nume = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return nume;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
        public static String getPrenumeStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        
       
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from student where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String prenume;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            prenume = rs.getString(3);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return prenume;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
         public static String getCNPStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        
       
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from student where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            cnp = rs.getString(4);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return cnp;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
          public static int getAnStudiuStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        
       
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from student where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            int an_studiu;
            if (!rs.next()) {
                
                dc.closeConnection();
                return -1;
            }
            //id = rs.getInt(1);
            an_studiu = rs.getInt(5);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return an_studiu;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return -1;
        }
    }
           public static int getNrMatricolStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
  
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from student where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            int nr_matricol;
            if (!rs.next()) {
                
                dc.closeConnection();
                return -1;
            }
            //id = rs.getInt(1);
            nr_matricol = rs.getInt(6);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return nr_matricol;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return -1;
        }
    }
            public static String getSpecializareStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from specializare INNER join student on specializare.id_specializare=student.id_specializare where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String denumire;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
        public static String getFacultateStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from facultate inner join  specializare on facultate.id_facultate=specializare.id_facultate INNER join student on specializare.id_specializare=student.id_specializare where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String denumire;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
        
        public static String getProgramStudiiStudent(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from program_studii inner join  specializare on program_studii.id_program_studii=specializare.id_program_studii INNER join student on specializare.id_specializare=student.id_specializare where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String denumire;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     
     public static Profesor getProfesor(String CNP, String parola){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        String nume, prenume;
        //int id;
        try {
           
            PreparedStatement ps = connection.prepareStatement("select nume, prenume, CNP, parola from profesor where CNP=? and parola=?");
            ps.setString(1, CNP);
            ps.setString(2, parola);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            nume = rs.getString(1);
            prenume = rs.getString(2);
            //pnc = rs.getString(4);

        
             dc.closeConnection();
             return new Profesor(nume, prenume, CNP);
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
      }
     public static String getNumeProfesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from profesor where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String nume;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            nume = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return nume;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     public static String getPrenumeProfesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from profesor where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String prenume;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            prenume = rs.getString(3);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return prenume;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     public static String getCNPProfesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from profesor where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
            if(!rs.next()) 
            {  
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            cnp = rs.getString(4);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return cnp;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     public static String getEmailProfesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from profesor where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
            String email;
            if(!rs.next()) 
            {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            email = rs.getString(5);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return email;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     public static String getFacultateProfesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from facultate inner join specializare on facultate.id_facultate=specializare.id_facultate inner join disciplina on specializare.id_specializare=disciplina.id_specializare inner join profesor on disciplina.id_disciplina=profesor.id_disciplina1 where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String denumire;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     public static String getDisciplina1Profesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from disciplina inner join profesor on disciplina.id_disciplina=profesor.id_disciplina1 where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String denumire;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
      public static String getDisciplinaProfesor(String denumire){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from disciplina inner join profesor on disciplina.id_disciplina=profesor.id_disciplina1 where CNP=?");
            ps.setString(1, denumire);
            
            ResultSet rs = ps.executeQuery();
               
          
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
      public static String getDisciplina2Profesor(String cnp){
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
           
            PreparedStatement ps = connection.prepareStatement("select * from disciplina inner join profesor on disciplina.id_disciplina=profesor.id_disciplina2 where CNP=?");
            ps.setString(1, cnp);
            
            ResultSet rs = ps.executeQuery();
               
            String denumire;
            if (!rs.next()) {
                
                dc.closeConnection();
                return null;
            }
            //id = rs.getInt(1);
            denumire = rs.getString(2);
           
            //pnc = rs.getString(4);

        
             dc.closeConnection();
            return denumire;
        }catch (SQLException ignored) {
            ignored.printStackTrace();
            dc.closeConnection();
            return null;
        }
    }
     
     
     
     
        public static Integer creeazaContStudent(String nume, String prenume, String cnp, int an_studiu, int nr_matricol, StringBuffer parolaReturnata,  int id_specializare) {
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        String parolaGenerata = Utilitare.genereazaParola(cnp) ;
        
        if (parolaReturnata != null) parolaReturnata.append(parolaGenerata);
        
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "insert into student (nume,prenume,cnp,an_studiu,nr_matricol,parola,id_specializare) values (?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nume);
            ps.setString(2, prenume);
            ps.setString(3, cnp);
            ps.setInt(4, an_studiu);
           
            ps.setInt(5, nr_matricol);
            ps.setString(6, Utilitare.getHashParola(parolaGenerata));
            //ps.setString(6, parolaGenerata);
          
            ps.setInt(7, id_specializare);
            
            //ps.setInt(7, idprogramstudii);
            ps.executeUpdate();
            ResultSet rsId = ps.getGeneratedKeys();
            if (rsId.next()) {
                Integer id = rsId.getInt(1);
                dc.closeConnection();
                return id;
            }
           
        } catch (SQLException e) { 
            e.printStackTrace();
          
        }
          dc.closeConnection();
          return null;
        }
        
        public static Integer creazaContProfesor(String nume, String prenume, String cnp, String email, StringBuffer parolaReturnata,  int id_disciplina1, int id_disciplina2) {
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        String parolaGenerata = Utilitare.genereazaParola(cnp) ;
        
        if (parolaReturnata != null) parolaReturnata.append(parolaGenerata);
        
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "insert into profesor (nume,prenume,cnp,email,parola,id_disciplina1,id_disciplina2) values (?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nume);
            ps.setString(2, prenume);
            ps.setString(3, cnp);
            ps.setString(4, email);
            ps.setString(5, Utilitare.getHashParola(parolaGenerata));
            //ps.setString(6, parolaGenerata);
            ps.setInt(6, id_disciplina1);
            ps.setInt(7, id_disciplina2);
          
            //ps.setInt(7, idSpecializare);
            
            //ps.setInt(7, idprogramstudii);
            ps.executeUpdate();
            ResultSet rsId = ps.getGeneratedKeys();
            if (rsId.next()) {
                Integer id = rsId.getInt(1);
                dc.closeConnection();
                return id;
            }
           
        } catch (SQLException e) { //most likely teacher with non-unique pnc or email introduced
            e.printStackTrace();
          
        }
          dc.closeConnection();
          return null;
        }
          /*public static Integer creazaContProfesorDis(String nume, String prenume, String cnp, String email, StringBuffer parolaReturnata, int id_disciplina1, int id_disciplina2) {
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        String parolaGenerata = Utilitare.genereazaParola(cnp) ;
        
        if (parolaReturnata != null) parolaReturnata.append(parolaGenerata);
        
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "insert into profesor (nume,prenume,cnp,email,parola,id_disciplina1,id_disciplina2) values (?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nume);
            ps.setString(2, prenume);
            ps.setString(3, cnp);
            ps.setString(4, email);
            ps.setString(5, Utilitare.getHashParola(parolaGenerata));
            //ps.setString(6, parolaGenerata);
            //ps.setInt(6, id_disciplina1);
            ps.setInt(7, id_disciplina2);
          
            //ps.setInt(7, idSpecializare);
            
            //ps.setInt(7, idprogramstudii);
            ps.executeUpdate();
            ResultSet rsId = ps.getGeneratedKeys();
            if (rsId.next()) {
                Integer id = rsId.getInt(1);
                dc.closeConnection();
                return id;
            }
           
        } catch (SQLException e) { //most likely teacher with non-unique pnc or email introduced
            e.printStackTrace();
          
        }
          dc.closeConnection();
          return null;
        }*/
    
    
    
        
        public static int getIdSpecializareStudent(String specializare) {
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "select id from specializare where denumire=?");
            ps.setString(1, specializare );
            ResultSet rs = ps.executeQuery();
            rs.first();
            int idSpecializare = rs.getInt(1);
            dc.closeConnection();
            return idSpecializare;
        } catch (SQLException e) {
            e.printStackTrace();
        
            dc.closeConnection();
            return -1;
        
        }
        }
        
        public static int getIdDisciplinaProfesor(String disciplina) {
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "select id from disciplina where denumire=?");
            ps.setString(1, disciplina );
            ResultSet rs = ps.executeQuery();
            rs.first();
            int idSpecializare = rs.getInt(1);
            dc.closeConnection();
            return idSpecializare;
        } catch (SQLException e) {
            e.printStackTrace();
        
            dc.closeConnection();
            return -1;
        
        }
}
}
