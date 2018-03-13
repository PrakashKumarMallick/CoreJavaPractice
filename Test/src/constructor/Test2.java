package constructor;

public class Test2 {
	public Test2(int a){
		System.out.println("One arg const & value is: "+a);
		System.out.println("-----------------------------");
	}
	public Test2(int a,int b){
		this(13);
		System.out.println("Two arg const & value are: "+a+" "+b);
		System.out.println("-----------------------------");
	}
	public Test2(int a, int b, int c){
		this(16,17);
		System.out.println("Three arg const & value are: "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Test2 t=new Test2(12);
		Test2 t1=new Test2(14,15);
		Test2 t2=new Test2(18,19,20);
	}

}
