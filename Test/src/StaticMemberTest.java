class OuterClass{
	static int x=20;
	static class SMC{
		static int a=10;
		int b=20;
		static void m1(){
			System.out.println("m1 is called");
		}
		void m2(){
			System.out.println("Instance m2() is called");
		}
		static class NSMC{
			static void m3(){
				System.out.println("m3 is called");
			}
			void m4(){
				System.out.println("Instance m4() is called");
			}
		}
	}
	static class SMC2{
		
	}
}
public class StaticMemberTest {

	public static void main(String[] args) {
		System.out.println(OuterClass.x);
		System.out.println(OuterClass.SMC.a);
		OuterClass.SMC.m1();
		OuterClass.SMC.NSMC.m3();
		OuterClass.SMC o=new OuterClass.SMC();
		System.out.println(o.b);
		o.m2();
		OuterClass.SMC.NSMC ob=new OuterClass.SMC.NSMC();
		ob.m4();
	}

}
