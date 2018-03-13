package string;//Prakash approCH

public class StrCheck{
	
	public static void main(String p[]){
		StrCheck sc=new StrCheck();
		String s="inoesis solutions";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			System.out.println(c+" found"+sc.countChar(s,c)+" no of times");
		}
	}
	public int countChar(String s,char c){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c){
				count++;					
			}
		}
		return count;
	}
}