package exam;
class X{
	
}
class Y extends X{
	
}
class Z extends Y{
	
}
public class Yipp {
	void m1(X a){
		System.out.println("X");
	}
	void m1(Y b){
		System.out.println("Y");
	}
	void m1(Z c){
		System.out.println("Z");
	}
	public static void main(String[] args) {
		X c1=new Z();
		Y c2=new Z();
		Z c3=new Z();
		Yipp c4=new Yipp();
		c4.m1(c1);
		c4.m1(c2);
		c4.m1(c3);
	}

}
