package methodprograms;

public class CustomerTwo {

	public static void main(String[] args) {
		Pizza fp=new Pizza();
		System.out.println("Taste of pizza before bake:"+fp.taste);
		CustomerTwo c= new CustomerTwo();
		c.bake(fp);
		System.out.println("Taste after baking:"+fp.taste);
	}
	public void bake(Pizza pizzatobebaked){
		pizzatobebaked.taste="Sweet";
		System.out.println(pizzatobebaked.taste);
	}
}
class Pizza{
	String taste="Sweet";
}
