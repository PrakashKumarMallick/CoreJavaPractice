package patternprogram;

import java.util.Scanner;

public class NewPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		for(int i=0;i<s;i++){
			for(int j=0;j<s;j++){
				if(j==0||j==s-1||i==0||i==s-1||j==i){
					System.out.print("*");
				}else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
