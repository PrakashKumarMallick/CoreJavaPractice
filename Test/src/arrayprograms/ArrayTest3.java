package arrayprograms;

public class ArrayTest3 {

	public static void main(String[] args) {
		int a[]={44,1,3,4,6,7,99,3,100};
		int max=0, min=1000;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
