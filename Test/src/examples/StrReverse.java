package examples;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a String");
		String s=sc.next(),s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s.equals(s1)?"Palindrom":"Not A Palindrom");
	}

}
