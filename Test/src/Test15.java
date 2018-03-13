import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v[]={44,1,3,4,6,7,4,99,3,100,4};
		int count=0;
		System.out.println("********************************");
		System.out.println("* 1.fIND EVEN NO FROM ARRAY    *");
		System.out.println("* 2.SEARCH GIVEN NO FROM ARRAY *");
		System.out.println("* ENTER YOUR CHOICE            *");
		System.out.println("********************************");
		int i=sc.nextInt();
		switch(i){
		case 1:	for(int j=0;j<v.length;j++){
					if(v[j]%2==0){
						System.out.println(v[j]);
						count++;
					}
				}
				System.out.println(count+" even no present in this array");
				break;
		case 2: System.out.println("Enter no to search: ");
				int j=sc.nextInt();
				for(int k=0;k<v.length;k++){
					if(v[k]==j){
						count++;
					}
				}
				if(count!=0){
					System.out.println("no found "+count+" times");
				}
				else{
					System.out.println("no not found");
				}
		}
	}
}
