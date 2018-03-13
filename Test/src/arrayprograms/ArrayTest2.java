package arrayprograms;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int a[]={44,1,3,4,6,7,99,3,100};
		System.out.println("Enter a No to search from array");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++){
			if(a[i]==n){
				System.out.println("Number found");
				break;
			}
		}
		sc.close();
	}

}
