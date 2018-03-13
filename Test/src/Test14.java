

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat d1=new DecimalFormat("#.##");//using to print decimal no up to two values with rounding up
		System.out.println("Enter a Decimal no:");
		double d=sc.nextDouble();
		System.out.println("Entered No is:"+d1.format(d));
		System.out.println("Enter a char");
		char c=sc.next().charAt(1);
		System.out.println(c);
		sc.close();
	}

}
