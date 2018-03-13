package string;

import java.util.Scanner;

public class IndexChk {

	public static void main(String[] args) {
		/*String s="inoesis solutuions";
		for(int i=0;i<s.length();){
			int x=s.indexOf('s',i);
			System.out.println(x);
			i=++x;
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a char to know index");
		char c=sc.next(".").charAt(0);
		for(int i=0;i<s.length();){
			int x=s.indexOf(c,i);
			System.out.println(x);
			i=++x;
		}
	}

}
