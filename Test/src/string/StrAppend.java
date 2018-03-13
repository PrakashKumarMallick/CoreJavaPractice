package string;

public class StrAppend {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("core");
		String s="java";
		sb.append(s);
		System.out.println(sb);
		System.out.println((2+2)+"four");
		String s1=4+"four"+"ss"+"dd";
		int i=4;
		String s2=String.valueOf(i)+"four"+"ss"+"dd";
		String s3=new StringBuffer("java").append(4).append("four").append("s").toString();
		System.out.println(s1+" "+s2+" "+s3);
	}
}
