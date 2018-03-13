package exception;

public class Average1 {
	public static void printAverage(int tsum,int tnum){
		int average=0;
		try{
			computeAverage(tsum, tnum);
		}
		catch(ArithmeticException e){
			System.out.println("Denominator is ="+tnum);
		}
		System.out.println("Average ="+average);
		System.out.println("exit printAverage");
	}
	public static int computeAverage(int sum,int num){
		System.out.println("Computing average");
		return sum/num;
	}
	public static void main(String[] args) {
		printAverage(100,0);
		System.out.println("Exit Main()");
	}

}
