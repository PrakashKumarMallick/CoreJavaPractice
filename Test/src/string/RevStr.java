package string;

public class RevStr {

	public static void main(String[] args) {
		String s="i-noesis solutions";
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
