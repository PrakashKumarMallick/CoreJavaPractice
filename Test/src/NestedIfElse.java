import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark");
		int mark=sc.nextInt();
		if(mark>=60){
			if(mark>=75){
				System.out.println("Excellent");
			}
			else{
				System.out.println("very good");
			}
		}else{
			if(mark>=50){
				System.out.println("just pass");
			}
			else{
				System.out.println("fail");
			}
		}
	}

}
