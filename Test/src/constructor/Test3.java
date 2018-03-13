package constructor;

public class Test3 {
	public Test3(char c) {
		this(1305102025);
		System.out.println("Gender: "+c);
	}
	public Test3(int i){
		this("Prakash");
		System.out.println("Roll no: "+i);
	}
	public Test3(String s){
		System.out.println("My name is: "+s);
	}

	public static void main(String[] args) {
		Test3 t=new Test3('M');
		
	}
}
