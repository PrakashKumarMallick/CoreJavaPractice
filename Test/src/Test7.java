import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter 1st no:");
		int i=a.nextInt();
		System.out.println("enter 2nd no:");
		int j=a.nextInt();
		int sum=i+j;
		System.out.println(sum);
		a.close();
	}

}
