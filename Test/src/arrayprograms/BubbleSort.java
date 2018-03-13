package arrayprograms;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]={12,25,8,2,50};
		System.out.println("Array elements before sorting");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		BubbleSort(arr,arr.length);
		System.out.println("\nArray elements after sorting in ascending order");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		BubbleSort1(arr,arr.length);
		System.out.println("\nArray elements after sorting in descending order");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}

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
	public static void BubbleSort1(int a[],int n) {
		for(int i=0;i<n;i++){
			for(int j=n-1;j>0;j--){
				if(a[j]>a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}

}
