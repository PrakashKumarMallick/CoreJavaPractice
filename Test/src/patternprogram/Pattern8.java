package patternprogram;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j<=n-1&&j>=i){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
