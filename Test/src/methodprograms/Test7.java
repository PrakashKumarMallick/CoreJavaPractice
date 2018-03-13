package methodprograms;

class Text{
	int i =10,j=15;
	static int k=20;
}
public class Test7 extends Text{
	int i=25;
	static int k=30;
	void sum(){
		System.out.println(super.i+j);
		System.out.println(i+k);
		System.out.println(i+super.k);
	}
	static void sum1(){
		System.out.println(Text.k);
		System.out.println(k);
	}
	public static void main(String[] args) {
		new Test7().sum();
		new Test7().sum1();
	}
}
