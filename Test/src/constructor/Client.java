package constructor;
class Person{
	String name;
	String emailId;
	int age;
	Person(String mn,String eid,int ag){
		this.name=mn;
		this.emailId=eid;
		this.age=ag;
	}
}
class Student extends Person{
	Student(String nm,String eid, int ag,String cs,int dur){
		super(nm,eid,ag);
		String course=cs;
		int duration=dur;
	}
}
class Employee extends Person{
	Employee(String nm,String eid,int ag,String dg,int sal){
		super(nm,eid,ag);
		String Designation=dg;
		int Salary=sal;
	}
}
public class Client {

	public static void main(String[] args) {
		Student s=new Student("pk","pk@p.com",27,"Java",6);
		Employee e=new  Employee("pk","PK@p.com",27,"SE",600000);
	}
}
