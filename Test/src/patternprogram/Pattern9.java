package patternprogram;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<(n*2)-1;j++){
				if(j<=i||j>=(((n*2)-1)-1)-i){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
