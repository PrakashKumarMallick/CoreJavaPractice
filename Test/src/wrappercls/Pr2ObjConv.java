package wrappercls;

public class Pr2ObjConv {

	public static void main(String[] args){
		int i=10;
		Integer iobj=new Integer(i);
		Integer iob=new Integer(20);
		System.out.println(iobj);
		System.out.println(iob);
		String s="100";
		Integer io=new Integer(s);
		System.out.println(io+2);
		String s1="True";
		String s2="pk";
		Boolean b=new Boolean(s1);
		Boolean b1=new Boolean(s2);
		System.out.println(b);
		System.out.println(b1);
	}
}
