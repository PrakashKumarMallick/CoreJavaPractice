package string;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password length should be>8");
		String pwd=sc.next();
		if(pwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@_.$#])[A-Za-z\\d@_.$#]{8,}")){
			System.out.println("Valid");
		}else{
			System.out.println("Invalid");
			System.err.println("Password must have one uppercase latter"
					+ " one lowercase latter one number and "
					+ "one special charcter");
		}
	}

}
