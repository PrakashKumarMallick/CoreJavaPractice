package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashsetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println(hs.size());
		hs.add(2);
		System.out.println(hs.size());
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Prakash");
		hs1.add("Prakas");
		hs1.add("Prakash.");
		System.out.println(hs.size());
		hs1.add("Prakash");
		System.out.println(hs.size());
		display(hs);
		display(hs1);
	}
	static void display(HashSet h){
		System.out.println("*****************************");
		Iterator it=h.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
