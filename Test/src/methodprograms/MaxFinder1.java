package methodprograms;

import java.util.Scanner;

public class MaxFinder1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=maxfinder.max(i,j);
		System.out.println("Max No Is: "+k);
		sc.close();
	}
}
class maxfinder{
	static int max(int i,int j){
		if(i>j)
			return i;
		else
			return j;
	}
}
