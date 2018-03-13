package arrayprograms;

public class ArrayTest {

	public static void main(String[] args) {
		int a[]={44,1,3,4,6,7,99,3,100};
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
			System.out.println(a[i]);
			count++;
			}
		}
		System.out.println("No of even Values in above array is="+count);
		
	}

}
