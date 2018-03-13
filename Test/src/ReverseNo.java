import java.util.Scanner;

public class ReverseNo {
	
	static int reverse(int i){
		int j=0;
		while(i!=0){
			j=j*10;
			j=j+i%10;
			i=i/10;
		}
		return j;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int i=sc.nextInt();
		System.out.println("Reverse of this no "+reverse(i));
		sc.close();
	}

}
