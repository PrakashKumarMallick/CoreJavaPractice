package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product2{
	String name;
	int prId;
	int Price;
	public Product2(String name, int prId, int price) {
		this.name = name;
		this.prId = prId;
		Price = price;
	}
	public String toString() {
		return "Product [name=" + name + ", prId=" + prId + ", Price=" + Price + "]";
	}
	public boolean equals(Object o){
		System.out.println("Equals");
		if(o==null){
			return false;
		}
		if(this.getClass()!=o.getClass()){
			return false;
		}
		Product2 ob=(Product2)o;
		if(ob.name.equals(this.name)){
			return true;
		}else if(ob.prId==(this.prId)){
			return true;
		}else if(ob.Price==(this.Price)){
			return true;
		}
		return false;
	}
	public int hashCode(){
		System.out.println("Hashcode");
		return Price;
	}
}
class PrPrice implements Comparator{
	public int compare(Object o,Object o1){
		Product2 pd=(Product2)o;
		Product2 pd1=(Product2)o1;
		return pd.Price-pd1.Price;
	}

	public Comparator reversed() {
		// TODO Auto-generated method stub
		return null;
	}
}
class PrName implements Comparator{
	public int compare(Object o,Object o1){
		Product2 pd=(Product2)o;
		Product2 pd1=(Product2)o1;
		return pd.name.compareTo(pd1.name);
	}

	public Comparator reversed() {
		// TODO Auto-generated method stub
		return null;
	}
}
class PrId implements Comparator{
	public int compare(Object o,Object o1){
		Product2 pd=(Product2)o;
		Product2 pd1=(Product2)o1;
		return pd.prId-pd1.prId;
	}

	public Comparator reversed() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class UserDefineComparatorTest {

	public static void main(String[] args) {
		Product2 p=new Product2("Mobile",102,7000);
		Product2 p1=new Product2("Marker",98,45);
		Product2 p2=new Product2("Laptop",101,27000);
		Product2 p3=new Product2("Marker",98,46);
		ArrayList<Product2> al=new ArrayList();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice");
		System.out.println("1.Sort by Price");
		System.out.println("2.Sort by Name");
		System.out.println("3.Sort by Id");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			Collections.sort(al, new PrPrice());
			for(Product2 pr:al){
				System.out.println(pr);
			}
			break;
		case 2:Collections.sort(al, new PrName());
			for(Product2 pr:al){
				System.out.println(pr);
			}
			break;
		case 3:Collections.sort(al, new PrId());
			for(Product2 pr:al){
				System.out.println(pr);
			}
			break;
		default: System.out.println("invalid choice");
		}
	}
}
