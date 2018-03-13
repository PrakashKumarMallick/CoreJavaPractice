package inheritance;
class Test2{
	int i=10,j=15;
	void sum(){
		System.out.println(this.i+this.j);
	}
}
class MyTest extends Test2{
	int k=20,l=25;
	void sum1(){
		System.out.println(this.i+this.j+this.k+this.l);
	}
}
public class ClientTest {
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.sum();
		MyTest mt=new MyTest();
		mt.sum();
		mt.sum1();
	}
}
