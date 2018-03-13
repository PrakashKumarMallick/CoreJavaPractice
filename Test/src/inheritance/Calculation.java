package inheritance;

import java.util.Scanner;

class MyMethods {
	public void addition(int a,int b){
		int c=a+b;
		System.out.println("Sum Of the Given Nos:"+c);
	}
	public void substraction(int a,int b){
		System.out.println(a>b?"Difference between the Given Nos:"+(a-b):"Difference between the Given Nos:"+(b-a));
	}
}

public class Calculation extends MyMethods{
	public void doOperation(int a,int b){
		super.addition(a, b);
		super.substraction(a, b);		
	}
	public static void main(String[] args) {
		Calculation ob=new Calculation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		ob.doOperation(a, b);
		sc.close();
	}

}
