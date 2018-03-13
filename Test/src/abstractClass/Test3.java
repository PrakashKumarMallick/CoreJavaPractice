package abstractClass;

abstract class T{
	abstract void show();
}
public class Test3 {

	public static void main(String[] args) {
		T ob=new T(){
			public void show(){
				System.out.println("Abstract class object created");
			}
		};
		ob.show();
	}

}
