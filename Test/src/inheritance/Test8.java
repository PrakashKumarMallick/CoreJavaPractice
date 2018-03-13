package inheritance;
class Pk{
	int i=10;
	void show(){
		System.out.println(i);
	}
	{
		System.out.println("hi");
	}
	static{
		System.out.println("hello");
	}
}
class Pk1 extends Pk{
	void show(){
		System.out.println(i);
	}
}
class Pk2 extends Pk1{
	int i=5;
	void show(int i){
		System.out.println("show of pk1");
	}
	void add(){
		System.out.println("add");
	}
}
public class Test8{

	public static void main(String[] args) {
		Pk1 p=new Pk1();
		System.out.println(p.i);
	}

}
