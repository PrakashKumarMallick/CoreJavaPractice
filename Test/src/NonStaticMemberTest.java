class OuterClass1{
	static int a=10;
	int b=20;
	int i=5;
	class NMSC{
		//static int i=5;
		int i=6;
		void m1(){
			System.out.println(a+b+OuterClass1.this.i+i);
			System.out.println("m1 is called");
		}
		class NNMSC{
			int j=7;
			void m2(){
				System.out.println("m2 is called");
			}
		}
	}
}
public class NonStaticMemberTest {

	public static void main(String[] args) {
		OuterClass1 o=new OuterClass1();
		OuterClass1.NMSC ob=o.new NMSC();
		OuterClass1.NMSC.NNMSC ob1=ob.new NNMSC();
		System.out.println(OuterClass1.a);
		System.out.println(o.b);
		System.out.println(ob.i);
		ob.m1();
		System.out.println(ob1.j);
		ob1.m2();
	}

}
