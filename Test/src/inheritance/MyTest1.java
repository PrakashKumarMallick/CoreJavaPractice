package inheritance;
class Test9{
	static void m1(){
		System.out.println("m1 of test");
	}
	static void m2(){
		System.out.println("m2 of test");
	}
}

public class MyTest1 extends Test9 {
	static void m1(){
		System.out.println("m1 of mytest");
	}
	static void m1(int i){
		System.out.println("m1 of mytest with int");
	}
	static void m3(){
		System.out.println("m3 of mytest");
	}
	public static void main(String[] args) {
		Test9 t=new Test9();
		Test9 t1=new MyTest1();
		t.m1();
		//t.m1(4);
		t.m2();
		t1.m1();
		//t1.m1(4);
		t1.m2();
		//t1.m3();
	}

}
