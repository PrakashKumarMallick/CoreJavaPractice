import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String s=sc.nextLine();
		System.out.println("Entered String :"+s);
		System.out.println("Reversed String :"+revString(s));
	}
	public static String revString(String rs){
		String r="";
		if(rs!=null){
			for(int i=rs.length()-1;i>=0;i--){
				r=r+rs.charAt(i);
			}
		}
		return r;
	}
}
