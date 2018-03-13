package constructor;
class Test5{
	public void m(){
		m1();
		System.out.println("m of Test5");
	}
	public void m1(){
		System.out.println("m1 of Test5");
	}
	Test5(){
		System.out.println("no arg of 5");
	}
}

public class Test4 extends Test5 {
	Test4(){
		System.out.println("no arg");
	}
	Test4(int a){
		System.out.println("one arg int type");
	}
	Test4(long b){
		System.out.println("one arg long type");
	}
	public void m1(){
		System.out.println("m1 of Test4");
	}
	public static void main(String[] args) {
		Test5 t=new Test4();
		Test4 t1=new Test4(22);
		Test4 t2=new Test4(12L);
		Test4 t3=new Test4(33);
		t.m();

	}

}

