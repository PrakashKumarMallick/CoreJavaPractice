import java.util.Scanner;

public class TestIF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive No...");
		}
		else
			System.out.println("Negative No...");
		sc.close();
	}

}
