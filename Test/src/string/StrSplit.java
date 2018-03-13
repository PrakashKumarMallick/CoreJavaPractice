package string;

public class StrSplit {

	public static void main(String[] args) {
		String s="Hello world Hello Hello world Hello world Hello Hello world java core five Hello";
		String s1[]=s.split("Hello");
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
		}
	}

}
