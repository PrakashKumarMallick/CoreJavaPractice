package methodprograms;

public class Client{
	public static void main(String[] args) {
		double p=10000;
		double n=5;
		double r=2.5;
		SimpleIntrest.calculateSI(p,n,r);
	}
}
class SimpleIntrest {
	static void calculateSI(double p,double n,double r){
		double si=(p*n*r)/100;
		System.out.println("Simple intrest is: "+si);
	}
}

