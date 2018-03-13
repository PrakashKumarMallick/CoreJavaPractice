import java.util.Scanner;

public class SimpleIntrestUsingIFElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Ammount:");
		int p=sc.nextInt();
		System.out.println("Rate of interest");
		double r=sc.nextDouble();
		System.out.println("Tenure");
		double t=sc.nextDouble();
		if(p>0&&r>0&&t>0){
		double sum=(p*t*r)/100;
		System.out.println(sum);
		}
		else
			System.out.println("use positive no...");
		sc.close();
	}
	
}
