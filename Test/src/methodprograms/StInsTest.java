package methodprograms;

public class StInsTest {
	static int i=10;
	int j=20;
	public static void staticDisplay(){
		System.out.println(i);
	}
	public void instanceDisplay(){
		System.out.println(j);
	}
	static{
		StInsTest.staticDisplay();
		StInsTest sit=new StInsTest();
		sit.instanceDisplay();
	}
	public static void main(String []args){
		
	}
}
