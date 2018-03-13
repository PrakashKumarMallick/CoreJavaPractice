package string;

public class MaxOccur {

	public static void main(String[] args) {
		String s="inoesis solutions";
		char ch = 0;
		int max=0,count=0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				count++;
			}else{
				if(count>max){
					max=count;
					ch=s.charAt(i);
				}
				count=0;
			}
		}
		System.out.println(ch); 
	}
}