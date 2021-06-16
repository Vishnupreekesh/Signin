package database;

import java.sql.*;

public class UserData {
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
	}

	public String check(String email) throws SQLException, ClassNotFoundException {
//		 TODO Auto-generated method stub
		
	
		String query="select * from emailtable where e_mail='"+email+"' ";
		String userid=select(query);
		String pass="";
		if(!userid.equals("")) {
			String id[]=userid.split(" ");
			String passQuery="Select * from pwdtable where userid='"+Integer.parseInt(id[0])+"'";
			String password[]=select(passQuery).split(" ");
			pass=password[1];
		}
		else {
			return userid;
		}
	return pass;
				
	}
	
	public String select(String query) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");  
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		String res="";

		while(rs.next()) {
			res=rs.getString(1)+" "+rs.getString(2);
		}
		
		return res;
	}

}
