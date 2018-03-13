package inheritance;

class Test10{
	Test10(){
		System.out.println("cons of test10");
		m1();
	}
	void m1(){
		System.out.println("m1 of test10");
	}
}
class Test4 extends Test10{
	Test4(){
		System.out.println("cons of test4");
		m1();
	}
	void m1(){
		System.out.println("m1 of test4");
	}
	public static void main(String[] args) {
		Test10 t=new Test4();
	}
}
