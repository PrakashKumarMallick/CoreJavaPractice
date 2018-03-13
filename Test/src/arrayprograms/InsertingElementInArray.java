package arrayprograms;

import java.util.Scanner;

public class InsertingElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements u want in the array");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter the data into array");
		for(int i=0;i<n;i++){
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements before insertion");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("Enter the element");
		int x=sc.nextInt();
		System.out.println("Enter the position ");
		int pos=sc.nextInt();
		for(int i=n; i>pos; i--){
			arr[i] = arr[i-1];
	    }
		arr[pos] = x;
		System.out.println("Array Elements after insertion");
		for(int i=0;i<n+1;i++){
			System.out.print(arr[i]+",");
		}
		sc.close();
	}

}
