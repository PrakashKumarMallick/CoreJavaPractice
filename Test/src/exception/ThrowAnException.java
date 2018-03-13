package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowAnException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("ENter 1st no:");
			int a=sc.nextInt();
			System.out.println("ENter 2nd No:");
			int b=sc.nextInt();
			sc.close();
			if(b==2){
				throw new ArithmeticException("/ by two");
			}
			int res=a/b;
			System.out.println("Result"+res);
		}catch(InputMismatchException e){
			System.out.println("enter valid no");
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
