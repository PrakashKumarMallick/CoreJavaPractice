
public class StaticBlock {
	static{
		System.out.println("1st Static Block");
	}
	static{
		System.out.println("2nd Static Block");
	}
	public static void main(String[] args) {
		System.out.println("Main Block");
	}
	static{
		System.out.println("3rd Static Block");
	}

}
