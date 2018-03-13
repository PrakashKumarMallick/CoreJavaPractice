package collection;

import java.util.Comparator;
import java.util.TreeSet;

class PrPric implements Comparator<Object>{
	public int compare(Object o,Object o1){
		Product2 pd=(Product2)o;
		Product2 pd1=(Product2)o1;
		return pd.Price-pd1.Price;
	}
}
class PrNam implements Comparator<Object>{
	public int compare(Object o,Object o1){
		Product2 pd=(Product2)o;
		Product2 pd1=(Product2)o1;
		return pd.name.compareTo(pd1.name);
	}
}
public class TreeSetComparator{
	public static void main(String pk[]){
		TreeSet<Product2> ts=new TreeSet<Product2>(new PrPric());
		ts.add(new Product2("Mobile",100,7000));
		ts.add(new Product2("Marker",98,45));
		ts.add(new Product2("Laptop",101,27000));
		ts.add(new Product2("Marker",98,46));
		for(Product2 p:ts){
			System.out.println(p);
		}
	}
}
