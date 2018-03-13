package inheritance;
class Text{
	final void sum(){
		int i=5,j=6;
		System.out.println(i+j);
	}
}

public class Test5 extends Text{
	/*public void sum(){
		int i=6,j=7;
		System.out.println(i+j);
	}*/

	public static void main(String[] args) {
		Test5 t=new Test5();
		Text t1=new Text();
		t.sum();
		t1.sum();
	}

}
