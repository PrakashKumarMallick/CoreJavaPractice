package inheritance;
class One{
	public One() {
		System.out.println("No arg of one");
	}
	public One(int i){
		System.out.println("One arg of one");
	}
}
class Two extends One{
	public Two(){
		System.out.println("No arg of Two");
	}
	public Two(int i){
		System.out.println("One arg of two");
	}
}
public class Main {

	public static void main(String[] args) {
		Two t=new Two(3);
	}

}
