
package clase;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilitare {

    public static String genereazaParola(String cnp){
        
        StringBuffer str = new StringBuffer();
        
        String  year="", month, day, bd;
   
       
        
        if ((cnp.charAt(0) == '1') || (cnp.charAt(0) == '2')) {
        
            year = "" + "19" + cnp.charAt(1) + cnp.charAt(2);
         }
        
        else if ((cnp.charAt(0) == '5') || (cnp.charAt(0) == '6')) 
                {
            year = "" + "20" + cnp.charAt(1) + cnp.charAt(2);
                }
        
        month = "" + cnp.charAt(3) + cnp.charAt(4);
        
        day = "" + cnp.charAt(5) + cnp.charAt(6);
        
        bd = day + "-" + month + "-" + year;
        
        str.append(bd);
        
        return str.toString();
      
}
    
    private static final String SALT_PAROLA = "2[M#7&";

    public static String getHashParola(String parola) {
        String parolaCriptata = parola + SALT_PAROLA;
        try {
            byte[] hash = MessageDigest.getInstance("SHA-256").digest(parolaCriptata.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException ignored) {
            return "";
        }
    }
}

