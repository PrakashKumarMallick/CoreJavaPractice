package collection;

import java.util.HashSet;
import java.util.Iterator;

class Leader implements Comparable{
	String name;
	String cName;
	int age;
	String PartyName;
	String country;
	public Leader(String name, String cName, int age, String partyName, String country) {
		this.name = name;
		this.cName = cName;
		this.age = age;
		PartyName = partyName;
		this.country = country;
	}
	/*public int compareTo(Object o){
		Leader l=(Leader)o;
		return this.age-l.age;
	}*/
	public int compareTo(Object o){
		Leader l=(Leader)o;
		return (this.name).compareTo(l.name);
	}
	public boolean equals(Object o){
		System.out.println("Equals");
		if(o==null){
			return false;
		}
		if(this.getClass()!=o.getClass()){
			return false;
		}
		Leader ob=(Leader)o;
		if(ob.name.equals(this.name)){
			return true;
		}else if(ob.cName.equals(this.cName)){
			return true;
		}else if(ob.PartyName.equals(this.PartyName)){
			return true;
		}
		return false;
	}
	public int hashCode(){
		System.out.println("Hashcode");
		return age;
	}
}
public class UserDefinedObject {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Leader l=new Leader("modi","banaras",60,"bjp","india");
		Leader l1=new Leader("nitesh","bihar",60,"jdu","india");
		Leader l2=new Leader("naveen","ganjam",65,"bjd","india");
		Leader l3=new Leader("naveen","ganjam",65,"bjd","india");
		hs.add(l);
		hs.add(l1);
		hs.add(l2);
		hs.add(l3);
		hs.add(null);
		System.out.println(hs.size());
		//display(hs);
	}
//	public static void display(HashSet h){
//		Iterator it=h.iterator();
//		while(it.hasNext()){
//			Leader ld=(Leader)it.next();
//			System.out.println(ld.name+" "+ld.cName+" "+ld.PartyName);
//		}
//	}
}
