package string;
//DEKSHAA APPROACH
public class StrChk {

	public static void main(String[] args) {
		String s="inoesis solution";
		for(int i=0;i<s.length();i++){
			int x=s.indexOf('s',1);
			i=++x;
			System.out.println(i);
		}
	}
}
