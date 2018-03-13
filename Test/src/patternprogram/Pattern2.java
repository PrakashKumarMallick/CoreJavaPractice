package patternprogram;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++){
			for(int j=1;j<=i;j++){
				if(j<=i){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
