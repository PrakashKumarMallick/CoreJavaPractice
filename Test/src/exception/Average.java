package exception;

public class Average {
	public static void printAverage(int tsum,int tnum){
		int average=computeAverage(tsum, tnum);
		System.out.println("Average ="+average);
		System.out.println("exit printAverage");
	}
	public static int computeAverage(int sum,int num){
		System.out.println("Computing average");
		try {
			return sum/num;
		} catch (ArithmeticException e) {
			System.out.println("Denominator is ="+num);
			
		}
		return 0;
	}
	public static void main(String[] args) {
		printAverage(100,0);
		System.out.println("Exit Main()");
	}

}
