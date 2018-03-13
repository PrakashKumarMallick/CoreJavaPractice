package inheritance;

public class Test7 {
	public double subtractNumbers(byte arg1, int arg2, int arg3) {
		double sum = arg1 + arg2 + arg3;
		return sum;
		}
	public static void main(String[] args) {
		Test7 t=new Test7();
		byte b=12;
		double d=t.subtractNumbers(b, 13, 12);
		System.out.println(d);
	}

}
