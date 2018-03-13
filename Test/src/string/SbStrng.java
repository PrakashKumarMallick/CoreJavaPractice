package string;

public class SbStrng {

	public static void main(String[] args) {
		String s="i-noesis solutions";
		String s1=s.substring(0,1);
		String s2=s.substring(2,18);
		System.out.println(s1+s2);
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
