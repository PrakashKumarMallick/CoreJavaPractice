package inheritance;
class Animal{
void m1(){
}
}
class Lion extends Animal{
	void m1(){
		
	}
}
class Dog extends Animal{
	
}
class Cow extends Animal{
	
}
class Deer extends Animal{
	
}
class Factory1{
	public static Animal getAnimals(int ch){
		switch(ch){
		case 1: return new Lion();
		case 2: return new Dog();
		case 3: return new Cow();
		case 4: return new Deer();
		default:
			return null;
	}
}
}
public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
