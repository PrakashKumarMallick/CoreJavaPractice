package examples;

import java.util.Scanner;
public class StudentResult {
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		String name="bhabani"; 
		String branch="MCA";
		int rollno=2323;
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("Rollno : "+rollno);
		Scanner dc=new Scanner(System.in);
		System.out.println("enter the mark of 6 subject :");
		a=dc.nextInt();
		if(a<0||a>100){
			System.out.println("Invalid Input..Try again");
			System.exit(0);
		}else if(a>=0&&a<=34){
			System.out.println("Fail");
			System.exit(0);
		}
		b=dc.nextInt();
		if(b<0||b>100){
			System.out.println("Invalid Input..Try again");
			System.exit(0);
		}else if(b>=0&&b<=34){
			System.out.println("Fail");
			System.exit(0);
		}
		c=dc.nextInt();
		if(c<0||c>100){
			System.out.println("Invalid Input..Try again");
			System.exit(0);
		}else if(c>=0&&c<=34){
			System.out.println("Fail");
			System.exit(0);
		}
		d=dc.nextInt();
		if(d<0||d>100){
			System.out.println("Invalid Input..Try again");
			System.exit(0);
		}else if(d>=0&&d<=34){
			System.out.println("Fail");
			System.exit(0);
		}
		e=dc.nextInt();
		if(e<0||e>100){
			System.out.println("Invalid Input..Try again");
			System.exit(0);
		}else if(e>=0&&e<=34){
			System.out.println("Fail");
			System.exit(0);
		}
		f=dc.nextInt();
		if(f<0||f>100){
			System.out.println("Invalid Input..Try again");
			System.exit(0);
		}else if(f>=0&&f<=34){
			System.out.println("Fail");
			System.exit(0);
		}	
		double sum=a+b+c+d+e+f;
		System.out.println(sum);
		double perct=(sum/600)*100;
		System.out.println(perct);
		if(perct>=70&&perct<100){
			System.out.println("Distinction");
		}
		else if(perct>=60&&perct<70){
			System.out.println("1st class");
		}
		else if(perct>=50&&perct<60){
			System.out.println("2nd class");
		}
		else if(perct>=35&&perct<50){
			System.out.println("3rd class");
		}else{
			System.out.println("Fail");
		}
   }
}

