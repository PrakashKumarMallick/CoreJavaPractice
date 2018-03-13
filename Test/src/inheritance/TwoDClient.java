package inheritance;

import java.util.Scanner;

class TwoD{
	public void draw(){
		System.out.println("Drawing ln & wd");
	}
}
class Rectangle extends TwoD{
	
}
class Square extends TwoD{
	
}
class Circle extends TwoD{
	public void draw(){
		System.out.println("Having radius");
	}
}
class Factory {
	public static TwoD getTwoDObject(int ch){
		switch(ch){
		case 1: return new Rectangle();
		case 2: return new Square();
		case 3: return new Circle();
		default:
			return null;
		}
	}
}
public class TwoDClient {

	public static void main(String[] args) {
		System.out.println("Enter Ur choice");
		System.out.println("1: Create object of Rectangle");
		System.out.println("2: Create object of Square");
		System.out.println("3: Create object of Circle");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		TwoD o=Factory.getTwoDObject(ch);
		if(o!=null){
			if(o instanceof Rectangle){
				Rectangle r=(Rectangle)o;
				r.draw();
			}
			else if(o instanceof Square){
				Square r=(Square)o;
				r.draw();
			}
			else{
				Circle r=(Circle)o;
				r.draw();
			}
		}
		else{
			System.out.println("Invalid Choice...");
		}
		sc.close();
	}

}
