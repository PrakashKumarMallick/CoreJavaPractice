package exam;
class Base{
	public void aMethod(int i){
		System.out.println("value is "+i);
	}
}
public class Sub extends Base{
	public void aMethod(int i){				//Method Overriding
		System.out.println("value is "+i);
	}
	public void aMethod(String s){			//Method Overloading
		System.out.println("Name is "+s);
	}
	public static void main(String[] args) {
		Base b=new Base();
		Sub s=new Sub();
		b.aMethod(5);
		s.aMethod("Java");

	}

}
