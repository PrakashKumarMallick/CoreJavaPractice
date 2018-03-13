import java.lang.Math;
import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("My Calculator");
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		System.out.println("5-Module");
		System.out.println("6-Square");
		System.out.println("7-Square Root");
		System.out.println("8-Find Odd/Even");
		System.out.println("9-Max & Min of Two Numbers");
		System.out.println("Choose your option");
		int opt=sc.nextInt();
		switch(opt){
			case 1:System.out.println("Enter Two Number:");
					int a=sc.nextInt();
					int b=sc.nextInt();
					int add=a+b;
					System.out.println("Addition of "+a+" & "+b+" is= "+add);
					break;
			case 2:System.out.println("Enter Two Number:");
					int c=sc.nextInt();
					int d=sc.nextInt();
					int sub=c-d;
					System.out.println("Substraction of "+c+" & "+d+" is= "+sub);
					break;
			case 3:System.out.println("Enter Two Number:");
					int e=sc.nextInt();
					int f=sc.nextInt();
					int mul=e*f;
					System.out.println("Multiplication of of "+e+" & "+f+" is= "+mul);
					break;
			case 4:System.out.println("Enter Two Number:");
					int g=sc.nextInt();
					int h=sc.nextInt();
					int div=g/h;
					System.out.println("Division of "+g+" & "+h+" is= "+div);
					break;
			case 5:System.out.println("Enter Two Number:");
					int i=sc.nextInt();
					int j=sc.nextInt();
					int mod=i%j;
					System.out.println("Module of "+i+" & "+j+" is= "+mod);
					break;
			case 6:System.out.println("Enter a number");
					long k=sc.nextLong();
					long sqr=k*k;
					System.out.println("Square of "+k+" is= "+sqr);
					break;
			case 7:System.out.println("Enter a number");
					int l=sc.nextInt();
					double sqt=Math.sqrt(l);
					System.out.println("Square root of "+l+" is= "+sqt);
					break;
			case 8:System.out.println("Enter a Number");
					int m=sc.nextInt();
					System.out.println(m%2==0?+m+" Is an Even Number":+m+" Is an Odd Number");
			case 9:System.out.println("Enter two Numbers");
					int n=sc.nextInt();
					int o=sc.nextInt();
					if(n>o)
						System.out.println(+n+" > "+o);
					else if(n<o)
						System.out.println(+n+" < "+o);
					else
						System.out.println(+n+" = "+o);
					break;
			default:System.out.println("Oops!!!Invalid Option, Try Again");
		}
		sc.close();
	}
}
