package methodprograms;
public class MergArray {
	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]={4,5,6,7};
		MergArray.mergarray(a,b);
	}
	static void mergarray(int x[],int y[]){
		int a=x.length+y.length;
		int c[]=new int[a];
		for(int i=0,j=0;i<c.length;i++){
			if(i<x.length){
				c[i]=x[i];
			}
			else{
				c[i]=y[j];
				j++;
			}
		}
			for(int arr:c)
			System.out.println(arr);
	}
}
