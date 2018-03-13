package exam;

public class Test3 {
	public void foo(boolean a, boolean b){
		if(a){
			System.out.println("A");
		}else if(a&&b){
			System.out.println("A&&B");
		}else{
			if(!b){
				System.out.println("notB");
			}else{
				System.out.println("ELSE");
			}
		}
	}
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.foo(false,true);
	}

}
