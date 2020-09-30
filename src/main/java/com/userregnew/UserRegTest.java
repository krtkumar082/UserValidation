package com.userregnew;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegTest {
	public static boolean checkFname(String fname) {
			            Pattern p1 =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
			            Matcher m1 = p1.matcher(fname);
			            boolean matchfound1 = m1.find();
			            return matchfound1;
	         }
	public static boolean checkLname(String lname) {
		Pattern p2 =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher m2 = p2.matcher(lname);
        boolean matchfound2 = m2.find();
        return matchfound2;
	}
	public static boolean checkEmail(String email) {
		Pattern p3 =Pattern.compile("^[a-z]([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}");
        Matcher m3 = p3.matcher(email);
        boolean matchfound2 = m3.find();
        return matchfound2;
	}
	public static boolean checkPhoneNumber(String number) {
		Pattern p4 =Pattern.compile("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
        Matcher m4 = p4.matcher(number);
        boolean matchfound2 = m4.find();
        return matchfound2;
	}
	public static boolean checkPsswd(String passwd) {
		Pattern p5 =Pattern.compile("(?=.*[@#$%])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]){8,}");
        Matcher m5 = p5.matcher(passwd);
        boolean matchfound2 = m5.find();
        return matchfound2;
	}
public static void main(String[] args) {
	System.out.println("Welcome to User Registration");
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Enter first name (Starts with capital)");
    String fname = sc.nextLine();
    if(checkFname(fname)) {
    	break;
    }
    else {
    	System.out.println("Invalid Input(Start with capital and should have min 3 charcaters)");
    }
}while(true);
	
	do {
		System.out.println("Enter last name (Starts with capital)");
	    String lname = sc.nextLine();
	    if(checkLname(lname)) {
	    	break;
	    }
	    else {
	    	System.out.println("Invalid Input(Start with capital and should have min 3 charcaters)");
	    }
	}while(true);
	
	do {
		System.out.println("Enter Valid Email");
	    String email = sc.nextLine();
	    if(checkEmail(email)) {
	    	break;
	    }
	    else {
	    	System.out.println("Invalid Input");
	    }
	}while(true);
	
	do {
		System.out.println("Enter Valid Phone Number");
	    String number = sc.nextLine();
	    if(checkPhoneNumber(number)) {
	    	break;
	    }
	    else {
	    	System.out.println("Invalid Input");
	    }
	}while(true);
	
	do {
		System.out.println("Enter Valid Psswd");
	    String passwd = sc.nextLine();
	    if(checkPsswd(passwd)) {
	    	System.out.println("Valid Input");
	    	break;
	    }
	    else {
	    	System.out.println("Invalid Input");
	    }
	}while(true);
}
}
