package string;

public class Person implements Cloneable {
	private String name;
	private int age;
	private long mobile;
	private Car c;
	private Address addr;
	public Person(String nm, int ag,long mb,Car ca,Address ad){
		this.name=nm;
		this.age=ag;
		this.mobile=mb;
		this.c=ca;
		this.addr=ad;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
public void displayDetails(){
	System.out.println("Person name:"+this.getName()+" Car Name:"+this.getC().getCarName()+" City:"+this.getAddr().getCity());
}
public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
}
