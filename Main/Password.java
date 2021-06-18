package Main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class Password {

	public static Object checkPass(String str) throws ClassNotFoundException, SQLException {
		String query="select password from pwdtable where userid='"+str+"' ";
		return sqldatabase.Functions.select(query);
		
	}
	
	public static void changePassword() {
		
	}
	
	public static String doHashing(String s) throws NoSuchAlgorithmException {
	      MessageDigest ms = MessageDigest.getInstance("SHA-224");
	      ms.update(s.getBytes());
	      byte[] result=ms.digest();
	      StringBuilder sb =new StringBuilder();

	      for(byte b:result){
	          sb.append(String.format("%02x",b));
	          
	      }
	      return sb.toString();
	  }

}
