package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class Person{
	int age;
	String name;
	Person(int age, String name){
		this.age=age;
		this.name=name;
	}
}

class PersonComparator implements Comparator<Person>{
	public int compare(Person p, Person p1) {
		int i=p.name.compareTo(p1.name);
		if(i==0){
			if(p.age == p1.age){
				return i;
			}else{
				return 1;
			}
		}
		return i;
	}
	
}

public class TreeSetTest {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(80);
		al.add(20);
		al.add(80);
		TreeSet<Integer> ts=new TreeSet<>(al);
		System.out.println("Integer TreeSet : "+ts);
		
		ArrayList<String> al1= new ArrayList<>();
		al1.add("Prakash");
		al1.add("Akash");
		al1.add("Prakash");
		al1.add("Rajesh");
		al1.add("Bikash");
		TreeSet<String> ts1=new TreeSet<>(al1);
		System.out.println("\nString TreeSet : "+ts1);
		
		ArrayList<String> al2= new ArrayList<>();
		al2.add("Prakash123");
		al2.add("Akash32");
		al2.add("12");
		al2.add("Rajesh42");
		al2.add("Bikash65");
		TreeSet<String> ts2=new TreeSet<>(al2);
		System.out.println("\nStringInteger TreeSet : "+ts2);
		
		TreeSet<Person> ts3=new TreeSet<>(new PersonComparator());
		ts3.add(new Person(24,"Prakash"));
		ts3.add(new Person(24,"Prakash"));
		ts3.add(new Person(25,"Akash"));
		ts3.add(new Person(26,"Prakash"));
		ts3.add(new Person(27,"Rajesh"));
		System.out.println("\nObject TreeSet : ");		
		for(Person p: ts3){
			System.out.println("\t\t"+p.name+"\t"+p.age);
		}
	}
}
