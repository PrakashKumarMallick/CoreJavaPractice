import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n=sc.nextInt();
		int rev=0,temp=n;
		while(n>0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println(rev==temp?"Palindrom":"Not palindrom");
		sc.close();
	}

}
