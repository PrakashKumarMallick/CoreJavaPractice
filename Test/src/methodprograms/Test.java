package methodprograms;
//Takes Nothing Returns Something
public class Test {
	public static void main(String[] args) {
		Test t=new Test();
		int k=t.sum();
		System.out.println("sum is:-"+k);
	}
	public int sum(){
		int i=10,j=20;
		return i+j;
	}
}
