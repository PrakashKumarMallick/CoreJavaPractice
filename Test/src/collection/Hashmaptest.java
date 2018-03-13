package collection;

import java.util.HashMap;
import java.util.Map;

class Student{
	String name;
	int id;
	public Student(String nm,int id){
		this.name=nm;
		this.id=id;
	}
}
public class Hashmaptest {

	public static void main(String[] args) {
		HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
		Student s=new Student("prakash",5);
		Student s1=new Student("deek",6);
		Student s2=new Student("rajesh",7);
		hm.put(1,s);
		hm.put(2,s1);
		hm.put(3,s2);
		for(Student stu:hm.values()){
			System.out.println(stu.id+"\t"+stu.name);
		}
	}
}
