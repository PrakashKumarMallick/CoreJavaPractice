import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		/*if(n%2==0)
			System.out.println(+n+" Is a Even no...");
		else
			System.out.println(+n+" Is a Odd no...");
		sc.close();*/
		System.out.println(n%2==0?+n+"is a even no":+n+"is a odd no");
	}

}
