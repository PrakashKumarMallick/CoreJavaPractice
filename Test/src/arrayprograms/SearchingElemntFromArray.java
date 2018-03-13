package arrayprograms;

import java.util.Scanner;

public class SearchingElemntFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements u want in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the data into array");
		for(int i=0;i<n;i++){
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element for searching");
		int e=sc.nextInt();
		String s=null;
		for(int i=0;i<n;i++){
			if(i==1){
				s="st";
			}else if(i==3){
				s="rd";
			}else{
				s="th";
			}
			if(arr[i]==e){
				System.out.println("Element is found in "+i+s+" position");
			}
		}
		sc.close();
	}
}
