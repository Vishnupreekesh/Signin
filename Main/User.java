package Main;

import java.util.Map;
import java.util.*;

public class User {
	String firstname;
	String lastname;
	String password;
	int status;
	Map<String,Integer> map=new TreeMap<String,Integer>();
	
	User(String firstname,String lastname,int status,String password,Map map){
		this.firstname=firstname;
		this.lastname=lastname;
		this.status=status;
		this.password=password;
		this.map=map;
	}
	
	public static void getUserid() {
		
	}
	
	public static void getEmail() {
		
	}

	public static void getPassword() {
	
	}
}
