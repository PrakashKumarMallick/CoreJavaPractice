package constructor;

public class ConstOverloading {
	public int a;
	private float b;
	protected int c;
	ConstOverloading(int i,float f){
		c=i;
		b=f;
		System.out.println(c+b);
	}
	ConstOverloading(float f,int i){
		a=i;
		b=f;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConstOverloading m=new ConstOverloading(10,12.5f);
		ConstOverloading m1=new ConstOverloading(12.5f,10);
	}
}
