package Main;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.*;

public class Signin {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email : ");
		String email=sc.next();
		System.out.println("Enter the Password : ");
		String password=sc.next();
		String userid= Email.isAvaliable(email);
		if(!userid.equals("")) {
			if(Password.checkPass(userid).equals(Password.doHashing(password))) {
				System.out.print("Login Successfully");
			}		
			else {
				System.out.print("Invalid Username or Password");
			}
		}
		else {
			System.out.print("Invalid Username or Password");
		}
	}
}
