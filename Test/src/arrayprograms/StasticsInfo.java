package arrayprograms;

import java.util.Scanner;

public class StasticsInfo {

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
		BubbleSort(arr,arr.length);
		System.out.println("\nArray elements after sorting in ascending order");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		Mean(arr,n);
	}
	public static void BubbleSort(int a[],int n) {
		for(int i=0;i<n;i++){
			for(int j=n-1;j>0;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	public static void Mean(int a[],int n){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("mean ="+sum/n);
	}
}
