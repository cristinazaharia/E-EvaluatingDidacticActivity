
package clase;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class ManagerActivitati {
    
      public static Integer getPerioadaEvaluare(String semestru, Date data_incepere, Date data_incheiere) {
        ConexiuneBazaDate dc = ConexiuneBazaDate.getInstance();
        dc.openConnection();
        Connection connection = dc.getConnection();
        
        
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "insert into perioada_evaluare (semestru,data_incepere,data_incheiere) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            
       
        // converting the util date into string format
   
 
             ps.setString(1, semestru);
           // ps.setDate(2, data_incepere);
           // ps.setDate(3, data_incepere);
            
            
          
       
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
}
