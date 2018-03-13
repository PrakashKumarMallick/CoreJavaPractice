
public class NonStaticBlock {
	{
		System.out.println("1st NonStatic Block");
	}
	public NonStaticBlock() {
		System.out.println("Const");
	}
	{
		System.out.println("2nd NonStatic Block");
	}
	public static void main(String[] args) {
		NonStaticBlock nsb=new NonStaticBlock();
		System.out.println("Main block");
	}
	{
		System.out.println("3rd NonStatic Block");
	}
}
