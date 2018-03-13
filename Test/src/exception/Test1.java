package exception;
class E1 extends RuntimeException{
	
}
public class Test1 {
	static int i;
	void show(){
		try{
			i++;
			throw new E1();
		}catch(RuntimeException e){
			i++;
			System.out.println(i);
			throw e;
		}
	}
	void display(){
		try{
			i++;
			throw new NumberFormatException();
		}catch(NumberFormatException e){
			i++;
			System.out.println(i);
			throw e;
		}
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		try{
			t.display();
			i++;
		}catch(NumberFormatException e){
			i++;
			System.out.println(i);
		}
		try{
			t.show();
			i++;
		}catch(Exception e){
			i++;
			System.out.println(i);
		}
	}

}
