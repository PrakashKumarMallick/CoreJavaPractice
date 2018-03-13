package string;

public class StrBuff {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("mate");
		String s="bird";
		sb.setCharAt(0,s.charAt(s.length()-1));
		System.out.println(sb);
	}
}
