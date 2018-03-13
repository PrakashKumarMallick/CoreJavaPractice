import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The mark");
		int m=sc.nextInt();
		if(m>=75)
		{
			System.out.println("Excelent...");
		}
		else if(m>=60){
		System.out.println("Very Good...");
		}
		else{
			if(m>=50){
				System.out.println("Just Pass...");
			}
			else{
				System.out.println("Fail...");
			}
		}
		sc.close();
	}
}
