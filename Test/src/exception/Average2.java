package exception;
public class Average2 {
	public static void printAverage(int tsum,int tnum){
		int average=computeAverage(tsum, tnum);
		System.out.println("Average ="+average);
		System.out.println("exit printAverage");
	}
	public static int computeAverage(int sum,int num){
		System.out.println("Computing average");
		return sum/num;
	}
	public static void main(String[] args) {
		try {
			printAverage(100,0);
		} catch (ArithmeticException e) {
			System.out.println("Denomination is 0...");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
		}
		System.out.println("Exit Main()");
	}
}
