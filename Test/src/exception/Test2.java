package exception;

import java.util.Scanner;

public class Test2 {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ages of five students ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		double avg=(a+b+c+d+e)/5;
		System.out.println(avg);
	}

}
