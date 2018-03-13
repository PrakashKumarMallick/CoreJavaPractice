package methodprograms;

import java.util.Scanner;

class Phone {
	private double weight;
	public void setWeight(double val) {
		if (val > 0 && val < 1000) {
			weight =val;
		}
		else{
			System.out.println("Invalid input");
		}
	}
	public double getWeight(){
		return this.weight;
	}
}

public class GeterSeter {

	public static void main(String[] args) {
		Phone p=new Phone();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur input");
		double val=sc.nextDouble();
		p.setWeight(val);
		System.out.println(p.getWeight());
		sc.close();
	}

}
