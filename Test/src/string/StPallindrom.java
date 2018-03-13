package string;

import java.util.Scanner;

public class StPallindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev.equalsIgnoreCase(s)?"Pallindrom":"Not A Pallindrom");
		sc.close();
	}
}
