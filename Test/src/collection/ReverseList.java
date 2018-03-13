package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(2);
		al.add(102);
		al.add(120);
		al.add(112);
		Collections.sort(al);
		System.out.println(al);
		Comparator<Integer> cm=Collections.reverseOrder();
		Collections.sort(al,cm);
		System.out.println(al);
	}

}
