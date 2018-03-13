package inheritance;
class X {
	X(){
		System.out.println("X Class");
	}
	void show(){
		System.out.println("Java");
	}
}
class Y extends X{
	Y(){
		System.out.println("Y Class");
	}
	void fun(){
		System.out.println("Learn Java");
	}
}
class Z extends Y{
	Z(){
		System.out.println("Z Class");
	}
}
public class Demo {

	public static void main(String[] args) {
		Z ob=new Z();
		ob.show();
		ob.fun();
	}

}
