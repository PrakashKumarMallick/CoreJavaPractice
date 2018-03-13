package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
	public static void main(String args[]){
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		System.out.println(al);
		HashSet hs=new HashSet();
		hs.add(0);
		hs.add(0);
		System.out.println(hs);
		hs.addAll(al);
		System.out.println(hs);
	}
}
