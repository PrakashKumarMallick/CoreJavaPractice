package exam;
public class Test11{
	static int i;
	public Test11(){
		i+=4;
		System.out.println(i);
	}
	void show(){
		i++;
		System.out.println(i);
	}
	{
		i+=10;
		System.out.println(i);
	}
	static{
		i+=10;
		System.out.println(i);
	}
	public static void main(String[] args) {
		i/=10;
		System.out.println(i);
		Test11 t=new Test11();
		t.show();
	}
	static{
		i+=10;
		System.out.println(i);
	}
}
