package exception;
class Ex1 extends Exception{
}
class A{
	A()throws Ex1{
		throw new Ex1();
	}
}
class B extends A{
	B()throws Exception{
		throw new Exception();
	}
}
class C extends A{
	C()throws Exception{
	}
}
public class ConstTest {

	public static void main(String[] args) {
		try{
			A aa=new A();
		}catch(Exception e){
			System.out.println("Java");
		}
		try{
			B bb=new B();
		}catch(Exception e){
			System.out.println("C");
		}
		try{
			C cc=new C();
		}catch(Exception e){
			System.out.println("C++");
		}
	}

}