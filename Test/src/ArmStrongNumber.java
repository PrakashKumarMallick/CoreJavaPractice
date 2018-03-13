import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		int no=n;
		int arm=0,a=0;
		while(n>0){
			a=n%10;
			n=n/10;
			arm=arm+(a*a*a);
		}
		System.out.println(arm==no?"Armstrong Number":"Not a ArmStrong Number");
	}

}
