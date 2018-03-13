package inheritance;

class X1{
	int a=5;
	int b=6;
	X1(){
		System.out.println("No arg cons of X1 class");
	}
	X1(int i){
		System.out.println("One arg const of X1 class");
	}
	void sum(){
		System.out.println(a+b);
	}
}

class Y1 extends X1{
	int c=7,d=8;
	Y1(int i){
		System.out.println("One arg const of Y1 class");
	}
	Y1() {
		System.out.println("No arg const of Y1 class");
	}
	void sum1(){
		System.out.println(a+b+c+d);
	}
}

class Z1 extends Y1{
	int e=9,f=10;
	void sum2(){
		System.out.println(a+b+c+d+e+f);
	}
}

public class Test3{
	public static void main (String args[]){
		Y1 ob=new Y1();
		Y1 ob1=new Y1(5);
		Z1 ob2=new Z1();
		ob.sum();
		ob.sum1();
		ob1.sum1();
		ob2.sum2();
	}
}