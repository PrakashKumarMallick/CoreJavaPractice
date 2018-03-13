import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Ammount:");
		int p=sc.nextInt();
		if(p<0){
			System.out.println("Invalid No...Try again");
		}
		else{
			System.out.println("Rate of interest");
			double r=sc.nextDouble();
		if(r<0){
			System.out.println("Invalid no.. Try again");
		}
		else{
			System.out.println("Tenure");
			double t=sc.nextDouble();
		if(t<0){
			System.out.println("Invalid no...Try again");
		}
		else{
			double sum=(p*t*r)/100;
			System.out.println(sum);
		}
		}
		}
		sc.close();
	}
}
