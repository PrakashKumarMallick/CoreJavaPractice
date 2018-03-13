package abstractClass;
class MyException extends Exception{
	
}
interface ITest{
	public int add(int i,int j)throws ArithmeticException;
}
class ExceptionTest implements ITest{
	public int add(int i,int j)throws ArithmeticException,NumberFormatException{
		try{
			return i/j;
		}catch(ArithmeticException o){
			System.out.println(o.getMessage());
		}catch(NumberFormatException o){
			System.out.println(o.getMessage());
		}
		return 0;
	}
}
public class Test2 {

	public static void main(String[] args) {
		ExceptionTest o=new ExceptionTest();
		System.out.println(o.add(5,0));
	}

}
