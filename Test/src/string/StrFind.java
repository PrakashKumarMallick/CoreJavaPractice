package string;

public class StrFind {

	public static void main(String[] args) {
		String s="Hello world Hello world Hello world Hello world java core five Hello";
		int c=0,c1=0;
		for(int i=0;i<s.length();){
			int k=s.indexOf("Hello",i);
			System.out.println(k);
			i=k+5;
			c++;
		}
		for(int j=0;j<s.length();){
			int l=s.indexOf("world",j);
			j=l+5;
			c1++;
		}
		System.out.println("No of hello in given string is "+c);
		System.out.println("No of world in given string is "+c1);
	}
}
