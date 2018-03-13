package methodprograms;

public class PasngPrimVarTest {
	int i=10;
	public void changeA(int a){
		a+=10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		PasngPrimVarTest at=new PasngPrimVarTest();
		System.out.println(at.i);
		at.changeA(at.i);
		System.out.println(at.i);
	}

}
