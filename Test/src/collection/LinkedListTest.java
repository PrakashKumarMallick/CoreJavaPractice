package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("10");
		l.add("11");
		l.add("17");
		l.add("13");
		l.add("14");
		System.out.println(l);
		l.addFirst("9");
		System.out.println(l);
		l.addLast("15");
		System.out.println(l);
		l.add(3,"12");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
	}

}
