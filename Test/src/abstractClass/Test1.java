package abstractClass;
/*abstract class Test{
	int i=10;
	public abstract void display();
}*/
class Test{
	int i=10;
	Test(){
		System.out.println("Test class");
	}
}//end of Test
class Text extends Test{
	int i;
	/*Text(){
		System.out.println("Text class");
	}*/
}//end of Text
public class Test1 {

	public static void main(String[] args) {
		Test t=new Text();
		System.out.println(t.i);
	}//end of main

}//end of Test1
