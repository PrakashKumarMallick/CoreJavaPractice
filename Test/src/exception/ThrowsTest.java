package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsTest {
	public static void devide()throws ArithmeticException,InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int i=sc.nextInt();
		System.out.println("enter 2nd no");
		int j=sc.nextInt();
		int devide=i/j;
		System.out.println(devide);
	}
	public static void main(String[] args) {
		try{
			ThrowsTest.devide();
		}catch(ArithmeticException e){
			System.out.println("Entered 0");
		}catch(InputMismatchException e){
			System.out.println("Enter a valid no");
		}
	}

}
