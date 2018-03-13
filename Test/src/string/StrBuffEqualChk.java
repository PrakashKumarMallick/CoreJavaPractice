package string;

public class StrBuffEqualChk {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("prakash");
		StringBuffer sb1=new StringBuffer("prakash");
		String s=new String("Prakash");
		String s1=new String("Prakash");
		String s2="Prakash";
		String s3="Prakash";
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

}
