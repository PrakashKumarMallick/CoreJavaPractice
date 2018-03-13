package exam;
class Text1{
	public Text1(){
		i++;
		System.out.println(i);
	}
	int i;
	void see(){
		i+=2;
	}
}
class Text2 extends Text1{
	public Text2(){
		i+=2;
		System.out.println(i);
	}
	public void see(){
		super.see();
		i+=2;
	}
}
class Text3 extends Text2{
	public Text3(){
		i+=2;
		System.out.println(i);
	}
	public void see(){
		super.see();
		i+=2;
	}
}
public class Test6 {

	public static void main(String[] args) {
		Text1 t=new Text1();
		Text2 t1=new Text2();
		Text3 t2=new Text3();
		t.see();
		t1.see();
		t2.see();
		System.out.println(t.i);
		System.out.println(t1.i);
		System.out.println(t2.i);
	}

}
