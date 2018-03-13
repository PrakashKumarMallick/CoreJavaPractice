package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListSortInDescendingOrder {

	public static void main(String[] args) {
		Product2 p=new Product2("Mobile",100,7000);
		Product2 p1=new Product2("Marker",98,45);
		Product2 p2=new Product2("Laptop",101,27000);
		ArrayList<Product2> al=new ArrayList<Product2>();
		al.add(p);
		al.add(p1);
		al.add(p2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice");
		System.out.println("1.Sort by Price");
		System.out.println("2.Sort by Name");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			Collections.sort(al, new PrPrice().reversed());
			System.out.println(al);
			break;
		case 2:Collections.sort(al, new PrName().reversed());
			System.out.println(al);
			break;
		default: System.out.println("invalid choice");
		}

	}

}
