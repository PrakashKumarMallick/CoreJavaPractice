package patternprogram;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		int k=0;
		for(int i=0;i<n;i++)
		{
			int m=(i<=(n/2-1)?k++:k--);
			for(int j=0;j<n;j++)
			{
				if(j>=n/2-m&&j<=n/4+m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
