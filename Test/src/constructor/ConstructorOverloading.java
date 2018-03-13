package constructor;

public class ConstructorOverloading {
	int i;
	int j;
	int k;
	String s;
	char c;
	public ConstructorOverloading(){
		System.out.println("no argument constructor");
	}
	public ConstructorOverloading(int k){
		System.out.println("One Argument constructor");
		System.out.println(k);
	}
	public ConstructorOverloading(int k,int l){
		System.out.println("Two Argument constructor");
		System.out.println(k+" "+l);
	}
	public ConstructorOverloading(int a,int b,int c){
		System.out.println("Three Argument constructor");
		System.out.println(a+" "+b+" "+c);
	}
	public ConstructorOverloading(int a,char c,String s, int b){
		System.out.println("Four Argument constructor");
		System.out.println(a+" "+c+" "+s+" "+b);
	}
	public static void main(String[] args) {
		ConstructorOverloading c=new ConstructorOverloading();
		ConstructorOverloading c1=new ConstructorOverloading(12);
		ConstructorOverloading c2=new ConstructorOverloading(13,14);
		ConstructorOverloading c3=new ConstructorOverloading(15,16,17);
		ConstructorOverloading c4=new ConstructorOverloading(18,'A',"Prakash",19);
	}

}
