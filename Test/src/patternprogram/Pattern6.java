package patternprogram;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		char k='A';
		for(int i=1;i<=s;i++){
			for(int j=1;j<=i;j++){
				if(j<=i){
					System.out.print(k);
					System.out.print(" ");
					k++;			
				}
				else
					System.out.print(" ");
			}
			//k++;	//Uncomment this line and comment 17 & 23 line and see the magic
			k='A';	//Comment this line & 22 and see the magic
			System.out.print("\n");
		}
	}

}
