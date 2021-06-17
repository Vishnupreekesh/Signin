package sqldatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Functions {
	
	public static void create(String query) {
		
	}
	
	public static void insert(String query) {
		
	}
	
	public static void delete() {
		
	}

	public static String select(String query) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");  
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		String str="";
		while(rs.next()) {
			str=rs.getString(1)+" ";
			str+=rs.getString(2);
		}
		return str;
	}
}
