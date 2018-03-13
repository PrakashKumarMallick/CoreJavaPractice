package patternprogram;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
