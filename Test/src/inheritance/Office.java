package inheritance;
class Employee {
	String name;
	String address;
	protected String phoneNumber;
	public float experience;
}
class Programmer extends Employee {
	Programmer (String val) {
		name = val;
	}
	String getName() {
		return name;
	}
}
class Office {
	public static void main(String args[]) {
		Programmer p=new Programmer ("Harry");
		System.out.println(p.getName());
	}
}
