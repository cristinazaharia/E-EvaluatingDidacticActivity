
package clase;
import java.sql.*;

public class ConexiuneBazaDate {
    private static ConexiuneBazaDate instance;
    private Connection connection;

    private ConexiuneBazaDate() {
    }

    public static ConexiuneBazaDate getInstance() {
        if (instance == null)
            instance = new ConexiuneBazaDate();
        return instance;
    }

    public Boolean openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/e-ep", "root", "");
            return Boolean.TRUE;
        } catch (ClassNotFoundException | SQLException ignored) {
            return Boolean.FALSE;
        }
    }

    public Boolean closeConnection() {
        try {
            if (connection != null) connection.close();
            return Boolean.TRUE;
        } catch (SQLException ignored) {
            return Boolean.FALSE;
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}


/*public class ConexiuneBD {
    public static void main(String[] args) {
        Connection con=null;
	Statement stmt=null;
	try{
		//Class.forName(driverName).newInstance();
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eep", "root", "");
		try{
		   stmt = con.createStatement();
		   String query = "SELECT id_student, nume FROM studenti";
		   ResultSet rs=stmt.executeQuery(query);
		   //System.out.println("id_student"+"\t"+"nume");
		   //Extact result from ResultSet rs
		   while(rs.next()){
				 System.out.println(""+rs.getInt("id_student")+"\t"+rs.getString("nume"));				
			  }
		   // close ResultSet rs
		   rs.close();
		   } catch(SQLException s){						
				s.printStackTrace();
			 }
		// close Connection and Statement
		con.close();
		stmt.close();
		}catch (Exception e){
			e.printStackTrace();
		 }
  }
}*/
      /*  try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/eep", "root", "")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
            Statement stmt = conn . createStatement () ;
            String sql = " SELECT id_student, nume FROM studenti";
            //System.out.println(sql);
            
            ResultSet rs = stmt . executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("Id_student") +" " + rs.getString("Nume"));
            }
            rs.close();
            conn.close();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}*/
/*public class ConexiuneBD {
    private static ConexiuneBD instance;
    private Connection connection;

    private ConexiuneBD() {
    }

    public static ConexiuneBD getInstance() {
        if (instance == null)
            instance = new ConexiuneBD();
        return instance;
    }

    public Boolean openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/eep", "root", "");
            return Boolean.TRUE;
        } catch (ClassNotFoundException | SQLException ignored) {
            return Boolean.FALSE;
        }
    }

    public Boolean closeConnection() {
        try {
            if (connection != null) connection.close();
            return Boolean.TRUE;
        } catch (SQLException ignored) {
            return Boolean.FALSE;
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}*/

