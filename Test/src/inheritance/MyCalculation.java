package inheritance;

import java.util.Scanner;

public class MyCalculation extends Calculation{
	public void multiplication(int a,int b){
		int c=a*b;
		System.out.println("Product Of the Given Nos:"+c);
	}
	public static void main(String[] args) {
		MyCalculation ob=new MyCalculation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		ob.addition(a, b);
		ob.substraction(a, b);
		ob.multiplication(a,b);
		sc.close();
	}
}
