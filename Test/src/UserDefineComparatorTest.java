
import java.util.Comparator;
import java.util.TreeSet;

class Product1 implements Comparator{
	String name;
	int prId;
	int Price;
	public Product1(String name, int prId, int price) {
		this.name = name;
		this.prId = prId;
		Price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrId() {
		return prId;
	}
	public int getPrice() {
		return Price;
	}
	public String toString() {
		return "Product [name=" + name + ", prId=" + prId + ", Price=" + Price + "]";
	}
	public int compare(Object o1, Object o2) {
		Product1 pd=(Product1)o1;
		Product1 pd1=(Product1)o2;
		return pd.getName().compareTo(pd.getName());
	}
}

public class UserDefineComparatorTest {

	public static void main(String[] args) {
		Product1 p=new Product1("Mobile",100,7000);
		Product1 p1=new Product1("Marker",98,45);
		Product1 p2=new Product1("Laptop",101,27000);
		TreeSet al=new TreeSet();
		al.add(p);
		al.add(p1);
		al.add(p2);
		System.out.println(al);
	}

}
