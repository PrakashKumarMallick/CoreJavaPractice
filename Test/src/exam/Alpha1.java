package exam;

public class Alpha1 {
	public static void main(String[] args) {
		boolean flag;int i=0;
		do{
			flag=false;
			System.out.println(i++);
			flag=i<10;
			continue;
		}
		while((flag)?true:false);
	}
}
