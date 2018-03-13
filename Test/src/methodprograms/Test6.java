package methodprograms;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Sum of Two Nos");
		System.out.println("2.Sum of Three Nos");
		int opt=sc.nextInt();
		switch(opt){
		case 1:	System.out.println("Enter Two Nos:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				sum(a,b);
				break;
		case 2:	System.out.println("Enter Three Nos:");
				int i=sc.nextInt();
				int j=sc.nextInt();
				int k=sc.nextInt();
				sum(i,j,k);
				break;
		default: System.out.println("Invalid Option");
		}
		sc.close();
	}
	static void sum(int a,int b){
		System.out.println("Sum is: "+(a+b));
	}
	static void sum(int a,int b,int c){
		System.out.println("Sum is: "+(a+b+c));
	}
}
