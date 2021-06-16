package com.vishnu;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import database.UserData;


public class User  {
	private static String doHashing(String s) throws NoSuchAlgorithmException {
      MessageDigest ms = MessageDigest.getInstance("SHA-224");
      ms.update(s.getBytes());
      byte[] result=ms.digest();
      StringBuilder sb =new StringBuilder();

      for(byte b:result){
          sb.append(String.format("%02x",b));
      }
      return sb.toString();
  }
	
	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Email");
		String email=sc.next();
		System.out.print("Enter the Password");
		String password=sc.next();
		
		UserData obj=new UserData();
		String pass=doHashing(password);
		
		String check=obj.check(email);
		if(check.equals("")) {
			System.out.print("Invalid Username or Password");
		}
		else if(check.equals(pass)) {
			System.out.print("Login Successfully");
		}
		else {
			System.out.print("Invalid Username or Password");
		}
			
	}
				
}
