
public class WordCount {

	public static void main(String[] args) {
		String s="WelCome to I-noesis solution";
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='\n'){
				count++;
			}
		}System.out.println(++count);
	}

}
