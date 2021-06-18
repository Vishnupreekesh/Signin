package sqldatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Functions {
	
	public static void create(String query) {
		
	}
	
	public static void insert(String query) {
		
	}
	
	public static void delete() {
		
	}

	public static List select(String query) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/userdatabase","root","Vishnu21@");  
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		List li=new ArrayList<>();
		String firstname="",lastname="",password="";
		int status=-1;
		Map<String,Integer> map=new TreeMap<String,Integer>();
		Object obj;
		while(rs.next()) {
			firstname=rs.getString(1);
			lastname=rs.getString(2);
			status=Integer.parseInt(rs.getString(3));
			password=rs.getString(4);
			map.put(rs.getString(6), Integer.parseInt(rs.getString(5)));    
		}	
		if(firstname.equals("")) return null;
		li.add(firstname);
		li.add(lastname);
		li.add(status);
		li.add(password);
		li.add(map);
		return li;
	}
}
