package collection;

import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("Prakash");
		a.add("Subhash");
		a.add("Deek");
		a.add("Smruti");
		System.out.println(a);
		System.out.println("Adding Tripti at end");
		a.add("Tripti");
		System.out.println(a);
		System.out.println("Add Rajesh at index 2");
		a.add(2, "Rajesh");
		System.out.println(a);
		System.out.println("remove element from 5th index");
		a.remove(5);
		System.out.println(a);
		System.out.println("remove Smruti");
		a.remove("Smruti");
		System.out.println(a);
		/*//remove all the elements from vector list
		a.removeAllElements();
		System.out.println(a);*/
		System.out.println("----------------------------------------------------");
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("Smruti");
		a1.add("Rajesh");
		a1.add("Deek");
		System.out.println(a1);
		/*//remove the matching elements of a from a1
		a1.removeAll(a);
		System.out.println(a1);*/
		//It keeps only matching element of a and remove others from a1
		a1.retainAll(a);
		System.out.println(a1);
		System.out.println("Add all the element of a in a1 at the end");
		a1.addAll(a);
		System.out.println(a1);
		System.out.println("Add all the element of a in a1 at given index");
		a1.addAll(1, a);
		System.out.println(a1);
		//a1.subList(5, 9);
		System.out.println(a1.subList(5, 10));
	}

}
