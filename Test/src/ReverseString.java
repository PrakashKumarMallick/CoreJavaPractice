
public class ReverseString {
	static String reverse(String name){
		if(name==null){
			return name;
		}
		String reverse="";
		for(int i=name.length()-1;i>=0;i--){
			reverse=reverse+name.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		String n="PraKash";
		System.out.println("Orginal String "+n);
		System.out.println("Reverse String "+reverse(n));
	}
}
