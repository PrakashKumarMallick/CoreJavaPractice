import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of Ram:");
		int r=sc.nextInt();
		System.out.println("Enter age of Shyam:");
		int s=sc.nextInt();
		System.out.println("Enter age of Hari:");
		int h=sc.nextInt();
		System.out.println("Enter age of Krishna:");
		int k=sc.nextInt();
		System.out.println("Enter age of Dama:");
		int d=sc.nextInt();
		double avg=(r+s+h+k+d)/5;
		System.out.println("Enter age of all student is:"+avg);
		sc.close();		
	}
}
