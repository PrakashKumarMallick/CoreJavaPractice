
public class LoopTest {
	static String o="";
	public static void main(String[] args) {
		for(int i=2;i<7;i++){
			if(i==3)continue;
			if(i==6)break;
			o=o+i;
		}
		System.out.println(o);
	}

}
