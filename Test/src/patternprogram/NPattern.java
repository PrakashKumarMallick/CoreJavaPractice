package patternprogram;

import java.util.Scanner;

public class NPattern{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		for(int i=0;i<s;i++){
			for(int j=0;j<s;j++){
				if((j==0)||(j==i)||(j==s-1)){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}System.out.print("\n");
		}
	}

}
