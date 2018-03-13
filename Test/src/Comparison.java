import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three nos:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		int max=i>j?(i>k?i:k):(j>k?j:k);
		int min=i<j?(i<k?i:k):(j<k?j:k);
		System.out.println("max="+max);
		System.out.println("min="+min);
		sc.close();
	}

}
