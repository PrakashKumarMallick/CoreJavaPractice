package inheritance;
class Test1 {
	void show(){
		System.out.println("I am from Super class");
	}
}
class Test extends Test1{
	
}
public class Demo1 {
	public static void main(String[] args) {
		Test ob=new Test();
		ob.show();
	}
}
