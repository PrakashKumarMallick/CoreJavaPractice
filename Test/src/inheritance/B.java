package inheritance;
class A {
	int i=10,j=15;
	public void sum() {
		System.out.println(i+j);
	}

}

public class B extends A{
	int k=30;
	public void sum1(){
		i=25;
		System.out.println(i+j+k);
	}
	public static void main(String[] args) {
		B subclsob=new B();
		subclsob.sum1();
		subclsob.sum();
		A supercls=new A();
		supercls.sum();
	}
}
