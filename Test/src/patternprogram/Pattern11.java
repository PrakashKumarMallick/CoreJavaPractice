package patternprogram;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int odd=1;
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0||j==0||i==n-1||j==n-1||j==i||j==(n-1)-i){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			odd=odd+2;
			System.out.println();
		}
	}
}
