package methodprograms;
//takes something returns something
public class Test3 {

	public static void main(String[] args) {
		Test3 t=new Test3();
		int res=t.sum(12,13);
		System.out.println("sum is "+res);
	}
	public int sum(int i, int j){
		return i+j;
	}

}
