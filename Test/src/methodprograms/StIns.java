package methodprograms;

public class StIns {
	static int m;
	int n;
	public static void main(String[] args) {
		StIns.m=20;
		StIns t=new StIns();
		t.n=30;
		t.m=40;
		StIns t1=new StIns();
		t1.n=45;
		System.out.println(m);
		System.out.println(t.n);
		System.out.println(t1.m);
		System.out.println(t1.n);
		StIns.m=50;
		System.out.println(t.m);
		System.out.println(t1.m);
		System.out.println(t.n);
	}

}
