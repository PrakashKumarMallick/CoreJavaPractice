import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lift No...:");
		int f=sc.nextInt();
		if(f<=12){
			System.out.println("floor no is "+f);
		}
		else{
			--f;
			System.out.println("Floor no is "+f);
		}
		sc.close();
	}

}
