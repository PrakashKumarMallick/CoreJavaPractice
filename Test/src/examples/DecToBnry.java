package examples;

import java.util.Scanner;

public class DecToBnry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A no:");
		int i=sc.nextInt();
		String s="";
		while(i!=0){
			s=s+(i%2);
			i=i/2;
			
		}
		String s1="";
		for(int j=s.length()-1;j>=0;j--){
			s1=s1+s.charAt(j);
		}
		System.out.println(s1);
	}

}
