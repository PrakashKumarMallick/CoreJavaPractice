package exception;
class Ex2 extends ArithmeticException{
	
}
public class ThrowDemo {
	public void Div(){
		try{
			throw new Ex2();
		}catch(Ex2 e){
			System.out.println("caught");
		}
	}
	public static void main(String[] args) {
		ThrowDemo td=new ThrowDemo();
		try{
			td.Div();
		}catch(Ex2 e){
			System.out.println("Main");
		}
	}

}
