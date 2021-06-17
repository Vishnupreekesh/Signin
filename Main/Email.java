package Main;

import java.sql.SQLException;

public class Email {

	public static String isAvaliable(String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String query="select userid from emailtable where e_mail='"+email+"' ";
		
		 return sqldatabase.Functions.select(query);
			
	}
	
	public static void addEmail() {
		
	}
	
	public static void changeEmail() {
		
	}

}
