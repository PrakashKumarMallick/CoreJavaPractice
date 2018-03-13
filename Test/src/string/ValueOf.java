package string;

public class ValueOf {

	public static void main(String[] args) {
		char ch[]={97,98,99};
		int i=45624;
		String s=String.valueOf(ch);
		s=s+String.valueOf(i);
		System.out.println(s);
	}

}
