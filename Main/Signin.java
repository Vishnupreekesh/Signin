package Main;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.*;

import sqldatabase.Functions;

public class Signin {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email : ");
		String email=sc.next();
		System.out.println("Enter the Password : ");
		String pass=Password.doHashing(sc.next());
		String query="select userid,e_mail from emailtable where e_mail='"+email+"'and userid=(select userid from pwdtable where password ='"+pass+"')";
		String str=sqldatabase.Functions.select(query);
		if(str.equals("")) {
			System.out.print("Invalid Username or Password");
		}
		else {
			String string[]=str.split(" ");
			User obj=new User(string[0],string[1],pass);
			System.out.print("Login Successfully");
		}
//		
	}
}
