package patternprogram;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		int noofspaces=s-1;
		int odd=1;
		for(int i=1;i<=s;i++){
			for(int j=1;j<=noofspaces;j++){
				System.out.print("  ");
			}
			int k=0;
			for(int j=1;j<=odd;j++){
				int l=(j<=i)?(k+=1):(k-=1);
				System.out.print(l);
				System.out.print(" ");
			}
			odd+=2;
			System.out.print("\n");
			noofspaces-=1;
		}
	}

}
